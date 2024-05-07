// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateParamRequest} extends {@link RequestModel}
 *
 * <p>UpdateParamRequest</p>
 */
public class UpdateParamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ParamId")
    private String paramId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private UpdateParamRequest(Builder builder) {
        super(builder);
        this.paramId = builder.paramId;
        this.instanceId = builder.instanceId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParamRequest create() {
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

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateParamRequest, Builder> {
        private String paramId; 
        private String instanceId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateParamRequest request) {
            super(request);
            this.paramId = request.paramId;
            this.instanceId = request.instanceId;
            this.value = request.value;
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
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateParamRequest build() {
            return new UpdateParamRequest(this);
        } 

    } 

}
