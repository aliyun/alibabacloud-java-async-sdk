// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeEipMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipMonitorDataResponseBody</p>
 */
public class DescribeEipMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipMonitorDatas")
    private EipMonitorDatas eipMonitorDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEipMonitorDataResponseBody(Builder builder) {
        this.eipMonitorDatas = builder.eipMonitorDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipMonitorDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEipMonitorDataResponseBody model) {
            this.eipMonitorDatas = model.eipMonitorDatas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the monitoring data of the EIP.</p>
         */
        public Builder eipMonitorDatas(EipMonitorDatas eipMonitorDatas) {
            this.eipMonitorDatas = eipMonitorDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEipMonitorDataResponseBody build() {
            return new DescribeEipMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipMonitorDataResponseBody</p>
     */
    public static class EipMonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipBandwidth")
        private Integer eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("EipFlow")
        private Long eipFlow;

        @com.aliyun.core.annotation.NameInMap("EipPackets")
        private Integer eipPackets;

        @com.aliyun.core.annotation.NameInMap("EipRX")
        private Long eipRX;

        @com.aliyun.core.annotation.NameInMap("EipTX")
        private Long eipTX;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
        public Long getEipFlow() {
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
        public Long getEipRX() {
            return this.eipRX;
        }

        /**
         * @return eipTX
         */
        public Long getEipTX() {
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
            private Long eipFlow; 
            private Integer eipPackets; 
            private Long eipRX; 
            private Long eipTX; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(EipMonitorData model) {
                this.eipBandwidth = model.eipBandwidth;
                this.eipFlow = model.eipFlow;
                this.eipPackets = model.eipPackets;
                this.eipRX = model.eipRX;
                this.eipTX = model.eipTX;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * EipBandwidth.
             */
            public Builder eipBandwidth(Integer eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * <p>The sum of inbound and outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder eipFlow(Long eipFlow) {
                this.eipFlow = eipFlow;
                return this;
            }

            /**
             * <p>The number of packets.</p>
             * 
             * <strong>example:</strong>
             * <p>3434</p>
             */
            public Builder eipPackets(Integer eipPackets) {
                this.eipPackets = eipPackets;
                return this;
            }

            /**
             * <p>The inbound traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder eipRX(Long eipRX) {
                this.eipRX = eipRX;
                return this;
            }

            /**
             * <p>The outbound traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>343</p>
             */
            public Builder eipTX(Long eipTX) {
                this.eipTX = eipTX;
                return this;
            }

            /**
             * <p>The timestamp of the monitoring data. Specify the time in the ISO8601 standard. Example: <code>2020-01-21T09:50:23Z</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-21T09:50:23Z</p>
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
    /**
     * 
     * {@link DescribeEipMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipMonitorDataResponseBody</p>
     */
    public static class EipMonitorDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipMonitorData")
        private java.util.List<EipMonitorData> eipMonitorData;

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
        public java.util.List<EipMonitorData> getEipMonitorData() {
            return this.eipMonitorData;
        }

        public static final class Builder {
            private java.util.List<EipMonitorData> eipMonitorData; 

            private Builder() {
            } 

            private Builder(EipMonitorDatas model) {
                this.eipMonitorData = model.eipMonitorData;
            } 

            /**
             * EipMonitorData.
             */
            public Builder eipMonitorData(java.util.List<EipMonitorData> eipMonitorData) {
                this.eipMonitorData = eipMonitorData;
                return this;
            }

            public EipMonitorDatas build() {
                return new EipMonitorDatas(this);
            } 

        } 

    }
}
