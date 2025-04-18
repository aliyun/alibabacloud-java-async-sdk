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
 * {@link GetTransitRouterFlowTopNResponseBody} extends {@link TeaModel}
 *
 * <p>GetTransitRouterFlowTopNResponseBody</p>
 */
public class GetTransitRouterFlowTopNResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterFlowTopN")
    private java.util.List<TransitRouterFlowTopN> transitRouterFlowTopN;

    private GetTransitRouterFlowTopNResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterFlowTopN = builder.transitRouterFlowTopN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransitRouterFlowTopNResponseBody create() {
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
     * @return transitRouterFlowTopN
     */
    public java.util.List<TransitRouterFlowTopN> getTransitRouterFlowTopN() {
        return this.transitRouterFlowTopN;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TransitRouterFlowTopN> transitRouterFlowTopN; 

        private Builder() {
        } 

        private Builder(GetTransitRouterFlowTopNResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterFlowTopN = model.transitRouterFlowTopN;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ranking result of inter-region traffic data.</p>
         */
        public Builder transitRouterFlowTopN(java.util.List<TransitRouterFlowTopN> transitRouterFlowTopN) {
            this.transitRouterFlowTopN = transitRouterFlowTopN;
            return this;
        }

        public GetTransitRouterFlowTopNResponseBody build() {
            return new GetTransitRouterFlowTopNResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTransitRouterFlowTopNResponseBody} extends {@link TeaModel}
     *
     * <p>GetTransitRouterFlowTopNResponseBody</p>
     */
    public static class TransitRouterFlowTopN extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("BandwithPackageId")
        private String bandwithPackageId;

        @com.aliyun.core.annotation.NameInMap("Bytes")
        private Double bytes;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("OtherIp")
        private String otherIp;

        @com.aliyun.core.annotation.NameInMap("OtherPort")
        private String otherPort;

        @com.aliyun.core.annotation.NameInMap("OtherRegion")
        private String otherRegion;

        @com.aliyun.core.annotation.NameInMap("Packets")
        private Double packets;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("ThisIp")
        private String thisIp;

        @com.aliyun.core.annotation.NameInMap("ThisPort")
        private String thisPort;

        @com.aliyun.core.annotation.NameInMap("ThisRegion")
        private String thisRegion;

        private TransitRouterFlowTopN(Builder builder) {
            this.accountId = builder.accountId;
            this.bandwithPackageId = builder.bandwithPackageId;
            this.bytes = builder.bytes;
            this.cenId = builder.cenId;
            this.endTime = builder.endTime;
            this.otherIp = builder.otherIp;
            this.otherPort = builder.otherPort;
            this.otherRegion = builder.otherRegion;
            this.packets = builder.packets;
            this.protocol = builder.protocol;
            this.startTime = builder.startTime;
            this.thisIp = builder.thisIp;
            this.thisPort = builder.thisPort;
            this.thisRegion = builder.thisRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterFlowTopN create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return bandwithPackageId
         */
        public String getBandwithPackageId() {
            return this.bandwithPackageId;
        }

        /**
         * @return bytes
         */
        public Double getBytes() {
            return this.bytes;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return otherRegion
         */
        public String getOtherRegion() {
            return this.otherRegion;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return thisIp
         */
        public String getThisIp() {
            return this.thisIp;
        }

        /**
         * @return thisPort
         */
        public String getThisPort() {
            return this.thisPort;
        }

        /**
         * @return thisRegion
         */
        public String getThisRegion() {
            return this.thisRegion;
        }

        public static final class Builder {
            private String accountId; 
            private String bandwithPackageId; 
            private Double bytes; 
            private String cenId; 
            private String endTime; 
            private String otherIp; 
            private String otherPort; 
            private String otherRegion; 
            private Double packets; 
            private String protocol; 
            private String startTime; 
            private String thisIp; 
            private String thisPort; 
            private String thisRegion; 

            private Builder() {
            } 

            private Builder(TransitRouterFlowTopN model) {
                this.accountId = model.accountId;
                this.bandwithPackageId = model.bandwithPackageId;
                this.bytes = model.bytes;
                this.cenId = model.cenId;
                this.endTime = model.endTime;
                this.otherIp = model.otherIp;
                this.otherPort = model.otherPort;
                this.otherRegion = model.otherRegion;
                this.packets = model.packets;
                this.protocol = model.protocol;
                this.startTime = model.startTime;
                this.thisIp = model.thisIp;
                this.thisPort = model.thisPort;
                this.thisRegion = model.thisRegion;
            } 

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>118639953821xxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the CEN bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>cenbwp-ia8kw1zjv4hyal****</p>
             */
            public Builder bandwithPackageId(String bandwithPackageId) {
                this.bandwithPackageId = bandwithPackageId;
                return this;
            }

            /**
             * <p>The total volume of traffic in the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>188</p>
             */
            public Builder bytes(Double bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-ia8kw1zjv4hyal****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The end of the time range that you queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-31T06:40:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The remote IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.216.XX.XX</p>
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * <p>The remote port.</p>
             * 
             * <strong>example:</strong>
             * <p>53470</p>
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * <p>The remote region where the <strong>remote IP address</strong> resides.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder otherRegion(String otherRegion) {
                this.otherRegion = otherRegion;
                return this;
            }

            /**
             * <p>The total number of packets in the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
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
             * <p>The beginning of the time range that you queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-31T05:40:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The local IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.8.XX.XX</p>
             */
            public Builder thisIp(String thisIp) {
                this.thisIp = thisIp;
                return this;
            }

            /**
             * <p>The local port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder thisPort(String thisPort) {
                this.thisPort = thisPort;
                return this;
            }

            /**
             * <p>The local region where the <strong>local IP address</strong> resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder thisRegion(String thisRegion) {
                this.thisRegion = thisRegion;
                return this;
            }

            public TransitRouterFlowTopN build() {
                return new TransitRouterFlowTopN(this);
            } 

        } 

    }
}
