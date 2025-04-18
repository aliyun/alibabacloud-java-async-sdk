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
 * {@link GetNatTopNResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatTopNResponseBody</p>
 */
public class GetNatTopNResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTopNOpen")
    private Boolean isTopNOpen;

    @com.aliyun.core.annotation.NameInMap("NatGatewayTopN")
    private java.util.List<NatGatewayTopN> natGatewayTopN;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<NatGatewayTopN> getNatGatewayTopN() {
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
        private java.util.List<NatGatewayTopN> natGatewayTopN; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNatTopNResponseBody model) {
            this.isTopNOpen = model.isTopNOpen;
            this.natGatewayTopN = model.natGatewayTopN;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether Network Intelligence Service (NIS) is activated. The NatGatewayTopN parameter returns an empty array when NIS is not activated.</p>
         * <ul>
         * <li><strong>true</strong>: activated</li>
         * <li><strong>false</strong>: not activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTopNOpen(Boolean isTopNOpen) {
            this.isTopNOpen = isTopNOpen;
            return this;
        }

        /**
         * <p>An array of statistics about real-time SNAT performance ranking.</p>
         */
        public Builder natGatewayTopN(java.util.List<NatGatewayTopN> natGatewayTopN) {
            this.natGatewayTopN = natGatewayTopN;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>77C512B5-12f3-f892-BD94-88A98271C1A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNatTopNResponseBody build() {
            return new GetNatTopNResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNatTopNResponseBody} extends {@link TeaModel}
     *
     * <p>GetNatTopNResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NatGatewayTopN model) {
                this.activeSessionCount = model.activeSessionCount;
                this.inBps = model.inBps;
                this.inFlowPerMinute = model.inFlowPerMinute;
                this.inPps = model.inPps;
                this.ip = model.ip;
                this.newSessionPerSecond = model.newSessionPerSecond;
                this.outBps = model.outBps;
                this.outFlowPerMinute = model.outFlowPerMinute;
                this.outPps = model.outPps;
            } 

            /**
             * <p>The number of concurrent connections. Unit: connections.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder activeSessionCount(Float activeSessionCount) {
                this.activeSessionCount = activeSessionCount;
                return this;
            }

            /**
             * <p>The inbound data transfer. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inBps(Float inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * <p>This field is reserved and not in use.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder inFlowPerMinute(Float inFlowPerMinute) {
                this.inFlowPerMinute = inFlowPerMinute;
                return this;
            }

            /**
             * <p>The inbound packet forwarding rate. Unit: packets per second.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder inPps(Float inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.156.101</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The new connection creation rate. Unit: connections per second.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder newSessionPerSecond(Float newSessionPerSecond) {
                this.newSessionPerSecond = newSessionPerSecond;
                return this;
            }

            /**
             * <p>The outbound data transfer. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder outBps(Float outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * <p>This field is reserved and not in use.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder outFlowPerMinute(Float outFlowPerMinute) {
                this.outFlowPerMinute = outFlowPerMinute;
                return this;
            }

            /**
             * <p>The outbound packet forwarding rate. Unit: packets per second.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
