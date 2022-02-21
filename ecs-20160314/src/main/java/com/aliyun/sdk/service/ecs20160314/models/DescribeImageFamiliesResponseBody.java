// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageFamiliesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageFamiliesResponseBody</p>
 */
public class DescribeImageFamiliesResponseBody extends TeaModel {
    @NameInMap("ImageFamilies")
    private ImageFamilies imageFamilies;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageFamiliesResponseBody(Builder builder) {
        this.imageFamilies = builder.imageFamilies;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageFamiliesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageFamilies
     */
    public ImageFamilies getImageFamilies() {
        return this.imageFamilies;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ImageFamilies imageFamilies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ImageFamilies.
         */
        public Builder imageFamilies(ImageFamilies imageFamilies) {
            this.imageFamilies = imageFamilies;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageFamiliesResponseBody build() {
            return new DescribeImageFamiliesResponseBody(this);
        } 

    } 

    public static class ImageFamilies extends TeaModel {
        @NameInMap("ImageFamily")
        private java.util.List < String > imageFamily;

        private ImageFamilies(Builder builder) {
            this.imageFamily = builder.imageFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageFamilies create() {
            return builder().build();
        }

        /**
         * @return imageFamily
         */
        public java.util.List < String > getImageFamily() {
            return this.imageFamily;
        }

        public static final class Builder {
            private java.util.List < String > imageFamily; 

            /**
             * ImageFamily.
             */
            public Builder imageFamily(java.util.List < String > imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            public ImageFamilies build() {
                return new ImageFamilies(this);
            } 

        } 

    }
}
