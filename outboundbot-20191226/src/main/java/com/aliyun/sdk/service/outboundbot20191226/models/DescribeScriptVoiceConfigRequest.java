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
 * {@link DescribeScriptVoiceConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeScriptVoiceConfigRequest</p>
 */
public class DescribeScriptVoiceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptVoiceConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptVoiceConfigId;

    private DescribeScriptVoiceConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.scriptVoiceConfigId = builder.scriptVoiceConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScriptVoiceConfigRequest create() {
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return scriptVoiceConfigId
     */
    public String getScriptVoiceConfigId() {
        return this.scriptVoiceConfigId;
    }

    public static final class Builder extends Request.Builder<DescribeScriptVoiceConfigRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String scriptVoiceConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScriptVoiceConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.scriptVoiceConfigId = request.scriptVoiceConfigId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
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
         * <p>28c4bcaf-5ab1-495e-8966-3206bf9ee733</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2a07b634-e15d-445f-bbcb-fc4ea2df7b87</p>
         */
        public Builder scriptVoiceConfigId(String scriptVoiceConfigId) {
            this.putQueryParameter("ScriptVoiceConfigId", scriptVoiceConfigId);
            this.scriptVoiceConfigId = scriptVoiceConfigId;
            return this;
        }

        @Override
        public DescribeScriptVoiceConfigRequest build() {
            return new DescribeScriptVoiceConfigRequest(this);
        } 

    } 

}
