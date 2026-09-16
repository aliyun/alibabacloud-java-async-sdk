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
 * {@link VehicleMetaVerifyRequest} extends {@link RequestModel}
 *
 * <p>VehicleMetaVerifyRequest</p>
 */
public class VehicleMetaVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleNum")
    private String vehicleNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleType")
    private String vehicleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyMetaType")
    private String verifyMetaType;

    private VehicleMetaVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identifyNum = builder.identifyNum;
        this.paramType = builder.paramType;
        this.userName = builder.userName;
        this.vehicleNum = builder.vehicleNum;
        this.vehicleType = builder.vehicleType;
        this.verifyMetaType = builder.verifyMetaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VehicleMetaVerifyRequest create() {
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
     * @return identifyNum
     */
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
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
     * @return verifyMetaType
     */
    public String getVerifyMetaType() {
        return this.verifyMetaType;
    }

    public static final class Builder extends Request.Builder<VehicleMetaVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String paramType; 
        private String userName; 
        private String vehicleNum; 
        private String vehicleType; 
        private String verifyMetaType; 

        private Builder() {
            super();
        } 

        private Builder(VehicleMetaVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identifyNum = request.identifyNum;
            this.paramType = request.paramType;
            this.userName = request.userName;
            this.vehicleNum = request.vehicleNum;
            this.vehicleType = request.vehicleType;
            this.verifyMetaType = request.verifyMetaType;
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
         * <p>The ID card number.</p>
         * <p>This parameter is required when VerifyMetaType is set to VEHICLE_3_META.</p>
         * <blockquote>
         * <ul>
         * <li>When paramType is set to normal, enter the plaintext.</li>
         * <li>When paramType is set to md5, enter the first 6 digits of the ID card number in plaintext + the MD5-encrypted date of birth (32-bit lowercase MD5) + the last 4 digits of the ID card number.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4****************1</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li>normal: not encrypted.</li>
         * <li>md5: MD5-encrypted.</li>
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
         * <p>The name.</p>
         * <blockquote>
         * <p>Note</p>
         * <ul>
         * <li>When paramType is set to normal, enter the plaintext.</li>
         * <li>When paramType is set to md5, enter the MD5-encrypted first character of the name (32-bit lowercase MD5) + the remaining characters of the name in plaintext.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>张**</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The license plate number.</p>
         * <blockquote>
         * <ul>
         * <li>When paramType is set to normal, enter the plaintext.</li>
         * <li>When paramType is set to md5, enter the characters of the license plate number except the last two in plaintext + the MD5-encrypted last two characters (32-bit lowercase MD5).</li>
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
         * <p>The vehicle type.</p>
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
         * <p>The verification type.</p>
         * <blockquote>
         * <ul>
         * <li>VEHICLE_2_META: two-element verification. Verifies the name and license plate number.</li>
         * <li>VEHICLE_3_META: three-element verification. Verifies the name, license plate number, and ID card number.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VEHICLE_2_META</p>
         */
        public Builder verifyMetaType(String verifyMetaType) {
            this.putQueryParameter("VerifyMetaType", verifyMetaType);
            this.verifyMetaType = verifyMetaType;
            return this;
        }

        @Override
        public VehicleMetaVerifyRequest build() {
            return new VehicleMetaVerifyRequest(this);
        } 

    } 

}
