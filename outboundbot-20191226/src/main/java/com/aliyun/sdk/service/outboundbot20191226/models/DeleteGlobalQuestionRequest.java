// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGlobalQuestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteGlobalQuestionRequest</p>
 */
public class DeleteGlobalQuestionRequest extends Request {
    @Query
    @NameInMap("GlobalQuestionId")
    @Validation(required = true)
    private String globalQuestionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private DeleteGlobalQuestionRequest(Builder builder) {
        super(builder);
        this.globalQuestionId = builder.globalQuestionId;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGlobalQuestionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalQuestionId
     */
    public String getGlobalQuestionId() {
        return this.globalQuestionId;
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

    public static final class Builder extends Request.Builder<DeleteGlobalQuestionRequest, Builder> {
        private String globalQuestionId; 
        private String instanceId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGlobalQuestionRequest request) {
            super(request);
            this.globalQuestionId = request.globalQuestionId;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
        } 

        /**
         * GlobalQuestionId.
         */
        public Builder globalQuestionId(String globalQuestionId) {
            this.putQueryParameter("GlobalQuestionId", globalQuestionId);
            this.globalQuestionId = globalQuestionId;
            return this;
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

        @Override
        public DeleteGlobalQuestionRequest build() {
            return new DeleteGlobalQuestionRequest(this);
        } 

    } 

}
