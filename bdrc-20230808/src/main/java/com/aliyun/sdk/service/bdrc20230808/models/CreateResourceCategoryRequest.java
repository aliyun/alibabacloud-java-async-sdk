// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link CreateResourceCategoryRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceCategoryRequest</p>
 */
public class CreateResourceCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceCategoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceMatcher")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceMatcher;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private CreateResourceCategoryRequest(Builder builder) {
        super(builder);
        this.resourceCategoryName = builder.resourceCategoryName;
        this.resourceMatcher = builder.resourceMatcher;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceCategoryName
     */
    public String getResourceCategoryName() {
        return this.resourceCategoryName;
    }

    /**
     * @return resourceMatcher
     */
    public String getResourceMatcher() {
        return this.resourceMatcher;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CreateResourceCategoryRequest, Builder> {
        private String resourceCategoryName; 
        private String resourceMatcher; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceCategoryRequest request) {
            super(request);
            this.resourceCategoryName = request.resourceCategoryName;
            this.resourceMatcher = request.resourceMatcher;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My***ResourceCategory</p>
         */
        public Builder resourceCategoryName(String resourceCategoryName) {
            this.putBodyParameter("ResourceCategoryName", resourceCategoryName);
            this.resourceCategoryName = resourceCategoryName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;type&quot;: &quot;BOOL&quot;,
         *    &quot;operator&quot;: &quot;AND&quot;,
         *    &quot;values&quot;: [
         *      {
         *        &quot;type&quot;: &quot;TAG&quot;,
         *        &quot;operator&quot;: &quot;EQUAL&quot;,
         *        &quot;key&quot;: &quot;key0&quot;,
         *        &quot;values&quot;: [
         *          &quot;value0&quot;
         *        ]
         *      },
         *      {
         *        &quot;type&quot;: &quot;TAG&quot;,
         *        &quot;operator&quot;: &quot;KEY_EXIST&quot;,
         *        &quot;key&quot;: &quot;key1&quot;
         *      },
         *      {
         *        &quot;type&quot;: &quot;TAG&quot;,
         *        &quot;operator&quot;: &quot;KEY_EXIST_NOT_EQUAL&quot;,
         *        &quot;key&quot;: &quot;key2&quot;,
         *        &quot;values&quot;: [
         *          &quot;value2-wrong&quot;
         *        ]
         *      }
         *    ]
         *  }</p>
         */
        public Builder resourceMatcher(String resourceMatcher) {
            this.putBodyParameter("ResourceMatcher", resourceMatcher);
            this.resourceMatcher = resourceMatcher;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateResourceCategoryRequest build() {
            return new CreateResourceCategoryRequest(this);
        } 

    } 

}
