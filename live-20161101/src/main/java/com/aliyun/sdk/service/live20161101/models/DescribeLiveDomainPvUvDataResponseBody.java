// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainPvUvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainPvUvDataResponseBody</p>
 */
public class DescribeLiveDomainPvUvDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PvUvDataInfos")
    private PvUvDataInfos pvUvDataInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeLiveDomainPvUvDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.pvUvDataInfos = builder.pvUvDataInfos;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainPvUvDataResponseBody create() {
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
     * @return pvUvDataInfos
     */
    public PvUvDataInfos getPvUvDataInfos() {
        return this.pvUvDataInfos;
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

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private PvUvDataInfos pvUvDataInfos; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainPvUvDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.domainName = model.domainName;
            this.endTime = model.endTime;
            this.pvUvDataInfos = model.pvUvDataInfos;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The time interval between the entries returned. Unit: seconds. Default value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-20T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The data of PVs and UVs.</p>
         */
        public Builder pvUvDataInfos(PvUvDataInfos pvUvDataInfos) {
            this.pvUvDataInfos = pvUvDataInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-17T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeLiveDomainPvUvDataResponseBody build() {
            return new DescribeLiveDomainPvUvDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainPvUvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainPvUvDataResponseBody</p>
     */
    public static class PvUvDataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PV")
        private String pv;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("UV")
        private String uv;

        private PvUvDataInfo(Builder builder) {
            this.pv = builder.pv;
            this.timeStamp = builder.timeStamp;
            this.uv = builder.uv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PvUvDataInfo create() {
            return builder().build();
        }

        /**
         * @return pv
         */
        public String getPv() {
            return this.pv;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return uv
         */
        public String getUv() {
            return this.uv;
        }

        public static final class Builder {
            private String pv; 
            private String timeStamp; 
            private String uv; 

            private Builder() {
            } 

            private Builder(PvUvDataInfo model) {
                this.pv = model.pv;
                this.timeStamp = model.timeStamp;
                this.uv = model.uv;
            } 

            /**
             * <p>The number of PVs.</p>
             * 
             * <strong>example:</strong>
             * <p>3036</p>
             */
            public Builder pv(String pv) {
                this.pv = pv;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-03-19T16:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The number of UVs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder uv(String uv) {
                this.uv = uv;
                return this;
            }

            public PvUvDataInfo build() {
                return new PvUvDataInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainPvUvDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainPvUvDataResponseBody</p>
     */
    public static class PvUvDataInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PvUvDataInfo")
        private java.util.List<PvUvDataInfo> pvUvDataInfo;

        private PvUvDataInfos(Builder builder) {
            this.pvUvDataInfo = builder.pvUvDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PvUvDataInfos create() {
            return builder().build();
        }

        /**
         * @return pvUvDataInfo
         */
        public java.util.List<PvUvDataInfo> getPvUvDataInfo() {
            return this.pvUvDataInfo;
        }

        public static final class Builder {
            private java.util.List<PvUvDataInfo> pvUvDataInfo; 

            private Builder() {
            } 

            private Builder(PvUvDataInfos model) {
                this.pvUvDataInfo = model.pvUvDataInfo;
            } 

            /**
             * PvUvDataInfo.
             */
            public Builder pvUvDataInfo(java.util.List<PvUvDataInfo> pvUvDataInfo) {
                this.pvUvDataInfo = pvUvDataInfo;
                return this;
            }

            public PvUvDataInfos build() {
                return new PvUvDataInfos(this);
            } 

        } 

    }
}
