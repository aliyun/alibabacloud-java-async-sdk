// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAICImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAICImagesRequest</p>
 */
public class DescribeAICImagesRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageType")
    private String imageType;

    @Query
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Query
    @NameInMap("MaxDate")
    private String maxDate;

    @Query
    @NameInMap("MinDate")
    private String minDate;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("Status")
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
         * The description of the image.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The image ID of the AIC instance.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   **public**: public image
         * *   **private**: custom image
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The URL of the AIC image repository.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. The maximum value is **100**. Default value: **10**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the image. Valid values:
         * <p>
         * 
         * *   **verifying**
         * *   **disable**
         * *   **available**
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
