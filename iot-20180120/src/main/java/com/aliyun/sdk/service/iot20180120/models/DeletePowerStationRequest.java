// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link DeletePowerStationRequest} extends {@link RequestModel}
 *
 * <p>DeletePowerStationRequest</p>
 */
public class DeletePowerStationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmInstanceUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmInstanceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PowerStationUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String powerStationUid;

    private DeletePowerStationRequest(Builder builder) {
        super(builder);
        this.algorithmInstanceUid = builder.algorithmInstanceUid;
        this.iotInstanceId = builder.iotInstanceId;
        this.powerStationUid = builder.powerStationUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePowerStationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmInstanceUid
     */
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return powerStationUid
     */
    public String getPowerStationUid() {
        return this.powerStationUid;
    }

    public static final class Builder extends Request.Builder<DeletePowerStationRequest, Builder> {
        private String algorithmInstanceUid; 
        private String iotInstanceId; 
        private String powerStationUid; 

        private Builder() {
            super();
        } 

        private Builder(DeletePowerStationRequest request) {
            super(request);
            this.algorithmInstanceUid = request.algorithmInstanceUid;
            this.iotInstanceId = request.iotInstanceId;
            this.powerStationUid = request.powerStationUid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder algorithmInstanceUid(String algorithmInstanceUid) {
            this.putQueryParameter("AlgorithmInstanceUid", algorithmInstanceUid);
            this.algorithmInstanceUid = algorithmInstanceUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder powerStationUid(String powerStationUid) {
            this.putQueryParameter("PowerStationUid", powerStationUid);
            this.powerStationUid = powerStationUid;
            return this;
        }

        @Override
        public DeletePowerStationRequest build() {
            return new DeletePowerStationRequest(this);
        } 

    } 

}
