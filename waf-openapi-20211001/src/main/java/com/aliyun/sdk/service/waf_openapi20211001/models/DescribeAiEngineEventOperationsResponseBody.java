// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineEventOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineEventOperationsResponseBody</p>
 */
public class DescribeAiEngineEventOperationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAiEngineEventOperationsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEventOperationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineEventOperationsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of event status change records, sorted in descending order by operation time.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries to return on each page during paging in a paged query. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If a next page exists, this field returns a value.</p>
         * <blockquote>
         * <p>If this parameter returns a value, it indicates that a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page until no value is returned, which indicates that all data is obtained.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1****-1219-019A-8B44-*****9C2C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of operation records for the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAiEngineEventOperationsResponseBody build() {
            return new DescribeAiEngineEventOperationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventOperationsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromStatus")
        private String fromStatus;

        @com.aliyun.core.annotation.NameInMap("OperatedAt")
        private Long operatedAt;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("ToStatus")
        private String toStatus;

        private Items(Builder builder) {
            this.fromStatus = builder.fromStatus;
            this.operatedAt = builder.operatedAt;
            this.operationId = builder.operationId;
            this.toStatus = builder.toStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return fromStatus
         */
        public String getFromStatus() {
            return this.fromStatus;
        }

        /**
         * @return operatedAt
         */
        public Long getOperatedAt() {
            return this.operatedAt;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return toStatus
         */
        public String getToStatus() {
            return this.toStatus;
        }

        public static final class Builder {
            private String fromStatus; 
            private Long operatedAt; 
            private String operationId; 
            private String toStatus; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.fromStatus = model.fromStatus;
                this.operatedAt = model.operatedAt;
                this.operationId = model.operationId;
                this.toStatus = model.toStatus;
            } 

            /**
             * <p>The event processing status before the modification. Valid values:</p>
             * <ul>
             * <li><strong>unhandled</strong>: Unprocessed.</li>
             * <li><strong>handling</strong>: Processing.</li>
             * <li><strong>handled</strong>: Processed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>handling</p>
             */
            public Builder fromStatus(String fromStatus) {
                this.fromStatus = fromStatus;
                return this;
            }

            /**
             * <p>The event operation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792973400000</p>
             */
            public Builder operatedAt(Long operatedAt) {
                this.operatedAt = operatedAt;
                return this;
            }

            /**
             * <p>The ID of the operation record.</p>
             * 
             * <strong>example:</strong>
             * <p>op109102</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The event processing status after the modification. Valid values:</p>
             * <ul>
             * <li><strong>unhandled</strong>: Unprocessed.</li>
             * <li><strong>handling</strong>: Processing.</li>
             * <li><strong>handled</strong>: Processed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>handled</p>
             */
            public Builder toStatus(String toStatus) {
                this.toStatus = toStatus;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
