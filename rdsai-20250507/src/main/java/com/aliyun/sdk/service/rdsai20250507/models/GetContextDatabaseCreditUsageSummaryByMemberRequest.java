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
 * {@link GetContextDatabaseCreditUsageSummaryByMemberRequest} extends {@link RequestModel}
 *
 * <p>GetContextDatabaseCreditUsageSummaryByMemberRequest</p>
 */
public class GetContextDatabaseCreditUsageSummaryByMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Item")
    private String item;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetContextDatabaseCreditUsageSummaryByMemberRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.item = builder.item;
        this.memberId = builder.memberId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseCreditUsageSummaryByMemberRequest create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetContextDatabaseCreditUsageSummaryByMemberRequest, Builder> {
        private String endTime; 
        private String item; 
        private String memberId; 
        private Integer page; 
        private Integer pageSize; 
        private String startTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetContextDatabaseCreditUsageSummaryByMemberRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.item = request.item;
            this.memberId = request.memberId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The end time of the query interval, exclusive. It must be later than <code>StartTime</code>. Use the ISO 8601 time format, such as <code>2026-10-08T00:00:00Z</code> (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The billing item used to filter records. Supported values include KnowledgeBaseRead (knowledge base read), MemoryRead (memory read), MemoryWrite (memory write), KnowledgeBaseWriteToken (knowledge base write token), and ContextGrowth (context growth). If omitted, all billing items that consume credits are included. Specifying storage items or unlisted values returns an <code>InvalidParameter</code> error.</p>
         * 
         * <strong>example:</strong>
         * <p>MemoryWrite</p>
         */
        public Builder item(String item) {
            this.putQueryParameter("Item", item);
            this.item = item;
            return this;
        }

        /**
         * <p>The member ID used to filter the aggregated results. If specified, only this member is analyzed without changing the caller identity. An empty list is returned if no matching records are found.</p>
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
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The maximum number of members to return per page. Valid values: 1 to 200. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the query interval, inclusive. Use the ISO 8601 time format, such as <code>2026-10-01T00:00:00Z</code> (UTC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the workspace to be analyzed. This parameter is required. The workspace must belong to the caller&quot;s account. Locked workspaces can still be queried. Member IDs are unique only within their respective workspaces, and cross-workspace ranking is not supported.</p>
         * <p>This parameter is required.</p>
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
        public GetContextDatabaseCreditUsageSummaryByMemberRequest build() {
            return new GetContextDatabaseCreditUsageSummaryByMemberRequest(this);
        } 

    } 

}
