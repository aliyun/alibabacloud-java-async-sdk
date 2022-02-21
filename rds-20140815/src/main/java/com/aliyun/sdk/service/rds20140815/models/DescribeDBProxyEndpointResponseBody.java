// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBProxyEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyEndpointResponseBody</p>
 */
public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    @NameInMap("DBProxyConnectString")
    private String DBProxyConnectString;

    @NameInMap("DBProxyConnectStringNetType")
    private String DBProxyConnectStringNetType;

    @NameInMap("DBProxyConnectStringPort")
    private String DBProxyConnectStringPort;

    @NameInMap("DBProxyEndpointId")
    private String DBProxyEndpointId;

    @NameInMap("DBProxyFeatures")
    private String DBProxyFeatures;

    @NameInMap("DbProxyEndpointAliases")
    private String dbProxyEndpointAliases;

    @NameInMap("DbProxyEndpointReadWriteMode")
    private String dbProxyEndpointReadWriteMode;

    @NameInMap("EndpointConnectItems")
    private EndpointConnectItems endpointConnectItems;

    @NameInMap("ReadOnlyInstanceDistributionType")
    private String readOnlyInstanceDistributionType;

    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    private String readOnlyInstanceMaxDelayTime;

    @NameInMap("ReadOnlyInstanceWeight")
    private String readOnlyInstanceWeight;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBProxyEndpointResponseBody(Builder builder) {
        this.DBProxyConnectString = builder.DBProxyConnectString;
        this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
        this.DBProxyConnectStringPort = builder.DBProxyConnectStringPort;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyFeatures = builder.DBProxyFeatures;
        this.dbProxyEndpointAliases = builder.dbProxyEndpointAliases;
        this.dbProxyEndpointReadWriteMode = builder.dbProxyEndpointReadWriteMode;
        this.endpointConnectItems = builder.endpointConnectItems;
        this.readOnlyInstanceDistributionType = builder.readOnlyInstanceDistributionType;
        this.readOnlyInstanceMaxDelayTime = builder.readOnlyInstanceMaxDelayTime;
        this.readOnlyInstanceWeight = builder.readOnlyInstanceWeight;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBProxyEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBProxyConnectString
     */
    public String getDBProxyConnectString() {
        return this.DBProxyConnectString;
    }

    /**
     * @return DBProxyConnectStringNetType
     */
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    /**
     * @return DBProxyConnectStringPort
     */
    public String getDBProxyConnectStringPort() {
        return this.DBProxyConnectStringPort;
    }

    /**
     * @return DBProxyEndpointId
     */
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    /**
     * @return DBProxyFeatures
     */
    public String getDBProxyFeatures() {
        return this.DBProxyFeatures;
    }

    /**
     * @return dbProxyEndpointAliases
     */
    public String getDbProxyEndpointAliases() {
        return this.dbProxyEndpointAliases;
    }

    /**
     * @return dbProxyEndpointReadWriteMode
     */
    public String getDbProxyEndpointReadWriteMode() {
        return this.dbProxyEndpointReadWriteMode;
    }

    /**
     * @return endpointConnectItems
     */
    public EndpointConnectItems getEndpointConnectItems() {
        return this.endpointConnectItems;
    }

    /**
     * @return readOnlyInstanceDistributionType
     */
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    /**
     * @return readOnlyInstanceMaxDelayTime
     */
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    /**
     * @return readOnlyInstanceWeight
     */
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBProxyConnectString; 
        private String DBProxyConnectStringNetType; 
        private String DBProxyConnectStringPort; 
        private String DBProxyEndpointId; 
        private String DBProxyFeatures; 
        private String dbProxyEndpointAliases; 
        private String dbProxyEndpointReadWriteMode; 
        private EndpointConnectItems endpointConnectItems; 
        private String readOnlyInstanceDistributionType; 
        private String readOnlyInstanceMaxDelayTime; 
        private String readOnlyInstanceWeight; 
        private String requestId; 

        /**
         * DBProxyConnectString.
         */
        public Builder DBProxyConnectString(String DBProxyConnectString) {
            this.DBProxyConnectString = DBProxyConnectString;
            return this;
        }

        /**
         * DBProxyConnectStringNetType.
         */
        public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }

        /**
         * DBProxyConnectStringPort.
         */
        public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }

        /**
         * DBProxyEndpointId.
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * DBProxyFeatures.
         */
        public Builder DBProxyFeatures(String DBProxyFeatures) {
            this.DBProxyFeatures = DBProxyFeatures;
            return this;
        }

        /**
         * DbProxyEndpointAliases.
         */
        public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
            this.dbProxyEndpointAliases = dbProxyEndpointAliases;
            return this;
        }

        /**
         * DbProxyEndpointReadWriteMode.
         */
        public Builder dbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
            this.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
            return this;
        }

        /**
         * EndpointConnectItems.
         */
        public Builder endpointConnectItems(EndpointConnectItems endpointConnectItems) {
            this.endpointConnectItems = endpointConnectItems;
            return this;
        }

        /**
         * ReadOnlyInstanceDistributionType.
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * ReadOnlyInstanceMaxDelayTime.
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * ReadOnlyInstanceWeight.
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBProxyEndpointResponseBody build() {
            return new DescribeDBProxyEndpointResponseBody(this);
        } 

    } 

    public static class EndpointConnectItemsEndpointConnectItems extends TeaModel {
        @NameInMap("DbProxyEndpointConnectString")
        private String dbProxyEndpointConnectString;

        @NameInMap("DbProxyEndpointNetType")
        private String dbProxyEndpointNetType;

        @NameInMap("DbProxyEndpointPort")
        private String dbProxyEndpointPort;

        private EndpointConnectItemsEndpointConnectItems(Builder builder) {
            this.dbProxyEndpointConnectString = builder.dbProxyEndpointConnectString;
            this.dbProxyEndpointNetType = builder.dbProxyEndpointNetType;
            this.dbProxyEndpointPort = builder.dbProxyEndpointPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConnectItemsEndpointConnectItems create() {
            return builder().build();
        }

        /**
         * @return dbProxyEndpointConnectString
         */
        public String getDbProxyEndpointConnectString() {
            return this.dbProxyEndpointConnectString;
        }

        /**
         * @return dbProxyEndpointNetType
         */
        public String getDbProxyEndpointNetType() {
            return this.dbProxyEndpointNetType;
        }

        /**
         * @return dbProxyEndpointPort
         */
        public String getDbProxyEndpointPort() {
            return this.dbProxyEndpointPort;
        }

        public static final class Builder {
            private String dbProxyEndpointConnectString; 
            private String dbProxyEndpointNetType; 
            private String dbProxyEndpointPort; 

            /**
             * DbProxyEndpointConnectString.
             */
            public Builder dbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
                this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
                return this;
            }

            /**
             * DbProxyEndpointNetType.
             */
            public Builder dbProxyEndpointNetType(String dbProxyEndpointNetType) {
                this.dbProxyEndpointNetType = dbProxyEndpointNetType;
                return this;
            }

            /**
             * DbProxyEndpointPort.
             */
            public Builder dbProxyEndpointPort(String dbProxyEndpointPort) {
                this.dbProxyEndpointPort = dbProxyEndpointPort;
                return this;
            }

            public EndpointConnectItemsEndpointConnectItems build() {
                return new EndpointConnectItemsEndpointConnectItems(this);
            } 

        } 

    }
    public static class EndpointConnectItems extends TeaModel {
        @NameInMap("EndpointConnectItems")
        private java.util.List < EndpointConnectItemsEndpointConnectItems> endpointConnectItems;

        private EndpointConnectItems(Builder builder) {
            this.endpointConnectItems = builder.endpointConnectItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConnectItems create() {
            return builder().build();
        }

        /**
         * @return endpointConnectItems
         */
        public java.util.List < EndpointConnectItemsEndpointConnectItems> getEndpointConnectItems() {
            return this.endpointConnectItems;
        }

        public static final class Builder {
            private java.util.List < EndpointConnectItemsEndpointConnectItems> endpointConnectItems; 

            /**
             * EndpointConnectItems.
             */
            public Builder endpointConnectItems(java.util.List < EndpointConnectItemsEndpointConnectItems> endpointConnectItems) {
                this.endpointConnectItems = endpointConnectItems;
                return this;
            }

            public EndpointConnectItems build() {
                return new EndpointConnectItems(this);
            } 

        } 

    }
}
