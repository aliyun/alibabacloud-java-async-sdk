// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeUserOnlineClientStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserOnlineClientStatisticsResponseBody</p>
 */
public class DescribeUserOnlineClientStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserStatistics")
    private UserStatistics userStatistics;

    private DescribeUserOnlineClientStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userStatistics = builder.userStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserOnlineClientStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userStatistics
     */
    public UserStatistics getUserStatistics() {
        return this.userStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private UserStatistics userStatistics; 

        private Builder() {
        } 

        private Builder(DescribeUserOnlineClientStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.userStatistics = model.userStatistics;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14846A6A-2192-4F6A-B272-B8BD68EBC89B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The connection information about the specified clients.</p>
         */
        public Builder userStatistics(UserStatistics userStatistics) {
            this.userStatistics = userStatistics;
            return this;
        }

        public DescribeUserOnlineClientStatisticsResponseBody build() {
            return new DescribeUserOnlineClientStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserOnlineClientStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserOnlineClientStatisticsResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OnlineCount")
        private String onlineCount;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Statistics(Builder builder) {
            this.onlineCount = builder.onlineCount;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return onlineCount
         */
        public String getOnlineCount() {
            return this.onlineCount;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String onlineCount; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.onlineCount = model.onlineCount;
                this.userName = model.userName;
            } 

            /**
             * <p>The number of clients that are connected to Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder onlineCount(String onlineCount) {
                this.onlineCount = onlineCount;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>doctest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserOnlineClientStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserOnlineClientStatisticsResponseBody</p>
     */
    public static class UserStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistics")
        private java.util.List<Statistics> statistics;

        private UserStatistics(Builder builder) {
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatistics create() {
            return builder().build();
        }

        /**
         * @return statistics
         */
        public java.util.List<Statistics> getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private java.util.List<Statistics> statistics; 

            private Builder() {
            } 

            private Builder(UserStatistics model) {
                this.statistics = model.statistics;
            } 

            /**
             * Statistics.
             */
            public Builder statistics(java.util.List<Statistics> statistics) {
                this.statistics = statistics;
                return this;
            }

            public UserStatistics build() {
                return new UserStatistics(this);
            } 

        } 

    }
}
