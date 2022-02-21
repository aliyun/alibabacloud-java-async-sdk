// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcePoolResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcePoolResponseBody</p>
 */
public class ListResourcePoolResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PoolInfoList")
    private PoolInfoList poolInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListResourcePoolResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.poolInfoList = builder.poolInfoList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return poolInfoList
     */
    public PoolInfoList getPoolInfoList() {
        return this.poolInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private PoolInfoList poolInfoList; 
        private String requestId; 
        private Integer total; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PoolInfoList.
         */
        public Builder poolInfoList(PoolInfoList poolInfoList) {
            this.poolInfoList = poolInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListResourcePoolResponseBody build() {
            return new ListResourcePoolResponseBody(this);
        } 

    } 

    public static class EcmResourcePool extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Note")
        private String note;

        @NameInMap("PoolType")
        private String poolType;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("YarnSiteConfig")
        private String yarnSiteConfig;

        private EcmResourcePool(Builder builder) {
            this.active = builder.active;
            this.id = builder.id;
            this.name = builder.name;
            this.note = builder.note;
            this.poolType = builder.poolType;
            this.userId = builder.userId;
            this.yarnSiteConfig = builder.yarnSiteConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcmResourcePool create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return poolType
         */
        public String getPoolType() {
            return this.poolType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return yarnSiteConfig
         */
        public String getYarnSiteConfig() {
            return this.yarnSiteConfig;
        }

        public static final class Builder {
            private Boolean active; 
            private Long id; 
            private String name; 
            private String note; 
            private String poolType; 
            private String userId; 
            private String yarnSiteConfig; 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * PoolType.
             */
            public Builder poolType(String poolType) {
                this.poolType = poolType;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * YarnSiteConfig.
             */
            public Builder yarnSiteConfig(String yarnSiteConfig) {
                this.yarnSiteConfig = yarnSiteConfig;
                return this;
            }

            public EcmResourcePool build() {
                return new EcmResourcePool(this);
            } 

        } 

    }
    public static class EcmResourcePoolConfig extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ConfigKey")
        private String configKey;

        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Note")
        private String note;

        @NameInMap("Status")
        private String status;

        private EcmResourcePoolConfig(Builder builder) {
            this.category = builder.category;
            this.configKey = builder.configKey;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.id = builder.id;
            this.note = builder.note;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcmResourcePoolConfig create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String category; 
            private String configKey; 
            private String configType; 
            private String configValue; 
            private Long id; 
            private String note; 
            private String status; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConfigKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EcmResourcePoolConfig build() {
                return new EcmResourcePoolConfig(this);
            } 

        } 

    }
    public static class EcmResourcePoolConfigList extends TeaModel {
        @NameInMap("EcmResourcePoolConfig")
        private java.util.List < EcmResourcePoolConfig> ecmResourcePoolConfig;

        private EcmResourcePoolConfigList(Builder builder) {
            this.ecmResourcePoolConfig = builder.ecmResourcePoolConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcmResourcePoolConfigList create() {
            return builder().build();
        }

        /**
         * @return ecmResourcePoolConfig
         */
        public java.util.List < EcmResourcePoolConfig> getEcmResourcePoolConfig() {
            return this.ecmResourcePoolConfig;
        }

        public static final class Builder {
            private java.util.List < EcmResourcePoolConfig> ecmResourcePoolConfig; 

            /**
             * EcmResourcePoolConfig.
             */
            public Builder ecmResourcePoolConfig(java.util.List < EcmResourcePoolConfig> ecmResourcePoolConfig) {
                this.ecmResourcePoolConfig = ecmResourcePoolConfig;
                return this;
            }

            public EcmResourcePoolConfigList build() {
                return new EcmResourcePoolConfigList(this);
            } 

        } 

    }
    public static class EcmResourcePoolConfigListEcmResourcePoolConfig extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ConfigKey")
        private String configKey;

        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Note")
        private String note;

        @NameInMap("Status")
        private String status;

        private EcmResourcePoolConfigListEcmResourcePoolConfig(Builder builder) {
            this.category = builder.category;
            this.configKey = builder.configKey;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.id = builder.id;
            this.note = builder.note;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcmResourcePoolConfigListEcmResourcePoolConfig create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String category; 
            private String configKey; 
            private String configType; 
            private String configValue; 
            private Long id; 
            private String note; 
            private String status; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConfigKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EcmResourcePoolConfigListEcmResourcePoolConfig build() {
                return new EcmResourcePoolConfigListEcmResourcePoolConfig(this);
            } 

        } 

    }
    public static class QueueEcmResourcePoolConfigList extends TeaModel {
        @NameInMap("EcmResourcePoolConfig")
        private java.util.List < EcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig;

        private QueueEcmResourcePoolConfigList(Builder builder) {
            this.ecmResourcePoolConfig = builder.ecmResourcePoolConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueEcmResourcePoolConfigList create() {
            return builder().build();
        }

        /**
         * @return ecmResourcePoolConfig
         */
        public java.util.List < EcmResourcePoolConfigListEcmResourcePoolConfig> getEcmResourcePoolConfig() {
            return this.ecmResourcePoolConfig;
        }

        public static final class Builder {
            private java.util.List < EcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig; 

            /**
             * EcmResourcePoolConfig.
             */
            public Builder ecmResourcePoolConfig(java.util.List < EcmResourcePoolConfigListEcmResourcePoolConfig> ecmResourcePoolConfig) {
                this.ecmResourcePoolConfig = ecmResourcePoolConfig;
                return this;
            }

            public QueueEcmResourcePoolConfigList build() {
                return new QueueEcmResourcePoolConfigList(this);
            } 

        } 

    }
    public static class EcmResourceQueue extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Leaf")
        private Boolean leaf;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentQueueId")
        private Long parentQueueId;

        @NameInMap("QualifiedName")
        private String qualifiedName;

        @NameInMap("QueueType")
        private String queueType;

        @NameInMap("ResourcePoolId")
        private Long resourcePoolId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        private EcmResourceQueue(Builder builder) {
            this.id = builder.id;
            this.leaf = builder.leaf;
            this.name = builder.name;
            this.parentQueueId = builder.parentQueueId;
            this.qualifiedName = builder.qualifiedName;
            this.queueType = builder.queueType;
            this.resourcePoolId = builder.resourcePoolId;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcmResourceQueue create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return leaf
         */
        public Boolean getLeaf() {
            return this.leaf;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentQueueId
         */
        public Long getParentQueueId() {
            return this.parentQueueId;
        }

        /**
         * @return qualifiedName
         */
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return resourcePoolId
         */
        public Long getResourcePoolId() {
            return this.resourcePoolId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long id; 
            private Boolean leaf; 
            private String name; 
            private Long parentQueueId; 
            private String qualifiedName; 
            private String queueType; 
            private Long resourcePoolId; 
            private String status; 
            private String userId; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Leaf.
             */
            public Builder leaf(Boolean leaf) {
                this.leaf = leaf;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentQueueId.
             */
            public Builder parentQueueId(Long parentQueueId) {
                this.parentQueueId = parentQueueId;
                return this;
            }

            /**
             * QualifiedName.
             */
            public Builder qualifiedName(String qualifiedName) {
                this.qualifiedName = qualifiedName;
                return this;
            }

            /**
             * QueueType.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * ResourcePoolId.
             */
            public Builder resourcePoolId(Long resourcePoolId) {
                this.resourcePoolId = resourcePoolId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public EcmResourceQueue build() {
                return new EcmResourceQueue(this);
            } 

        } 

    }
    public static class Queue extends TeaModel {
        @NameInMap("EcmResourcePoolConfigList")
        private QueueEcmResourcePoolConfigList ecmResourcePoolConfigList;

        @NameInMap("EcmResourceQueue")
        private EcmResourceQueue ecmResourceQueue;

        private Queue(Builder builder) {
            this.ecmResourcePoolConfigList = builder.ecmResourcePoolConfigList;
            this.ecmResourceQueue = builder.ecmResourceQueue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queue create() {
            return builder().build();
        }

        /**
         * @return ecmResourcePoolConfigList
         */
        public QueueEcmResourcePoolConfigList getEcmResourcePoolConfigList() {
            return this.ecmResourcePoolConfigList;
        }

        /**
         * @return ecmResourceQueue
         */
        public EcmResourceQueue getEcmResourceQueue() {
            return this.ecmResourceQueue;
        }

        public static final class Builder {
            private QueueEcmResourcePoolConfigList ecmResourcePoolConfigList; 
            private EcmResourceQueue ecmResourceQueue; 

            /**
             * EcmResourcePoolConfigList.
             */
            public Builder ecmResourcePoolConfigList(QueueEcmResourcePoolConfigList ecmResourcePoolConfigList) {
                this.ecmResourcePoolConfigList = ecmResourcePoolConfigList;
                return this;
            }

            /**
             * EcmResourceQueue.
             */
            public Builder ecmResourceQueue(EcmResourceQueue ecmResourceQueue) {
                this.ecmResourceQueue = ecmResourceQueue;
                return this;
            }

            public Queue build() {
                return new Queue(this);
            } 

        } 

    }
    public static class QueueList extends TeaModel {
        @NameInMap("Queue")
        private java.util.List < Queue> queue;

        private QueueList(Builder builder) {
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueList create() {
            return builder().build();
        }

        /**
         * @return queue
         */
        public java.util.List < Queue> getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private java.util.List < Queue> queue; 

            /**
             * Queue.
             */
            public Builder queue(java.util.List < Queue> queue) {
                this.queue = queue;
                return this;
            }

            public QueueList build() {
                return new QueueList(this);
            } 

        } 

    }
    public static class PoolInfo extends TeaModel {
        @NameInMap("EcmResourcePool")
        private EcmResourcePool ecmResourcePool;

        @NameInMap("EcmResourcePoolConfigList")
        private EcmResourcePoolConfigList ecmResourcePoolConfigList;

        @NameInMap("QueueList")
        private QueueList queueList;

        private PoolInfo(Builder builder) {
            this.ecmResourcePool = builder.ecmResourcePool;
            this.ecmResourcePoolConfigList = builder.ecmResourcePoolConfigList;
            this.queueList = builder.queueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PoolInfo create() {
            return builder().build();
        }

        /**
         * @return ecmResourcePool
         */
        public EcmResourcePool getEcmResourcePool() {
            return this.ecmResourcePool;
        }

        /**
         * @return ecmResourcePoolConfigList
         */
        public EcmResourcePoolConfigList getEcmResourcePoolConfigList() {
            return this.ecmResourcePoolConfigList;
        }

        /**
         * @return queueList
         */
        public QueueList getQueueList() {
            return this.queueList;
        }

        public static final class Builder {
            private EcmResourcePool ecmResourcePool; 
            private EcmResourcePoolConfigList ecmResourcePoolConfigList; 
            private QueueList queueList; 

            /**
             * EcmResourcePool.
             */
            public Builder ecmResourcePool(EcmResourcePool ecmResourcePool) {
                this.ecmResourcePool = ecmResourcePool;
                return this;
            }

            /**
             * EcmResourcePoolConfigList.
             */
            public Builder ecmResourcePoolConfigList(EcmResourcePoolConfigList ecmResourcePoolConfigList) {
                this.ecmResourcePoolConfigList = ecmResourcePoolConfigList;
                return this;
            }

            /**
             * QueueList.
             */
            public Builder queueList(QueueList queueList) {
                this.queueList = queueList;
                return this;
            }

            public PoolInfo build() {
                return new PoolInfo(this);
            } 

        } 

    }
    public static class PoolInfoList extends TeaModel {
        @NameInMap("PoolInfo")
        private java.util.List < PoolInfo> poolInfo;

        private PoolInfoList(Builder builder) {
            this.poolInfo = builder.poolInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PoolInfoList create() {
            return builder().build();
        }

        /**
         * @return poolInfo
         */
        public java.util.List < PoolInfo> getPoolInfo() {
            return this.poolInfo;
        }

        public static final class Builder {
            private java.util.List < PoolInfo> poolInfo; 

            /**
             * PoolInfo.
             */
            public Builder poolInfo(java.util.List < PoolInfo> poolInfo) {
                this.poolInfo = poolInfo;
                return this;
            }

            public PoolInfoList build() {
                return new PoolInfoList(this);
            } 

        } 

    }
}
