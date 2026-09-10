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
 * {@link ImageBatchModerationRequest} extends {@link RequestModel}
 *
 * <p>ImageBatchModerationRequest</p>
 */
public class ImageBatchModerationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private ImageBatchModerationRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
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

    public static final class Builder extends Request.Builder<ImageBatchModerationRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(ImageBatchModerationRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The detection services supported by Image Moderation Pro. Separate multiple services with commas. Valid values:</p>
         * <ul>
         * <li><p>baselineCheck: General baseline check</p>
         * </li>
         * <li><p>baselineCheck_pro: General baseline check (Professional Edition)</p>
         * </li>
         * <li><p>tonalityImprove: Content administration check</p>
         * </li>
         * <li><p>aigcCheck: AIGC image check</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck,tonalityImprove</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The parameters for the content to moderate.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;imageUrl&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png">https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png</a>&quot;,
         *         &quot;dataId&quot;: &quot;img123****&quot;
         *     }</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public ImageBatchModerationRequest build() {
            return new ImageBatchModerationRequest(this);
        } 

    } 

}
