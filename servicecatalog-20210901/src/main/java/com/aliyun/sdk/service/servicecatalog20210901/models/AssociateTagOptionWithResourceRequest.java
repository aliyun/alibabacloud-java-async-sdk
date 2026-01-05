// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link AssociateTagOptionWithResourceRequest} extends {@link RequestModel}
 *
 * <p>AssociateTagOptionWithResourceRequest</p>
 */
public class AssociateTagOptionWithResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagOptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagOptionId;

    private AssociateTagOptionWithResourceRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.tagOptionId = builder.tagOptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateTagOptionWithResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tagOptionId
     */
    public String getTagOptionId() {
        return this.tagOptionId;
    }

    public static final class Builder extends Request.Builder<AssociateTagOptionWithResourceRequest, Builder> {
        private String resourceId; 
        private String tagOptionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateTagOptionWithResourceRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.tagOptionId = request.tagOptionId;
        } 

        /**
         * <p>The ID of the resource with which the tag option is associated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp15p96922****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The ID of the tag option.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-bp1u6mdf3d****</p>
         */
        public Builder tagOptionId(String tagOptionId) {
            this.putBodyParameter("TagOptionId", tagOptionId);
            this.tagOptionId = tagOptionId;
            return this;
        }

        @Override
        public AssociateTagOptionWithResourceRequest build() {
            return new AssociateTagOptionWithResourceRequest(this);
        } 

    } 

}
