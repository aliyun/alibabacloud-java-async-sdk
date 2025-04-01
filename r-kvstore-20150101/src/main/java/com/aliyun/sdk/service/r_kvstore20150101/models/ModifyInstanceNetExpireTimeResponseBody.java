// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link ModifyInstanceNetExpireTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceNetExpireTimeResponseBody</p>
 */
public class ModifyInstanceNetExpireTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("NetInfoItems")
    private NetInfoItems netInfoItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ModifyInstanceNetExpireTimeResponseBody model) {
            this.instanceId = model.instanceId;
            this.netInfoItems = model.netInfoItems;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Details about the extension period for which the classic network endpoint of the instance is retained.</p>
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9C4AF387-1EA3-4C84-8013-3F6B973EDDF5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceNetExpireTimeResponseBody build() {
            return new ModifyInstanceNetExpireTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceNetExpireTimeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyInstanceNetExpireTimeResponseBody</p>
     */
    public static class NetInfoItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("Port")
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

            private Builder() {
            } 

            private Builder(NetInfoItem model) {
                this.connectionString = model.connectionString;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.expiredTime = model.expiredTime;
                this.IPAddress = model.IPAddress;
                this.port = model.port;
            } 

            /**
             * <p>The endpoint of the classic network.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The network type of the instance. The returned value is <strong>Classic</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Classic</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The expiration time of the classic network endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T09:29:18Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The IP address of the instance in the classic network.</p>
             * 
             * <strong>example:</strong>
             * <p>100.118.142.***</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6379</p>
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
    /**
     * 
     * {@link ModifyInstanceNetExpireTimeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyInstanceNetExpireTimeResponseBody</p>
     */
    public static class NetInfoItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetInfoItem")
        private java.util.List<NetInfoItem> netInfoItem;

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
        public java.util.List<NetInfoItem> getNetInfoItem() {
            return this.netInfoItem;
        }

        public static final class Builder {
            private java.util.List<NetInfoItem> netInfoItem; 

            private Builder() {
            } 

            private Builder(NetInfoItems model) {
                this.netInfoItem = model.netInfoItem;
            } 

            /**
             * NetInfoItem.
             */
            public Builder netInfoItem(java.util.List<NetInfoItem> netInfoItem) {
                this.netInfoItem = netInfoItem;
                return this;
            }

            public NetInfoItems build() {
                return new NetInfoItems(this);
            } 

        } 

    }
}
