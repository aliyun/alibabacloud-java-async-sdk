// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteParamRequest} extends {@link RequestModel}
 *
 * <p>DeleteParamRequest</p>
 */
public class DeleteParamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ParamId")
    private String paramId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteParamRequest(Builder builder) {
        super(builder);
        this.paramId = builder.paramId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteParamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramId
     */
    public String getParamId() {
        return this.paramId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteParamRequest, Builder> {
        private String paramId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteParamRequest request) {
            super(request);
            this.paramId = request.paramId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ParamId.
         */
        public Builder paramId(String paramId) {
            this.putPathParameter("ParamId", paramId);
            this.paramId = paramId;
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

        @Override
        public DeleteParamRequest build() {
            return new DeleteParamRequest(this);
        } 

    } 

}
