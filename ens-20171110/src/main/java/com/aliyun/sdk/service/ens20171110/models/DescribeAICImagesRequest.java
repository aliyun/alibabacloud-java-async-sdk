// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeAICImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAICImagesRequest</p>
 */
public class DescribeAICImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDate")
    private String maxDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDate")
    private String minDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeAICImagesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.imageType = builder.imageType;
        this.imageUrl = builder.imageUrl;
        this.maxDate = builder.maxDate;
        this.minDate = builder.minDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAICImagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return maxDate
     */
    public String getMaxDate() {
        return this.maxDate;
    }

    /**
     * @return minDate
     */
    public String getMinDate() {
        return this.minDate;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeAICImagesRequest, Builder> {
        private String description; 
        private String imageId; 
        private String imageType; 
        private String imageUrl; 
        private String maxDate; 
        private String minDate; 
        private String pageNumber; 
        private String pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAICImagesRequest request) {
            super(request);
            this.description = request.description;
            this.imageId = request.imageId;
            this.imageType = request.imageType;
            this.imageUrl = request.imageUrl;
            this.maxDate = request.maxDate;
            this.minDate = request.minDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Test operation of console</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The image ID of the AIC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>m-ad0ddaddc2d54adeaa09b7c0f1e****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: public image</li>
         * <li><strong>private</strong>: custom image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>The URL of the AIC image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>****.alibaba-inc.com/aic/socimage:test</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-02</p>
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-02</p>
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. The maximum value is <strong>100</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li><strong>verifying</strong></li>
         * <li><strong>disable</strong></li>
         * <li><strong>available</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAICImagesRequest build() {
            return new DescribeAICImagesRequest(this);
        } 

    } 

}
