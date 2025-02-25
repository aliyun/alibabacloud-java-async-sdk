// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

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
 * {@link GetLaunchTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetLaunchTrendResponseBody</p>
 */
public class GetLaunchTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetLaunchTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLaunchTrendResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
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
        public Builder data(java.util.List<Data> data) {
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

        public GetLaunchTrendResponseBody build() {
            return new GetLaunchTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLaunchTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetLaunchTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("coldLaunchCount")
        private Long coldLaunchCount;

        @com.aliyun.core.annotation.NameInMap("coldLaunchDuration")
        private Double coldLaunchDuration;

        @com.aliyun.core.annotation.NameInMap("firstLaunchCount")
        private Long firstLaunchCount;

        @com.aliyun.core.annotation.NameInMap("firstLaunchDuration")
        private Double firstLaunchDuration;

        @com.aliyun.core.annotation.NameInMap("hotLaunchCount")
        private Long hotLaunchCount;

        @com.aliyun.core.annotation.NameInMap("hotLaunchDuration")
        private Double hotLaunchDuration;

        @com.aliyun.core.annotation.NameInMap("timePoint")
        private String timePoint;

        private Data(Builder builder) {
            this.coldLaunchCount = builder.coldLaunchCount;
            this.coldLaunchDuration = builder.coldLaunchDuration;
            this.firstLaunchCount = builder.firstLaunchCount;
            this.firstLaunchDuration = builder.firstLaunchDuration;
            this.hotLaunchCount = builder.hotLaunchCount;
            this.hotLaunchDuration = builder.hotLaunchDuration;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coldLaunchCount
         */
        public Long getColdLaunchCount() {
            return this.coldLaunchCount;
        }

        /**
         * @return coldLaunchDuration
         */
        public Double getColdLaunchDuration() {
            return this.coldLaunchDuration;
        }

        /**
         * @return firstLaunchCount
         */
        public Long getFirstLaunchCount() {
            return this.firstLaunchCount;
        }

        /**
         * @return firstLaunchDuration
         */
        public Double getFirstLaunchDuration() {
            return this.firstLaunchDuration;
        }

        /**
         * @return hotLaunchCount
         */
        public Long getHotLaunchCount() {
            return this.hotLaunchCount;
        }

        /**
         * @return hotLaunchDuration
         */
        public Double getHotLaunchDuration() {
            return this.hotLaunchDuration;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Long coldLaunchCount; 
            private Double coldLaunchDuration; 
            private Long firstLaunchCount; 
            private Double firstLaunchDuration; 
            private Long hotLaunchCount; 
            private Double hotLaunchDuration; 
            private String timePoint; 

            /**
             * coldLaunchCount.
             */
            public Builder coldLaunchCount(Long coldLaunchCount) {
                this.coldLaunchCount = coldLaunchCount;
                return this;
            }

            /**
             * coldLaunchDuration.
             */
            public Builder coldLaunchDuration(Double coldLaunchDuration) {
                this.coldLaunchDuration = coldLaunchDuration;
                return this;
            }

            /**
             * firstLaunchCount.
             */
            public Builder firstLaunchCount(Long firstLaunchCount) {
                this.firstLaunchCount = firstLaunchCount;
                return this;
            }

            /**
             * firstLaunchDuration.
             */
            public Builder firstLaunchDuration(Double firstLaunchDuration) {
                this.firstLaunchDuration = firstLaunchDuration;
                return this;
            }

            /**
             * hotLaunchCount.
             */
            public Builder hotLaunchCount(Long hotLaunchCount) {
                this.hotLaunchCount = hotLaunchCount;
                return this;
            }

            /**
             * hotLaunchDuration.
             */
            public Builder hotLaunchDuration(Double hotLaunchDuration) {
                this.hotLaunchDuration = hotLaunchDuration;
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
