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
 * {@link CreateVSwitchCidrReservationRequest} extends {@link RequestModel}
 *
 * <p>CreateVSwitchCidrReservationRequest</p>
 */
public class CreateVSwitchCidrReservationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPrefixNumber")
    private Integer ipPrefixNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationCidr")
    private String vSwitchCidrReservationCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationDescription")
    private String vSwitchCidrReservationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationMask")
    private String vSwitchCidrReservationMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationName")
    private String vSwitchCidrReservationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationType")
    private String vSwitchCidrReservationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    private CreateVSwitchCidrReservationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipPrefixNumber = builder.ipPrefixNumber;
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
     * @return ipPrefixNumber
     */
    public Integer getIpPrefixNumber() {
        return this.ipPrefixNumber;
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
    public java.util.List<Tag> getTag() {
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
        private Integer ipPrefixNumber; 
        private String ipVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
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
            this.ipPrefixNumber = request.ipPrefixNumber;
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and business restrictions. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a Normal request. If the check succeeds, an HTTP 2xx status code is returned and the reserved CIDR block for a vSwitch is created.</li>
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
         * <p>The expected number of IP prefixes to reserve. Valid values: 1 to 32.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ipPrefixNumber(Integer ipPrefixNumber) {
            this.putQueryParameter("IpPrefixNumber", ipPrefixNumber);
            this.ipPrefixNumber = ipPrefixNumber;
            return this;
        }

        /**
         * <p>The IP version of the reserved CIDR block for a vSwitch. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong> (default)</li>
         * <li><strong>IPv6</strong></li>
         * </ul>
         * <blockquote>
         * <p>You do not need to specify this parameter when you create an IPv4 reserved CIDR block for a vSwitch. This parameter is required when you create an IPv6 reserved CIDR block for a vSwitch.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
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
         * <p>The region ID of the vSwitch.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The resource tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The reserved CIDR block for a vSwitch.</p>
         * <ul>
         * <li>If <strong>IpVersion</strong> is set to <strong>IPv4</strong>, the reserved CIDR block for a vSwitch must be a proper subset of the IPv4 CIDR block of the vSwitch, and the mask length cannot exceed 28.</li>
         * <li>If <strong>IpVersion</strong> is set to <strong>IPv6</strong>, the reserved CIDR block for a vSwitch must be a proper subset of the IPv6 CIDR block of the vSwitch, and the mask length cannot exceed 80.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You must specify either the <strong>VSwitchCidrReservationMask</strong> parameter or the <strong>VSwitchCidrReservationCidr</strong> parameter.</li>
         * <li>The reserved CIDR block cannot contain the system reserved IP addresses of the vSwitch to which it belongs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.64/28</p>
         */
        public Builder vSwitchCidrReservationCidr(String vSwitchCidrReservationCidr) {
            this.putQueryParameter("VSwitchCidrReservationCidr", vSwitchCidrReservationCidr);
            this.vSwitchCidrReservationCidr = vSwitchCidrReservationCidr;
            return this;
        }

        /**
         * <p>The description of the reserved CIDR block for a vSwitch. If you leave this parameter empty, the default value is empty.</p>
         * <p>The description must be 1 to 256 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ReservationDescription</p>
         */
        public Builder vSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
            this.putQueryParameter("VSwitchCidrReservationDescription", vSwitchCidrReservationDescription);
            this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
            return this;
        }

        /**
         * <p>The mask of the reserved CIDR block for a vSwitch.</p>
         * <ul>
         * <li>If <strong>IpVersion</strong> is set to <strong>IPv4</strong>, the mask length of the reserved CIDR block for a vSwitch must be at least 2 bits longer than the mask of the IPv4 CIDR block of the vSwitch and cannot exceed 28.</li>
         * <li>If <strong>IpVersion</strong> is set to <strong>IPv6</strong>, the mask length of the reserved CIDR block for a vSwitch must be longer than the mask of the IPv6 CIDR block of the vSwitch and cannot exceed 80.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You must specify either the <strong>VSwitchCidrReservationMask</strong> parameter or the <strong>VSwitchCidrReservationCidr</strong> parameter.</li>
         * <li>The reserved CIDR block cannot contain the system reserved IP addresses of the vSwitch to which it belongs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder vSwitchCidrReservationMask(String vSwitchCidrReservationMask) {
            this.putQueryParameter("VSwitchCidrReservationMask", vSwitchCidrReservationMask);
            this.vSwitchCidrReservationMask = vSwitchCidrReservationMask;
            return this;
        }

        /**
         * <p>The name of the reserved CIDR block for a vSwitch.</p>
         * <p>The name must be 1 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ReservationName</p>
         */
        public Builder vSwitchCidrReservationName(String vSwitchCidrReservationName) {
            this.putQueryParameter("VSwitchCidrReservationName", vSwitchCidrReservationName);
            this.vSwitchCidrReservationName = vSwitchCidrReservationName;
            return this;
        }

        /**
         * <p>The type of the reserved CIDR block for a vSwitch. Valid values: <strong>prefix</strong>, which indicates that IP addresses are allocated by CIDR block.</p>
         * <blockquote>
         * <p>When users or cloud services automatically assign CIDR blocks to elastic network interface controllers (NICs), the CIDR blocks must be allocated from the reserved CIDR block. If the IP addresses in the reserved CIDR block are exhausted, the system returns an error.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>prefix</p>
         */
        public Builder vSwitchCidrReservationType(String vSwitchCidrReservationType) {
            this.putQueryParameter("VSwitchCidrReservationType", vSwitchCidrReservationType);
            this.vSwitchCidrReservationType = vSwitchCidrReservationType;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the reserved CIDR block for a vSwitch belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-25navfgbue4g****</p>
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

    /**
     * 
     * {@link CreateVSwitchCidrReservationRequest} extends {@link TeaModel}
     *
     * <p>CreateVSwitchCidrReservationRequest</p>
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
             * <p>The tag key of the resource. You can specify up to 20 tag keys. If you specify this parameter, the value cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
