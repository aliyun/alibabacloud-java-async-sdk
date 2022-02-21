// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageSharePermissionRequest</p>
 */
public class DescribeImageSharePermissionRequest extends Request {
    @Query
    @NameInMap("AliyunId")
    private Long aliyunId;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private String pageSize;

    private DescribeImageSharePermissionRequest(Builder builder) {
        super(builder);
        this.aliyunId = builder.aliyunId;
        this.imageId = builder.imageId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSharePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunId
     */
    public Long getAliyunId() {
        return this.aliyunId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
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

    public static final class Builder extends Request.Builder<DescribeImageSharePermissionRequest, Builder> {
        private Long aliyunId; 
        private String imageId; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageSharePermissionRequest response) {
            super(response);
            this.aliyunId = response.aliyunId;
            this.imageId = response.imageId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * AliyunId.
         */
        public Builder aliyunId(Long aliyunId) {
            this.putQueryParameter("AliyunId", aliyunId);
            this.aliyunId = aliyunId;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeImageSharePermissionRequest build() {
            return new DescribeImageSharePermissionRequest(this);
        } 

    } 

}
