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
 * {@link VehicleMetaVerifyV2Request} extends {@link RequestModel}
 *
 * <p>VehicleMetaVerifyV2Request</p>
 */
public class VehicleMetaVerifyV2Request extends Request {
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

    private VehicleMetaVerifyV2Request(Builder builder) {
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

    public static VehicleMetaVerifyV2Request create() {
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

    public static final class Builder extends Request.Builder<VehicleMetaVerifyV2Request, Builder> {
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

        private Builder(VehicleMetaVerifyV2Request request) {
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
         * IdentifyNum.
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * VehicleNum.
         */
        public Builder vehicleNum(String vehicleNum) {
            this.putQueryParameter("VehicleNum", vehicleNum);
            this.vehicleNum = vehicleNum;
            return this;
        }

        /**
         * VehicleType.
         */
        public Builder vehicleType(String vehicleType) {
            this.putQueryParameter("VehicleType", vehicleType);
            this.vehicleType = vehicleType;
            return this;
        }

        /**
         * VerifyMetaType.
         */
        public Builder verifyMetaType(String verifyMetaType) {
            this.putQueryParameter("VerifyMetaType", verifyMetaType);
            this.verifyMetaType = verifyMetaType;
            return this;
        }

        @Override
        public VehicleMetaVerifyV2Request build() {
            return new VehicleMetaVerifyV2Request(this);
        } 

    } 

}
