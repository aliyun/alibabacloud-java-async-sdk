// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateTagOptionWithResourceRequest} extends {@link RequestModel}
 *
 * <p>AssociateTagOptionWithResourceRequest</p>
 */
public class AssociateTagOptionWithResourceRequest extends Request {
    @Body
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Body
    @NameInMap("TagOptionId")
    @Validation(required = true)
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
         * The ID of the resource with which the tag option is associated.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The ID of the tag option.
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
