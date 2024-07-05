// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayUserAvgResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayUserAvgResponseBody</p>
 */
public class DescribePlayUserAvgResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserPlayStatisAvgs")
    private UserPlayStatisAvgs userPlayStatisAvgs;

    private DescribePlayUserAvgResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userPlayStatisAvgs = builder.userPlayStatisAvgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayUserAvgResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userPlayStatisAvgs
     */
    public UserPlayStatisAvgs getUserPlayStatisAvgs() {
        return this.userPlayStatisAvgs;
    }

    public static final class Builder {
        private String requestId; 
        private UserPlayStatisAvgs userPlayStatisAvgs; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The statistics on average playback each day.
         */
        public Builder userPlayStatisAvgs(UserPlayStatisAvgs userPlayStatisAvgs) {
            this.userPlayStatisAvgs = userPlayStatisAvgs;
            return this;
        }

        public DescribePlayUserAvgResponseBody build() {
            return new DescribePlayUserAvgResponseBody(this);
        } 

    } 

    public static class UserPlayStatisAvg extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgPlayCount")
        private String avgPlayCount;

        @com.aliyun.core.annotation.NameInMap("AvgPlayDuration")
        private String avgPlayDuration;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        private UserPlayStatisAvg(Builder builder) {
            this.avgPlayCount = builder.avgPlayCount;
            this.avgPlayDuration = builder.avgPlayDuration;
            this.date = builder.date;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPlayStatisAvg create() {
            return builder().build();
        }

        /**
         * @return avgPlayCount
         */
        public String getAvgPlayCount() {
            return this.avgPlayCount;
        }

        /**
         * @return avgPlayDuration
         */
        public String getAvgPlayDuration() {
            return this.avgPlayDuration;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        public static final class Builder {
            private String avgPlayCount; 
            private String avgPlayDuration; 
            private String date; 

            /**
             * The average number of video views.
             */
            public Builder avgPlayCount(String avgPlayCount) {
                this.avgPlayCount = avgPlayCount;
                return this;
            }

            /**
             * The average playback duration. Unit: milliseconds.
             */
            public Builder avgPlayDuration(String avgPlayDuration) {
                this.avgPlayDuration = avgPlayDuration;
                return this;
            }

            /**
             * The date when the statistics were generated. The date follows the *yyyy-MM-dd* format.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            public UserPlayStatisAvg build() {
                return new UserPlayStatisAvg(this);
            } 

        } 

    }
    public static class UserPlayStatisAvgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserPlayStatisAvg")
        private java.util.List < UserPlayStatisAvg> userPlayStatisAvg;

        private UserPlayStatisAvgs(Builder builder) {
            this.userPlayStatisAvg = builder.userPlayStatisAvg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPlayStatisAvgs create() {
            return builder().build();
        }

        /**
         * @return userPlayStatisAvg
         */
        public java.util.List < UserPlayStatisAvg> getUserPlayStatisAvg() {
            return this.userPlayStatisAvg;
        }

        public static final class Builder {
            private java.util.List < UserPlayStatisAvg> userPlayStatisAvg; 

            /**
             * UserPlayStatisAvg.
             */
            public Builder userPlayStatisAvg(java.util.List < UserPlayStatisAvg> userPlayStatisAvg) {
                this.userPlayStatisAvg = userPlayStatisAvg;
                return this;
            }

            public UserPlayStatisAvgs build() {
                return new UserPlayStatisAvgs(this);
            } 

        } 

    }
}
