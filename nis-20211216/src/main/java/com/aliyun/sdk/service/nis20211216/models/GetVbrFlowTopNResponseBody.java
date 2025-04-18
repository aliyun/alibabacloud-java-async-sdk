// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetVbrFlowTopNResponseBody} extends {@link TeaModel}
 *
 * <p>GetVbrFlowTopNResponseBody</p>
 */
public class GetVbrFlowTopNResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterFlowlogTopN")
    private java.util.List<VirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VirtualBorderRouterFlowlogTopN> getVirtualBorderRouterFlowlogTopN() {
        return this.virtualBorderRouterFlowlogTopN;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN; 

        private Builder() {
        } 

        private Builder(GetVbrFlowTopNResponseBody model) {
            this.requestId = model.requestId;
            this.virtualBorderRouterFlowlogTopN = model.virtualBorderRouterFlowlogTopN;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ranking result of hybrid cloud traffic data.</p>
         */
        public Builder virtualBorderRouterFlowlogTopN(java.util.List<VirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN) {
            this.virtualBorderRouterFlowlogTopN = virtualBorderRouterFlowlogTopN;
            return this;
        }

        public GetVbrFlowTopNResponseBody build() {
            return new GetVbrFlowTopNResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVbrFlowTopNResponseBody} extends {@link TeaModel}
     *
     * <p>GetVbrFlowTopNResponseBody</p>
     */
    public static class VirtualBorderRouterFlowlogTopN extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AttachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Double bytes;

        @com.aliyun.core.annotation.NameInMap("CloudIp")
        private String cloudIp;

        @com.aliyun.core.annotation.NameInMap("CloudPort")
        private String cloudPort;

        @com.aliyun.core.annotation.NameInMap("CloudRegion")
        private String cloudRegion;

        @com.aliyun.core.annotation.NameInMap("OtherIp")
        private String otherIp;

        @com.aliyun.core.annotation.NameInMap("OtherPort")
        private String otherPort;

        @com.aliyun.core.annotation.NameInMap("Packets")
        private Double packets;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterId")
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

            private Builder() {
            } 

            private Builder(VirtualBorderRouterFlowlogTopN model) {
                this.accountId = model.accountId;
                this.attachmentId = model.attachmentId;
                this.bytes = model.bytes;
                this.cloudIp = model.cloudIp;
                this.cloudPort = model.cloudPort;
                this.cloudRegion = model.cloudRegion;
                this.otherIp = model.otherIp;
                this.otherPort = model.otherPort;
                this.packets = model.packets;
                this.protocol = model.protocol;
                this.virtualBorderRouterId = model.virtualBorderRouterId;
            } 

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>156237031628****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The CEN connection ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-u6v1j3jre0fe9h****</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The total volume of traffic in the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>108</p>
             */
            public Builder bytes(Double bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * <p>The local IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>120.24.X.X</p>
             */
            public Builder cloudIp(String cloudIp) {
                this.cloudIp = cloudIp;
                return this;
            }

            /**
             * <p>The local port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder cloudPort(String cloudPort) {
                this.cloudPort = cloudPort;
                return this;
            }

            /**
             * <p>The local region where the local IP address resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * <p>The remote IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>222.85.X.X</p>
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * <p>The remote port.</p>
             * 
             * <strong>example:</strong>
             * <p>10965</p>
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * <p>The total number of packets in the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder packets(Double packets) {
                this.packets = packets;
                return this;
            }

            /**
             * <p>The protocol number.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the VBR that is associated with the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-k1atj46citwuek42j****</p>
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
