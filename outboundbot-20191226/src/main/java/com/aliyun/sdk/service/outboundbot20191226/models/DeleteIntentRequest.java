// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIntentRequest} extends {@link RequestModel}
 *
 * <p>DeleteIntentRequest</p>
 */
public class DeleteIntentRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private String intentId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private DeleteIntentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntentRequest create() {
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
     * @return intentId
     */
    public String getIntentId() {
        return this.intentId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<DeleteIntentRequest, Builder> {
        private String instanceId; 
        private String intentId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIntentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.scriptId = request.scriptId;
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
         * IntentId.
         */
        public Builder intentId(String intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
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

        @Override
        public DeleteIntentRequest build() {
            return new DeleteIntentRequest(this);
        } 

    } 

}
