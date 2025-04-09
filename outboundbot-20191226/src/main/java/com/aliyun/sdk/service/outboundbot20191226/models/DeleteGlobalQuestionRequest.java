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
 * {@link DeleteGlobalQuestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteGlobalQuestionRequest</p>
 */
public class DeleteGlobalQuestionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalQuestionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalQuestionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35f1361e-4377-494c-9f10-4274bda0317f</p>
         */
        public Builder globalQuestionId(String globalQuestionId) {
            this.putQueryParameter("GlobalQuestionId", globalQuestionId);
            this.globalQuestionId = globalQuestionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
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
         * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
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
