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
 * {@link DescribeImageRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRequest</p>
 */
public class DescribeImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRepoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageRepoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTag")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The instance ID of the image.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to query the IDs of instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-hfs6gaawhyu6****</p>
         */
        public Builder imageInstanceId(String imageInstanceId) {
            this.putQueryParameter("ImageInstanceId", imageInstanceId);
            this.imageInstanceId = imageInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the image.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to query the IDs of regions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder imageRegionId(String imageRegionId) {
            this.putQueryParameter("ImageRegionId", imageRegionId);
            this.imageRegionId = imageRegionId;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to query the IDs of image repositories.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-7i88t7lx3fmf****</p>
         */
        public Builder imageRepoId(String imageRepoId) {
            this.putQueryParameter("ImageRepoId", imageRepoId);
            this.imageRepoId = imageRepoId;
            return this;
        }

        /**
         * <p>The tag that is added to the image.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to query tags.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.8.0.15</p>
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
