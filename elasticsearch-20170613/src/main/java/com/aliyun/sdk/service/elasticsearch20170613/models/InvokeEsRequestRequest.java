// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link InvokeEsRequestRequest} extends {@link RequestModel}
 *
 * <p>InvokeEsRequestRequest</p>
 */
public class InvokeEsRequestRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("system")
    private Boolean system;

    private InvokeEsRequestRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.credentialId = builder.credentialId;
        this.method = builder.method;
        this.path = builder.path;
        this.system = builder.system;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeEsRequestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return system
     */
    public Boolean getSystem() {
        return this.system;
    }

    public static final class Builder extends Request.Builder<InvokeEsRequestRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String credentialId; 
        private String method; 
        private String path; 
        private Boolean system; 

        private Builder() {
            super();
        } 

        private Builder(InvokeEsRequestRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.credentialId = request.credentialId;
            this.method = request.method;
            this.path = request.path;
            this.system = request.system;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request body passed through to ES. Set this parameter based on the requirements of the target ES API. This parameter is not required for calls such as GET that do not have a request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;query&quot;:{&quot;match_all&quot;:{}}}</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The ID of the credential to use. If this parameter is not specified, the default credential of the instance is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-7k2mq9xr4vbn</p>
         */
        public Builder credentialId(String credentialId) {
            this.putQueryParameter("credentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>The HTTP method used to access ES. Default value: GET.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The ES path to access. This parameter is required. The leading / can be omitted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>_cat/indices?format=json</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>Specifies whether to use the Alibaba Cloud ES system credential. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder system(Boolean system) {
            this.putQueryParameter("system", system);
            this.system = system;
            return this;
        }

        @Override
        public InvokeEsRequestRequest build() {
            return new InvokeEsRequestRequest(this);
        } 

    } 

}
