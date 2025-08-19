// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link VehicleInsureQueryRequest} extends {@link RequestModel}
 *
 * <p>VehicleInsureQueryRequest</p>
 */
public class VehicleInsureQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleNum")
    private String vehicleNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleType")
    private String vehicleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vin")
    private String vin;

    private VehicleInsureQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.paramType = builder.paramType;
        this.vehicleNum = builder.vehicleNum;
        this.vehicleType = builder.vehicleType;
        this.vin = builder.vin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VehicleInsureQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return vehicleNum
     */
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    /**
     * @return vehicleType
     */
    public String getVehicleType() {
        return this.vehicleType;
    }

    /**
     * @return vin
     */
    public String getVin() {
        return this.vin;
    }

    public static final class Builder extends Request.Builder<VehicleInsureQueryRequest, Builder> {
        private String regionId; 
        private String paramType; 
        private String vehicleNum; 
        private String vehicleType; 
        private String vin; 

        private Builder() {
            super();
        } 

        private Builder(VehicleInsureQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.paramType = request.paramType;
            this.vehicleNum = request.vehicleNum;
            this.vehicleType = request.vehicleType;
            this.vin = request.vin;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Parameter type:</p>
         * <ul>
         * <li><strong>normal</strong>: Unencrypted.</li>
         * <li><strong>md5</strong>: MD5 encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>License plate number</p>
         * <blockquote>
         * <ul>
         * <li>When <code>paramType</code> is set to <code>normal</code>, enter the plain text.</li>
         * <li>When <code>paramType</code> is set to <code>md5</code>, enter the plain text of all but the last two characters of the license plate + the MD5 encryption (32 lowercase characters) of the last two characters of the license plate.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>陕A9****</p>
         */
        public Builder vehicleNum(String vehicleNum) {
            this.putQueryParameter("VehicleNum", vehicleNum);
            this.vehicleNum = vehicleNum;
            return this;
        }

        /**
         * <p>Driver&quot;s license vehicle type.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        public Builder vehicleType(String vehicleType) {
            this.putQueryParameter("VehicleType", vehicleType);
            this.vehicleType = vehicleType;
            return this;
        }

        /**
         * <p>Vehicle identification code, i.e., the vehicle VIN</p>
         * <blockquote>
         * <ul>
         * <li>When <code>paramType</code> is set to <code>normal</code>, enter the plain text.</li>
         * <li>When <code>paramType</code> is set to <code>md5</code>, enter the plain text of all but the last four characters of the VIN + the MD5 encryption (32 lowercase characters) of the last four characters of the VIN.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LB**************</p>
         */
        public Builder vin(String vin) {
            this.putQueryParameter("Vin", vin);
            this.vin = vin;
            return this;
        }

        @Override
        public VehicleInsureQueryRequest build() {
            return new VehicleInsureQueryRequest(this);
        } 

    } 

}
