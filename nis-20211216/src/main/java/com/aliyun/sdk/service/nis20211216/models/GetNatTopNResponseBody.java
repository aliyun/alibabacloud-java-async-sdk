// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNatTopNResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatTopNResponseBody</p>
 */
public class GetNatTopNResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTopNOpen")
    private Boolean isTopNOpen;

    @com.aliyun.core.annotation.NameInMap("NatGatewayTopN")
    private java.util.List < NatGatewayTopN> natGatewayTopN;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNatTopNResponseBody(Builder builder) {
        this.isTopNOpen = builder.isTopNOpen;
        this.natGatewayTopN = builder.natGatewayTopN;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatTopNResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTopNOpen
     */
    public Boolean getIsTopNOpen() {
        return this.isTopNOpen;
    }

    /**
     * @return natGatewayTopN
     */
    public java.util.List < NatGatewayTopN> getNatGatewayTopN() {
        return this.natGatewayTopN;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isTopNOpen; 
        private java.util.List < NatGatewayTopN> natGatewayTopN; 
        private String requestId; 

        /**
         * Indicates whether Network Intelligence Service (NIS) is activated. The NatGatewayTopN parameter returns an empty array when NIS is not activated.
         * <p>
         * 
         * *   **true**: activated
         * *   **false**: not activated
         */
        public Builder isTopNOpen(Boolean isTopNOpen) {
            this.isTopNOpen = isTopNOpen;
            return this;
        }

        /**
         * An array of statistics about real-time SNAT performance ranking.
         */
        public Builder natGatewayTopN(java.util.List < NatGatewayTopN> natGatewayTopN) {
            this.natGatewayTopN = natGatewayTopN;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNatTopNResponseBody build() {
            return new GetNatTopNResponseBody(this);
        } 

    } 

    public static class NatGatewayTopN extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionCount")
        private Float activeSessionCount;

        @com.aliyun.core.annotation.NameInMap("InBps")
        private Float inBps;

        @com.aliyun.core.annotation.NameInMap("InFlowPerMinute")
        private Float inFlowPerMinute;

        @com.aliyun.core.annotation.NameInMap("InPps")
        private Float inPps;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NewSessionPerSecond")
        private Float newSessionPerSecond;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Float outBps;

        @com.aliyun.core.annotation.NameInMap("OutFlowPerMinute")
        private Float outFlowPerMinute;

        @com.aliyun.core.annotation.NameInMap("OutPps")
        private Float outPps;

        private NatGatewayTopN(Builder builder) {
            this.activeSessionCount = builder.activeSessionCount;
            this.inBps = builder.inBps;
            this.inFlowPerMinute = builder.inFlowPerMinute;
            this.inPps = builder.inPps;
            this.ip = builder.ip;
            this.newSessionPerSecond = builder.newSessionPerSecond;
            this.outBps = builder.outBps;
            this.outFlowPerMinute = builder.outFlowPerMinute;
            this.outPps = builder.outPps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayTopN create() {
            return builder().build();
        }

        /**
         * @return activeSessionCount
         */
        public Float getActiveSessionCount() {
            return this.activeSessionCount;
        }

        /**
         * @return inBps
         */
        public Float getInBps() {
            return this.inBps;
        }

        /**
         * @return inFlowPerMinute
         */
        public Float getInFlowPerMinute() {
            return this.inFlowPerMinute;
        }

        /**
         * @return inPps
         */
        public Float getInPps() {
            return this.inPps;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return newSessionPerSecond
         */
        public Float getNewSessionPerSecond() {
            return this.newSessionPerSecond;
        }

        /**
         * @return outBps
         */
        public Float getOutBps() {
            return this.outBps;
        }

        /**
         * @return outFlowPerMinute
         */
        public Float getOutFlowPerMinute() {
            return this.outFlowPerMinute;
        }

        /**
         * @return outPps
         */
        public Float getOutPps() {
            return this.outPps;
        }

        public static final class Builder {
            private Float activeSessionCount; 
            private Float inBps; 
            private Float inFlowPerMinute; 
            private Float inPps; 
            private String ip; 
            private Float newSessionPerSecond; 
            private Float outBps; 
            private Float outFlowPerMinute; 
            private Float outPps; 

            /**
             * The number of concurrent connections. Unit: connections.
             */
            public Builder activeSessionCount(Float activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * The inbound data transfer. Unit: bit/s.
             */
            public Builder inBps(Float inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * This field is reserved and not in use.
             */
            public Builder inFlowPerMinute(Float inFlowPerMinute) {
                this.inFlowPerMinute = inFlowPerMinute;
                return this;
            }

            /**
             * The inbound packet forwarding rate. Unit: packets per second.
             */
            public Builder inPps(Float inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The new connection creation rate. Unit: connections per second.
             */
            public Builder newSessionPerSecond(Float newSessionPerSecond) {
                this.newSessionPerSecond = newSessionPerSecond;
                return this;
            }

            /**
             * The outbound data transfer. Unit: bit/s.
             */
            public Builder outBps(Float outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * This field is reserved and not in use.
             */
            public Builder outFlowPerMinute(Float outFlowPerMinute) {
                this.outFlowPerMinute = outFlowPerMinute;
                return this;
            }

            /**
             * The outbound packet forwarding rate. Unit: packets per second.
             */
            public Builder outPps(Float outPps) {
                this.outPps = outPps;
                return this;
            }

            public NatGatewayTopN build() {
                return new NatGatewayTopN(this);
            } 

        } 

    }
}
