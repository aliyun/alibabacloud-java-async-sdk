// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetResourceTypeTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeTemplateRequest</p>
 */
public class GetResourceTypeTemplateRequest extends Request {
    @Query
    @NameInMap("ResourceType")
    private String resourceType;


    private GetResourceTypeTemplateRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeTemplateRequest create() {
        return builder().build();
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder {
        private String resourceType; 

        /**
         * <p>ResourceType.</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        public GetResourceTypeTemplateRequest build() {
            return new GetResourceTypeTemplateRequest(this);
        } 

    } 

}
