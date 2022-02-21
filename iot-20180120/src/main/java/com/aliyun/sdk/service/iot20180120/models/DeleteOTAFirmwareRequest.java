// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOTAFirmwareRequest} extends {@link RequestModel}
 *
 * <p>DeleteOTAFirmwareRequest</p>
 */
public class DeleteOTAFirmwareRequest extends Request {
    @Query
    @NameInMap("FirmwareId")
    @Validation(required = true)
    private String firmwareId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteOTAFirmwareRequest(Builder builder) {
        super(builder);
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOTAFirmwareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteOTAFirmwareRequest, Builder> {
        private String firmwareId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOTAFirmwareRequest response) {
            super(response);
            this.firmwareId = response.firmwareId;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * FirmwareId.
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
            return this;
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
        public DeleteOTAFirmwareRequest build() {
            return new DeleteOTAFirmwareRequest(this);
        } 

    } 

}
