// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartModelServiceRequest} extends {@link RequestModel}
 *
 * <p>StartModelServiceRequest</p>
 */
public class StartModelServiceRequest extends Request {
    @Body
    @NameInMap("ModelServiceId")
    private String modelServiceId;

    private StartModelServiceRequest(Builder builder) {
        super(builder);
        this.modelServiceId = builder.modelServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartModelServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public static final class Builder extends Request.Builder<StartModelServiceRequest, Builder> {
        private String modelServiceId; 

        private Builder() {
            super();
        } 

        private Builder(StartModelServiceRequest response) {
            super(response);
            this.modelServiceId = response.modelServiceId;
        } 

        /**
         * ModelServiceId.
         */
        public Builder modelServiceId(String modelServiceId) {
            this.putBodyParameter("ModelServiceId", modelServiceId);
            this.modelServiceId = modelServiceId;
            return this;
        }

        @Override
        public StartModelServiceRequest build() {
            return new StartModelServiceRequest(this);
        } 

    } 

}
