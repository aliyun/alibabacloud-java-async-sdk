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
 * {@link UpdateResourceCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceCategoryRequest</p>
 */
public class UpdateResourceCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryName")
    private String resourceCategoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceMatcher")
    private String resourceMatcher;

    private UpdateResourceCategoryRequest(Builder builder) {
        super(builder);
        this.resourceCategoryId = builder.resourceCategoryId;
        this.resourceCategoryName = builder.resourceCategoryName;
        this.resourceMatcher = builder.resourceMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceCategoryId
     */
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
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

    public static final class Builder extends Request.Builder<UpdateResourceCategoryRequest, Builder> {
        private String resourceCategoryId; 
        private String resourceCategoryName; 
        private String resourceMatcher; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceCategoryRequest request) {
            super(request);
            this.resourceCategoryId = request.resourceCategoryId;
            this.resourceCategoryName = request.resourceCategoryName;
            this.resourceMatcher = request.resourceMatcher;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-123***7890</p>
         */
        public Builder resourceCategoryId(String resourceCategoryId) {
            this.putBodyParameter("ResourceCategoryId", resourceCategoryId);
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }

        /**
         * ResourceCategoryName.
         */
        public Builder resourceCategoryName(String resourceCategoryName) {
            this.putBodyParameter("ResourceCategoryName", resourceCategoryName);
            this.resourceCategoryName = resourceCategoryName;
            return this;
        }

        /**
         * ResourceMatcher.
         */
        public Builder resourceMatcher(String resourceMatcher) {
            this.putBodyParameter("ResourceMatcher", resourceMatcher);
            this.resourceMatcher = resourceMatcher;
            return this;
        }

        @Override
        public UpdateResourceCategoryRequest build() {
            return new UpdateResourceCategoryRequest(this);
        } 

    } 

}
