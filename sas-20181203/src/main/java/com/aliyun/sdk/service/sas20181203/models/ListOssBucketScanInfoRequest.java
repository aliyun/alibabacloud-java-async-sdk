// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOssBucketScanInfoRequest} extends {@link RequestModel}
 *
 * <p>ListOssBucketScanInfoRequest</p>
 */
public class ListOssBucketScanInfoRequest extends Request {
    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("FuzzBucketName")
    private String fuzzBucketName;

    @Query
    @NameInMap("HasRisk")
    private Integer hasRisk;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private Integer status;

    private ListOssBucketScanInfoRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.currentPage = builder.currentPage;
        this.fuzzBucketName = builder.fuzzBucketName;
        this.hasRisk = builder.hasRisk;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOssBucketScanInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fuzzBucketName
     */
    public String getFuzzBucketName() {
        return this.fuzzBucketName;
    }

    /**
     * @return hasRisk
     */
    public Integer getHasRisk() {
        return this.hasRisk;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListOssBucketScanInfoRequest, Builder> {
        private String bucketName; 
        private Integer currentPage; 
        private String fuzzBucketName; 
        private Integer hasRisk; 
        private String lang; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListOssBucketScanInfoRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.currentPage = request.currentPage;
            this.fuzzBucketName = request.fuzzBucketName;
            this.hasRisk = request.hasRisk;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * FuzzBucketName.
         */
        public Builder fuzzBucketName(String fuzzBucketName) {
            this.putQueryParameter("FuzzBucketName", fuzzBucketName);
            this.fuzzBucketName = fuzzBucketName;
            return this;
        }

        /**
         * HasRisk.
         */
        public Builder hasRisk(Integer hasRisk) {
            this.putQueryParameter("HasRisk", hasRisk);
            this.hasRisk = hasRisk;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListOssBucketScanInfoRequest build() {
            return new ListOssBucketScanInfoRequest(this);
        } 

    } 

}
