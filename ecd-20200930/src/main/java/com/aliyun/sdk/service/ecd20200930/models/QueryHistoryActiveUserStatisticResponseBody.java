// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryActiveUserStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHistoryActiveUserStatisticResponseBody</p>
 */
public class QueryHistoryActiveUserStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserStatisticList")
    private java.util.List<UserStatisticList> userStatisticList;

    private QueryHistoryActiveUserStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userStatisticList = builder.userStatisticList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryActiveUserStatisticResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userStatisticList
     */
    public java.util.List<UserStatisticList> getUserStatisticList() {
        return this.userStatisticList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<UserStatisticList> userStatisticList; 

        private Builder() {
        } 

        private Builder(QueryHistoryActiveUserStatisticResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.userStatisticList = model.userStatisticList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CC5E450-FC43-4F5B-B540-9964BD313427</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of daily active user statistics.</p>
         */
        public Builder userStatisticList(java.util.List<UserStatisticList> userStatisticList) {
            this.userStatisticList = userStatisticList;
            return this;
        }

        public QueryHistoryActiveUserStatisticResponseBody build() {
            return new QueryHistoryActiveUserStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryActiveUserStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHistoryActiveUserStatisticResponseBody</p>
     */
    public static class UserStatisticList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveUserCount")
        private Integer activeUserCount;

        @com.aliyun.core.annotation.NameInMap("FormatDate")
        private String formatDate;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private Long timeStamp;

        private UserStatisticList(Builder builder) {
            this.activeUserCount = builder.activeUserCount;
            this.formatDate = builder.formatDate;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticList create() {
            return builder().build();
        }

        /**
         * @return activeUserCount
         */
        public Integer getActiveUserCount() {
            return this.activeUserCount;
        }

        /**
         * @return formatDate
         */
        public String getFormatDate() {
            return this.formatDate;
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Integer activeUserCount; 
            private String formatDate; 
            private Long timeStamp; 

            private Builder() {
            } 

            private Builder(UserStatisticList model) {
                this.activeUserCount = model.activeUserCount;
                this.formatDate = model.formatDate;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The number of deduplicated active users on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder activeUserCount(Integer activeUserCount) {
                this.activeUserCount = activeUserCount;
                return this;
            }

            /**
             * <p>The date in the standard yyyy-MM-dd format, in the UTC+8 time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-01</p>
             */
            public Builder formatDate(String formatDate) {
                this.formatDate = formatDate;
                return this;
            }

            /**
             * <p>The timestamp of the date, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735689600000</p>
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public UserStatisticList build() {
                return new UserStatisticList(this);
            } 

        } 

    }
}
