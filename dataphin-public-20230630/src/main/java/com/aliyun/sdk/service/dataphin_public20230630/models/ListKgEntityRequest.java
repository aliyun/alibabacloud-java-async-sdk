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
 * {@link ListKgEntityRequest} extends {@link RequestModel}
 *
 * <p>ListKgEntityRequest</p>
 */
public class ListKgEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListKgEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityType = builder.entityType;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKgEntityRequest create() {
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
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListKgEntityRequest, Builder> {
        private String regionId; 
        private String entityType; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListKgEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityType = request.entityType;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.workspaceId = request.workspaceId;
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
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * ListQuery.
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListKgEntityRequest build() {
            return new ListKgEntityRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListKgEntityRequest} extends {@link TeaModel}
     *
     * <p>ListKgEntityRequest</p>
     */
    public static class FilterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Op")
        @com.aliyun.core.annotation.Validation(required = true)
        private String op;

        @com.aliyun.core.annotation.NameInMap("PropertyCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String propertyCode;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private FilterList(Builder builder) {
            this.op = builder.op;
            this.propertyCode = builder.propertyCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterList create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return propertyCode
         */
        public String getPropertyCode() {
            return this.propertyCode;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String op; 
            private String propertyCode; 
            private String value; 

            private Builder() {
            } 

            private Builder(FilterList model) {
                this.op = model.op;
                this.propertyCode = model.propertyCode;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>company_name</p>
             */
            public Builder propertyCode(String propertyCode) {
                this.propertyCode = propertyCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FilterList build() {
                return new FilterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKgEntityRequest} extends {@link TeaModel}
     *
     * <p>ListKgEntityRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterList")
        private java.util.List<FilterList> filterList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        private ListQuery(Builder builder) {
            this.filterList = builder.filterList;
            this.keyword = builder.keyword;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return filterList
         */
        public java.util.List<FilterList> getFilterList() {
            return this.filterList;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private java.util.List<FilterList> filterList; 
            private String keyword; 
            private Integer pageNum; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.filterList = model.filterList;
                this.keyword = model.keyword;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
            } 

            /**
             * FilterList.
             */
            public Builder filterList(java.util.List<FilterList> filterList) {
                this.filterList = filterList;
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
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
