// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCategoriesRequest} extends {@link RequestModel}
 *
 * <p>GetCategoriesRequest</p>
 */
public class GetCategoriesRequest extends Request {
    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("Type")
    private String type;

    private GetCategoriesRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetCategoriesRequest, Builder> {
        private Long cateId; 
        private Long pageNo; 
        private Long pageSize; 
        private String sortBy; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetCategoriesRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.type = request.type;
        } 

        /**
         * The ID of the category. Default value: **-1**, which indicates the parent category ID of a level 1 category.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * The number of the page where the subcategories to be returned are listed. Default value: **1**.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page of the subcategory list. Default value: **10**. Maximum value: **100**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The method for sorting the results. Valid values:
         * <p>
         * 
         * *   **CreationTime:Desc** (default): The results are sorted in reverse chronological order based on the creation time.
         * *   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The type of the category. Valid values:
         * <p>
         * 
         * *   **default** (default): default category
         * *   **material**: material category
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCategoriesRequest build() {
            return new GetCategoriesRequest(this);
        } 

    } 

}
