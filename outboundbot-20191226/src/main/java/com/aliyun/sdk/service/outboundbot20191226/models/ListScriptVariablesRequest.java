// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListScriptVariablesRequest} extends {@link RequestModel}
 *
 * <p>ListScriptVariablesRequest</p>
 */
public class ListScriptVariablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sandbox")
    private Boolean sandbox;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    private ListScriptVariablesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sandbox = builder.sandbox;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptVariablesRequest create() {
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
     * @return sandbox
     */
    public Boolean getSandbox() {
        return this.sandbox;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<ListScriptVariablesRequest, Builder> {
        private String instanceId; 
        private Boolean sandbox; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptVariablesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sandbox = request.sandbox;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2e55ad0f-7a07-420e-a9b0-62d66ba7278a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Sandbox.
         */
        public Builder sandbox(Boolean sandbox) {
            this.putQueryParameter("Sandbox", sandbox);
            this.sandbox = sandbox;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>62318d71-1128-4fd7-af15-c852cbe26b93</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public ListScriptVariablesRequest build() {
            return new ListScriptVariablesRequest(this);
        } 

    } 

}
