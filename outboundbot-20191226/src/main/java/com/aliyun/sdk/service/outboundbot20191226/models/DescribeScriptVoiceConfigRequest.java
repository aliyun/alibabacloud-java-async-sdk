// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScriptVoiceConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeScriptVoiceConfigRequest</p>
 */
public class DescribeScriptVoiceConfigRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("ScriptVoiceConfigId")
    @Validation(required = true)
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * ScriptVoiceConfigId.
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
