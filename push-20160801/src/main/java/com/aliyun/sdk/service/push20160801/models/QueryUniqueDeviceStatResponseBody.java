// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryUniqueDeviceStatResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUniqueDeviceStatResponseBody</p>
 */
public class QueryUniqueDeviceStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppDeviceStats")
    private AppDeviceStats appDeviceStats;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryUniqueDeviceStatResponseBody(Builder builder) {
        this.appDeviceStats = builder.appDeviceStats;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUniqueDeviceStatResponseBody create() {
        return builder().build();
    }

    /**
     * @return appDeviceStats
     */
    public AppDeviceStats getAppDeviceStats() {
        return this.appDeviceStats;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppDeviceStats appDeviceStats; 
        private String requestId; 

        /**
         * AppDeviceStats.
         */
        public Builder appDeviceStats(AppDeviceStats appDeviceStats) {
            this.appDeviceStats = appDeviceStats;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUniqueDeviceStatResponseBody build() {
            return new QueryUniqueDeviceStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUniqueDeviceStatResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUniqueDeviceStatResponseBody</p>
     */
    public static class AppDeviceStat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private AppDeviceStat(Builder builder) {
            this.count = builder.count;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppDeviceStat create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long count; 
            private String time; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public AppDeviceStat build() {
                return new AppDeviceStat(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryUniqueDeviceStatResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUniqueDeviceStatResponseBody</p>
     */
    public static class AppDeviceStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDeviceStat")
        private java.util.List < AppDeviceStat> appDeviceStat;

        private AppDeviceStats(Builder builder) {
            this.appDeviceStat = builder.appDeviceStat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppDeviceStats create() {
            return builder().build();
        }

        /**
         * @return appDeviceStat
         */
        public java.util.List < AppDeviceStat> getAppDeviceStat() {
            return this.appDeviceStat;
        }

        public static final class Builder {
            private java.util.List < AppDeviceStat> appDeviceStat; 

            /**
             * AppDeviceStat.
             */
            public Builder appDeviceStat(java.util.List < AppDeviceStat> appDeviceStat) {
                this.appDeviceStat = appDeviceStat;
                return this;
            }

            public AppDeviceStats build() {
                return new AppDeviceStats(this);
            } 

        } 

    }
}
