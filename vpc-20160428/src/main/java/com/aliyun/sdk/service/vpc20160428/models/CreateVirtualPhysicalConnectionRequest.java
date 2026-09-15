// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateVirtualPhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualPhysicalConnectionRequest</p>
 */
public class CreateVirtualPhysicalConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String physicalConnectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long vlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpconnAliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long vpconnAliUid;

    private CreateVirtualPhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.orderMode = builder.orderMode;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.tag = builder.tag;
        this.token = builder.token;
        this.vlanId = builder.vlanId;
        this.vpconnAliUid = builder.vpconnAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualPhysicalConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return orderMode
     */
    public String getOrderMode() {
        return this.orderMode;
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vlanId
     */
    public Long getVlanId() {
        return this.vlanId;
    }

    /**
     * @return vpconnAliUid
     */
    public Long getVpconnAliUid() {
        return this.vpconnAliUid;
    }

    public static final class Builder extends Request.Builder<CreateVirtualPhysicalConnectionRequest, Builder> {
        private String description; 
        private Boolean dryRun; 
        private String name; 
        private String orderMode; 
        private String physicalConnectionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String spec; 
        private java.util.List<Tag> tag; 
        private String token; 
        private Long vlanId; 
        private Long vpconnAliUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualPhysicalConnectionRequest request) {
            super(request);
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.name = request.name;
            this.orderMode = request.orderMode;
            this.physicalConnectionId = request.physicalConnectionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.spec = request.spec;
            this.tag = request.tag;
            this.token = request.token;
            this.vlanId = request.vlanId;
            this.vpconnAliUid = request.vpconnAliUid;
        } 

        /**
         * <p>The description of the shared Express Connect circuits.</p>
         * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character, but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without creating the shared Express Connect circuits. The system checks required parameters, request format, and instance status. If the check fails, the corresponding error is returned. If the check passes, <code>DRYRUN.SUCCESS</code> is returned.</li>
         * <li><strong>false</strong> (default): sends a Normal request. After the check passes, the shared Express Connect circuits are created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The name of the shared Express Connect circuits.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-), but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The payer of the shared Express Connect circuits. Valid values:</p>
         * <ul>
         * <li><strong>PayByPhysicalConnectionOwner</strong>: The partner pays.</li>
         * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The tenant pays.<blockquote>
         * <p>Default value: PayByVirtualPhysicalConnectionOwner (tenant pays).</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByVirtualPhysicalConnectionOwner</p>
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * <p>The ID of the Express Connect circuit associated with the shared Express Connect circuits.</p>
         * <blockquote>
         * <p>The Express Connect circuit must be in the Enabled state and must be an Express Connect circuit (shared Express Connect circuits IDs are not supported). Otherwise, ResourceNotFound.PhysicalConnectionId or IncorrectStatus.PhysicalConnection is returned. You can invoke DescribePhysicalConnections to query the status of the Express Connect circuit. The caller must be the account (partner) that owns the Express Connect circuit.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * <p>The region ID of the shared Express Connect circuits.</p>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the shared Express Connect circuits belong.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzjty2chzuqky</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The bandwidth value of the shared Express Connect circuits.</p>
         * <p>Valid values: <strong>50M</strong>, <strong>100M</strong>, <strong>200M</strong>, <strong>300M</strong>, <strong>400M</strong>, <strong>500M</strong>, <strong>1G</strong>, <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong>.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>The bandwidth values <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available by default. To use these values, contact your account manager.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>The bandwidth values <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available by default. To use these values, contact your account manager.</p>
         * </blockquote>
         * <p>Unit: <strong>M</strong> indicates Mbit/s and <strong>G</strong> indicates Gbit/s.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CBCE910E-D396-4944-8****</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The VLAN ID of the shared Express Connect circuits. Valid values: <strong>0</strong> to <strong>2999</strong>.</p>
         * <ul>
         * <li>If the VLAN ID is <strong>0</strong>, the physical switch port of the Virtual Border Router (VBR) does not use VLAN mode but uses Layer 3 routing interface mode. In Layer 3 routing interface mode, each Express Connect circuit corresponds to one VBR.</li>
         * <li>If the VLAN ID is <strong>1</strong> to <strong>2999</strong>, the physical switch port of the VBR uses VLAN-based Layer 3 sub-interfaces. In Layer 3 sub-interface mode, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit of the VBR can connect to VPCs under multiple accounts. VBRs in different VLANs have network isolation at Layer 2 and cannot communicate with each other.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder vlanId(Long vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        /**
         * <p>The ID of the tenant\&quot;s Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        public Builder vpconnAliUid(Long vpconnAliUid) {
            this.putQueryParameter("VpconnAliUid", vpconnAliUid);
            this.vpconnAliUid = vpconnAliUid;
            return this;
        }

        @Override
        public CreateVirtualPhysicalConnectionRequest build() {
            return new CreateVirtualPhysicalConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVirtualPhysicalConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateVirtualPhysicalConnectionRequest</p>
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
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
