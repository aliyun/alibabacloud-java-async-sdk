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
 * {@link DescribeImageBaselineItemListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineItemListRequest</p>
 */
public class DescribeImageBaselineItemListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineClassKey")
    private String baselineClassKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineNameKey")
    private String baselineNameKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

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
    public java.util.List<String> getScanRange() {
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
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeImageBaselineItemListRequest, Builder> {
        private String baselineClassKey; 
        private String baselineNameKey; 
        private Integer currentPage; 
        private String imageUuid; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List<String> scanRange; 
        private String status; 
        private java.util.List<String> uuids; 

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
         * <p>The key of the baseline type.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_leak</p>
         */
        public Builder baselineClassKey(String baselineClassKey) {
            this.putQueryParameter("BaselineClassKey", baselineClassKey);
            this.baselineClassKey = baselineClassKey;
            return this;
        }

        /**
         * <p>The key of the baseline name.</p>
         * 
         * <strong>example:</strong>
         * <p>AccessKey pair leak</p>
         */
        public Builder baselineNameKey(String baselineNameKey) {
            this.putQueryParameter("BaselineNameKey", baselineNameKey);
            this.baselineNameKey = baselineNameKey;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The UUID of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0b5c7193300da2070220038718ad****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The types of the assets that are scanned.</p>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The status of the baseline risk item. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unfixed</li>
         * <li><strong>1</strong>: fixed</li>
         * <li><strong>2</strong>: pending verification</li>
         * <li><strong>3</strong>: fixing failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUIDs of images.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
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
