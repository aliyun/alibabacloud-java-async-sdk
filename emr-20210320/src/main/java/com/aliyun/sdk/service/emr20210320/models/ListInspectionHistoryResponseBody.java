// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListInspectionHistoryResponseBody</p>
 */
public class ListInspectionHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInspectionHistoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Created on 2023/8/21
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInspectionHistoryResponseBody build() {
            return new ListInspectionHistoryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeMessage")
        private String changeMessage;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InspectionItems")
        private java.util.List < java.util.Map<String, String>> inspectionItems;

        @com.aliyun.core.annotation.NameInMap("ReportTime")
        private String reportTime;

        private Data(Builder builder) {
            this.changeMessage = builder.changeMessage;
            this.healthStatus = builder.healthStatus;
            this.inspectionItems = builder.inspectionItems;
            this.reportTime = builder.reportTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeMessage
         */
        public String getChangeMessage() {
            return this.changeMessage;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return inspectionItems
         */
        public java.util.List < java.util.Map<String, String>> getInspectionItems() {
            return this.inspectionItems;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        public static final class Builder {
            private String changeMessage; 
            private String healthStatus; 
            private java.util.List < java.util.Map<String, String>> inspectionItems; 
            private String reportTime; 

            /**
             * 变更消息
             */
            public Builder changeMessage(String changeMessage) {
                this.changeMessage = changeMessage;
                return this;
            }

            /**
             * 巡检状态
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * 巡检变更明细
             */
            public Builder inspectionItems(java.util.List < java.util.Map<String, String>> inspectionItems) {
                this.inspectionItems = inspectionItems;
                return this;
            }

            /**
             * ReportTime.
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
