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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
    private Boolean enableJumboFrame;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
        this.enableJumboFrame = builder.enableJumboFrame;
        this.linkType = builder.linkType;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
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
     * @return enableJumboFrame
     */
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private Boolean enableJumboFrame; 
        private String linkType; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
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
            this.enableJumboFrame = request.enableJumboFrame;
            this.linkType = request.linkType;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account to which the acceptor of the VPC peering connection belongs.</p>
         * <ul>
         * <li><p>If you enter your own Alibaba Cloud account ID, a same-account VPC peering connection is created.</p>
         * </li>
         * <li><p>If you enter the ID of another Alibaba Cloud account, a cross-account VPC peering connection is created.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the acceptor account is a Resource Access Management (RAM) user, you must enter the ID of the Alibaba Cloud account to which the RAM user belongs in <strong>AcceptingAliUid</strong>.</p>
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
         * <p>The ID of the region where the acceptor of the VPC peering connection is deployed.</p>
         * <ul>
         * <li><p>To create an intra-region VPC peering connection, enter the same region ID as the initiator.</p>
         * </li>
         * <li><p>To create an inter-region VPC peering connection, enter a region ID different from that of the initiator.</p>
         * </li>
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
         * <p>The ID of the VPC that acts as the acceptor of the VPC peering connection.</p>
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
         * <p>The bandwidth of the VPC peering connection. Unit: Mbit/s. The value must be a positive integer.</p>
         * <blockquote>
         * <p>If you want to specify this parameter, make sure that you are creating an inter-region peering connection.</p>
         * </blockquote>
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
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
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
         * <p>The description of the VPC peering connection. The description must be 2 to 256 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>Specifies whether to perform only a dry run for this request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not create a VPC peering connection. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a Normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
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
         * <p>Specifies whether to enable the jumbo frame feature for the VPC peering connection. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.<blockquote>
         * <p>Note: If you want to specify this parameter, make sure that you are creating an inter-region peering connection.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableJumboFrame(Boolean enableJumboFrame) {
            this.putBodyParameter("EnableJumboFrame", enableJumboFrame);
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }

        /**
         * <p>The link type.</p>
         * <p>Valid values: Platinum and Gold. Default value: Gold.</p>
         * <blockquote>
         * <p>If you want to specify this parameter, make sure that you are creating an inter-region peering connection.</p>
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
         * <p>The name of the VPC peering connection. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and can contain digits, underscores (_), and hyphens (-).</p>
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
         * <p>The ID of the region where you want to create a VPC peering connection. </p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a>.</p>
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
         * <p>The tag information.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID create a VPC that acts as the initiator create a VPC peering connection.</p>
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

    /**
     * 
     * {@link CreateVpcPeerConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateVpcPeerConnectionRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You must specify at least one tag key and can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You must specify at least one tag value and can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
