// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainISPDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainISPDataResponseBody</p>
 */
public class DescribeVodDomainISPDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Value value;

    private DescribeVodDomainISPDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainISPDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return value
     */
    public Value getValue() {
        return this.value;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private Value value; 

        private Builder() {
        } 

        private Builder(DescribeVodDomainISPDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.value = model.value;
        } 

        /**
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Value value) {
            this.value = value;
            return this;
        }

        public DescribeVodDomainISPDataResponseBody build() {
            return new DescribeVodDomainISPDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainISPDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainISPDataResponseBody</p>
     */
    public static class ISPProportionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgObjectSize")
        private String avgObjectSize;

        @com.aliyun.core.annotation.NameInMap("AvgResponseRate")
        private String avgResponseRate;

        @com.aliyun.core.annotation.NameInMap("AvgResponseTime")
        private String avgResponseTime;

        @com.aliyun.core.annotation.NameInMap("Bps")
        private String bps;

        @com.aliyun.core.annotation.NameInMap("BytesProportion")
        private String bytesProportion;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("IspEname")
        private String ispEname;

        @com.aliyun.core.annotation.NameInMap("Proportion")
        private String proportion;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private String qps;

        @com.aliyun.core.annotation.NameInMap("ReqErrRate")
        private String reqErrRate;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private String totalBytes;

        @com.aliyun.core.annotation.NameInMap("TotalQuery")
        private String totalQuery;

        private ISPProportionData(Builder builder) {
            this.avgObjectSize = builder.avgObjectSize;
            this.avgResponseRate = builder.avgResponseRate;
            this.avgResponseTime = builder.avgResponseTime;
            this.bps = builder.bps;
            this.bytesProportion = builder.bytesProportion;
            this.ISP = builder.ISP;
            this.ispEname = builder.ispEname;
            this.proportion = builder.proportion;
            this.qps = builder.qps;
            this.reqErrRate = builder.reqErrRate;
            this.totalBytes = builder.totalBytes;
            this.totalQuery = builder.totalQuery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ISPProportionData create() {
            return builder().build();
        }

        /**
         * @return avgObjectSize
         */
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        /**
         * @return avgResponseRate
         */
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        /**
         * @return avgResponseTime
         */
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        /**
         * @return bps
         */
        public String getBps() {
            return this.bps;
        }

        /**
         * @return bytesProportion
         */
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return ispEname
         */
        public String getIspEname() {
            return this.ispEname;
        }

        /**
         * @return proportion
         */
        public String getProportion() {
            return this.proportion;
        }

        /**
         * @return qps
         */
        public String getQps() {
            return this.qps;
        }

        /**
         * @return reqErrRate
         */
        public String getReqErrRate() {
            return this.reqErrRate;
        }

        /**
         * @return totalBytes
         */
        public String getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return totalQuery
         */
        public String getTotalQuery() {
            return this.totalQuery;
        }

        public static final class Builder {
            private String avgObjectSize; 
            private String avgResponseRate; 
            private String avgResponseTime; 
            private String bps; 
            private String bytesProportion; 
            private String ISP; 
            private String ispEname; 
            private String proportion; 
            private String qps; 
            private String reqErrRate; 
            private String totalBytes; 
            private String totalQuery; 

            private Builder() {
            } 

            private Builder(ISPProportionData model) {
                this.avgObjectSize = model.avgObjectSize;
                this.avgResponseRate = model.avgResponseRate;
                this.avgResponseTime = model.avgResponseTime;
                this.bps = model.bps;
                this.bytesProportion = model.bytesProportion;
                this.ISP = model.ISP;
                this.ispEname = model.ispEname;
                this.proportion = model.proportion;
                this.qps = model.qps;
                this.reqErrRate = model.reqErrRate;
                this.totalBytes = model.totalBytes;
                this.totalQuery = model.totalQuery;
            } 

            /**
             * AvgObjectSize.
             */
            public Builder avgObjectSize(String avgObjectSize) {
                this.avgObjectSize = avgObjectSize;
                return this;
            }

            /**
             * AvgResponseRate.
             */
            public Builder avgResponseRate(String avgResponseRate) {
                this.avgResponseRate = avgResponseRate;
                return this;
            }

            /**
             * AvgResponseTime.
             */
            public Builder avgResponseTime(String avgResponseTime) {
                this.avgResponseTime = avgResponseTime;
                return this;
            }

            /**
             * Bps.
             */
            public Builder bps(String bps) {
                this.bps = bps;
                return this;
            }

            /**
             * BytesProportion.
             */
            public Builder bytesProportion(String bytesProportion) {
                this.bytesProportion = bytesProportion;
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
             * IspEname.
             */
            public Builder ispEname(String ispEname) {
                this.ispEname = ispEname;
                return this;
            }

            /**
             * Proportion.
             */
            public Builder proportion(String proportion) {
                this.proportion = proportion;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * ReqErrRate.
             */
            public Builder reqErrRate(String reqErrRate) {
                this.reqErrRate = reqErrRate;
                return this;
            }

            /**
             * TotalBytes.
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * TotalQuery.
             */
            public Builder totalQuery(String totalQuery) {
                this.totalQuery = totalQuery;
                return this;
            }

            public ISPProportionData build() {
                return new ISPProportionData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainISPDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainISPDataResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ISPProportionData")
        private java.util.List<ISPProportionData> ISPProportionData;

        private Value(Builder builder) {
            this.ISPProportionData = builder.ISPProportionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return ISPProportionData
         */
        public java.util.List<ISPProportionData> getISPProportionData() {
            return this.ISPProportionData;
        }

        public static final class Builder {
            private java.util.List<ISPProportionData> ISPProportionData; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.ISPProportionData = model.ISPProportionData;
            } 

            /**
             * ISPProportionData.
             */
            public Builder ISPProportionData(java.util.List<ISPProportionData> ISPProportionData) {
                this.ISPProportionData = ISPProportionData;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
}
