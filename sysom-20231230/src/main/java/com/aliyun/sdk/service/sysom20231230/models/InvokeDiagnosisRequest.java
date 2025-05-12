// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link InvokeDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>InvokeDiagnosisRequest</p>
 */
public class InvokeDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private InvokeDiagnosisRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.params = builder.params;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeDiagnosisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<InvokeDiagnosisRequest, Builder> {
        private String channel; 
        private String params; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(InvokeDiagnosisRequest request) {
            super(request);
            this.channel = request.channel;
            this.params = request.params;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_assist</p>
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;instance&quot;: &quot;i-wz9gdv7qmdhusamc4dl01&quot;,
         *     &quot;uid&quot;: &quot;xxxxxxxxxxxxxx&quot;,
         *     &quot;region&quot;: &quot;cn-shenzhen&quot;
         * }</p>
         */
        public Builder params(String params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>memgraph</p>
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("service_name", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public InvokeDiagnosisRequest build() {
            return new InvokeDiagnosisRequest(this);
        } 

    } 

}
