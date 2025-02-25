// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AllocateAnycastEipAddressRequest</p>
 */
public class AllocateAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private String bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ServiceLocation")
    @Validation(required = true)
    private String serviceLocation;

    private AllocateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceLocation = builder.serviceLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateAnycastEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public static final class Builder extends Request.Builder<AllocateAnycastEipAddressRequest, Builder> {
        private String bandwidth; 
        private String clientToken; 
        private String description; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String name; 
        private String resourceGroupId; 
        private String serviceLocation; 

        private Builder() {
            super();
        } 

        private Builder(AllocateAnycastEipAddressRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceLocation = request.serviceLocation;
        } 

        /**
         * The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **200** to **1000**.
         * 
         * Default value: **1000**.
         * 
         * > The maximum bandwidth is not a guaranteed service and is for reference only.
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
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
         * The description of the Anycast EIP.
         * <p>
         * 
         * The description must be 0 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The billing method of the Anycast EIP.
         * <p>
         * 
         * Set the value to **PostPaid**, which specifies the pay-as-you-go billing method.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The metering method of the Anycast EIP.
         * <p>
         * 
         * Set the value to **PayByTraffic**, which specifies the pay-by-data-transfer metering method.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The name of the Anycast EIP.
         * <p>
         * 
         * The name must be 0 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The access area of the Anycast EIP.
         * <p>
         * 
         * Set the value to **international**, which specifies the areas outside the Chinese mainland.
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        @Override
        public AllocateAnycastEipAddressRequest build() {
            return new AllocateAnycastEipAddressRequest(this);
        } 

    } 

}
