// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRenderingDeviceInternetPortsRequest} extends {@link RequestModel}
 *
 * <p>AddRenderingDeviceInternetPortsRequest</p>
 */
public class AddRenderingDeviceInternetPortsRequest extends Request {
    @Query
    @NameInMap("ISP")
    private String ISP;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("InternalPort")
    @Validation(required = true)
    private String internalPort;

    @Query
    @NameInMap("IpProtocol")
    @Validation(required = true)
    private String ipProtocol;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private AddRenderingDeviceInternetPortsRequest(Builder builder) {
        super(builder);
        this.ISP = builder.ISP;
        this.instanceIds = builder.instanceIds;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRenderingDeviceInternetPortsRequest create() {
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return internalPort
     */
    public String getInternalPort() {
        return this.internalPort;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<AddRenderingDeviceInternetPortsRequest, Builder> {
        private String ISP; 
        private String instanceIds; 
        private String internalPort; 
        private String ipProtocol; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(AddRenderingDeviceInternetPortsRequest response) {
            super(response);
            this.ISP = response.ISP;
            this.instanceIds = response.instanceIds;
            this.internalPort = response.internalPort;
            this.ipProtocol = response.ipProtocol;
            this.ownerId = response.ownerId;
        } 

        /**
         * ISP.
         */
        public Builder ISP(String ISP) {
            this.putQueryParameter("ISP", ISP);
            this.ISP = ISP;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InternalPort.
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public AddRenderingDeviceInternetPortsRequest build() {
            return new AddRenderingDeviceInternetPortsRequest(this);
        } 

    } 

}
