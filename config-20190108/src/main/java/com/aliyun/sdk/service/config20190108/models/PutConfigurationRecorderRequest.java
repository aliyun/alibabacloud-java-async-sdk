// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConfigurationRecorderRequest} extends {@link RequestModel}
 *
 * <p>PutConfigurationRecorderRequest</p>
 */
public class PutConfigurationRecorderRequest extends Request {
    @Body
    @NameInMap("ResourceTypes")
    @Validation(required = true)
    private String resourceTypes;

    private PutConfigurationRecorderRequest(Builder builder) {
        super(builder);
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConfigurationRecorderRequest create() {
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

    public static final class Builder extends Request.Builder<PutConfigurationRecorderRequest, Builder> {
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(PutConfigurationRecorderRequest response) {
            super(response);
            this.resourceTypes = response.resourceTypes;
        } 

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putBodyParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public PutConfigurationRecorderRequest build() {
            return new PutConfigurationRecorderRequest(this);
        } 

    } 

}
