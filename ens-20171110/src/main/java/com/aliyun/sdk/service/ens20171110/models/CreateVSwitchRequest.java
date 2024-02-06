// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVSwitchRequest} extends {@link RequestModel}
 *
 * <p>CreateVSwitchRequest</p>
 */
public class CreateVSwitchRequest extends Request {
    @Query
    @NameInMap("CidrBlock")
    @Validation(required = true)
    private String cidrBlock;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("NetworkId")
    private String networkId;

    @Query
    @NameInMap("VSwitchName")
    private String vSwitchName;

    private CreateVSwitchRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.networkId = builder.networkId;
        this.vSwitchName = builder.vSwitchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static final class Builder extends Request.Builder<CreateVSwitchRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private String ensRegionId; 
        private String networkId; 
        private String vSwitchName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVSwitchRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.ensRegionId = request.ensRegionId;
            this.networkId = request.networkId;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * The CIDR block of the vSwitch. Take note of the following limits:
         * <p>
         * 
         * *   The subnet mask must be 16 to 29 bits in length.
         * *   The CIDR block of the vSwitch must fall within the CIDR block of the VPC to which the vSwitch belongs.
         * *   The CIDR block of the vSwitch cannot be the same as the destination CIDR block in a route entry of the VPC. However, it can be a subset of the destination CIDR block.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * The description of the vSwitch.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the edge node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The ID of the network to which the vSwitch that you want to create belongs.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * The name of the vSwitch. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   The name must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         * 
         * Default value: null.
         */
        public Builder vSwitchName(String vSwitchName) {
            this.putQueryParameter("VSwitchName", vSwitchName);
            this.vSwitchName = vSwitchName;
            return this;
        }

        @Override
        public CreateVSwitchRequest build() {
            return new CreateVSwitchRequest(this);
        } 

    } 

}
