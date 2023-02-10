// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRequest</p>
 */
public class DescribeImageRequest extends Request {
    @Query
    @NameInMap("ImageInstanceId")
    @Validation(required = true)
    private String imageInstanceId;

    @Query
    @NameInMap("ImageRegionId")
    @Validation(required = true)
    private String imageRegionId;

    @Query
    @NameInMap("ImageRepoId")
    @Validation(required = true)
    private String imageRepoId;

    @Query
    @NameInMap("ImageTag")
    @Validation(required = true)
    private String imageTag;

    private DescribeImageRequest(Builder builder) {
        super(builder);
        this.imageInstanceId = builder.imageInstanceId;
        this.imageRegionId = builder.imageRegionId;
        this.imageRepoId = builder.imageRepoId;
        this.imageTag = builder.imageTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageInstanceId
     */
    public String getImageInstanceId() {
        return this.imageInstanceId;
    }

    /**
     * @return imageRegionId
     */
    public String getImageRegionId() {
        return this.imageRegionId;
    }

    /**
     * @return imageRepoId
     */
    public String getImageRepoId() {
        return this.imageRepoId;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    public static final class Builder extends Request.Builder<DescribeImageRequest, Builder> {
        private String imageInstanceId; 
        private String imageRegionId; 
        private String imageRepoId; 
        private String imageTag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageRequest request) {
            super(request);
            this.imageInstanceId = request.imageInstanceId;
            this.imageRegionId = request.imageRegionId;
            this.imageRepoId = request.imageRepoId;
            this.imageTag = request.imageTag;
        } 

        /**
         * The instance ID of the image.
         * <p>
         * 
         * >  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query the IDs of instances.
         */
        public Builder imageInstanceId(String imageInstanceId) {
            this.putQueryParameter("ImageInstanceId", imageInstanceId);
            this.imageInstanceId = imageInstanceId;
            return this;
        }

        /**
         * The region ID of the image.
         * <p>
         * 
         * >  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query the IDs of regions.
         */
        public Builder imageRegionId(String imageRegionId) {
            this.putQueryParameter("ImageRegionId", imageRegionId);
            this.imageRegionId = imageRegionId;
            return this;
        }

        /**
         * The ID of the image repository.
         * <p>
         * 
         * >  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query the IDs of image repositories.
         */
        public Builder imageRepoId(String imageRepoId) {
            this.putQueryParameter("ImageRepoId", imageRepoId);
            this.imageRepoId = imageRepoId;
            return this;
        }

        /**
         * The tag that is added to the image.
         * <p>
         * 
         * >  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query tags.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        @Override
        public DescribeImageRequest build() {
            return new DescribeImageRequest(this);
        } 

    } 

}
