// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>GetMetaCategoryRequest</p>
 */
public class GetMetaCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    private GetMetaCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaCategoryRequest create() {
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

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder extends Request.Builder<GetMetaCategoryRequest, Builder> {
        private String regionId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long parentCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.parentCategoryId = request.parentCategoryId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
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
         * <p>The category tree ID.</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.putQueryParameter("ParentCategoryId", parentCategoryId);
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        @Override
        public GetMetaCategoryRequest build() {
            return new GetMetaCategoryRequest(this);
        } 

    } 

}
