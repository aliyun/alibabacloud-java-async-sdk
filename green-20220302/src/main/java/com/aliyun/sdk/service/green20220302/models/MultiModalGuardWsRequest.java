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
 * {@link MultiModalGuardWsRequest} extends {@link RequestModel}
 *
 * <p>MultiModalGuardWsRequest</p>
 */
public class MultiModalGuardWsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private MultiModalGuardWsRequest(Builder builder) {
        super(builder);
        this.modelType = builder.modelType;
        this.protocolType = builder.protocolType;
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalGuardWsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
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

    public static final class Builder extends Request.Builder<MultiModalGuardWsRequest, Builder> {
        private String modelType; 
        private String protocolType; 
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(MultiModalGuardWsRequest request) {
            super(request);
            this.modelType = request.modelType;
            this.protocolType = request.protocolType;
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The model type. Valid values:</p>
         * <ul>
         * <li>LLM</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>OpenAI</li>
         * <li>DashScope</li>
         * <li>Anthropic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DashScope</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The moderation service category. Valid values:</p>
         * <ul>
         * <li>query_security_check_pro: AI input content security detection (pro edition).</li>
         * <li>response_security_check_pro: AI-generated content security detection (pro edition).</li>
         * <li>img_query_security_check: AIGC input image security detection.</li>
         * <li>img_response_security_check: AIGC output image security detection.</li>
         * <li>text_img_mix_guard: Multimodal (text + image) hybrid security detection.</li>
         * <li>file_security_sync_check: AIGC input or output file security detection.</li>
         * <li>text_file_sec_sync_check: Multimodal (text + file) real-time security detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>query_security_check_pro</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The parameter set required by the moderation service, in JSON string format. The input parameter for text content is content (String), the input parameter for image content is imageUrls (JSONArray), and the input parameter for file content is fileUrls (JSONArray).</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li><p>文本：
         * {
         * &quot;content&quot;: &quot;test&quot;
         * }</p>
         * </li>
         * <li><p>图片：
         * {
         * &quot;imageUrls&quot;: [&quot;<a href="https://example.com/image.png%22%5D">https://example.com/image.png&quot;]</a>
         * }</p>
         * </li>
         * <li><p>文件：
         * {
         * &quot;fileUrls&quot;: [&quot;<a href="https://example.com/file.pdf%22%5D">https://example.com/file.pdf&quot;]</a>
         * }</p>
         * </li>
         * </ul>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public MultiModalGuardWsRequest build() {
            return new MultiModalGuardWsRequest(this);
        } 

    } 

}
