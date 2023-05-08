// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSensitiveFileByKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageSensitiveFileByKeyRequest</p>
 */
public class DescribeImageSensitiveFileByKeyRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageUuid")
    private String imageUuid;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    @Query
    @NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

    private DescribeImageSensitiveFileByKeyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.scanRange = builder.scanRange;
        this.sensitiveFileKey = builder.sensitiveFileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSensitiveFileByKeyRequest create() {
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
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
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
     * @return scanRange
     */
    public java.util.List < String > getScanRange() {
        return this.scanRange;
    }

    /**
     * @return sensitiveFileKey
     */
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    public static final class Builder extends Request.Builder<DescribeImageSensitiveFileByKeyRequest, Builder> {
        private Integer currentPage; 
        private String imageUuid; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List < String > scanRange; 
        private String sensitiveFileKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageSensitiveFileByKeyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.scanRange = request.scanRange;
            this.sensitiveFileKey = request.sensitiveFileKey;
        } 

        /**
         * The key of the last data entry.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * The timestamp when the last scan was performed. Unit: milliseconds.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * The digest of the image layer.
         */
        public Builder sensitiveFileKey(String sensitiveFileKey) {
            this.putQueryParameter("SensitiveFileKey", sensitiveFileKey);
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }

        @Override
        public DescribeImageSensitiveFileByKeyRequest build() {
            return new DescribeImageSensitiveFileByKeyRequest(this);
        } 

    } 

}
