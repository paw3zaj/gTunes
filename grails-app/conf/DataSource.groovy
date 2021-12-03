dataSource {
    pooled = true
    // driverClassName = "org.h2.Driver"
    // username = 'sa'
    // password = ''
    driverClassName = "org.postgresql.Driver"
    username = 'pawel'
    password = 'pass'
     properties {
        initialSize = 34
        maxActive = 150
        minIdle = 15
        maxIdle = 30
        maxWait = 10000
        timeBetweenEvictionRunsMillis = 1800000
        minEvictableIdleTimeMillis = 1800000
        testOnBorrow = true
        testWhileIdle = true
        testOnReturn = false
        removeAbandonedTimeout = 60
        removeAbandoned = true
        logAbandoned = true
        validationQuery = "SELECT 1"
    }
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.provider_class = "org.hibernate.cache.EhCacheProvider"
    // jdbc.factory_class = HibernatePartitionBatcherFactory.class.getName()
}
// environment specific settings
environments {
    development {
        dataSource {
            // dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            // url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/gTunes"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
