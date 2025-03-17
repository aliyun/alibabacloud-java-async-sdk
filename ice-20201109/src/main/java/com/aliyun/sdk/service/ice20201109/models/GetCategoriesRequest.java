// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetCategoriesRequest} extends {@link RequestModel}
 *
 * <p>GetCategoriesRequest</p>
 */
public class GetCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetCategoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
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
            this.regionId = request.regionId;
            this.cateId = request.cateId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.type = request.type;
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
         * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://ims.console.aliyun.com">Intelligent Media Services (IMS) console</a> and choose <strong>Media Asset Management</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
         * <li>View the value of CateId returned by the AddCategory operation that you called to create a category.</li>
         * <li>View the value of CateId returned by the GetCategories operation that you called to query a category.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sorting rule of results. Valid values:</p>
         * <p>- CreationTime:Desc (default): The results are sorted in reverse chronological order based on the creation time.</p>
         * <p>- CreationTime:Asc: The results are sorted in chronological order based on the creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The type of the category. Valid values: default and material. A value of default indicates audio, video, and image files. This is the default value. A value of material indicates short video materials.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
