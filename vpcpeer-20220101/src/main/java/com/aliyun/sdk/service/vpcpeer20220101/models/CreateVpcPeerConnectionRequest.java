// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

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
 * {@link CreateVpcPeerConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcPeerConnectionRequest</p>
 */
public class CreateVpcPeerConnectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptingAliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long acceptingAliUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptingRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceptingRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptingVpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceptingVpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkType")
    private String linkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateVpcPeerConnectionRequest(Builder builder) {
        super(builder);
        this.acceptingAliUid = builder.acceptingAliUid;
        this.acceptingRegionId = builder.acceptingRegionId;
        this.acceptingVpcId = builder.acceptingVpcId;
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.linkType = builder.linkType;
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return linkType
     */
    public String getLinkType() {
        return this.linkType;
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
        private Integer bandwidth; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String linkType; 
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
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.linkType = request.linkType;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account to which the accepter VPC belongs.</p>
         * <ul>
         * <li>To create a VPC peering connection within your Alibaba Cloud account, enter the ID of your Alibaba Cloud account.</li>
         * <li>To create a VPC peering connection between your Alibaba Cloud account and another Alibaba Cloud account, enter the ID of the peer Alibaba Cloud account.</li>
         * </ul>
         * <blockquote>
         * <p> If the accepter is a RAM user, set <strong>AcceptingAliUid</strong> to the ID of the Alibaba Cloud account that created the RAM user.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        public Builder acceptingAliUid(Long acceptingAliUid) {
            this.putBodyParameter("AcceptingAliUid", acceptingAliUid);
            this.acceptingAliUid = acceptingAliUid;
            return this;
        }

        /**
         * <p>The region ID of the accepter VPC of the VPC peering connection that you want to create.</p>
         * <ul>
         * <li>To create an intra-region VPC peering connection, enter a region ID that is the same as that of the requester VPC.</li>
         * <li>To create an inter-region VPC peering connection, enter a region ID that is different from that of the requester VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder acceptingRegionId(String acceptingRegionId) {
            this.putBodyParameter("AcceptingRegionId", acceptingRegionId);
            this.acceptingRegionId = acceptingRegionId;
            return this;
        }

        /**
         * <p>The ID of the accepter VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vzjkp2q1xgnind****</p>
         */
        public Builder acceptingVpcId(String acceptingVpcId) {
            this.putBodyParameter("AcceptingVpcId", acceptingVpcId);
            this.acceptingVpcId = acceptingVpcId;
            return this;
        }

        /**
         * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be an integer greater than 0. Before you specify this parameter, make sure that you create an inter-region VPC peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the VPC peering connection.</p>
         * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The link type of the VPC peering connection that you want to create. Valid values:</p>
         * <ul>
         * <li><p>Platinum.</p>
         * </li>
         * <li><p>Gold: default value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you need to specify this parameter, ensure that the VPC peering connection is an inter-region connection.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Gold</p>
         */
        public Builder linkType(String linkType) {
            this.putQueryParameter("LinkType", linkType);
            this.linkType = linkType;
            return this;
        }

        /**
         * <p>The name of the VPC peering connection.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcpeer</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region where you want to create a VPC peering connection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the requester VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1gsk7h12ew7oegk****</p>
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
