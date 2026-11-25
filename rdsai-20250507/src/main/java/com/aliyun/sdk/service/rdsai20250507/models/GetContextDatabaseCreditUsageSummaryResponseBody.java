// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetContextDatabaseCreditUsageSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseCreditUsageSummaryResponseBody</p>
 */
public class GetContextDatabaseCreditUsageSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private java.util.List<Buckets> buckets;

    @com.aliyun.core.annotation.NameInMap("Dimension")
    private String dimension;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TotalCredits")
    private String totalCredits;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetContextDatabaseCreditUsageSummaryResponseBody(Builder builder) {
        this.buckets = builder.buckets;
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalCredits = builder.totalCredits;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseCreditUsageSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buckets
     */
    public java.util.List<Buckets> getBuckets() {
        return this.buckets;
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalCredits
     */
    public String getTotalCredits() {
        return this.totalCredits;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<Buckets> buckets; 
        private String dimension; 
        private String endTime; 
        private String interval; 
        private String requestId; 
        private String startTime; 
        private String totalCredits; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseCreditUsageSummaryResponseBody model) {
            this.buckets = model.buckets;
            this.dimension = model.dimension;
            this.endTime = model.endTime;
            this.interval = model.interval;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.totalCredits = model.totalCredits;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The bucketing results, sorted sequentially by BucketStart, Item, and SubItem. Unpriced records are included in Quantity and RecordCount, but not in Credits.</p>
         */
        public Builder buckets(java.util.List<Buckets> buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * <p>The query dimension. Valid values: Workspace (a single workspace) and Account (all workspaces under the caller account).</p>
         * 
         * <strong>example:</strong>
         * <p>Workspace</p>
         */
        public Builder dimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The end time of the query interval passed in the request, exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The actual bucketing granularity used. Valid values: Hour (hourly) and Day (daily). When the request parameter is omitted, the automatically selected granularity is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The ID of the API request, which is used to troubleshoot call issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query interval passed in the request, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total credit consumption of priced records that meet the filter conditions within the query interval. Returned as a decimal string with up to 6 decimal places, where 1 credit equals 1 CNY. Returns the string <code>0</code> when there are no priced records. Unpriced records are not included in the total. Do not treat this value as the final bill amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2513</p>
         */
        public Builder totalCredits(String totalCredits) {
            this.totalCredits = totalCredits;
            return this;
        }

        /**
         * <p>The ID of the queried workspace. This parameter has a value only when Dimension is Workspace. It is empty for the account dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-x9z4ctzed9gfu2w</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetContextDatabaseCreditUsageSummaryResponseBody build() {
            return new GetContextDatabaseCreditUsageSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseCreditUsageSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseCreditUsageSummaryResponseBody</p>
     */
    public static class Buckets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketStart")
        private String bucketStart;

        @com.aliyun.core.annotation.NameInMap("Credits")
        private String credits;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("SubItem")
        private String subItem;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Buckets(Builder builder) {
            this.bucketStart = builder.bucketStart;
            this.credits = builder.credits;
            this.item = builder.item;
            this.quantity = builder.quantity;
            this.recordCount = builder.recordCount;
            this.subItem = builder.subItem;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Buckets create() {
            return builder().build();
        }

        /**
         * @return bucketStart
         */
        public String getBucketStart() {
            return this.bucketStart;
        }

        /**
         * @return credits
         */
        public String getCredits() {
            return this.credits;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return subItem
         */
        public String getSubItem() {
            return this.subItem;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String bucketStart; 
            private String credits; 
            private String item; 
            private Long quantity; 
            private Long recordCount; 
            private String subItem; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Buckets model) {
                this.bucketStart = model.bucketStart;
                this.credits = model.credits;
                this.item = model.item;
                this.quantity = model.quantity;
                this.recordCount = model.recordCount;
                this.subItem = model.subItem;
                this.unit = model.unit;
            } 

            /**
             * <p>The start time of the bucket, in ISO 8601 UTC time format ending with <code>Z</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01T00:00:00Z</p>
             */
            public Builder bucketStart(String bucketStart) {
                this.bucketStart = bucketStart;
                return this;
            }

            /**
             * <p>The total credit consumption of priced records in the bucket. Returned as a decimal string with up to 6 decimal places, where 1 credit equals 1 CNY. Returns the string <code>0</code> when all records are unpriced.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2513</p>
             */
            public Builder credits(String credits) {
                this.credits = credits;
                return this;
            }

            /**
             * <p>The billing item corresponding to the bucket. Valid values: KnowledgeBaseRead (knowledge base read), MemoryRead (memory read), MemoryWrite (memory write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context growth).</p>
             * 
             * <strong>example:</strong>
             * <p>ContextGrowth</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The total usage of all records in the bucket, including unpriced records. The unit is specified by Unit.</p>
             * 
             * <strong>example:</strong>
             * <p>251300</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The number of metering records in the bucket, including unpriced records.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * <p>The context evolution sub-item. Recognized values include KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). Returns null for other billing items, missing sub-items, or unrecognized sub-items.</p>
             * 
             * <strong>example:</strong>
             * <p>MemoryEvolution</p>
             */
            public Builder subItem(String subItem) {
                this.subItem = subItem;
                return this;
            }

            /**
             * <p>The unit of measurement. Valid values: Count (number of times), Token (number of tokens), and MicroCredit (one millionth of a credit).</p>
             * 
             * <strong>example:</strong>
             * <p>MicroCredit</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Buckets build() {
                return new Buckets(this);
            } 

        } 

    }
}
