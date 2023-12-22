// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoModerationRequest} extends {@link RequestModel}
 *
 * <p>VideoModerationRequest</p>
 */
public class VideoModerationRequest extends Request {
    @Body
    @NameInMap("Service")
    private String service;

    @Body
    @NameInMap("ServiceParameters")
    private String serviceParameters;

    private VideoModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoModerationRequest create() {
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

    public static final class Builder extends Request.Builder<VideoModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(VideoModerationRequest request) {
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
        public VideoModerationRequest build() {
            return new VideoModerationRequest(this);
        } 

    } 

}
