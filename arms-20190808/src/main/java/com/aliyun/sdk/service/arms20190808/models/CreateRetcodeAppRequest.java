// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the resource group. You can obtain the resource group ID in the <strong>Resource Management</strong> console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SdkTest</p>
         */
        public Builder retcodeAppName(String retcodeAppName) {
            this.putQueryParameter("RetcodeAppName", retcodeAppName);
            this.retcodeAppName = retcodeAppName;
            return this;
        }

        /**
         * <p>The type of the application. Valid values:</p>
         * <ul>
         * <li><code>web</code>: web application</li>
         * <li><code>weex</code>: Weex mobile app</li>
         * <li><code>mini_dd</code>: DingTalk mini program</li>
         * <li><code>mini_alipay</code>: Alipay mini program</li>
         * <li><code>mini_wx</code>: WeChat mini program</li>
         * <li><code>mini_common</code>: mini program on other platforms</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mini_dd</p>
         */
        public Builder retcodeAppType(String retcodeAppType) {
            this.putQueryParameter("RetcodeAppType", retcodeAppType);
            this.retcodeAppType = retcodeAppType;
            return this;
        }

        /**
         * <p>The tags that you want to add to the task.</p>
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

    /**
     * 
     * {@link CreateRetcodeAppRequest} extends {@link TeaModel}
     *
     * <p>CreateRetcodeAppRequest</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
