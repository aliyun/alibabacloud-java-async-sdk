// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionInstancesResponseBody</p>
 */
public class DescribeSubscriptionInstancesResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubscriptionInstances")
    private SubscriptionInstances subscriptionInstances;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalRecordCount")
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
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * SubscriptionInstances.
         */
        public Builder subscriptionInstances(SubscriptionInstances subscriptionInstances) {
            this.subscriptionInstances = subscriptionInstances;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalRecordCount.
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
        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
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
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InstanceType.
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
        @NameInMap("DDL")
        private Boolean DDL;

        @NameInMap("DML")
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
             * DDL.
             */
            public Builder DDL(Boolean DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * DML.
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
        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("PublicHost")
        private String publicHost;

        @NameInMap("VPCHost")
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
             * PrivateHost.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * PublicHost.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * VPCHost.
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
        @NameInMap("Table")
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
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("TableList")
        private TableList tableList;

        @NameInMap("WholeDatabase")
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
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * TableList.
             */
            public Builder tableList(TableList tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * WholeDatabase.
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
        @NameInMap("SynchronousObject")
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("Tag")
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
        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("InstanceCreateTime")
        private String instanceCreateTime;

        @NameInMap("JobCreateTime")
        private String jobCreateTime;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        private SubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        private SubscriptionHost subscriptionHost;

        @NameInMap("SubscriptionInstanceID")
        private String subscriptionInstanceID;

        @NameInMap("SubscriptionInstanceName")
        private String subscriptionInstanceName;

        @NameInMap("SubscriptionObject")
        private SubscriptionObject subscriptionObject;

        @NameInMap("Tags")
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
             * BeginTimestamp.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * ConsumptionCheckpoint.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * ConsumptionClient.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * EndTimestamp.
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * InstanceCreateTime.
             */
            public Builder instanceCreateTime(String instanceCreateTime) {
                this.instanceCreateTime = instanceCreateTime;
                return this;
            }

            /**
             * JobCreateTime.
             */
            public Builder jobCreateTime(String jobCreateTime) {
                this.jobCreateTime = jobCreateTime;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * SourceEndpoint.
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
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
             * SubscribeTopic.
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * SubscriptionDataType.
             */
            public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * SubscriptionHost.
             */
            public Builder subscriptionHost(SubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * SubscriptionInstanceID.
             */
            public Builder subscriptionInstanceID(String subscriptionInstanceID) {
                this.subscriptionInstanceID = subscriptionInstanceID;
                return this;
            }

            /**
             * SubscriptionInstanceName.
             */
            public Builder subscriptionInstanceName(String subscriptionInstanceName) {
                this.subscriptionInstanceName = subscriptionInstanceName;
                return this;
            }

            /**
             * SubscriptionObject.
             */
            public Builder subscriptionObject(SubscriptionObject subscriptionObject) {
                this.subscriptionObject = subscriptionObject;
                return this;
            }

            /**
             * Tags.
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
        @NameInMap("SubscriptionInstance")
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
