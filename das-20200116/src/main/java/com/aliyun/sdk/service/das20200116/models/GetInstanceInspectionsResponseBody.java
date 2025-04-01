// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceInspectionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceInspectionsResponseBody</p>
 */
public class GetInstanceInspectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceInspectionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetInstanceInspectionsResponseBody build() {
            return new GetInstanceInspectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionsResponseBody</p>
     */
    public static class AutoFunction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIndex")
        private Integer autoIndex;

        @com.aliyun.core.annotation.NameInMap("AutoLimitedSql")
        private Integer autoLimitedSql;

        @com.aliyun.core.annotation.NameInMap("AutoResourceOptimize")
        private Integer autoResourceOptimize;

        @com.aliyun.core.annotation.NameInMap("AutoScale")
        private Integer autoScale;

        @com.aliyun.core.annotation.NameInMap("EventSubscription")
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

            private Builder() {
            } 

            private Builder(AutoFunction model) {
                this.autoIndex = model.autoIndex;
                this.autoLimitedSql = model.autoLimitedSql;
                this.autoResourceOptimize = model.autoResourceOptimize;
                this.autoScale = model.autoScale;
                this.eventSubscription = model.eventSubscription;
            } 

            /**
             * <p>Indicates whether the feature of automatically creating and deleting indexes is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder autoIndex(Integer autoIndex) {
                this.autoIndex = autoIndex;
                return this;
            }

            /**
             * <p>Indicates whether the automatic throttling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder autoLimitedSql(Integer autoLimitedSql) {
                this.autoLimitedSql = autoLimitedSql;
                return this;
            }

            /**
             * <p>Indicates whether the automatic fragment recycling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoResourceOptimize(Integer autoResourceOptimize) {
                this.autoResourceOptimize = autoResourceOptimize;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoScale(Integer autoScale) {
                this.autoScale = autoScale;
                return this;
            }

            /**
             * <p>Indicates whether the event subscription feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionsResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceAlias")
        private String instanceAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceArea")
        private String instanceArea;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(Instance model) {
                this.accountId = model.accountId;
                this.category = model.category;
                this.cpu = model.cpu;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.instanceAlias = model.instanceAlias;
                this.instanceArea = model.instanceArea;
                this.instanceClass = model.instanceClass;
                this.instanceId = model.instanceId;
                this.memory = model.memory;
                this.networkType = model.networkType;
                this.nodeId = model.nodeId;
                this.region = model.region;
                this.storage = model.storage;
                this.uuid = model.uuid;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The account ID. You can view the ID of the logon account by moving the pointer over the profile in the Alibaba Cloud management console.</p>
             * 
             * <strong>example:</strong>
             * <p>108398049688****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The connection mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>standard</strong>: standard mode.</li>
             * <li><strong>safe</strong>: database proxy mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The CPU specification of the instance. For example, if a value of 8 is returned, the instance has eight CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The database engine. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>Redis</strong></li>
             * <li><strong>PolarDBMySQL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The version number of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-01</p>
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * <p>The type of the instance on which the database is deployed. Valid values:</p>
             * <ul>
             * <li><strong>RDS</strong>: an Alibaba Cloud database instance.</li>
             * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance on which a self-managed database is deployed.</li>
             * <li><strong>IDC</strong>: a self-managed database instance that is not deployed on Alibaba Cloud.</li>
             * </ul>
             * <blockquote>
             * <p> The value IDC indicates that the instance is deployed in a data center.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceArea(String instanceArea) {
                this.instanceArea = instanceArea;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.s2.xlarge</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp10usoc1erj7****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The memory capacity of the database that is deployed on the instance. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>32768</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The network type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The ID of the node on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp10usoc1erj7****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The storage space of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The unique identifier of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hdm_3063db6792965c080a4bcb6e6304****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1knt7m55z9exoo7****</p>
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
    /**
     * 
     * {@link GetInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoFunction")
        private AutoFunction autoFunction;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.Map<String, ?> data;

        @com.aliyun.core.annotation.NameInMap("EnableDasPro")
        private Integer enableDasPro;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Instance")
        private Instance instance;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("ScoreMap")
        private java.util.Map<String, ?> scoreMap;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
        public java.util.Map<String, ?> getData() {
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
        public java.util.Map<String, ?> getScoreMap() {
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
            private java.util.Map<String, ?> data; 
            private Integer enableDasPro; 
            private Long endTime; 
            private Long gmtCreate; 
            private Instance instance; 
            private Integer score; 
            private java.util.Map<String, ?> scoreMap; 
            private Long startTime; 
            private Integer state; 
            private Integer taskType; 

            private Builder() {
            } 

            private Builder(List model) {
                this.autoFunction = model.autoFunction;
                this.data = model.data;
                this.enableDasPro = model.enableDasPro;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.instance = model.instance;
                this.score = model.score;
                this.scoreMap = model.scoreMap;
                this.startTime = model.startTime;
                this.state = model.state;
                this.taskType = model.taskType;
            } 

            /**
             * <p>Indicates whether the autonomy service is enabled.</p>
             */
            public Builder autoFunction(AutoFunction autoFunction) {
                this.autoFunction = autoFunction;
                return this;
            }

            /**
             * <p>The data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;data&quot;: { &quot;hasDeadLock&quot;: false, &quot;exceptionTableMap&quot;: {}, &quot;bigTransactionCount&quot;: 0, &quot;cpu&quot;: 4, &quot;isRds&quot;: true, &quot;rdsEnable&quot;: true, &quot;enable&quot;: false, &quot;activeSessions&quot;: [], &quot;bigTransactionList&quot;: [], &quot;bigSessionList&quot;: [ { &quot;blockDuration&quot;: 0, &quot;active&quot;: false, &quot;Time&quot;: 0, &quot;db&quot;: &quot;&quot; },</p>
             */
            public Builder data(java.util.Map<String, ?> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>2</strong>: not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enableDasPro(Integer enableDasPro) {
                this.enableDasPro = enableDasPro;
                return this;
            }

            /**
             * <p>The end time of the inspection and scoring task. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * <blockquote>
             * <p> The end time must be later than the start time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1608888296001</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1603247192000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The information about the instance.</p>
             */
            public Builder instance(Instance instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The inspection score of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The scores that are deducted for the instance.</p>
             */
            public Builder scoreMap(java.util.Map<String, ?> scoreMap) {
                this.scoreMap = scoreMap;
                return this;
            }

            /**
             * <p>The start time of the inspection and scoring task. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the inspection and scoring task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The task is waiting for execution.</li>
             * <li><strong>1</strong>: The task is in progress.</li>
             * <li><strong>2</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The mode in which the inspection and scoring task was initiated. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: automatic mode.</li>
             * <li><strong>1</strong>: manual mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetInstanceInspectionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The detailed information.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number. The value returned is a positive integer. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
