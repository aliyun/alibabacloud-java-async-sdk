// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListApprovalTasksByUserRequest} extends {@link RequestModel}
 *
 * <p>ListApprovalTasksByUserRequest</p>
 */
public class ListApprovalTasksByUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListApprovalTasksByUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalTasksByUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListApprovalTasksByUserRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListApprovalTasksByUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The query conditions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListApprovalTasksByUserRequest build() {
            return new ListApprovalTasksByUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListApprovalTasksByUserRequest} extends {@link TeaModel}
     *
     * <p>ListApprovalTasksByUserRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmittedFrom")
        private String submittedFrom;

        @com.aliyun.core.annotation.NameInMap("SubmittedTo")
        private String submittedTo;

        private ListQuery(Builder builder) {
            this.approvalType = builder.approvalType;
            this.keyword = builder.keyword;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.relationType = builder.relationType;
            this.status = builder.status;
            this.submittedFrom = builder.submittedFrom;
            this.submittedTo = builder.submittedTo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return approvalType
         */
        public String getApprovalType() {
            return this.approvalType;
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
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submittedFrom
         */
        public String getSubmittedFrom() {
            return this.submittedFrom;
        }

        /**
         * @return submittedTo
         */
        public String getSubmittedTo() {
            return this.submittedTo;
        }

        public static final class Builder {
            private String approvalType; 
            private String keyword; 
            private Integer page; 
            private Integer pageSize; 
            private String relationType; 
            private String status; 
            private String submittedFrom; 
            private String submittedTo; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.approvalType = model.approvalType;
                this.keyword = model.keyword;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.relationType = model.relationType;
                this.status = model.status;
                this.submittedFrom = model.submittedFrom;
                this.submittedTo = model.submittedTo;
            } 

            /**
             * <p>The approval task type. Valid values:</p>
             * <ul>
             * <li>APPROVE: Permission approval.</li>
             * <li>MANAGE: Management.</li>
             * <li>OTHERS: Others.</li>
             * <li>ATOMIC: Atomic metric approval.</li>
             * <li>BIZ_OBJECT: Business object approval.</li>
             * <li>BIZ_PROCESS: Business process approval.</li>
             * <li>PUBLISH_APPROVE: Publish approval.</li>
             * <li>BASELINE_APPROVE: Baseline approval.</li>
             * <li>CODE_REVIEW: Asset approval.</li>
             * <li>OBJECT_CODE_REVIEW: Code review.</li>
             * <li>STANDARD_APPROVAL: Standard online approval.</li>
             * <li>BATCH_STANDARD_APPROVAL: Batch standard online approval.</li>
             * <li>STANDARD_OFFLINE_APPROVAL: Standard offline approval.</li>
             * <li>BATCH_STANDARD_OFFLINE_APPROVAL: Batch standard offline approval.</li>
             * <li>PRIVILEGE_TRANSFER_APPROVAL: Permission transfer approval.</li>
             * <li>QD_FEATURE_ONLINE: Label listing.</li>
             * <li>QD_FEATURE_OFFLINE: Label delisting.</li>
             * <li>QD_CLUSTER_ONLINE: Group online.</li>
             * <li>QD_CLUSTER_OFFLINE: Group offline.</li>
             * <li>QD_MEMBER_ADD_APP: Add member to application.</li>
             * <li>QD_FEATURE_ADD_APP: Add label to application.</li>
             * <li>QD_CLUSTER_ADD_APP: Add group to application.</li>
             * <li>QD_FEATURE_ADD_PROJECT: Add label to project.</li>
             * <li>QD_CLUSTER_ADD_PROJECT: Add group to project.</li>
             * <li>TASK_DATA_DOWNLOAD: Data download.</li>
             * <li>CUSTOM_OPERATE: Custom operation.</li>
             * <li>PRIVACY_COMPUTING: Privacy-preserving computation.</li>
             * <li>MDC_TOPIC_DIR_PUBLISH: Asset topic directory publish.</li>
             * <li>ASSET_PUBLISH: Asset listing approval.</li>
             * <li>ASSET_UN_PUBLISH: Asset delisting approval.</li>
             * <li>APPLICATION_CREATE: Application creation approval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_SOURCE</p>
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>The keyword for fuzzy match on the task name.</p>
             * 
             * <strong>example:</strong>
             * <p>datasource</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The page number, starting from 1. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of records per page. Default value: 20. Maximum value: 100. Values greater than 100 are automatically adjusted to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The relationship type between the current user and the approval task. This parameter is required. Valid values:</p>
             * <ul>
             * <li>SUBMITTED: Submitted by me.</li>
             * <li>PENDING_APPROVAL: Pending my approval.</li>
             * <li>PROCESSED: Processed by me.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SUBMITTED</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The approval status filter. Status filtering is not supported in the pending scenario. Valid values:</p>
             * <ul>
             * <li>APPROVING: Approving.</li>
             * <li>APPROVED: Approved.</li>
             * <li>REJECTED: Rejected.</li>
             * <li>REVOKED: Revoked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The start of the submission time range, in the format yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01 00:00:00</p>
             */
            public Builder submittedFrom(String submittedFrom) {
                this.submittedFrom = submittedFrom;
                return this;
            }

            /**
             * <p>The end of the submission time range, in the format yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-31 23:59:59</p>
             */
            public Builder submittedTo(String submittedTo) {
                this.submittedTo = submittedTo;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
