// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceInspectionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceInspectionsResponseBody</p>
 */
public class GetInstanceInspectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetInstanceInspectionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceInspectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The inspection and scoring results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetInstanceInspectionsResponseBody build() {
            return new GetInstanceInspectionsResponseBody(this);
        } 

    } 

    public static class AutoFunction extends TeaModel {
        @NameInMap("AutoIndex")
        private Integer autoIndex;

        @NameInMap("AutoLimitedSql")
        private Integer autoLimitedSql;

        @NameInMap("AutoResourceOptimize")
        private Integer autoResourceOptimize;

        @NameInMap("AutoScale")
        private Integer autoScale;

        @NameInMap("EventSubscription")
        private Integer eventSubscription;

        private AutoFunction(Builder builder) {
            this.autoIndex = builder.autoIndex;
            this.autoLimitedSql = builder.autoLimitedSql;
            this.autoResourceOptimize = builder.autoResourceOptimize;
            this.autoScale = builder.autoScale;
            this.eventSubscription = builder.eventSubscription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoFunction create() {
            return builder().build();
        }

        /**
         * @return autoIndex
         */
        public Integer getAutoIndex() {
            return this.autoIndex;
        }

        /**
         * @return autoLimitedSql
         */
        public Integer getAutoLimitedSql() {
            return this.autoLimitedSql;
        }

        /**
         * @return autoResourceOptimize
         */
        public Integer getAutoResourceOptimize() {
            return this.autoResourceOptimize;
        }

        /**
         * @return autoScale
         */
        public Integer getAutoScale() {
            return this.autoScale;
        }

        /**
         * @return eventSubscription
         */
        public Integer getEventSubscription() {
            return this.eventSubscription;
        }

        public static final class Builder {
            private Integer autoIndex; 
            private Integer autoLimitedSql; 
            private Integer autoResourceOptimize; 
            private Integer autoScale; 
            private Integer eventSubscription; 

            /**
             * Indicates whether the feature of automatically creating and deleting indexes is enabled. Valid values:
             * <p>
             * 
             * * **0**: disabled.
             * * **1**: enabled.
             * * **2**: not supported.
             */
            public Builder autoIndex(Integer autoIndex) {
                this.autoIndex = autoIndex;
                return this;
            }

            /**
             * Indicates whether the automatic throttling feature is enabled. Valid values:
             * <p>
             * 
             * * **0**: disabled.
             * * **1**: enabled.
             * * **2**: not supported.
             */
            public Builder autoLimitedSql(Integer autoLimitedSql) {
                this.autoLimitedSql = autoLimitedSql;
                return this;
            }

            /**
             * Indicates whether automatic reclamation of fragments is enabled. Valid values:
             * <p>
             * 
             * * **0**: disabled.
             * * **1**: enabled.
             * * **2**: not supported.
             */
            public Builder autoResourceOptimize(Integer autoResourceOptimize) {
                this.autoResourceOptimize = autoResourceOptimize;
                return this;
            }

            /**
             * Indicates whether the auto scaling feature is enabled. Valid values:
             * <p>
             * 
             * * **0**: disabled.
             * * **1**: enabled.
             * * **2**: not supported.
             */
            public Builder autoScale(Integer autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * Indicates whether the event subscription feature is enabled. Valid values:
             * <p>
             * 
             * * **0**: disabled.
             * * **1**: enabled.
             * * **2**: not supported.
             */
            public Builder eventSubscription(Integer eventSubscription) {
                this.eventSubscription = eventSubscription;
                return this;
            }

            public AutoFunction build() {
                return new AutoFunction(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("Category")
        private String category;

        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("InstanceAlias")
        private String instanceAlias;

        @NameInMap("InstanceArea")
        private String instanceArea;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Region")
        private String region;

        @NameInMap("Storage")
        private Integer storage;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcId")
        private String vpcId;

        private Instance(Builder builder) {
            this.accountId = builder.accountId;
            this.category = builder.category;
            this.cpu = builder.cpu;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.instanceAlias = builder.instanceAlias;
            this.instanceArea = builder.instanceArea;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.memory = builder.memory;
            this.networkType = builder.networkType;
            this.nodeId = builder.nodeId;
            this.region = builder.region;
            this.storage = builder.storage;
            this.uuid = builder.uuid;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceArea
         */
        public String getInstanceArea() {
            return this.instanceArea;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String accountId; 
            private String category; 
            private String cpu; 
            private String engine; 
            private String engineVersion; 
            private String instanceAlias; 
            private String instanceArea; 
            private String instanceClass; 
            private String instanceId; 
            private Integer memory; 
            private String networkType; 
            private String nodeId; 
            private String region; 
            private Integer storage; 
            private String uuid; 
            private String vpcId; 

            /**
             * The account ID. You can obtain the account ID on the **Security Settings** page in the Alibaba Cloud **account management center**.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The connection mode of the instance. Valid values:
             * <p>
             * 
             * * **standard**: standard mode.
             * * **safe**: database proxy mode.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The CPU specification of the instance. For example, if a value of 8 is returned, the instance has eight CPU cores.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The database engine. Valid values:
             * <p>
             * 
             * * **MySQL**
             * * **Redis**
             * * **PolarDBMySQL**
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version number of the database engine.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * The type of the instance on which the database is deployed. Valid values:
             * <p>
             * 
             * * **RDS**: an Alibaba Cloud database instance.
             * * **ECS**: an ECS instance on which a self-managed database is deployed.
             * * **IDC**: a self-managed database instance that is not deployed on Alibaba Cloud.
             * 
             * > The value IDC indicates that the instance is deployed in a data center.
             */
            public Builder instanceArea(String instanceArea) {
                this.instanceArea = instanceArea;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The memory capacity of the database that is deployed on the instance. Unit: MB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The network type of the instance.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the node on the instance.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The storage space of the instance. Unit: GB.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * The unique identifier of the instance.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the instance is deployed.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("AutoFunction")
        private AutoFunction autoFunction;

        @NameInMap("Data")
        private java.util.Map < String, ? > data;

        @NameInMap("EnableDasPro")
        private Integer enableDasPro;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Instance")
        private Instance instance;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("ScoreMap")
        private java.util.Map < String, ? > scoreMap;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private Integer state;

        @NameInMap("TaskType")
        private Integer taskType;

        private List(Builder builder) {
            this.autoFunction = builder.autoFunction;
            this.data = builder.data;
            this.enableDasPro = builder.enableDasPro;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.instance = builder.instance;
            this.score = builder.score;
            this.scoreMap = builder.scoreMap;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return autoFunction
         */
        public AutoFunction getAutoFunction() {
            return this.autoFunction;
        }

        /**
         * @return data
         */
        public java.util.Map < String, ? > getData() {
            return this.data;
        }

        /**
         * @return enableDasPro
         */
        public Integer getEnableDasPro() {
            return this.enableDasPro;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return instance
         */
        public Instance getInstance() {
            return this.instance;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreMap
         */
        public java.util.Map < String, ? > getScoreMap() {
            return this.scoreMap;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private AutoFunction autoFunction; 
            private java.util.Map < String, ? > data; 
            private Integer enableDasPro; 
            private Long endTime; 
            private Long gmtCreate; 
            private Instance instance; 
            private Integer score; 
            private java.util.Map < String, ? > scoreMap; 
            private Long startTime; 
            private Integer state; 
            private Integer taskType; 

            /**
             * Indicates whether the autonomy service is enabled.
             */
            public Builder autoFunction(AutoFunction autoFunction) {
                this.autoFunction = autoFunction;
                return this;
            }

            /**
             * The returned data.
             */
            public Builder data(java.util.Map < String, ? > data) {
                this.data = data;
                return this;
            }

            /**
             * Indicates whether DAS Professional Edition is enabled. Valid values:
             * <p>
             * 
             * * **0**: disabled.
             * * **1**: enabled.
             * * **2**: not supported.
             */
            public Builder enableDasPro(Integer enableDasPro) {
                this.enableDasPro = enableDasPro;
                return this;
            }

            /**
             * The end time of the inspection and scoring task. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * <p>
             * 
             * > The end time must be later than the start time.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The details of the instance.
             */
            public Builder instance(Instance instance) {
                this.instance = instance;
                return this;
            }

            /**
             * The inspection scores of the instance.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The scores that are deducted for the instance.
             */
            public Builder scoreMap(java.util.Map < String, ? > scoreMap) {
                this.scoreMap = scoreMap;
                return this;
            }

            /**
             * The start time of the inspection and scoring task. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the inspection and scoring task. Valid values:
             * <p>
             * 
             * * **0**: The task is waiting for execution.
             * * **1**: The task is in progress.
             * * **2**: The task is complete.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * The mode in which the inspection and scoring task was initiated. Valid values:
             * <p>
             * 
             * * **0**: automatic mode
             * * **1**: manual mode
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNo")
        private Long pageNo;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * The mode in which the inspection and scoring task was initiated. Valid values:
             * <p>
             * 
             * *   **0**: automatic mode
             * *   **1**: manual mode
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The page number. The value returned is a positive integer. Default value: 1.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page. Default value: 10.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
