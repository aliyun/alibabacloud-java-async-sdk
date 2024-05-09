// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionInstancesResponseBody</p>
 */
public class DescribeSubscriptionInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubscriptionInstances")
    private SubscriptionInstances subscriptionInstances;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeSubscriptionInstancesResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.subscriptionInstances = builder.subscriptionInstances;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscriptionInstances
     */
    public SubscriptionInstances getSubscriptionInstances() {
        return this.subscriptionInstances;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private SubscriptionInstances subscriptionInstances; 
        private String success; 
        private Long totalRecordCount; 

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The maximum number of entries that can be displayed on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of change tracking instances and the details of each instance.
         */
        public Builder subscriptionInstances(SubscriptionInstances subscriptionInstances) {
            this.subscriptionInstances = subscriptionInstances;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of change tracking instances that belong to your Alibaba Cloud account.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSubscriptionInstancesResponseBody build() {
            return new DescribeSubscriptionInstancesResponseBody(this);
        } 

    } 

    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private SourceEndpoint(Builder builder) {
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceID; 
            private String instanceType; 

            /**
             * The ID of the source instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source instance.
             * <p>
             * 
             * >  This parameter is returned only for change tracking instances of the new version.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    public static class SubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDL")
        private Boolean DDL;

        @com.aliyun.core.annotation.NameInMap("DML")
        private Boolean DML;

        private SubscriptionDataType(Builder builder) {
            this.DDL = builder.DDL;
            this.DML = builder.DML;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return DDL
         */
        public Boolean getDDL() {
            return this.DDL;
        }

        /**
         * @return DML
         */
        public Boolean getDML() {
            return this.DML;
        }

        public static final class Builder {
            private Boolean DDL; 
            private Boolean DML; 

            /**
             * Indicates whether data definition language (DDL) operations are tracked. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder DDL(Boolean DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * Indicates whether data manipulation language (DML) operations are tracked. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder DML(Boolean DML) {
                this.DML = DML;
                return this;
            }

            public SubscriptionDataType build() {
                return new SubscriptionDataType(this);
            } 

        } 

    }
    public static class SubscriptionHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateHost")
        private String privateHost;

        @com.aliyun.core.annotation.NameInMap("PublicHost")
        private String publicHost;

        @com.aliyun.core.annotation.NameInMap("VPCHost")
        private String VPCHost;

        private SubscriptionHost(Builder builder) {
            this.privateHost = builder.privateHost;
            this.publicHost = builder.publicHost;
            this.VPCHost = builder.VPCHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionHost create() {
            return builder().build();
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        /**
         * @return VPCHost
         */
        public String getVPCHost() {
            return this.VPCHost;
        }

        public static final class Builder {
            private String privateHost; 
            private String publicHost; 
            private String VPCHost; 

            /**
             * The private endpoint of the change tracking instance. The format is `<Address>:<Port number>`.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * The public endpoint of the change tracking instance. The format is `<Address>:<Port number>`.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * The virtual private cloud (VPC) endpoint of the change tracking instance. The format is `<Address>:<Port number>`.
             */
            public Builder VPCHost(String VPCHost) {
                this.VPCHost = VPCHost;
                return this;
            }

            public SubscriptionHost build() {
                return new SubscriptionHost(this);
            } 

        } 

    }
    public static class TableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List < String > table;

        private TableList(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableList create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List < String > getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < String > table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < String > table) {
                this.table = table;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    public static class SynchronousObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("TableList")
        private TableList tableList;

        @com.aliyun.core.annotation.NameInMap("WholeDatabase")
        private String wholeDatabase;

        private SynchronousObject(Builder builder) {
            this.databaseName = builder.databaseName;
            this.tableList = builder.tableList;
            this.wholeDatabase = builder.wholeDatabase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronousObject create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return tableList
         */
        public TableList getTableList() {
            return this.tableList;
        }

        /**
         * @return wholeDatabase
         */
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

        public static final class Builder {
            private String databaseName; 
            private TableList tableList; 
            private String wholeDatabase; 

            /**
             * The name of the database to which the object belongs.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tableList(TableList tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * Indicates whether the data of an entire database is tracked. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder wholeDatabase(String wholeDatabase) {
                this.wholeDatabase = wholeDatabase;
                return this;
            }

            public SynchronousObject build() {
                return new SynchronousObject(this);
            } 

        } 

    }
    public static class SubscriptionObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SynchronousObject")
        private java.util.List < SynchronousObject> synchronousObject;

        private SubscriptionObject(Builder builder) {
            this.synchronousObject = builder.synchronousObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionObject create() {
            return builder().build();
        }

        /**
         * @return synchronousObject
         */
        public java.util.List < SynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

        public static final class Builder {
            private java.util.List < SynchronousObject> synchronousObject; 

            /**
             * SynchronousObject.
             */
            public Builder synchronousObject(java.util.List < SynchronousObject> synchronousObject) {
                this.synchronousObject = synchronousObject;
                return this;
            }

            public SubscriptionObject build() {
                return new SubscriptionObject(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value that corresponds to the tag key.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SubscriptionInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
        private String consumptionClient;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceCreateTime")
        private String instanceCreateTime;

        @com.aliyun.core.annotation.NameInMap("JobCreateTime")
        private String jobCreateTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
        private SubscriptionDataType subscriptionDataType;

        @com.aliyun.core.annotation.NameInMap("SubscriptionHost")
        private SubscriptionHost subscriptionHost;

        @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceID")
        private String subscriptionInstanceID;

        @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceName")
        private String subscriptionInstanceName;

        @com.aliyun.core.annotation.NameInMap("SubscriptionObject")
        private SubscriptionObject subscriptionObject;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private SubscriptionInstance(Builder builder) {
            this.beginTimestamp = builder.beginTimestamp;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.instanceCreateTime = builder.instanceCreateTime;
            this.jobCreateTime = builder.jobCreateTime;
            this.payType = builder.payType;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.subscribeTopic = builder.subscribeTopic;
            this.subscriptionDataType = builder.subscriptionDataType;
            this.subscriptionHost = builder.subscriptionHost;
            this.subscriptionInstanceID = builder.subscriptionInstanceID;
            this.subscriptionInstanceName = builder.subscriptionInstanceName;
            this.subscriptionObject = builder.subscriptionObject;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionInstance create() {
            return builder().build();
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceCreateTime
         */
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        /**
         * @return jobCreateTime
         */
        public String getJobCreateTime() {
            return this.jobCreateTime;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return sourceEndpoint
         */
        public SourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subscribeTopic
         */
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        /**
         * @return subscriptionDataType
         */
        public SubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        /**
         * @return subscriptionHost
         */
        public SubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        /**
         * @return subscriptionInstanceID
         */
        public String getSubscriptionInstanceID() {
            return this.subscriptionInstanceID;
        }

        /**
         * @return subscriptionInstanceName
         */
        public String getSubscriptionInstanceName() {
            return this.subscriptionInstanceName;
        }

        /**
         * @return subscriptionObject
         */
        public SubscriptionObject getSubscriptionObject() {
            return this.subscriptionObject;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String beginTimestamp; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String endTimestamp; 
            private String errorMessage; 
            private String instanceCreateTime; 
            private String jobCreateTime; 
            private String payType; 
            private SourceEndpoint sourceEndpoint; 
            private String status; 
            private String subscribeTopic; 
            private SubscriptionDataType subscriptionDataType; 
            private SubscriptionHost subscriptionHost; 
            private String subscriptionInstanceID; 
            private String subscriptionInstanceName; 
            private SubscriptionObject subscriptionObject; 
            private Tags tags; 

            /**
             * The start of the time range for change tracking. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The downstream client information, in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The error message returned if change tracking failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The time when the change tracking instance was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
             */
            public Builder instanceCreateTime(String instanceCreateTime) {
                this.instanceCreateTime = instanceCreateTime;
                return this;
            }

            /**
             * The time when the change tracking task was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder jobCreateTime(String jobCreateTime) {
                this.jobCreateTime = jobCreateTime;
                return this;
            }

            /**
             * The billing method of the change tracking instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The status of the change tracking task. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is being prechecked.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Starting**: The task is being started.
             * *   **Normal**: The task is running as expected.
             * *   **Abnormal**: The task is not running as expected.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The topic of the change tracking instance.
             * <p>
             * 
             * >  This parameter is returned only if your change tracking instances are of the new version and you have called the [CreateConsumerGroup](~~122863~~) operation to create a consumer group.
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * The types of operations that are tracked by the task.
             */
            public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * The endpoint of the change tracking instance.
             */
            public Builder subscriptionHost(SubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * The ID of the change tracking instance.
             */
            public Builder subscriptionInstanceID(String subscriptionInstanceID) {
                this.subscriptionInstanceID = subscriptionInstanceID;
                return this;
            }

            /**
             * The name of the change tracking instance.
             */
            public Builder subscriptionInstanceName(String subscriptionInstanceName) {
                this.subscriptionInstanceName = subscriptionInstanceName;
                return this;
            }

            /**
             * The objects for change tracking.
             */
            public Builder subscriptionObject(SubscriptionObject subscriptionObject) {
                this.subscriptionObject = subscriptionObject;
                return this;
            }

            /**
             * The collection of tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public SubscriptionInstance build() {
                return new SubscriptionInstance(this);
            } 

        } 

    }
    public static class SubscriptionInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscriptionInstance")
        private java.util.List < SubscriptionInstance> subscriptionInstance;

        private SubscriptionInstances(Builder builder) {
            this.subscriptionInstance = builder.subscriptionInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionInstances create() {
            return builder().build();
        }

        /**
         * @return subscriptionInstance
         */
        public java.util.List < SubscriptionInstance> getSubscriptionInstance() {
            return this.subscriptionInstance;
        }

        public static final class Builder {
            private java.util.List < SubscriptionInstance> subscriptionInstance; 

            /**
             * SubscriptionInstance.
             */
            public Builder subscriptionInstance(java.util.List < SubscriptionInstance> subscriptionInstance) {
                this.subscriptionInstance = subscriptionInstance;
                return this;
            }

            public SubscriptionInstances build() {
                return new SubscriptionInstances(this);
            } 

        } 

    }
}
