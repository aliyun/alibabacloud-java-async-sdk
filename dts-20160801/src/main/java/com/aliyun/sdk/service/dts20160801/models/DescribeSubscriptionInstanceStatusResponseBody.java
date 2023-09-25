// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionInstanceStatusResponseBody</p>
 */
public class DescribeSubscriptionInstanceStatusResponseBody extends TeaModel {
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

    @NameInMap("PayType")
    private String payType;

    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubscriptionDataType")
    private SubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionInstanceID")
    private String subscriptionInstanceID;

    @NameInMap("SubscriptionInstanceName")
    private String subscriptionInstanceName;

    @NameInMap("SubscriptionObject")
    private SubscriptionObject subscriptionObject;

    private DescribeSubscriptionInstanceStatusResponseBody(Builder builder) {
        this.beginTimestamp = builder.beginTimestamp;
        this.consumptionCheckpoint = builder.consumptionCheckpoint;
        this.consumptionClient = builder.consumptionClient;
        this.endTimestamp = builder.endTimestamp;
        this.errorMessage = builder.errorMessage;
        this.payType = builder.payType;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.status = builder.status;
        this.subscriptionDataType = builder.subscriptionDataType;
        this.subscriptionInstanceID = builder.subscriptionInstanceID;
        this.subscriptionInstanceName = builder.subscriptionInstanceName;
        this.subscriptionObject = builder.subscriptionObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionInstanceStatusResponseBody create() {
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
     * @return subscriptionDataType
     */
    public SubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
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

    public static final class Builder {
        private String beginTimestamp; 
        private String consumptionCheckpoint; 
        private String consumptionClient; 
        private String endTimestamp; 
        private String errorMessage; 
        private String payType; 
        private SourceEndpoint sourceEndpoint; 
        private String status; 
        private SubscriptionDataType subscriptionDataType; 
        private String subscriptionInstanceID; 
        private String subscriptionInstanceName; 
        private SubscriptionObject subscriptionObject; 

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
         * SubscriptionDataType.
         */
        public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
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

        public DescribeSubscriptionInstanceStatusResponseBody build() {
            return new DescribeSubscriptionInstanceStatusResponseBody(this);
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
}
