// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainPvUvDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainPvUvDataResponseBody</p>
 */
public class DescribeLiveDomainPvUvDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PvUvDataInfos")
    private PvUvDataInfos pvUvDataInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
         * PvUvDataInfos.
         */
        public Builder pvUvDataInfos(PvUvDataInfos pvUvDataInfos) {
            this.pvUvDataInfos = pvUvDataInfos;
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

        public DescribeLiveDomainPvUvDataResponseBody build() {
            return new DescribeLiveDomainPvUvDataResponseBody(this);
        } 

    } 

    public static class PvUvDataInfo extends TeaModel {
        @NameInMap("PV")
        private String pv;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("UV")
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

            /**
             * PV.
             */
            public Builder pv(String pv) {
                this.pv = pv;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * UV.
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
    public static class PvUvDataInfos extends TeaModel {
        @NameInMap("PvUvDataInfo")
        private java.util.List < PvUvDataInfo> pvUvDataInfo;

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
        public java.util.List < PvUvDataInfo> getPvUvDataInfo() {
            return this.pvUvDataInfo;
        }

        public static final class Builder {
            private java.util.List < PvUvDataInfo> pvUvDataInfo; 

            /**
             * PvUvDataInfo.
             */
            public Builder pvUvDataInfo(java.util.List < PvUvDataInfo> pvUvDataInfo) {
                this.pvUvDataInfo = pvUvDataInfo;
                return this;
            }

            public PvUvDataInfos build() {
                return new PvUvDataInfos(this);
            } 

        } 

    }
}
