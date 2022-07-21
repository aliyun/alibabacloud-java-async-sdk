// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStudioProjectCooperationRequest} extends {@link RequestModel}
 *
 * <p>SetStudioProjectCooperationRequest</p>
 */
public class SetStudioProjectCooperationRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private SetStudioProjectCooperationRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetStudioProjectCooperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetStudioProjectCooperationRequest, Builder> {
        private String iotInstanceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetStudioProjectCooperationRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.status = request.status;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetStudioProjectCooperationRequest build() {
            return new SetStudioProjectCooperationRequest(this);
        } 

    } 

}
