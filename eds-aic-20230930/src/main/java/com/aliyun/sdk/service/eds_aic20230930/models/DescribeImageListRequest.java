// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeImageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageListRequest</p>
 */
public class DescribeImageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageBizTags")
    private java.util.List<ImageBizTags> imageBizTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImagePackageType")
    private String imagePackageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemType")
    private String systemType;

    private DescribeImageListRequest(Builder builder) {
        super(builder);
        this.imageBizTags = builder.imageBizTags;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imagePackageType = builder.imagePackageType;
        this.imageType = builder.imageType;
        this.instanceType = builder.instanceType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
        this.systemType = builder.systemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageBizTags
     */
    public java.util.List<ImageBizTags> getImageBizTags() {
        return this.imageBizTags;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imagePackageType
     */
    public String getImagePackageType() {
        return this.imagePackageType;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return systemType
     */
    public String getSystemType() {
        return this.systemType;
    }

    public static final class Builder extends Request.Builder<DescribeImageListRequest, Builder> {
        private java.util.List<ImageBizTags> imageBizTags; 
        private String imageId; 
        private String imageName; 
        private String imagePackageType; 
        private String imageType; 
        private String instanceType; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 
        private String systemType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageListRequest request) {
            super(request);
            this.imageBizTags = request.imageBizTags;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.imagePackageType = request.imagePackageType;
            this.imageType = request.imageType;
            this.instanceType = request.instanceType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
            this.systemType = request.systemType;
        } 

        /**
         * ImageBizTags.
         */
        public Builder imageBizTags(java.util.List<ImageBizTags> imageBizTags) {
            this.putQueryParameter("ImageBizTags", imageBizTags);
            this.imageBizTags = imageBizTags;
            return this;
        }

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Android 12 image</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>Image package type.</p>
         * 
         * <strong>example:</strong>
         * <p>VM</p>
         */
        public Builder imagePackageType(String imagePackageType) {
            this.putQueryParameter("ImagePackageType", imagePackageType);
            this.imagePackageType = imagePackageType;
            return this;
        }

        /**
         * <p>The type of the image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>User: custom images.</li>
         * <li>System: system images.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The state of the image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE: The image is available.</li>
         * <li>DELETE: The image is deleted.</li>
         * <li>INIT: The image is being initialized.</li>
         * <li>CREATE_FAILED: The image failed to be created.</li>
         * <li>CREATING: The image is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SystemType.
         */
        public Builder systemType(String systemType) {
            this.putQueryParameter("SystemType", systemType);
            this.systemType = systemType;
            return this;
        }

        @Override
        public DescribeImageListRequest build() {
            return new DescribeImageListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageListRequest} extends {@link TeaModel}
     *
     * <p>DescribeImageListRequest</p>
     */
    public static class ImageBizTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ImageBizTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageBizTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ImageBizTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImageBizTags build() {
                return new ImageBizTags(this);
            } 

        } 

    }
}
