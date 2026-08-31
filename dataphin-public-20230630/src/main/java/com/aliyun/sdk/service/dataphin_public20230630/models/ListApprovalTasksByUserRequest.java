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
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
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
         * OpUserId.
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
             * ApprovalType.
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubmittedFrom.
             */
            public Builder submittedFrom(String submittedFrom) {
                this.submittedFrom = submittedFrom;
                return this;
            }

            /**
             * SubmittedTo.
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
