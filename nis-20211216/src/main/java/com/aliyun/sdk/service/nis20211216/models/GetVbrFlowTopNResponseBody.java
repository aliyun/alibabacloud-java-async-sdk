// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVbrFlowTopNResponseBody} extends {@link TeaModel}
 *
 * <p>GetVbrFlowTopNResponseBody</p>
 */
public class GetVbrFlowTopNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualBorderRouterFlowlogTopN")
    private java.util.List < VirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN;

    private GetVbrFlowTopNResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualBorderRouterFlowlogTopN = builder.virtualBorderRouterFlowlogTopN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVbrFlowTopNResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualBorderRouterFlowlogTopN
     */
    public java.util.List < VirtualBorderRouterFlowlogTopN> getVirtualBorderRouterFlowlogTopN() {
        return this.virtualBorderRouterFlowlogTopN;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VirtualBorderRouterFlowlogTopN.
         */
        public Builder virtualBorderRouterFlowlogTopN(java.util.List < VirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN) {
            this.virtualBorderRouterFlowlogTopN = virtualBorderRouterFlowlogTopN;
            return this;
        }

        public GetVbrFlowTopNResponseBody build() {
            return new GetVbrFlowTopNResponseBody(this);
        } 

    } 

    public static class VirtualBorderRouterFlowlogTopN extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AttachmentId")
        private String attachmentId;

        @NameInMap("Bytes")
        private Double bytes;

        @NameInMap("CloudIp")
        private String cloudIp;

        @NameInMap("CloudPort")
        private String cloudPort;

        @NameInMap("CloudRegion")
        private String cloudRegion;

        @NameInMap("OtherIp")
        private String otherIp;

        @NameInMap("OtherPort")
        private String otherPort;

        @NameInMap("Packets")
        private Double packets;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("VirtualBorderRouterId")
        private String virtualBorderRouterId;

        private VirtualBorderRouterFlowlogTopN(Builder builder) {
            this.accountId = builder.accountId;
            this.attachmentId = builder.attachmentId;
            this.bytes = builder.bytes;
            this.cloudIp = builder.cloudIp;
            this.cloudPort = builder.cloudPort;
            this.cloudRegion = builder.cloudRegion;
            this.otherIp = builder.otherIp;
            this.otherPort = builder.otherPort;
            this.packets = builder.packets;
            this.protocol = builder.protocol;
            this.virtualBorderRouterId = builder.virtualBorderRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterFlowlogTopN create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return bytes
         */
        public Double getBytes() {
            return this.bytes;
        }

        /**
         * @return cloudIp
         */
        public String getCloudIp() {
            return this.cloudIp;
        }

        /**
         * @return cloudPort
         */
        public String getCloudPort() {
            return this.cloudPort;
        }

        /**
         * @return cloudRegion
         */
        public String getCloudRegion() {
            return this.cloudRegion;
        }

        /**
         * @return otherIp
         */
        public String getOtherIp() {
            return this.otherIp;
        }

        /**
         * @return otherPort
         */
        public String getOtherPort() {
            return this.otherPort;
        }

        /**
         * @return packets
         */
        public Double getPackets() {
            return this.packets;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return virtualBorderRouterId
         */
        public String getVirtualBorderRouterId() {
            return this.virtualBorderRouterId;
        }

        public static final class Builder {
            private String accountId; 
            private String attachmentId; 
            private Double bytes; 
            private String cloudIp; 
            private String cloudPort; 
            private String cloudRegion; 
            private String otherIp; 
            private String otherPort; 
            private Double packets; 
            private String protocol; 
            private String virtualBorderRouterId; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AttachmentId.
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * Bytes.
             */
            public Builder bytes(Double bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * CloudIp.
             */
            public Builder cloudIp(String cloudIp) {
                this.cloudIp = cloudIp;
                return this;
            }

            /**
             * CloudPort.
             */
            public Builder cloudPort(String cloudPort) {
                this.cloudPort = cloudPort;
                return this;
            }

            /**
             * CloudRegion.
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * OtherIp.
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * OtherPort.
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * Packets.
             */
            public Builder packets(Double packets) {
                this.packets = packets;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * VirtualBorderRouterId.
             */
            public Builder virtualBorderRouterId(String virtualBorderRouterId) {
                this.virtualBorderRouterId = virtualBorderRouterId;
                return this;
            }

            public VirtualBorderRouterFlowlogTopN build() {
                return new VirtualBorderRouterFlowlogTopN(this);
            } 

        } 

    }
}
