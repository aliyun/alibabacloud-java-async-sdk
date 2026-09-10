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
 * {@link MultimodalAsyncModerationRequest} extends {@link RequestModel}
 *
 * <p>MultimodalAsyncModerationRequest</p>
 */
public class MultimodalAsyncModerationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private MultimodalAsyncModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultimodalAsyncModerationRequest create() {
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

    public static final class Builder extends Request.Builder<MultimodalAsyncModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(MultimodalAsyncModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The type of moderation service. Valid values:</p>
         * <ul>
         * <li><p>post_text_image_detection: multimodal moderation for post text and images</p>
         * </li>
         * <li><p>profile_text_image_detection: multimodal moderation for profile picture and nickname</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>post_text_image_detection</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The parameter set required by the moderation service. This value must be a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mainData&quot;:{&quot;mainContent&quot;:&quot;testMainContent&quot;,&quot;mainTitle&quot;:&quot;testMainTitle&quot;,&quot;mainImages&quot;:[{&quot;imageUrl&quot;:&quot;<a href="https://xxxx.com/001.jpg%22%7D%5D%7D%7D">https://xxxx.com/001.jpg&quot;}]}}</a></p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public MultimodalAsyncModerationRequest build() {
            return new MultimodalAsyncModerationRequest(this);
        } 

    } 

}
