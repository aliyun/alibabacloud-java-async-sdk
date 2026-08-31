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
 * {@link ListGovernObjectsRequest} extends {@link RequestModel}
 *
 * <p>ListGovernObjectsRequest</p>
 */
public class ListGovernObjectsRequest extends Request {
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

    private ListGovernObjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGovernObjectsRequest create() {
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

    public static final class Builder extends Request.Builder<ListGovernObjectsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListGovernObjectsRequest request) {
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
        public ListGovernObjectsRequest build() {
            return new ListGovernObjectsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListGovernObjectsRequest} extends {@link TeaModel}
     *
     * <p>ListGovernObjectsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GovernItemType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String governItemType;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectNames")
        private java.util.List<String> projectNames;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<String> statusList;

        @com.aliyun.core.annotation.NameInMap("ViewType")
        private String viewType;

        private ListQuery(Builder builder) {
            this.governItemType = builder.governItemType;
            this.keyword = builder.keyword;
            this.owner = builder.owner;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.projectNames = builder.projectNames;
            this.statusList = builder.statusList;
            this.viewType = builder.viewType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return governItemType
         */
        public String getGovernItemType() {
            return this.governItemType;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
         * @return projectNames
         */
        public java.util.List<String> getProjectNames() {
            return this.projectNames;
        }

        /**
         * @return statusList
         */
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        /**
         * @return viewType
         */
        public String getViewType() {
            return this.viewType;
        }

        public static final class Builder {
            private String governItemType; 
            private String keyword; 
            private String owner; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<String> projectNames; 
            private java.util.List<String> statusList; 
            private String viewType; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.governItemType = model.governItemType;
                this.keyword = model.keyword;
                this.owner = model.owner;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.projectNames = model.projectNames;
                this.statusList = model.statusList;
                this.viewType = model.viewType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder governItemType(String governItemType) {
                this.governItemType = governItemType;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * ProjectNames.
             */
            public Builder projectNames(java.util.List<String> projectNames) {
                this.projectNames = projectNames;
                return this;
            }

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List<String> statusList) {
                this.statusList = statusList;
                return this;
            }

            /**
             * ViewType.
             */
            public Builder viewType(String viewType) {
                this.viewType = viewType;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
