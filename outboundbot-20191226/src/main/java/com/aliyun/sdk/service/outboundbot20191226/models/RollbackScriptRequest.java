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
 * {@link RollbackScriptRequest} extends {@link RequestModel}
 *
 * <p>RollbackScriptRequest</p>
 */
public class RollbackScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RollbackVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rollbackVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    private RollbackScriptRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.rollbackVersion = builder.rollbackVersion;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackScriptRequest create() {
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
     * @return rollbackVersion
     */
    public String getRollbackVersion() {
        return this.rollbackVersion;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<RollbackScriptRequest, Builder> {
        private String instanceId; 
        private String rollbackVersion; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackScriptRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.rollbackVersion = request.rollbackVersion;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1579055782000</p>
         */
        public Builder rollbackVersion(String rollbackVersion) {
            this.putQueryParameter("RollbackVersion", rollbackVersion);
            this.rollbackVersion = rollbackVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>303523b1-0094-4ebe-b9ed-c23d11c91d61</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public RollbackScriptRequest build() {
            return new RollbackScriptRequest(this);
        } 

    } 

}
