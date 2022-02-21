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
         * DeviceIds.
         */
        public Builder deviceIds(java.util.List < String > deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceDetailInfos.
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
        private String ID;

        @NameInMap("IP")
        private String IP;

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
            this.ID = builder.ID;
            this.IP = builder.IP;
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
         * @return ID
         */
        public String getID() {
            return this.ID;
        }

        /**
         * @return IP
         */
        public String getIP() {
            return this.IP;
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
            private String ID; 
            private String IP; 
            private String ISP; 
            private String mac; 
            private String regionID; 
            private String server; 
            private String status; 
            private String type; 

            /**
             * ID.
             */
            public Builder ID(String ID) {
                this.ID = ID;
                return this;
            }

            /**
             * IP.
             */
            public Builder IP(String IP) {
                this.IP = IP;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * RegionID.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
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
             * Type.
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
