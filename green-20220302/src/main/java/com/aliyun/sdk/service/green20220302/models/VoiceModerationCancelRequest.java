// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VoiceModerationCancelRequest} extends {@link RequestModel}
 *
 * <p>VoiceModerationCancelRequest</p>
 */
public class VoiceModerationCancelRequest extends Request {
    @Body
    @NameInMap("Service")
    private String service;

    @Body
    @NameInMap("ServiceParameters")
    private String serviceParameters;

    private VoiceModerationCancelRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VoiceModerationCancelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<VoiceModerationCancelRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(VoiceModerationCancelRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public VoiceModerationCancelRequest build() {
            return new VoiceModerationCancelRequest(this);
        } 

    } 

}
