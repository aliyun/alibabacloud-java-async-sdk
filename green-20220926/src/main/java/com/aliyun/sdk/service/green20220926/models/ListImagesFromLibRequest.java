// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListImagesFromLibRequest} extends {@link RequestModel}
 *
 * <p>ListImagesFromLibRequest</p>
 */
public class ListImagesFromLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImgId")
    private String imgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sort")
    private java.util.Map<String, String> sort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private ListImagesFromLibRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.imgId = builder.imgId;
        this.libId = builder.libId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesFromLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return imgId
     */
    public String getImgId() {
        return this.imgId;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sort
     */
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListImagesFromLibRequest, Builder> {
        private Integer currentPage; 
        private String endDate; 
        private String imgId; 
        private String libId; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.Map<String, String> sort; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesFromLibRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.imgId = request.imgId;
            this.libId = request.libId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sort = request.sort;
            this.startDate = request.startDate;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>End date.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-24 10:01:55</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        public Builder imgId(String imgId) {
            this.putBodyParameter("ImgId", imgId);
            this.imgId = imgId;
            return this;
        }

        /**
         * <p>Gallery ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_xxxx</p>
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Sort field.</p>
         */
        public Builder sort(java.util.Map<String, String> sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putBodyParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * <p>Start date.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-11 09:00:19</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ListImagesFromLibRequest build() {
            return new ListImagesFromLibRequest(this);
        } 

    } 

}
