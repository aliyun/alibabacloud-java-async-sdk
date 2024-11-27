// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImageBatchModerationRequest} extends {@link RequestModel}
 *
 * <p>ImageBatchModerationRequest</p>
 */
public class ImageBatchModerationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Services")
    private String services;

    private ImageBatchModerationRequest(Builder builder) {
        super(builder);
        this.serviceParameters = builder.serviceParameters;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageBatchModerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    /**
     * @return services
     */
    public String getServices() {
        return this.services;
    }

    public static final class Builder extends Request.Builder<ImageBatchModerationRequest, Builder> {
        private String serviceParameters; 
        private String services; 

        private Builder() {
            super();
        } 

        private Builder(ImageBatchModerationRequest request) {
            super(request);
            this.serviceParameters = request.serviceParameters;
            this.services = request.services;
        } 

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * Services.
         */
        public Builder services(String services) {
            this.putQueryParameter("Services", services);
            this.services = services;
            return this;
        }

        @Override
        public ImageBatchModerationRequest build() {
            return new ImageBatchModerationRequest(this);
        } 

    } 

}
