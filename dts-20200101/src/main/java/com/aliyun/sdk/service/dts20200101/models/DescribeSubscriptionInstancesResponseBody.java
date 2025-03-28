// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSubscriptionInstancesResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.subscriptionInstances = model.subscriptionInstances;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries that can be displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC3BAAF2-74E3-4471-8EB5-96202D6A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of change tracking instances and the details of each instance.</p>
         */
        public Builder subscriptionInstances(SubscriptionInstances subscriptionInstances) {
            this.subscriptionInstances = subscriptionInstances;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of change tracking instances that belong to your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSubscriptionInstancesResponseBody build() {
            return new DescribeSubscriptionInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * <blockquote>
             * <p> This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
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
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SubscriptionDataType model) {
                this.DDL = model.DDL;
                this.DML = model.DML;
            } 

            /**
             * <p>Indicates whether data definition language (DDL) operations are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder DDL(Boolean DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * <p>Indicates whether data manipulation language (DML) operations are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SubscriptionHost model) {
                this.privateHost = model.privateHost;
                this.publicHost = model.publicHost;
                this.VPCHost = model.VPCHost;
            } 

            /**
             * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-vpc.aliyuncs.com:18003</p>
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
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
    public static class TableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<String> table;

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
        public java.util.List<String> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<String> table; 

            private Builder() {
            } 

            private Builder(TableList model) {
                this.table = model.table;
            } 

            /**
             * Table.
             */
            public Builder table(java.util.List<String> table) {
                this.table = table;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SynchronousObject model) {
                this.databaseName = model.databaseName;
                this.tableList = model.tableList;
                this.wholeDatabase = model.wholeDatabase;
            } 

            /**
             * <p>The name of the database to which the object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The table name.</p>
             */
            public Builder tableList(TableList tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * <p>Indicates whether the data of an entire database is tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
    public static class SubscriptionObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SynchronousObject")
        private java.util.List<SynchronousObject> synchronousObject;

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
        public java.util.List<SynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

        public static final class Builder {
            private java.util.List<SynchronousObject> synchronousObject; 

            private Builder() {
            } 

            private Builder(SubscriptionObject model) {
                this.synchronousObject = model.synchronousObject;
            } 

            /**
             * SynchronousObject.
             */
            public Builder synchronousObject(java.util.List<SynchronousObject> synchronousObject) {
                this.synchronousObject = synchronousObject;
                return this;
            }

            public SubscriptionObject build() {
                return new SubscriptionObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testkey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value that corresponds to the tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testvalue1</p>
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
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SubscriptionInstance model) {
                this.beginTimestamp = model.beginTimestamp;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.endTimestamp = model.endTimestamp;
                this.errorMessage = model.errorMessage;
                this.instanceCreateTime = model.instanceCreateTime;
                this.jobCreateTime = model.jobCreateTime;
                this.payType = model.payType;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.subscribeTopic = model.subscribeTopic;
                this.subscriptionDataType = model.subscriptionDataType;
                this.subscriptionHost = model.subscriptionHost;
                this.subscriptionInstanceID = model.subscriptionInstanceID;
                this.subscriptionInstanceName = model.subscriptionInstanceName;
                this.subscriptionObject = model.subscriptionObject;
                this.tags = model.tags;
            } 

            /**
             * <p>The start of the time range for change tracking. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T08:25:43Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T09:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information, in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
             * 
             * <strong>example:</strong>
             * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T10:17:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned if change tracking failed.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the change tracking instance was created. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T02:48:20Z</p>
             */
            public Builder instanceCreateTime(String instanceCreateTime) {
                this.instanceCreateTime = instanceCreateTime;
                return this;
            }

            /**
             * <p>The time when the change tracking task was created. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T02:48:20Z</p>
             */
            public Builder jobCreateTime(String jobCreateTime) {
                this.jobCreateTime = jobCreateTime;
                return this;
            }

            /**
             * <p>The billing method of the change tracking instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The status of the change tracking task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
             * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
             * <li><strong>Starting</strong>: The task is being started.</li>
             * <li><strong>Normal</strong>: The task is running as expected.</li>
             * <li><strong>Abnormal</strong>: The task is not running as expected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The topic of the change tracking instance.</p>
             * <blockquote>
             * <p> This parameter is returned only if your change tracking instances are of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * <p>The types of operations that are tracked by the task.</p>
             */
            public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * <p>The endpoint of the change tracking instance.</p>
             */
            public Builder subscriptionHost(SubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * <p>The ID of the change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder subscriptionInstanceID(String subscriptionInstanceID) {
                this.subscriptionInstanceID = subscriptionInstanceID;
                return this;
            }

            /**
             * <p>The name of the change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder subscriptionInstanceName(String subscriptionInstanceName) {
                this.subscriptionInstanceName = subscriptionInstanceName;
                return this;
            }

            /**
             * <p>The objects for change tracking.</p>
             */
            public Builder subscriptionObject(SubscriptionObject subscriptionObject) {
                this.subscriptionObject = subscriptionObject;
                return this;
            }

            /**
             * <p>The collection of tags.</p>
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
    /**
     * 
     * {@link DescribeSubscriptionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionInstancesResponseBody</p>
     */
    public static class SubscriptionInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscriptionInstance")
        private java.util.List<SubscriptionInstance> subscriptionInstance;

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
        public java.util.List<SubscriptionInstance> getSubscriptionInstance() {
            return this.subscriptionInstance;
        }

        public static final class Builder {
            private java.util.List<SubscriptionInstance> subscriptionInstance; 

            private Builder() {
            } 

            private Builder(SubscriptionInstances model) {
                this.subscriptionInstance = model.subscriptionInstance;
            } 

            /**
             * SubscriptionInstance.
             */
            public Builder subscriptionInstance(java.util.List<SubscriptionInstance> subscriptionInstance) {
                this.subscriptionInstance = subscriptionInstance;
                return this;
            }

            public SubscriptionInstances build() {
                return new SubscriptionInstances(this);
            } 

        } 

    }
}
