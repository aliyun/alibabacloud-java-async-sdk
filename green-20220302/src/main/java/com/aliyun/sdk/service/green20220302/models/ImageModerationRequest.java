// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The moderation services supported by Image Moderation 2.0. Valid values:</p>
         * <ul>
         * <li>baselineCheck: common baseline moderation</li>
         * <li>baselineCheck_pro: common baseline moderation_Professional</li>
         * <li>baselineCheck_cb: common baseline moderation_For regions outside the Chinese mainland</li>
         * <li>tonalityImprove: content governance moderation</li>
         * <li>aigcCheck: AI-generated image identification</li>
         * <li>profilePhotoCheck: avatar image moderation</li>
         * <li>advertisingCheck: marketing material identification</li>
         * <li>liveStreamCheck: moderation of screenshots of videos and live streams</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>liveStreamCheck: moderation of screenshots of videos and live streams</li>
         * <li>baselineCheck: common baseline moderation</li>
         * <li>aigcCheck: AI-generated image identification</li>
         * <li>baselineCheck_pro: common baseline moderation_Professional</li>
         * <li>advertisingCheck: marketing material identification</li>
         * <li>baselineCheck_cb: common baseline moderation_For regions outside the Chinese mainland</li>
         * <li>tonalityImprove: content governance moderation</li>
         * <li>profilePhotoCheck: avatar image moderation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The parameters required by the moderation service. The value is a JSON string.</p>
         * <ul>
         * <li>imageUrl: the URL of the object that you want to moderate. This parameter is required.</li>
         * <li>dataId: the ID of the object that you want to moderate. This parameter is optional.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;imageUrl&quot;:&quot;<a href="https://www.aliyun.com/test.jpg%22,%22dataId%22:%22img1234567%22%7D">https://www.aliyun.com/test.jpg&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</a></p>
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
