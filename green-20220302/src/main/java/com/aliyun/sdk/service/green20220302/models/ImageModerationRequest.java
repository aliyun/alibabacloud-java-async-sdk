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
         * The moderation services supported by Image Moderation 2.0. Valid values:
         * <p>
         * 
         * *   baselineCheck: common baseline moderation
         * *   baselineCheck_pro: common baseline moderation_Professional
         * *   baselineCheck_cb: common baseline moderation_For regions outside the Chinese mainland
         * *   tonalityImprove: content governance moderation
         * *   aigcCheck: AI-generated image identification
         * *   profilePhotoCheck: avatar image moderation
         * *   advertisingCheck: marketing material identification
         * *   liveStreamCheck: moderation of screenshots of videos and live streams
         * 
         * Valid values:
         * 
         * *   liveStreamCheck: moderation of screenshots of videos and live streams
         * *   baselineCheck: common baseline moderation
         * *   aigcCheck: AI-generated image identification
         * *   baselineCheck_pro: common baseline moderation_Professional
         * *   advertisingCheck: marketing material identification
         * *   baselineCheck_cb: common baseline moderation_For regions outside the Chinese mainland
         * *   tonalityImprove: content governance moderation
         * *   profilePhotoCheck: avatar image moderation
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * The parameters required by the moderation service. The value is a JSON string.
         * <p>
         * 
         * *   imageUrl: the URL of the object that you want to moderate. This parameter is required.
         * *   dataId: the ID of the object that you want to moderate. This parameter is optional.
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
