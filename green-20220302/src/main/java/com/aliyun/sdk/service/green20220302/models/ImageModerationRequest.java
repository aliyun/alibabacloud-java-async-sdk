// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageModerationRequest} extends {@link RequestModel}
 *
 * <p>ImageModerationRequest</p>
 */
public class ImageModerationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private ImageModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageModerationRequest create() {
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

    public static final class Builder extends Request.Builder<ImageModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(ImageModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * The type of the moderation service.
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * The parameters required by the moderation service. The value is a JSON string.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public ImageModerationRequest build() {
            return new ImageModerationRequest(this);
        } 

    } 

}
