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
 * {@link GetContextDatabaseCreditUsageSummaryByMemberResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseCreditUsageSummaryByMemberResponseBody</p>
 */
public class GetContextDatabaseCreditUsageSummaryByMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetContextDatabaseCreditUsageSummaryByMemberResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.total = builder.total;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseCreditUsageSummaryByMemberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
        private String endTime; 
        private java.util.List<Items> items; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private String startTime; 
        private Long total; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseCreditUsageSummaryByMemberResponseBody model) {
            this.endTime = model.endTime;
            this.items = model.items;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.total = model.total;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The end time of the query range passed in the request, exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The member summaries on the current page, sorted in descending order of total credit consumption. Each record covers the entire query range.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The actual page number used for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The actual number of items per page used for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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
         * <p>2026-10-01T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of members that match the filter criteria. This is not the number of metering records and is not affected by pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The ID of the workspace queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-x9z4ctzed9gfu2w</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetContextDatabaseCreditUsageSummaryByMemberResponseBody build() {
            return new GetContextDatabaseCreditUsageSummaryByMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseCreditUsageSummaryByMemberResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseCreditUsageSummaryByMemberResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credits")
        private String credits;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Long recordCount;

        private Items(Builder builder) {
            this.credits = builder.credits;
            this.memberId = builder.memberId;
            this.quantity = builder.quantity;
            this.recordCount = builder.recordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return credits
         */
        public String getCredits() {
            return this.credits;
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
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        public static final class Builder {
            private String credits; 
            private String memberId; 
            private Long quantity; 
            private Long recordCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.credits = model.credits;
                this.memberId = model.memberId;
                this.quantity = model.quantity;
                this.recordCount = model.recordCount;
            } 

            /**
             * <p>The total credit consumption of priced records for the member. Returned as a decimal string with up to 6 decimal places. 1 credit equals 1 CNY. The value is null if there are no priced records.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2513</p>
             */
            public Builder credits(String credits) {
                this.credits = credits;
                return this;
            }

            /**
             * <p>The member ID. Historical or system records may not have a member ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mb-abcdefghijklmno</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The total metered quantity of records that match the filter criteria for the member, including unpriced records. To view the usage of a specific billable item, specify Item in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The number of metering records that match the filter criteria for the member, including unpriced records.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
