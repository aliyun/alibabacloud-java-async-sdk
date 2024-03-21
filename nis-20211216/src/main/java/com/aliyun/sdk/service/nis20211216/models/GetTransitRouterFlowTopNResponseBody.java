// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTransitRouterFlowTopNResponseBody} extends {@link TeaModel}
 *
 * <p>GetTransitRouterFlowTopNResponseBody</p>
 */
public class GetTransitRouterFlowTopNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransitRouterFlowTopN")
    private java.util.List < TransitRouterFlowTopN> transitRouterFlowTopN;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterFlowTopN
     */
    public java.util.List < TransitRouterFlowTopN> getTransitRouterFlowTopN() {
        return this.transitRouterFlowTopN;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TransitRouterFlowTopN> transitRouterFlowTopN; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ranking result of inter-region traffic data.
         */
        public Builder transitRouterFlowTopN(java.util.List < TransitRouterFlowTopN> transitRouterFlowTopN) {
            this.transitRouterFlowTopN = transitRouterFlowTopN;
            return this;
        }

        public GetTransitRouterFlowTopNResponseBody build() {
            return new GetTransitRouterFlowTopNResponseBody(this);
        } 

    } 

    public static class TransitRouterFlowTopN extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("BandwithPackageId")
        private String bandwithPackageId;

        @NameInMap("Bytes")
        private Double bytes;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("OtherIp")
        private String otherIp;

        @NameInMap("OtherPort")
        private String otherPort;

        @NameInMap("OtherRegion")
        private String otherRegion;

        @NameInMap("Packets")
        private Double packets;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("ThisIp")
        private String thisIp;

        @NameInMap("ThisPort")
        private String thisPort;

        @NameInMap("ThisRegion")
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

            /**
             * The account ID.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the CEN bandwidth plan.
             */
            public Builder bandwithPackageId(String bandwithPackageId) {
                this.bandwithPackageId = bandwithPackageId;
                return this;
            }

            /**
             * The total volume of traffic in the specified time range.
             */
            public Builder bytes(Double bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The end of the time range that you queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The remote IP address.
             */
            public Builder otherIp(String otherIp) {
                this.otherIp = otherIp;
                return this;
            }

            /**
             * The remote port.
             */
            public Builder otherPort(String otherPort) {
                this.otherPort = otherPort;
                return this;
            }

            /**
             * The remote region where the **remote IP address** resides.
             */
            public Builder otherRegion(String otherRegion) {
                this.otherRegion = otherRegion;
                return this;
            }

            /**
             * The total number of packets in the specified time range.
             */
            public Builder packets(Double packets) {
                this.packets = packets;
                return this;
            }

            /**
             * The protocol number.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The beginning of the time range that you queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The local IP address.
             */
            public Builder thisIp(String thisIp) {
                this.thisIp = thisIp;
                return this;
            }

            /**
             * The local port.
             */
            public Builder thisPort(String thisPort) {
                this.thisPort = thisPort;
                return this;
            }

            /**
             * The local region where the **local IP address** resides.
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
