// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVSwitchCidrReservationRequest} extends {@link RequestModel}
 *
 * <p>CreateVSwitchCidrReservationRequest</p>
 */
public class CreateVSwitchCidrReservationRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchCidrReservationCidr")
    private String vSwitchCidrReservationCidr;

    @Query
    @NameInMap("VSwitchCidrReservationDescription")
    private String vSwitchCidrReservationDescription;

    @Query
    @NameInMap("VSwitchCidrReservationMask")
    private String vSwitchCidrReservationMask;

    @Query
    @NameInMap("VSwitchCidrReservationName")
    private String vSwitchCidrReservationName;

    @Query
    @NameInMap("VSwitchCidrReservationType")
    private String vSwitchCidrReservationType;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    private CreateVSwitchCidrReservationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipVersion = builder.ipVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.vSwitchCidrReservationCidr = builder.vSwitchCidrReservationCidr;
        this.vSwitchCidrReservationDescription = builder.vSwitchCidrReservationDescription;
        this.vSwitchCidrReservationMask = builder.vSwitchCidrReservationMask;
        this.vSwitchCidrReservationName = builder.vSwitchCidrReservationName;
        this.vSwitchCidrReservationType = builder.vSwitchCidrReservationType;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVSwitchCidrReservationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchCidrReservationCidr
     */
    public String getVSwitchCidrReservationCidr() {
        return this.vSwitchCidrReservationCidr;
    }

    /**
     * @return vSwitchCidrReservationDescription
     */
    public String getVSwitchCidrReservationDescription() {
        return this.vSwitchCidrReservationDescription;
    }

    /**
     * @return vSwitchCidrReservationMask
     */
    public String getVSwitchCidrReservationMask() {
        return this.vSwitchCidrReservationMask;
    }

    /**
     * @return vSwitchCidrReservationName
     */
    public String getVSwitchCidrReservationName() {
        return this.vSwitchCidrReservationName;
    }

    /**
     * @return vSwitchCidrReservationType
     */
    public String getVSwitchCidrReservationType() {
        return this.vSwitchCidrReservationType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateVSwitchCidrReservationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ipVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String vSwitchCidrReservationCidr; 
        private String vSwitchCidrReservationDescription; 
        private String vSwitchCidrReservationMask; 
        private String vSwitchCidrReservationName; 
        private String vSwitchCidrReservationType; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVSwitchCidrReservationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipVersion = request.ipVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.vSwitchCidrReservationCidr = request.vSwitchCidrReservationCidr;
            this.vSwitchCidrReservationDescription = request.vSwitchCidrReservationDescription;
            this.vSwitchCidrReservationMask = request.vSwitchCidrReservationMask;
            this.vSwitchCidrReservationName = request.vSwitchCidrReservationName;
            this.vSwitchCidrReservationType = request.vSwitchCidrReservationType;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
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
         * *   **true**: performs only a dry run, without performing the actual request. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The IP version of the reserved CIDR block. Valid values:
         * <p>
         * 
         * *   **IPv4** (default)
         * *   **IPv6**
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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

        /**
         * The ID of the region where the vSwitch is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Resource tags
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The reserved CIDR block of the vSwitch.
         * <p>
         * 
         * *   When **IpVersion** is set to **IPv4**, the reserved CIDR block must be a proper subset of the IPv4 CIDR block of the vSwitch and the subnet mask length of the reserved CIDR block cannot be greater than 28.
         * *   When **IpVersion** is set to **IPv6**, the reserved CIDR block must be a proper subset of the IPv6 CIDR block of the vSwitch and the subnet mask length of the reserved CIDR block cannot be greater than 80.
         * 
         * >  You must specify one of **VSwitchCidrReservationMask** and **VSwitchCidrReservationCidr**.
         */
        public Builder vSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
            this.putQueryParameter("VSwitchCidrReservationCidr", vSwitchCidrReservationCidr);
            this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
            return this;
        }

        /**
         * The description of the reserved CIDR block. This parameter is empty by default.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder vSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
            this.putQueryParameter("VSwitchCidrReservationDescription", vSwitchCidrReservationDescription);
            this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
            return this;
        }

        /**
         * The subnet mask of the reserved CIDR block.
         * <p>
         * 
         * *   When **IpVersion** is set to **IPv4**, the subnet mask length of the CIDR block must be greater than the IPv4 subnet mask length of the vSwitch and cannot be greater than 28.
         * *   When **IpVersion** is set to **IPv6**, the subnet mask length of the CIDR block must be greater than the IPv6 subnet mask length of the vSwitch and cannot be greater than 80.
         * 
         * >  You must specify one of **VSwitchCidrReservationMask** and **VSwitchCidrReservationCidr**.
         */
        public Builder vSwitchCidrReservationMask(String vSwitchCidrReservationMask) {
            this.putQueryParameter("VSwitchCidrReservationMask", vSwitchCidrReservationMask);
            this.vSwitchCidrReservationMask = vSwitchCidrReservationMask;
            return this;
        }

        /**
         * The name of the reserved CIDR block.
         * <p>
         * 
         * The name must be 2 to 128 characters in length and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder vSwitchCidrReservationName(String vSwitchCidrReservationName) {
            this.putQueryParameter("VSwitchCidrReservationName", vSwitchCidrReservationName);
            this.vSwitchCidrReservationName = vSwitchCidrReservationName;
            return this;
        }

        /**
         * The type of reserved CIDR block. Set the value to **prefix**.
         * <p>
         * 
         * >  When a user or a cloud service allocates a CIDR block to an elastic network interface (ENI), the CIDR block must be allocated from the reserved CIDR block. If the reserved CIDR block is exhausted, an error is returned.
         */
        public Builder vSwitchCidrReservationType(String vSwitchCidrReservationType) {
            this.putQueryParameter("VSwitchCidrReservationType", vSwitchCidrReservationType);
            this.vSwitchCidrReservationType = vSwitchCidrReservationType;
            return this;
        }

        /**
         * The ID of the vSwitch to which the reserved CIDR block belongs.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateVSwitchCidrReservationRequest build() {
            return new CreateVSwitchCidrReservationRequest(this);
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
             * The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.
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
