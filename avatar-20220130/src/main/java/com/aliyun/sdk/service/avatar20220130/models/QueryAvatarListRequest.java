// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvatarListRequest} extends {@link RequestModel}
 *
 * <p>QueryAvatarListRequest</p>
 */
public class QueryAvatarListRequest extends Request {
    @Query
    @NameInMap("ModelType")
    @Validation(required = true)
    private String modelType;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private QueryAvatarListRequest(Builder builder) {
        super(builder);
        this.modelType = builder.modelType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryAvatarListRequest, Builder> {
        private String modelType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvatarListRequest request) {
            super(request);
            this.modelType = request.modelType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryAvatarListRequest build() {
            return new QueryAvatarListRequest(this);
        } 

    } 

}
