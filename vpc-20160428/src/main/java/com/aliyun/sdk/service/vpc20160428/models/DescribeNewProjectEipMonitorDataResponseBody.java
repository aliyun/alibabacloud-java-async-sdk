// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewProjectEipMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNewProjectEipMonitorDataResponseBody</p>
 */
public class DescribeNewProjectEipMonitorDataResponseBody extends TeaModel {
    @NameInMap("EipMonitorDatas")
    private EipMonitorDatas eipMonitorDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNewProjectEipMonitorDataResponseBody(Builder builder) {
        this.eipMonitorDatas = builder.eipMonitorDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewProjectEipMonitorDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipMonitorDatas
     */
    public EipMonitorDatas getEipMonitorDatas() {
        return this.eipMonitorDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EipMonitorDatas eipMonitorDatas; 
        private String requestId; 

        /**
         * EipMonitorDatas.
         */
        public Builder eipMonitorDatas(EipMonitorDatas eipMonitorDatas) {
            this.eipMonitorDatas = eipMonitorDatas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNewProjectEipMonitorDataResponseBody build() {
            return new DescribeNewProjectEipMonitorDataResponseBody(this);
        } 

    } 

    public static class EipMonitorData extends TeaModel {
        @NameInMap("EipBandwidth")
        private Integer eipBandwidth;

        @NameInMap("EipFlow")
        private Integer eipFlow;

        @NameInMap("EipPackets")
        private Integer eipPackets;

        @NameInMap("EipRX")
        private Integer eipRX;

        @NameInMap("EipTX")
        private Integer eipTX;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private EipMonitorData(Builder builder) {
            this.eipBandwidth = builder.eipBandwidth;
            this.eipFlow = builder.eipFlow;
            this.eipPackets = builder.eipPackets;
            this.eipRX = builder.eipRX;
            this.eipTX = builder.eipTX;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipMonitorData create() {
            return builder().build();
        }

        /**
         * @return eipBandwidth
         */
        public Integer getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return eipFlow
         */
        public Integer getEipFlow() {
            return this.eipFlow;
        }

        /**
         * @return eipPackets
         */
        public Integer getEipPackets() {
            return this.eipPackets;
        }

        /**
         * @return eipRX
         */
        public Integer getEipRX() {
            return this.eipRX;
        }

        /**
         * @return eipTX
         */
        public Integer getEipTX() {
            return this.eipTX;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Integer eipBandwidth; 
            private Integer eipFlow; 
            private Integer eipPackets; 
            private Integer eipRX; 
            private Integer eipTX; 
            private String timeStamp; 

            /**
             * EipBandwidth.
             */
            public Builder eipBandwidth(Integer eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * EipFlow.
             */
            public Builder eipFlow(Integer eipFlow) {
                this.eipFlow = eipFlow;
                return this;
            }

            /**
             * EipPackets.
             */
            public Builder eipPackets(Integer eipPackets) {
                this.eipPackets = eipPackets;
                return this;
            }

            /**
             * EipRX.
             */
            public Builder eipRX(Integer eipRX) {
                this.eipRX = eipRX;
                return this;
            }

            /**
             * EipTX.
             */
            public Builder eipTX(Integer eipTX) {
                this.eipTX = eipTX;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public EipMonitorData build() {
                return new EipMonitorData(this);
            } 

        } 

    }
    public static class EipMonitorDatas extends TeaModel {
        @NameInMap("EipMonitorData")
        private java.util.List < EipMonitorData> eipMonitorData;

        private EipMonitorDatas(Builder builder) {
            this.eipMonitorData = builder.eipMonitorData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipMonitorDatas create() {
            return builder().build();
        }

        /**
         * @return eipMonitorData
         */
        public java.util.List < EipMonitorData> getEipMonitorData() {
            return this.eipMonitorData;
        }

        public static final class Builder {
            private java.util.List < EipMonitorData> eipMonitorData; 

            /**
             * EipMonitorData.
             */
            public Builder eipMonitorData(java.util.List < EipMonitorData> eipMonitorData) {
                this.eipMonitorData = eipMonitorData;
                return this;
            }

            public EipMonitorDatas build() {
                return new EipMonitorDatas(this);
            } 

        } 

    }
}
