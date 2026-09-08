// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListQuotaActiveUserUsagesRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaActiveUserUsagesRequest</p>
 */
public class ListQuotaActiveUserUsagesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelfOnly")
    private Boolean selfOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadCount")
    private Integer workloadCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListQuotaActiveUserUsagesRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.selfOnly = builder.selfOnly;
        this.sortBy = builder.sortBy;
        this.userId = builder.userId;
        this.username = builder.username;
        this.workloadCount = builder.workloadCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaActiveUserUsagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return selfOnly
     */
    public Boolean getSelfOnly() {
        return this.selfOnly;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workloadCount
     */
    public Integer getWorkloadCount() {
        return this.workloadCount;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListQuotaActiveUserUsagesRequest, Builder> {
        private String quotaId; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean selfOnly; 
        private String sortBy; 
        private String userId; 
        private String username; 
        private Integer workloadCount; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaActiveUserUsagesRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.selfOnly = request.selfOnly;
            this.sortBy = request.sortBy;
            this.userId = request.userId;
            this.username = request.username;
            this.workloadCount = request.workloadCount;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The quota identifier for which to retrieve detailed information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quotamtl37ge7gkvdz</p>
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to view only the resource usage in the current quota.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder selfOnly(Boolean selfOnly) {
            this.putQueryParameter("SelfOnly", selfOnly);
            this.selfOnly = selfOnly;
            return this;
        }

        /**
         * <p>The field by which to sort the returned results. Valid values:</p>
         * <ul>
         * <li>QuotaId</li>
         * <li>SubmittedCPU</li>
         * <li>SubmittedMemory</li>
         * <li>SubmittedGPU</li>
         * <li>UsedCPU</li>
         * <li>UsedMemory</li>
         * <li>UsedGPU</li>
         * <li>WorkloadCount</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The user ID for which to query resource usage.</p>
         * 
         * <strong>example:</strong>
         * <p>200xxxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username for which to query resource usage.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * WorkloadCount.
         */
        public Builder workloadCount(Integer workloadCount) {
            this.putQueryParameter("WorkloadCount", workloadCount);
            this.workloadCount = workloadCount;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListQuotaActiveUserUsagesRequest build() {
            return new ListQuotaActiveUserUsagesRequest(this);
        } 

    } 

}
