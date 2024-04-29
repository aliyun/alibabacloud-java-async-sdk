// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOssBucketScanInfoRequest} extends {@link RequestModel}
 *
 * <p>ListOssBucketScanInfoRequest</p>
 */
public class ListOssBucketScanInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzBucketName")
    private String fuzzBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasRisk")
    private Integer hasRisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The name of the bucket that is used for fuzzy match.
         */
        public Builder fuzzBucketName(String fuzzBucketName) {
            this.putQueryParameter("FuzzBucketName", fuzzBucketName);
            this.fuzzBucketName = fuzzBucketName;
            return this;
        }

        /**
         * Specifies whether at-risk objects are detected. Valid values:
         * <p>
         * 
         * *   **0**: No at-risk objects are detected.
         * *   **1**: At-risk objects are detected.
         */
        public Builder hasRisk(Integer hasRisk) {
            this.putQueryParameter("HasRisk", hasRisk);
            this.hasRisk = hasRisk;
            return this;
        }

        /**
         * The language of the content in the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The check status of the bucket. Valid values:
         * <p>
         * 
         * *   **1**: The bucket is not checked.
         * *   **2**: All objects in the bucket are being checked.
         * *   **3**: Only new objects in the bucket are being checked.
         * *   **4**: The bucket is checked.
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
