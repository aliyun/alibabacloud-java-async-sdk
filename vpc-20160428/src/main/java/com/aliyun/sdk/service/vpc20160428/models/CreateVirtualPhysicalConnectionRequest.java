// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualPhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualPhysicalConnectionRequest</p>
 */
public class CreateVirtualPhysicalConnectionRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OrderMode")
    @Validation(required = true)
    private String orderMode;

    @Query
    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    private String physicalConnectionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Spec")
    @Validation(required = true)
    private String spec;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VlanId")
    @Validation(required = true)
    private Long vlanId;

    @Query
    @NameInMap("VpconnAliUid")
    @Validation(required = true)
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
    public java.util.List < Tag> getTag() {
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
        private java.util.List < Tag> tag; 
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
         * The description of the hosted connection.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to perform a dry run, without performing the actual request. Default value: 45104. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the request for potential issues, including required parameters, request syntax, and instance status. If the request fails the dry run, an error code is returned. If the request passes the dry run, `DRYRUN.SUCCESS` is returned.
         * *   **false**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The name of the hosted connection.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The payer for the hosted connection. Valid values:
         * <p>
         * 
         * *   **PayByPhysicalConnectionOwner**: The partner pays for the hosted connection.
         * *   **PayByVirtualPhysicalConnectionOwner**: The tenant pays for the hosted connection.
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * The ID of the Express Connect circuit over which the hosted connection is created.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * The region ID of the hosted connection.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the hosted connection belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The bandwidth value of the hosted connection.
         * <p>
         * 
         * Valid values: **50M**, **100M**, **200M**, **300M**, **400M**, **500M**, **1G**, **2G**, **5G**, **8G**, and **10G**.
         * 
         * >  **2G**, **5G**, **8G**, and **10G** are unavailable by default. If you want to use these bandwidth values, contact your account manager.
         * 
         * **M** indicates Mbit/s and **G** indicates Gbit/s.
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * The virtual local area network (VLAN) ID of the hosted connection. Valid values: **0** to **2999**.
         * <p>
         * 
         * *   If the VLAN ID is set to **0**, it indicates that the switch port of the virtual border router (VBR) is a Layer 3 router interface instead of a VLAN interface. When a Layer 3 router interface is used, each Express Connect circuit corresponds to a VBR.
         * *   If the VLAN ID is set to a value from **1** to **2999**, the switch port of the VBR is a Layer 3 VLAN subinterface. When a Layer 3 VLAN subinterface is used, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit with which the VBR is associated can be used to connect to virtual private clouds (VPCs) that belong to different Alibaba Cloud accounts. VBRs in different VLANs are isolated from each other at Layer 2.
         */
        public Builder vlanId(Long vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the tenant.
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. You can specify at most 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The value can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter but cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.
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
