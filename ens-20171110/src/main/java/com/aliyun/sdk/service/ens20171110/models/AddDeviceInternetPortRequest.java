// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDeviceInternetPortRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceInternetPortRequest</p>
 */
public class AddDeviceInternetPortRequest extends Request {
    @Query
    @NameInMap("ISP")
    private String ISP;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InternalIp")
    @Validation(required = true)
    private String internalIp;

    @Query
    @NameInMap("InternalPort")
    private String internalPort;

    @Query
    @NameInMap("NatType")
    @Validation(required = true)
    private String natType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddDeviceInternetPortRequest(Builder builder) {
        super(builder);
        this.ISP = builder.ISP;
        this.instanceId = builder.instanceId;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.natType = builder.natType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceInternetPortRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return internalPort
     */
    public String getInternalPort() {
        return this.internalPort;
    }

    /**
     * @return natType
     */
    public String getNatType() {
        return this.natType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddDeviceInternetPortRequest, Builder> {
        private String ISP; 
        private String instanceId; 
        private String internalIp; 
        private String internalPort; 
        private String natType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceInternetPortRequest request) {
            super(request);
            this.ISP = request.ISP;
            this.instanceId = request.instanceId;
            this.internalIp = request.internalIp;
            this.internalPort = request.internalPort;
            this.natType = request.natType;
            this.regionId = request.regionId;
        } 

        /**
         * The Internet service provider (ISP). If you leave this parameter empty, the system automatically allows a random ISP. Valid values:
         * <p>
         * 
         * *   telecom: China Telecom
         * *   cmcc: China Mobile
         * *   unicom: China Unicom
         * *   cbn: China Broadcasting Network (CBN)
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * The ID of the instance. You can specify the ID of the server or container.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The internal IP address of the instance.
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * The internal port number. Specify this parameter in the following format: first port/last port. Separate multiple port number groups with commas (,). Example: 1026/2001,2005/2005. This parameter is required if you set NatType to DNAT. If you set NatType to SNAT, the value of this parameter is invalid.
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * The type of the NAT gateway. The value of this parameter is of the enumerated data type. Valid values:
         * <p>
         * 
         * *   SNAT
         * *   DNAT
         */
        public Builder natType(String natType) {
            this.putQueryParameter("NatType", natType);
            this.natType = natType;
            return this;
        }

        /**
         * The ID of the Edge Node Service (ENS) node.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddDeviceInternetPortRequest build() {
            return new AddDeviceInternetPortRequest(this);
        } 

    } 

}
