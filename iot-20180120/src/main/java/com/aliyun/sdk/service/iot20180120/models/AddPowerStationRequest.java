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
 * {@link AddPowerStationRequest} extends {@link RequestModel}
 *
 * <p>AddPowerStationRequest</p>
 */
public class AddPowerStationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmInstanceUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmInstanceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PowerStationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String powerStationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RatedPower")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ratedPower;

    private AddPowerStationRequest(Builder builder) {
        super(builder);
        this.algorithmInstanceUid = builder.algorithmInstanceUid;
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.powerStationName = builder.powerStationName;
        this.ratedPower = builder.ratedPower;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPowerStationRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return powerStationName
     */
    public String getPowerStationName() {
        return this.powerStationName;
    }

    /**
     * @return ratedPower
     */
    public Integer getRatedPower() {
        return this.ratedPower;
    }

    public static final class Builder extends Request.Builder<AddPowerStationRequest, Builder> {
        private String algorithmInstanceUid; 
        private String description; 
        private String iotInstanceId; 
        private String powerStationName; 
        private Integer ratedPower; 

        private Builder() {
            super();
        } 

        private Builder(AddPowerStationRequest request) {
            super(request);
            this.algorithmInstanceUid = request.algorithmInstanceUid;
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.powerStationName = request.powerStationName;
            this.ratedPower = request.ratedPower;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public Builder powerStationName(String powerStationName) {
            this.putQueryParameter("PowerStationName", powerStationName);
            this.powerStationName = powerStationName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ratedPower(Integer ratedPower) {
            this.putQueryParameter("RatedPower", ratedPower);
            this.ratedPower = ratedPower;
            return this;
        }

        @Override
        public AddPowerStationRequest build() {
            return new AddPowerStationRequest(this);
        } 

    } 

}
