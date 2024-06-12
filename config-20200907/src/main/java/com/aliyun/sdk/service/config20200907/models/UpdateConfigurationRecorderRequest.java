// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigurationRecorderRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigurationRecorderRequest</p>
 */
public class UpdateConfigurationRecorderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceTypes;

    private UpdateConfigurationRecorderRequest(Builder builder) {
        super(builder);
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigurationRecorderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<UpdateConfigurationRecorderRequest, Builder> {
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigurationRecorderRequest request) {
            super(request);
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * The resource types. Separate multiple resource types with commas (,).
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putBodyParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public UpdateConfigurationRecorderRequest build() {
            return new UpdateConfigurationRecorderRequest(this);
        } 

    } 

}
