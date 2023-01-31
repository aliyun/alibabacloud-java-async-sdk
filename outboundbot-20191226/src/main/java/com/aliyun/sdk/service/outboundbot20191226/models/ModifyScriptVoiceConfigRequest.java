// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScriptVoiceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyScriptVoiceConfigRequest</p>
 */
public class ModifyScriptVoiceConfigRequest extends Request {
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

    @Query
    @NameInMap("ScriptWaveformRelation")
    private String scriptWaveformRelation;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ModifyScriptVoiceConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.scriptVoiceConfigId = builder.scriptVoiceConfigId;
        this.scriptWaveformRelation = builder.scriptWaveformRelation;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScriptVoiceConfigRequest create() {
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

    /**
     * @return scriptWaveformRelation
     */
    public String getScriptWaveformRelation() {
        return this.scriptWaveformRelation;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyScriptVoiceConfigRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String scriptVoiceConfigId; 
        private String scriptWaveformRelation; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScriptVoiceConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.scriptVoiceConfigId = request.scriptVoiceConfigId;
            this.scriptWaveformRelation = request.scriptWaveformRelation;
            this.type = request.type;
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

        /**
         * ScriptWaveformRelation.
         */
        public Builder scriptWaveformRelation(String scriptWaveformRelation) {
            this.putQueryParameter("ScriptWaveformRelation", scriptWaveformRelation);
            this.scriptWaveformRelation = scriptWaveformRelation;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyScriptVoiceConfigRequest build() {
            return new ModifyScriptVoiceConfigRequest(this);
        } 

    } 

}
