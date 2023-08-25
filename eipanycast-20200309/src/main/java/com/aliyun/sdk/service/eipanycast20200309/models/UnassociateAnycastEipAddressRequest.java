// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>UnassociateAnycastEipAddressRequest</p>
 */
public class UnassociateAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("BindInstanceId")
    @Validation(required = true)
    private String bindInstanceId;

    @Query
    @NameInMap("BindInstanceRegionId")
    @Validation(required = true)
    private String bindInstanceRegionId;

    @Query
    @NameInMap("BindInstanceType")
    @Validation(required = true)
    private String bindInstanceType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private String dryRun;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private UnassociateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.bindInstanceId = builder.bindInstanceId;
        this.bindInstanceRegionId = builder.bindInstanceRegionId;
        this.bindInstanceType = builder.bindInstanceType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateAnycastEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return bindInstanceId
     */
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    /**
     * @return bindInstanceRegionId
     */
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    /**
     * @return bindInstanceType
     */
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<UnassociateAnycastEipAddressRequest, Builder> {
        private String anycastId; 
        private String bindInstanceId; 
        private String bindInstanceRegionId; 
        private String bindInstanceType; 
        private String clientToken; 
        private String dryRun; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateAnycastEipAddressRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.bindInstanceId = request.bindInstanceId;
            this.bindInstanceRegionId = request.bindInstanceRegionId;
            this.bindInstanceType = request.bindInstanceType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * The ID of the Anycast EIP.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * The ID of the cloud resource from which you want to disassociate the Anycast EIP.
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * The region where the cloud resource is deployed.
         */
        public Builder bindInstanceRegionId(String bindInstanceRegionId) {
            this.putQueryParameter("BindInstanceRegionId", bindInstanceRegionId);
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }

        /**
         * The type of cloud resource from which you want to disassociate the Anycast EIP. Valid values:
         * <p>
         * 
         * *   **SlbInstance**: an internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)
         * *   **NetworkInterface**: an elastic network interface (ENI)
         */
        public Builder bindInstanceType(String bindInstanceType) {
            this.putQueryParameter("BindInstanceType", bindInstanceType);
            this.bindInstanceType = bindInstanceType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * >  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to only precheck the request. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request without disassociating the Anycast EIP. The system checks the required parameters, request syntax, and limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The secondary private IP address of the ENI from which you want to disassociate the Anycast EIP.
         * <p>
         * 
         * This parameter is valid only when you set **BindInstanceType** to **NetworkInterface**. If you do not set this parameter, the primary private IP address of the ENI is returned.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public UnassociateAnycastEipAddressRequest build() {
            return new UnassociateAnycastEipAddressRequest(this);
        } 

    } 

}
