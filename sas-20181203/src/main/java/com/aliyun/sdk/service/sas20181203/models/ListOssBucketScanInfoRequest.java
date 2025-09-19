// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>iboxpublic****</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the bucket that is used for fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder fuzzBucketName(String fuzzBucketName) {
            this.putQueryParameter("FuzzBucketName", fuzzBucketName);
            this.fuzzBucketName = fuzzBucketName;
            return this;
        }

        /**
         * <p>Specifies whether at-risk objects are detected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No at-risk objects are detected.</li>
         * <li><strong>1</strong>: At-risk objects are detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hasRisk(Integer hasRisk) {
            this.putQueryParameter("HasRisk", hasRisk);
            this.hasRisk = hasRisk;
            return this;
        }

        /**
         * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The check status of the bucket. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The bucket is not checked.</li>
         * <li><strong>2</strong>: All objects in the bucket are being checked.</li>
         * <li><strong>3</strong>: Only new objects in the bucket are being checked.</li>
         * <li><strong>4</strong>: The bucket is checked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
