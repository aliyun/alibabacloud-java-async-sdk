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
 * {@link VideoModerationResultRequest} extends {@link RequestModel}
 *
 * <p>VideoModerationResultRequest</p>
 */
public class VideoModerationResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private VideoModerationResultRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoModerationResultRequest create() {
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

    public static final class Builder extends Request.Builder<VideoModerationResultRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(VideoModerationResultRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The type of the moderation service.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>liveStreamDetection: live stream moderation</li>
         * <li>videoDetection: video file moderation</li>
         * <li>liveStreamDetection_cb: live stream moderation_For regions outside the Chinese mainland</li>
         * <li>videoDetection_cb: video file moderation_For regions outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>videoDetection</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The parameters required by the moderation service. The ID of the task that you want to query. You can specify one task ID at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;taskId&quot;:&quot;au_f_8PoWiZKoLbczp5HRn69VdT-1y8@U5&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public VideoModerationResultRequest build() {
            return new VideoModerationResultRequest(this);
        } 

    } 

}
