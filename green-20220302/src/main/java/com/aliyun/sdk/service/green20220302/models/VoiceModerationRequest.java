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
 * {@link VoiceModerationRequest} extends {@link RequestModel}
 *
 * <p>VoiceModerationRequest</p>
 */
public class VoiceModerationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private VoiceModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VoiceModerationRequest create() {
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

    public static final class Builder extends Request.Builder<VoiceModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(VoiceModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The ServiceCode for voice moderation.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The set of parameters that are required for the moderation service. The value must be a JSON string.</p>
         * <p>url: Required. The URL of the object to be detected. Make sure that the URL is accessible over the Internet. dataId: Optional. The data ID of the object to be detected. For more information, see ServiceParameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;url&quot;: &quot;<a href="http://aliyundoc.com/test.flv">http://aliyundoc.com/test.flv</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public VoiceModerationRequest build() {
            return new VoiceModerationRequest(this);
        } 

    } 

}
