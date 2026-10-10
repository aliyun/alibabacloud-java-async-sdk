// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
         * <p>The detection types supported by Image Moderation Enhanced Edition. Valid values:</p>
         * <ul>
         * <li>baselineCheck: general baseline check</li>
         * <li>baselineCheck_pro: general baseline check (Professional Edition)</li>
         * <li>baselineCheck_cb: general baseline check (Overseas Edition)</li>
         * <li>tonalityImprove: content governance detection</li>
         * <li>aigcCheck: AIGC image detection</li>
         * <li>aigcViolationDetection: AIGC image infringement detection</li>
         * <li>aigcDetector: AIGC image generation determination</li>
         * <li>profilePhotoCheck: profile picture detection</li>
         * <li>postImageCheck: post and comment image detection</li>
         * <li>advertisingCheck: marketing material detection</li>
         * <li>liveStreamCheck: video or live stream screenshot detection</li>
         * <li>generalOcr: general image and text OCR</li>
         * <li>generalRecognition: universal image recognition</li>
         * <li>postImageCheckByVL: image moderation service with large and small model fusion</li>
         * <li>postImageCheckByVL_cb: image moderation service with large and small model fusion (Overseas Edition)</li>
         * <li>baselineCheckByVL: general image moderation large model service</li>
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
         * <p>The parameter set for the content moderation object. The value is a JSON string.</p>
         * <ul>
         * <li>imageUrl: the URL of the object to be moderated. Required.</li>
         * <li>dataId: the data ID corresponding to the moderation object. Optional.</li>
         * <li>referer: the Referer request header, used for scenarios such as hotlink protection. Optional.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;imageUrl&quot;:&quot;<a href="https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png%22,%22dataId%22:%22img1234567%22%7D">https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</a></p>
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
