// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchagent20260515.models;

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
 * {@link GenerateAcpCompletionRequest} extends {@link RequestModel}
 *
 * <p>GenerateAcpCompletionRequest</p>
 */
public class GenerateAcpCompletionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map<String, ?> params;

    private GenerateAcpCompletionRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.agentName = builder.agentName;
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.method = builder.method;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAcpCompletionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return params
     */
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<GenerateAcpCompletionRequest, Builder> {
        private String workspaceName; 
        private String agentName; 
        private String id; 
        private String jsonrpc; 
        private String method; 
        private java.util.Map<String, ?> params; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAcpCompletionRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.agentName = request.agentName;
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.method = request.method;
            this.params = request.params;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * agentName.
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("agentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * jsonrpc.
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * method.
         */
        public Builder method(String method) {
            this.putBodyParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * params.
         */
        public Builder params(java.util.Map<String, ?> params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public GenerateAcpCompletionRequest build() {
            return new GenerateAcpCompletionRequest(this);
        } 

    } 

}
