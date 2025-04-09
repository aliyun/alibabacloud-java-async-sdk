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
 * {@link ModifyScriptVoiceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyScriptVoiceConfigRequest</p>
 */
public class ModifyScriptVoiceConfigRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptWaveformRelation")
    private String scriptWaveformRelation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bdd49242-114c-4045-b1d1-25ccc1756c75</p>
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
         * <p>1d7a26e0-628b-4c3c-9918-7f2e23273f54</p>
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
         * <p>e15cc646-50e5-4bc0-87ec-e4f2d1063b90</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WAVEFORM</p>
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
