// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link ListImageCachesRequest} extends {@link RequestModel}
 *
 * <p>ListImageCachesRequest</p>
 */
public class ListImageCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCacheName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String imageCacheName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListImageCachesRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
        this.imageCacheName = builder.imageCacheName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageCachesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return imageCacheName
     */
    public String getImageCacheName() {
        return this.imageCacheName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListImageCachesRequest, Builder> {
        private String image; 
        private String imageCacheName; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListImageCachesRequest request) {
            super(request);
            this.image = request.image;
            this.imageCacheName = request.imageCacheName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tags = request.tags;
        } 

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>egs-registry.cn-hangzhou.cr.aliyuncs.com/egs/vllm:0.9.0.1-pytorch2.7-cu128-20250612</p>
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The name of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>my-imc</p>
         */
        public Builder imageCacheName(String imageCacheName) {
            this.putQueryParameter("ImageCacheName", imageCacheName);
            this.imageCacheName = imageCacheName;
            return this;
        }

        /**
         * <p>The maximum number of results to return for a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set the value to the NextToken value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzh43v*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The cache status of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the image cache. You can specify up to 20 tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListImageCachesRequest build() {
            return new ListImageCachesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListImageCachesRequest} extends {@link TeaModel}
     *
     * <p>ListImageCachesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
