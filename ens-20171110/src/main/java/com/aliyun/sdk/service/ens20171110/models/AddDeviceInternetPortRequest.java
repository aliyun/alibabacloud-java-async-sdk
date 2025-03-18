// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AddDeviceInternetPortRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceInternetPortRequest</p>
 */
public class AddDeviceInternetPortRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalPort")
    private String internalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The Internet service provider (ISP). If you leave this parameter empty, the system automatically allows a random ISP. Valid values:</p>
         * <ul>
         * <li>telecom: China Telecom</li>
         * <li>cmcc: China Mobile</li>
         * <li>unicom: China Unicom</li>
         * <li>cbn: China Broadcasting Network (CBN)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The ID of the instance. You can specify the ID of the server or container.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5saiou41t6ude2ia56ri902ke</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The private IP address of the simple application server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.50</p>
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * <p>The internal port number. Specify this parameter in the following format: first port/last port. Separate multiple port number groups with commas (,). Example: 1026/2001,2005/2005. This parameter is required if you set NatType to DNAT. If you set NatType to SNAT, the value of this parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>12022/12022</p>
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * <p>The type of the NAT gateway. The value of this parameter is of the enumerated data type. Valid values:</p>
         * <ul>
         * <li>SNAT</li>
         * <li>DNAT</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DNAT</p>
         */
        public Builder natType(String natType) {
            this.putQueryParameter("NatType", natType);
            this.natType = natType;
            return this;
        }

        /**
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wuxi-5</p>
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
