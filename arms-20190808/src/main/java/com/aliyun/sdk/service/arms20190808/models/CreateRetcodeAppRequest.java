// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRetcodeAppRequest} extends {@link RequestModel}
 *
 * <p>CreateRetcodeAppRequest</p>
 */
public class CreateRetcodeAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetcodeAppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String retcodeAppName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetcodeAppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String retcodeAppType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateRetcodeAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.retcodeAppName = builder.retcodeAppName;
        this.retcodeAppType = builder.retcodeAppType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRetcodeAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return retcodeAppName
     */
    public String getRetcodeAppName() {
        return this.retcodeAppName;
    }

    /**
     * @return retcodeAppType
     */
    public String getRetcodeAppType() {
        return this.retcodeAppType;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateRetcodeAppRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private String retcodeAppName; 
        private String retcodeAppType; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateRetcodeAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.retcodeAppName = request.retcodeAppName;
            this.retcodeAppType = request.retcodeAppType;
            this.tags = request.tags;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the application that is monitored by Browser Monitoring.
         */
        public Builder retcodeAppName(String retcodeAppName) {
            this.putQueryParameter("RetcodeAppName", retcodeAppName);
            this.retcodeAppName = retcodeAppName;
            return this;
        }

        /**
         * The site type.
         */
        public Builder retcodeAppType(String retcodeAppType) {
            this.putQueryParameter("RetcodeAppType", retcodeAppType);
            this.retcodeAppType = retcodeAppType;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateRetcodeAppRequest build() {
            return new CreateRetcodeAppRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
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

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
