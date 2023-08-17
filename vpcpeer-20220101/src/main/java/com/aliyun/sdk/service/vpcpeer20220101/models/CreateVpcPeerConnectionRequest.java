// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcPeerConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcPeerConnectionRequest</p>
 */
public class CreateVpcPeerConnectionRequest extends Request {
    @Body
    @NameInMap("AcceptingAliUid")
    @Validation(required = true)
    private Long acceptingAliUid;

    @Body
    @NameInMap("AcceptingRegionId")
    @Validation(required = true)
    private String acceptingRegionId;

    @Body
    @NameInMap("AcceptingVpcId")
    @Validation(required = true)
    private String acceptingVpcId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private CreateVpcPeerConnectionRequest(Builder builder) {
        super(builder);
        this.acceptingAliUid = builder.acceptingAliUid;
        this.acceptingRegionId = builder.acceptingRegionId;
        this.acceptingVpcId = builder.acceptingVpcId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcPeerConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptingAliUid
     */
    public Long getAcceptingAliUid() {
        return this.acceptingAliUid;
    }

    /**
     * @return acceptingRegionId
     */
    public String getAcceptingRegionId() {
        return this.acceptingRegionId;
    }

    /**
     * @return acceptingVpcId
     */
    public String getAcceptingVpcId() {
        return this.acceptingVpcId;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateVpcPeerConnectionRequest, Builder> {
        private Long acceptingAliUid; 
        private String acceptingRegionId; 
        private String acceptingVpcId; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcPeerConnectionRequest request) {
            super(request);
            this.acceptingAliUid = request.acceptingAliUid;
            this.acceptingRegionId = request.acceptingRegionId;
            this.acceptingVpcId = request.acceptingVpcId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.vpcId = request.vpcId;
        } 

        /**
         * The ID of the Alibaba Cloud account to which the accepter VPC belongs.
         * <p>
         * 
         * *   To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.
         * 
         * *   To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.
         * 
         * > If the accepter VPC belongs to a Resource Access Management (RAM) user, you must set the value of **AcceptingAliUid** to the ID of the corresponding Alibaba Cloud account.
         */
        public Builder acceptingAliUid(Long acceptingAliUid) {
            this.putBodyParameter("AcceptingAliUid", acceptingAliUid);
            this.acceptingAliUid = acceptingAliUid;
            return this;
        }

        /**
         * The region ID of the accepter VPC of the VPC peering connection that you want to create.
         * <p>
         * 
         * *   To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.
         * *   To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.
         */
        public Builder acceptingRegionId(String acceptingRegionId) {
            this.putBodyParameter("AcceptingRegionId", acceptingRegionId);
            this.acceptingRegionId = acceptingRegionId;
            return this;
        }

        /**
         * The ID of the accepter VPC.
         */
        public Builder acceptingVpcId(String acceptingVpcId) {
            this.putBodyParameter("AcceptingVpcId", acceptingVpcId);
            this.acceptingVpcId = acceptingVpcId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **client token** as the **request ID**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the VPC peering connection.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The name of the VPC peering connection.
         * <p>
         * 
         * The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where you want to create a VPC peering connection.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * For more information about resource groups, see [What is a resource group?](~~94475~~)
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the requester VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateVpcPeerConnectionRequest build() {
            return new CreateVpcPeerConnectionRequest(this);
        } 

    } 

}
