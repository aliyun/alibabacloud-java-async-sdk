// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOTAFirmwareRequest} extends {@link RequestModel}
 *
 * <p>QueryOTAFirmwareRequest</p>
 */
public class QueryOTAFirmwareRequest extends Request {
    @Query
    @NameInMap("FirmwareId")
    @Validation(required = true)
    private String firmwareId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private QueryOTAFirmwareRequest(Builder builder) {
        super(builder);
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOTAFirmwareRequest create() {
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

    public static final class Builder extends Request.Builder<QueryOTAFirmwareRequest, Builder> {
        private String firmwareId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOTAFirmwareRequest request) {
            super(request);
            this.firmwareId = request.firmwareId;
            this.iotInstanceId = request.iotInstanceId;
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
        public QueryOTAFirmwareRequest build() {
            return new QueryOTAFirmwareRequest(this);
        } 

    } 

}
