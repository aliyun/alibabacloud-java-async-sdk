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
 * {@link Vehicle5ItemQueryRequest} extends {@link RequestModel}
 *
 * <p>Vehicle5ItemQueryRequest</p>
 */
public class Vehicle5ItemQueryRequest extends Request {
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

    private Vehicle5ItemQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.paramType = builder.paramType;
        this.vehicleNum = builder.vehicleNum;
        this.vehicleType = builder.vehicleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Vehicle5ItemQueryRequest create() {
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

    public static final class Builder extends Request.Builder<Vehicle5ItemQueryRequest, Builder> {
        private String regionId; 
        private String paramType; 
        private String vehicleNum; 
        private String vehicleType; 

        private Builder() {
            super();
        } 

        private Builder(Vehicle5ItemQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.paramType = request.paramType;
            this.vehicleNum = request.vehicleNum;
            this.vehicleType = request.vehicleType;
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
         * <li>When paramType is set to normal, enter the plain text.</li>
         * <li>When paramType is set to md5, enter the plain text of all but the last two characters of the license plate + MD5 encryption (32-bit lowercase MD5) of the last two characters.</li>
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
         * <p>Vehicle type</p>
         * <blockquote>
         * <ul>
         * <li>02: Ordinary passenger car</li>
         * <li>52: New energy passenger car</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        public Builder vehicleType(String vehicleType) {
            this.putQueryParameter("VehicleType", vehicleType);
            this.vehicleType = vehicleType;
            return this;
        }

        @Override
        public Vehicle5ItemQueryRequest build() {
            return new Vehicle5ItemQueryRequest(this);
        } 

    } 

}
