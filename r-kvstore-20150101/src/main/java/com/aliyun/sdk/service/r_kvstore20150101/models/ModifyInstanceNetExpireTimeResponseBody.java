// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNetExpireTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceNetExpireTimeResponseBody</p>
 */
public class ModifyInstanceNetExpireTimeResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("NetInfoItems")
    private NetInfoItems netInfoItems;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceNetExpireTimeResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.netInfoItems = builder.netInfoItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNetExpireTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return netInfoItems
     */
    public NetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private NetInfoItems netInfoItems; 
        private String requestId; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetInfoItems.
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceNetExpireTimeResponseBody build() {
            return new ModifyInstanceNetExpireTimeResponseBody(this);
        } 

    } 

    public static class NetInfoItem extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("Port")
        private String port;

        private NetInfoItem(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.expiredTime = builder.expiredTime;
            this.IPAddress = builder.IPAddress;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItem create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return DBInstanceNetType
         */
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String DBInstanceNetType; 
            private String expiredTime; 
            private String IPAddress; 
            private String port; 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * DBInstanceNetType.
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * IPAddress.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public NetInfoItem build() {
                return new NetInfoItem(this);
            } 

        } 

    }
    public static class NetInfoItems extends TeaModel {
        @NameInMap("NetInfoItem")
        private java.util.List < NetInfoItem> netInfoItem;

        private NetInfoItems(Builder builder) {
            this.netInfoItem = builder.netInfoItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItems create() {
            return builder().build();
        }

        /**
         * @return netInfoItem
         */
        public java.util.List < NetInfoItem> getNetInfoItem() {
            return this.netInfoItem;
        }

        public static final class Builder {
            private java.util.List < NetInfoItem> netInfoItem; 

            /**
             * NetInfoItem.
             */
            public Builder netInfoItem(java.util.List < NetInfoItem> netInfoItem) {
                this.netInfoItem = netInfoItem;
                return this;
            }

            public NetInfoItems build() {
                return new NetInfoItems(this);
            } 

        } 

    }
}
