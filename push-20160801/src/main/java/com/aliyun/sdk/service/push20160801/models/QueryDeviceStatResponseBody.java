// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceStatResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceStatResponseBody</p>
 */
public class QueryDeviceStatResponseBody extends TeaModel {
    @NameInMap("AppDeviceStats")
    private AppDeviceStats appDeviceStats;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDeviceStatResponseBody(Builder builder) {
        this.appDeviceStats = builder.appDeviceStats;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceStatResponseBody create() {
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

        public QueryDeviceStatResponseBody build() {
            return new QueryDeviceStatResponseBody(this);
        } 

    } 

    public static class AppDeviceStat extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("Time")
        private String time;

        private AppDeviceStat(Builder builder) {
            this.count = builder.count;
            this.deviceType = builder.deviceType;
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
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long count; 
            private String deviceType; 
            private String time; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
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
    public static class AppDeviceStats extends TeaModel {
        @NameInMap("AppDeviceStat")
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
