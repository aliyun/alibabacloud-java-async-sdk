// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineItemListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineItemListRequest</p>
 */
public class DescribeImageBaselineItemListRequest extends Request {
    @Query
    @NameInMap("BaselineClassKey")
    private String baselineClassKey;

    @Query
    @NameInMap("BaselineNameKey")
    private String baselineNameKey;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageUuid")
    @Validation(required = true)
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
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Uuids")
    private java.util.List < String > uuids;

    private DescribeImageBaselineItemListRequest(Builder builder) {
        super(builder);
        this.baselineClassKey = builder.baselineClassKey;
        this.baselineNameKey = builder.baselineNameKey;
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.scanRange = builder.scanRange;
        this.status = builder.status;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineItemListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineClassKey
     */
    public String getBaselineClassKey() {
        return this.baselineClassKey;
    }

    /**
     * @return baselineNameKey
     */
    public String getBaselineNameKey() {
        return this.baselineNameKey;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeImageBaselineItemListRequest, Builder> {
        private String baselineClassKey; 
        private String baselineNameKey; 
        private Integer currentPage; 
        private String imageUuid; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List < String > scanRange; 
        private String status; 
        private java.util.List < String > uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBaselineItemListRequest request) {
            super(request);
            this.baselineClassKey = request.baselineClassKey;
            this.baselineNameKey = request.baselineNameKey;
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.scanRange = request.scanRange;
            this.status = request.status;
            this.uuids = request.uuids;
        } 

        /**
         * The key of the baseline type.
         */
        public Builder baselineClassKey(String baselineClassKey) {
            this.putQueryParameter("BaselineClassKey", baselineClassKey);
            this.baselineClassKey = baselineClassKey;
            return this;
        }

        /**
         * The key of the baseline name.
         */
        public Builder baselineNameKey(String baselineNameKey) {
            this.putQueryParameter("BaselineNameKey", baselineNameKey);
            this.baselineNameKey = baselineNameKey;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The UUID of the image.
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The types of the assets that are scanned.
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * The status of the baseline risk item. Valid values:
         * <p>
         * 
         * *   **0**: unfixed
         * *   **1**: fixed
         * *   **2**: pending verification
         * *   **3**: fixing failed
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The UUIDs of images.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeImageBaselineItemListRequest build() {
            return new DescribeImageBaselineItemListRequest(this);
        } 

    } 

}
