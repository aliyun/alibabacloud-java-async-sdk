// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.saf20190521.models;

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
 * {@link ExecuteRequestMLRequest} extends {@link RequestModel}
 *
 * <p>ExecuteRequestMLRequest</p>
 */
public class ExecuteRequestMLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    @com.aliyun.core.annotation.Validation(required = true)
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceParameters;

    private ExecuteRequestMLRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.service = builder.service;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteRequestMLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<ExecuteRequestMLRequest, Builder> {
        private String lang; 
        private String service; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteRequestMLRequest request) {
            super(request);
            this.lang = request.lang;
            this.service = request.service;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The service product code. Set this parameter to saf_de because this operation supports only custom events.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>saf_de</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>The service input parameters in JSON format. You must include the eventCode property of the custom event in the JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;accountId&quot;: &quot;1233***&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public ExecuteRequestMLRequest build() {
            return new ExecuteRequestMLRequest(this);
        } 

    } 

}
