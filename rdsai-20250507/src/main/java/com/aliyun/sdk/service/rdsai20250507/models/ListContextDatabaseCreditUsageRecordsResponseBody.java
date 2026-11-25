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
 * {@link ListContextDatabaseCreditUsageRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseCreditUsageRecordsResponseBody</p>
 */
public class ListContextDatabaseCreditUsageRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private String dimension;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListContextDatabaseCreditUsageRecordsResponseBody(Builder builder) {
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.total = builder.total;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextDatabaseCreditUsageRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String dimension; 
        private String endTime; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<Records> records; 
        private String requestId; 
        private String startTime; 
        private Long total; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseCreditUsageRecordsResponseBody model) {
            this.dimension = model.dimension;
            this.endTime = model.endTime;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.total = model.total;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The query dimension. Valid values: Workspace indicates a single workspace, and Account indicates all workspaces under the caller account.</p>
         * 
         * <strong>example:</strong>
         * <p>Workspace</p>
         */
        public Builder dimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The end time of the query range passed in the request, exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The actual page number used for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The actual page size used for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The metering records on the current page. If SortBy is not specified, the records are sorted in descending order of request time.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The ID of the OpenAPI request, which is used to troubleshoot call issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query range passed in the request, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of metering records that match the filter conditions, which is not affected by pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
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

        public ListContextDatabaseCreditUsageRecordsResponseBody build() {
            return new ListContextDatabaseCreditUsageRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseCreditUsageRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseCreditUsageRecordsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credits")
        private String credits;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("SubItem")
        private String subItem;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Records(Builder builder) {
            this.credits = builder.credits;
            this.item = builder.item;
            this.memberId = builder.memberId;
            this.quantity = builder.quantity;
            this.requestTime = builder.requestTime;
            this.subItem = builder.subItem;
            this.unit = builder.unit;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
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
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
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

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String credits; 
            private String item; 
            private String memberId; 
            private Long quantity; 
            private String requestTime; 
            private String subItem; 
            private String unit; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.credits = model.credits;
                this.item = model.item;
                this.memberId = model.memberId;
                this.quantity = model.quantity;
                this.requestTime = model.requestTime;
                this.subItem = model.subItem;
                this.unit = model.unit;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The credit consumption of this record. It is returned as a decimal string with up to 6 decimal places. 1 credit = 1 CNY. The amount is recorded at the time of metering and does not change with subsequent price adjustments. It is null when unpriced, which does not indicate zero consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0742</p>
             */
            public Builder credits(String credits) {
                this.credits = credits;
                return this;
            }

            /**
             * <p>The billing item of this record. Valid values: KnowledgeBaseRead (knowledge base read), MemoryRead (memory base read), MemoryWrite (memory base write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context growth).</p>
             * 
             * <strong>example:</strong>
             * <p>ContextGrowth</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The ID of the member that generated this record. Historical or system records may not have a member ID, in which case null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>mb-abcdefghijklmno</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The usage of this record. The unit is specified by Unit in the same record.</p>
             * 
             * <strong>example:</strong>
             * <p>74200</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The request time when this metering record was generated, in ISO 8601 UTC time format ending with Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:30:12Z</p>
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>The context growth sub-item. Recognized values include KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). null is returned for other billing items, missing sub-items, or unrecognized sub-items.</p>
             * 
             * <strong>example:</strong>
             * <p>KnowledgeReview</p>
             */
            public Builder subItem(String subItem) {
                this.subItem = subItem;
                return this;
            }

            /**
             * <p>The metering unit. Valid values: Count indicates the number of times, Token indicates the number of tokens, and MicroCredit indicates one millionth of a credit.</p>
             * 
             * <strong>example:</strong>
             * <p>MicroCredit</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The ID of the workspace to which this record belongs. Even if queried by account, each record still indicates its workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-x9z4ctzed9gfu2w</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
