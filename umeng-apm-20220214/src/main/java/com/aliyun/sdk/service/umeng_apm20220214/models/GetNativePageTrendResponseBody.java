// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNativePageTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetNativePageTrendResponseBody</p>
 */
public class GetNativePageTrendResponseBody extends TeaModel {
    @NameInMap("code")
    private Long code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    @NameInMap("success")
    private Boolean success;

    private GetNativePageTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNativePageTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < Data> data; 
        private String msg; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNativePageTrendResponseBody build() {
            return new GetNativePageTrendResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("avgLoadDuration")
        private Double avgLoadDuration;

        @NameInMap("crashRate")
        private Double crashRate;

        @NameInMap("loadCnt")
        private Long loadCnt;

        @NameInMap("slowLoadRate")
        private Double slowLoadRate;

        @NameInMap("timePoint")
        private String timePoint;

        private Data(Builder builder) {
            this.avgLoadDuration = builder.avgLoadDuration;
            this.crashRate = builder.crashRate;
            this.loadCnt = builder.loadCnt;
            this.slowLoadRate = builder.slowLoadRate;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgLoadDuration
         */
        public Double getAvgLoadDuration() {
            return this.avgLoadDuration;
        }

        /**
         * @return crashRate
         */
        public Double getCrashRate() {
            return this.crashRate;
        }

        /**
         * @return loadCnt
         */
        public Long getLoadCnt() {
            return this.loadCnt;
        }

        /**
         * @return slowLoadRate
         */
        public Double getSlowLoadRate() {
            return this.slowLoadRate;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Double avgLoadDuration; 
            private Double crashRate; 
            private Long loadCnt; 
            private Double slowLoadRate; 
            private String timePoint; 

            /**
             * avgLoadDuration.
             */
            public Builder avgLoadDuration(Double avgLoadDuration) {
                this.avgLoadDuration = avgLoadDuration;
                return this;
            }

            /**
             * crashRate.
             */
            public Builder crashRate(Double crashRate) {
                this.crashRate = crashRate;
                return this;
            }

            /**
             * loadCnt.
             */
            public Builder loadCnt(Long loadCnt) {
                this.loadCnt = loadCnt;
                return this;
            }

            /**
             * slowLoadRate.
             */
            public Builder slowLoadRate(Double slowLoadRate) {
                this.slowLoadRate = slowLoadRate;
                return this;
            }

            /**
             * timePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
