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
 * {@link ListRowPermissionByUserIdRequest} extends {@link RequestModel}
 *
 * <p>ListRowPermissionByUserIdRequest</p>
 */
public class ListRowPermissionByUserIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListRowPermissionByUserIdQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListRowPermissionByUserIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listRowPermissionByUserIdQuery = builder.listRowPermissionByUserIdQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRowPermissionByUserIdRequest create() {
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
     * @return listRowPermissionByUserIdQuery
     */
    public ListRowPermissionByUserIdQuery getListRowPermissionByUserIdQuery() {
        return this.listRowPermissionByUserIdQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ListRowPermissionByUserIdRequest, Builder> {
        private String regionId; 
        private ListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListRowPermissionByUserIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listRowPermissionByUserIdQuery = request.listRowPermissionByUserIdQuery;
            this.opTenantId = request.opTenantId;
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
        public Builder listRowPermissionByUserIdQuery(ListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery) {
            String listRowPermissionByUserIdQueryShrink = shrink(listRowPermissionByUserIdQuery, "ListRowPermissionByUserIdQuery", "json");
            this.putBodyParameter("ListRowPermissionByUserIdQuery", listRowPermissionByUserIdQueryShrink);
            this.listRowPermissionByUserIdQuery = listRowPermissionByUserIdQuery;
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

        @Override
        public ListRowPermissionByUserIdRequest build() {
            return new ListRowPermissionByUserIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListRowPermissionByUserIdRequest} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdRequest</p>
     */
    public static class ListRowPermissionByUserIdQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        private ListRowPermissionByUserIdQuery(Builder builder) {
            this.operator = builder.operator;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListRowPermissionByUserIdQuery create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
            private String operator; 
            private Integer pageNum; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(ListRowPermissionByUserIdQuery model) {
                this.operator = model.operator;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30008888</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public ListRowPermissionByUserIdQuery build() {
                return new ListRowPermissionByUserIdQuery(this);
            } 

        } 

    }
}
