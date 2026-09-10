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
 * {@link MultiModalGuardRequest} extends {@link RequestModel}
 *
 * <p>MultiModalGuardRequest</p>
 */
public class MultiModalGuardRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private MultiModalGuardRequest(Builder builder) {
        super(builder);
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalGuardRequest create() {
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

    public static final class Builder extends Request.Builder<MultiModalGuardRequest, Builder> {
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(MultiModalGuardRequest request) {
            super(request);
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The type of the moderation service. Valid values:</p>
         * <ul>
         * <li><p>query_security_check: AI input content moderation.</p>
         * </li>
         * <li><p>response_security_check: AI-generated content moderation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>query_security_check_pro</p>
         */
        public Builder service(String service) {
            this.putBodyParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The set of parameters required for the moderation service. The value must be a JSON string.</p>
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
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public MultiModalGuardRequest build() {
            return new MultiModalGuardRequest(this);
        } 

    } 

}
