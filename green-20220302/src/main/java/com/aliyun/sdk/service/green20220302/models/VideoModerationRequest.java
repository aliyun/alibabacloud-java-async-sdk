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
 * {@link VideoModerationRequest} extends {@link RequestModel}
 *
 * <p>VideoModerationRequest</p>
 */
public class VideoModerationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
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
         * <p>The service code for video moderation.</p>
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
         * <p>The parameters that are required for the moderation service. The value must be a JSON string.</p>
         * <ul>
         * <li>url: Required. The URL of the object to be moderated. Make sure that the URL can be accessed over the Internet.</li>
         * <li>dataId: Optional. The data ID of the object to be moderated.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2505810.html">ServiceParameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;url&quot;: &quot;<a href="https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4">https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
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
