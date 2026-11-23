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
 * {@link GetContextDatabaseCreditUsageSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetContextDatabaseCreditUsageSummaryRequest</p>
 */
public class GetContextDatabaseCreditUsageSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Item")
    private String item;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubItem")
    private String subItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetContextDatabaseCreditUsageSummaryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.item = builder.item;
        this.memberId = builder.memberId;
        this.startTime = builder.startTime;
        this.subItem = builder.subItem;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseCreditUsageSummaryRequest create() {
        return builder().build();
    }

@Override
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
     * @return interval
     */
    public String getInterval() {
        return this.interval;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subItem
     */
    public String getSubItem() {
        return this.subItem;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetContextDatabaseCreditUsageSummaryRequest, Builder> {
        private String endTime; 
        private String interval; 
        private String item; 
        private String memberId; 
        private String startTime; 
        private String subItem; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetContextDatabaseCreditUsageSummaryRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.item = request.item;
            this.memberId = request.memberId;
            this.startTime = request.startTime;
            this.subItem = request.subItem;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The end time of the query range, exclusive. This time must be later than StartTime. Use the ISO 8601 time format, such as 2026-10-15T00:00:00Z (UTC). The maximum time range is 7 days for hourly statistics and 31 days for daily statistics.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The bucketing granularity. Valid values: Hour (hourly) and Day (daily). The values are case-insensitive. If omitted, Hour is used by default for a time range of up to 7 days, and Day is used for a time range exceeding 7 days. The maximum time range is 7 days for Hour and 31 days for Day. If the limit is exceeded, InvalidParameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The billing item used to filter records. Supported values include KnowledgeBaseRead (knowledge base read), MemoryRead (memory read), MemoryWrite (memory write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context evolution). If omitted, all billing items that consume credits are included. Storage items or unlisted values return InvalidParameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ContextGrowth</p>
         */
        public Builder item(String item) {
            this.putQueryParameter("Item", item);
            this.item = item;
            return this;
        }

        /**
         * <p>The member ID used to filter records. If specified, WorkspaceId must also be provided. Otherwise, InvalidParameter is returned. A member ID is unique only within its workspace. This parameter only filters data and does not change the caller identity. Records without a member ID are not matched. Results are still bucketed by time and billing item, and are not split by member.</p>
         * 
         * <strong>example:</strong>
         * <p>mb-abcdefghijklmno</p>
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The start time of the query range, inclusive. Use the ISO 8601 time format, such as 2026-09-15T00:00:00Z (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The context evolution sub-item used to filter records. Supported values include KnowledgeOrganization (knowledge organization), MemoryPromotion (memory promotion), KnowledgeReview (knowledge review), KnowledgeEvolution (knowledge evolution), and MemoryEvolution (memory evolution). The values are case-sensitive. If only SubItem is provided, the billing item is automatically restricted to ContextGrowth. If other Item values are provided simultaneously or the sub-item is not in the list, InvalidParameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MemoryEvolution</p>
         */
        public Builder subItem(String subItem) {
            this.putQueryParameter("SubItem", subItem);
            this.subItem = subItem;
            return this;
        }

        /**
         * <p>The ID of the workspace to query. If specified, only the data of this workspace under the caller account is queried. Locked workspaces can also be queried. If omitted, all workspaces under the caller account are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-x9z4ctzed9gfu2w</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetContextDatabaseCreditUsageSummaryRequest build() {
            return new GetContextDatabaseCreditUsageSummaryRequest(this);
        } 

    } 

}
