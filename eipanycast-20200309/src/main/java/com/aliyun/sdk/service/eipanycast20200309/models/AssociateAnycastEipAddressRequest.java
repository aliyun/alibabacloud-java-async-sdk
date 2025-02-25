// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateAnycastEipAddressRequest</p>
 */
public class AssociateAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("AssociationMode")
    private String associationMode;

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
    private Boolean dryRun;

    @Query
    @NameInMap("PopLocations")
    private java.util.List < PopLocations> popLocations;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private AssociateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.associationMode = builder.associationMode;
        this.bindInstanceId = builder.bindInstanceId;
        this.bindInstanceRegionId = builder.bindInstanceRegionId;
        this.bindInstanceType = builder.bindInstanceType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.popLocations = builder.popLocations;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAnycastEipAddressRequest create() {
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
     * @return associationMode
     */
    public String getAssociationMode() {
        return this.associationMode;
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
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return popLocations
     */
    public java.util.List < PopLocations> getPopLocations() {
        return this.popLocations;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<AssociateAnycastEipAddressRequest, Builder> {
        private String anycastId; 
        private String associationMode; 
        private String bindInstanceId; 
        private String bindInstanceRegionId; 
        private String bindInstanceType; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < PopLocations> popLocations; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(AssociateAnycastEipAddressRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.associationMode = request.associationMode;
            this.bindInstanceId = request.bindInstanceId;
            this.bindInstanceRegionId = request.bindInstanceRegionId;
            this.bindInstanceType = request.bindInstanceType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.popLocations = request.popLocations;
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
         * The association mode. Valid values:
         * <p>
         * 
         * *   **Default**: the default mode. In this mode, the endpoint to be associated serves as the default origin server.
         * *   **Normal**: the standard mode. In this mode, the endpoint to be associated serves as a standard origin server.
         * 
         * > You can associate endpoints in multiple regions with an Anycast EIP. However, only one endpoint can serve as the default origin server. Others serve as standard origin servers. If you do not specify or add an access point, requests are forwarded to the default origin server.\
         * 
         * 
         * *   If this is your first time to associate an Anycast EIP with an endpoint, set the value to **Default**.
         * *   If not, you can also set the value to **Default**, which specifies a new default origin server. In this case, the previous origin server functions as a standard origin server.
         */
        public Builder associationMode(String associationMode) {
            this.putQueryParameter("AssociationMode", associationMode);
            this.associationMode = associationMode;
            return this;
        }

        /**
         * The ID of the endpoint with which you want to associate the Anycast EIP.
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * The ID of the region where the endpoint is deployed.
         * <p>
         * 
         * You can associate Anycast EIPs only with endpoints in specific regions. You can call the [DescribeAnycastServerRegions](~~171939~~) operation to query the region IDs.
         */
        public Builder bindInstanceRegionId(String bindInstanceRegionId) {
            this.putQueryParameter("BindInstanceRegionId", bindInstanceRegionId);
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }

        /**
         * The type of endpoint with which you want to associate the Anycast EIP. Valid values:
         * <p>
         * 
         * *   **SlbInstance**: internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)
         * *   **NetworkInterface**: elastic network interface (ENI)
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The information about the access points in associated access areas when you associate an Anycast EIP with an endpoint.
         * <p>
         * 
         * If this is your first time to associate an Anycast EIP with an endpoint, ignore this parameter. The system automatically associates all access areas.
         * 
         * You can call the [DescribeAnycastPopLocations](~~171938~~) operation to query information about access points in supported access areas.
         */
        public Builder popLocations(java.util.List < PopLocations> popLocations) {
            this.putQueryParameter("PopLocations", popLocations);
            this.popLocations = popLocations;
            return this;
        }

        /**
         * The secondary private IP address of the ENI with which you want to associate the Anycast EIP.
         * <p>
         * 
         * This parameter is valid only when you set **BindInstanceType** to **NetworkInterface**. If you do not set this parameter, the primary private IP address of the ENI is used.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public AssociateAnycastEipAddressRequest build() {
            return new AssociateAnycastEipAddressRequest(this);
        } 

    } 

    public static class PopLocations extends TeaModel {
        @NameInMap("PopLocation")
        private String popLocation;

        private PopLocations(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocations create() {
            return builder().build();
        }

        /**
         * @return popLocation
         */
        public String getPopLocation() {
            return this.popLocation;
        }

        public static final class Builder {
            private String popLocation; 

            /**
             * The information about the access points in associated access areas when you associate an Anycast EIP with an endpoint.
             * <p>
             * 
             * If this is your first time to associate an Anycast EIP with an endpoint, ignore this parameter. The system automatically associates all access areas.
             * 
             * You can call the [DescribeAnycastPopLocations](~~171938~~) operation to query information about access points in supported access areas.
             */
            public Builder popLocation(String popLocation) {
                this.popLocation = popLocation;
                return this;
            }

            public PopLocations build() {
                return new PopLocations(this);
            } 

        } 

    }
}
