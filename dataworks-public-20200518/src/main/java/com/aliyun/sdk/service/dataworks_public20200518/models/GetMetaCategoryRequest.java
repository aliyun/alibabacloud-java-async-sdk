// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>GetMetaCategoryRequest</p>
 */
public class GetMetaCategoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentCategoryId")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the category tree.
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
