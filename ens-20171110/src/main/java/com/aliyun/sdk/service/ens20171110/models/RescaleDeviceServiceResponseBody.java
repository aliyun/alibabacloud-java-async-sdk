// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RescaleDeviceServiceResponseBody} extends {@link TeaModel}
 *
 * <p>RescaleDeviceServiceResponseBody</p>
 */
public class RescaleDeviceServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceIds")
    private java.util.List<String> deviceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceDetailInfos")
    private java.util.List<ResourceDetailInfos> resourceDetailInfos;

    private RescaleDeviceServiceResponseBody(Builder builder) {
        this.deviceIds = builder.deviceIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.resourceDetailInfos = builder.resourceDetailInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleDeviceServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceIds
     */
    public java.util.List<String> getDeviceIds() {
        return this.deviceIds;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDetailInfos
     */
    public java.util.List<ResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    public static final class Builder {
        private java.util.List<String> deviceIds; 
        private String orderId; 
        private String requestId; 
        private java.util.List<ResourceDetailInfos> resourceDetailInfos; 

        private Builder() {
        } 

        private Builder(RescaleDeviceServiceResponseBody model) {
            this.deviceIds = model.deviceIds;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.resourceDetailInfos = model.resourceDetailInfos;
        } 

        /**
         * <p>The IDs of the devices.</p>
         */
        public Builder deviceIds(java.util.List<String> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>b3b5bb9a-4e0b-4cac-8ebf-e5e015726723</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3F3F3570-E721-53F6-853F-37B7725AC6CB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The key properties of the device.</p>
         */
        public Builder resourceDetailInfos(java.util.List<ResourceDetailInfos> resourceDetailInfos) {
            this.resourceDetailInfos = resourceDetailInfos;
            return this;
        }

        public RescaleDeviceServiceResponseBody build() {
            return new RescaleDeviceServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RescaleDeviceServiceResponseBody} extends {@link TeaModel}
     *
     * <p>RescaleDeviceServiceResponseBody</p>
     */
    public static class ResourceDetailInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ID")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("RegionID")
        private String regionID;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResourceDetailInfos(Builder builder) {
            this.id = builder.id;
            this.ip = builder.ip;
            this.ISP = builder.ISP;
            this.mac = builder.mac;
            this.regionID = builder.regionID;
            this.server = builder.server;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDetailInfos create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String ip; 
            private String ISP; 
            private String mac; 
            private String regionID; 
            private String server; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResourceDetailInfos model) {
                this.id = model.id;
                this.ip = model.ip;
                this.ISP = model.ISP;
                this.mac = model.mac;
                this.regionID = model.regionID;
                this.server = model.server;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>h-uf6009zoa6hdbjyqxcn1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>10.152.196.36</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>telecom</p>
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * <p>The media access control (MAC) address of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>24:0B:88:04:71:E0</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The ID of the edge node to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chongqing-1</p>
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * <p>The name of the server on which the device is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>ens-nc2</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The status of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.ac6.large</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResourceDetailInfos build() {
                return new ResourceDetailInfos(this);
            } 

        } 

    }
}
