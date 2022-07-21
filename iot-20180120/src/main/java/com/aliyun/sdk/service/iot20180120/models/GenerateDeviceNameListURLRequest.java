// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDeviceNameListURLRequest} extends {@link RequestModel}
 *
 * <p>GenerateDeviceNameListURLRequest</p>
 */
public class GenerateDeviceNameListURLRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GenerateDeviceNameListURLRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDeviceNameListURLRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateDeviceNameListURLRequest, Builder> {
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDeviceNameListURLRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public GenerateDeviceNameListURLRequest build() {
            return new GenerateDeviceNameListURLRequest(this);
        } 

    } 

}
