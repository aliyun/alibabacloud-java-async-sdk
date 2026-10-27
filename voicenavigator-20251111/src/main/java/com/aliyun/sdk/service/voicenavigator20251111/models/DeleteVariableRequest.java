// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link DeleteVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteVariableRequest</p>
 */
public class DeleteVariableRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VariableId")
    private String variableId;

    private DeleteVariableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVariableRequest create() {
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
     * @return variableId
     */
    public String getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DeleteVariableRequest, Builder> {
        private String instanceId; 
        private String variableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVariableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.variableId = request.variableId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb1</p>
         */
        public Builder variableId(String variableId) {
            this.putBodyParameter("VariableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DeleteVariableRequest build() {
            return new DeleteVariableRequest(this);
        } 

    } 

}
