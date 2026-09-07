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
 * {@link QueryActiveUserStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>QueryActiveUserStatisticResponseBody</p>
 */
public class QueryActiveUserStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserStatisticList")
    private java.util.List<UserStatisticList> userStatisticList;

    private QueryActiveUserStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userStatisticList = builder.userStatisticList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActiveUserStatisticResponseBody create() {
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

        private Builder(QueryActiveUserStatisticResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.userStatisticList = model.userStatisticList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of data points.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of active user statistics.</p>
         */
        public Builder userStatisticList(java.util.List<UserStatisticList> userStatisticList) {
            this.userStatisticList = userStatisticList;
            return this;
        }

        public QueryActiveUserStatisticResponseBody build() {
            return new QueryActiveUserStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryActiveUserStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>QueryActiveUserStatisticResponseBody</p>
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
             * <p>The number of deduplicated active users within the statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder activeUserCount(Integer activeUserCount) {
                this.activeUserCount = activeUserCount;
                return this;
            }

            /**
             * <p>The formatted date string in UTC+8, in the format of yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-30</p>
             */
            public Builder formatDate(String formatDate) {
                this.formatDate = formatDate;
                return this;
            }

            /**
             * <p>The epoch timestamp in milliseconds corresponding to the data point.</p>
             * 
             * <strong>example:</strong>
             * <p>1606723951000</p>
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
