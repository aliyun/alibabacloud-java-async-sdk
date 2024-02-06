// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleDeviceServiceResponseBody} extends {@link TeaModel}
 *
 * <p>RescaleDeviceServiceResponseBody</p>
 */
public class RescaleDeviceServiceResponseBody extends TeaModel {
    @NameInMap("DeviceIds")
    private java.util.List < String > deviceIds;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDetailInfos")
    private java.util.List < ResourceDetailInfos> resourceDetailInfos;

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

    /**
     * @return deviceIds
     */
    public java.util.List < String > getDeviceIds() {
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
    public java.util.List < ResourceDetailInfos> getResourceDetailInfos() {
        return this.resourceDetailInfos;
    }

    public static final class Builder {
        private java.util.List < String > deviceIds; 
        private String orderId; 
        private String requestId; 
        private java.util.List < ResourceDetailInfos> resourceDetailInfos; 

        /**
         * The IDs of the devices.
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
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
         * The key properties of the device.
         */
        public Builder resourceDetailInfos(java.util.List < ResourceDetailInfos> resourceDetailInfos) {
            this.resourceDetailInfos = resourceDetailInfos;
            return this;
        }

        public RescaleDeviceServiceResponseBody build() {
            return new RescaleDeviceServiceResponseBody(this);
        } 

    } 

    public static class ResourceDetailInfos extends TeaModel {
        @NameInMap("ID")
        private String id;

        @NameInMap("IP")
        private String ip;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("RegionID")
        private String regionID;

        @NameInMap("Server")
        private String server;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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

            /**
             * The ID of the device.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The IP address of the device.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The Internet service provider (ISP) to which the device belongs.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The media access control (MAC) address of the device.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * The ID of the edge node to which the device belongs.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * The name of the server on which the device is deployed.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * The status of the device.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the instance.
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
