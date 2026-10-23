// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListWorkflowInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowInstancesRequest</p>
 */
public class ListWorkflowInstancesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessId")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String businessId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initiator")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String initiator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListWorkflowInstancesRequest(Builder builder) {
        super(builder);
        this.businessId = builder.businessId;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.initiator = builder.initiator;
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return initiator
     */
    public String getInitiator() {
        return this.initiator;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListWorkflowInstancesRequest, Builder> {
        private String businessId; 
        private String collaborationGroupId; 
        private String initiator; 
        private String keyword; 
        private Long page; 
        private Long pageSize; 
        private String sortBy; 
        private String sortOrder; 
        private String status; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowInstancesRequest request) {
            super(request);
            this.businessId = request.businessId;
            this.collaborationGroupId = request.collaborationGroupId;
            this.initiator = request.initiator;
            this.keyword = request.keyword;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.status = request.status;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The exact requirement ID.</p>
         * 
         * <strong>example:</strong>
         * <p>REQ-1001</p>
         */
        public Builder businessId(String businessId) {
            this.putBodyParameter("businessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * <p>The collaboration space ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_20261016_abc123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The exact external initiator tag.</p>
         * 
         * <strong>example:</strong>
         * <p>External initiator Zhang San</p>
         */
        public Builder initiator(String initiator) {
            this.putBodyParameter("initiator", initiator);
            this.initiator = initiator;
            return this;
        }

        /**
         * <p>The keyword for the title or requirement ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly report</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT_CREATE</p>
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("sortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("sortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>Filters the instances by status. Valid values: Running, Completed, Failed, and Terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If you use winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListWorkflowInstancesRequest build() {
            return new ListWorkflowInstancesRequest(this);
        } 

    } 

}
