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
 * {@link DeleteScriptWaveformRequest} extends {@link RequestModel}
 *
 * <p>DeleteScriptWaveformRequest</p>
 */
public class DeleteScriptWaveformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptWaveformId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptWaveformId;

    private DeleteScriptWaveformRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.scriptWaveformId = builder.scriptWaveformId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScriptWaveformRequest create() {
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
     * @return scriptWaveformId
     */
    public String getScriptWaveformId() {
        return this.scriptWaveformId;
    }

    public static final class Builder extends Request.Builder<DeleteScriptWaveformRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String scriptWaveformId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScriptWaveformRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.scriptWaveformId = request.scriptWaveformId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scriptWaveformId(String scriptWaveformId) {
            this.putQueryParameter("ScriptWaveformId", scriptWaveformId);
            this.scriptWaveformId = scriptWaveformId;
            return this;
        }

        @Override
        public DeleteScriptWaveformRequest build() {
            return new DeleteScriptWaveformRequest(this);
        } 

    } 

}
