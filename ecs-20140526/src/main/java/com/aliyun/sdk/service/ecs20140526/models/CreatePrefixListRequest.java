// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreatePrefixListRequest} extends {@link RequestModel}
 *
 * <p>CreatePrefixListRequest</p>
 */
public class CreatePrefixListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressFamily")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Entry")
    private java.util.List<Entry> entry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEntries")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200, minimum = 1)
    private Integer maxEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixListName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefixListName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreatePrefixListRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.addressFamily = builder.addressFamily;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.entry = builder.entry;
        this.maxEntries = builder.maxEntries;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.prefixListName = builder.prefixListName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrefixListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return addressFamily
     */
    public String getAddressFamily() {
        return this.addressFamily;
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
     * @return entry
     */
    public java.util.List<Entry> getEntry() {
        return this.entry;
    }

    /**
     * @return maxEntries
     */
    public Integer getMaxEntries() {
        return this.maxEntries;
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
     * @return prefixListName
     */
    public String getPrefixListName() {
        return this.prefixListName;
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

    public static final class Builder extends Request.Builder<CreatePrefixListRequest, Builder> {
        private String sourceRegionId; 
        private String addressFamily; 
        private String clientToken; 
        private String description; 
        private java.util.List<Entry> entry; 
        private Integer maxEntries; 
        private String ownerAccount; 
        private Long ownerId; 
        private String prefixListName; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrefixListRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.addressFamily = request.addressFamily;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.entry = request.entry;
            this.maxEntries = request.maxEntries;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.prefixListName = request.prefixListName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The IP address family. Valid values:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder addressFamily(String addressFamily) {
            this.putQueryParameter("AddressFamily", addressFamily);
            this.addressFamily = addressFamily;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the prefix list. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The details of entries in the prefix list.</p>
         */
        public Builder entry(java.util.List<Entry> entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
            return this;
        }

        /**
         * <p>The maximum number of entries that the prefix list can contain. Valid values: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxEntries(Integer maxEntries) {
            this.putQueryParameter("MaxEntries", maxEntries);
            this.maxEntries = maxEntries;
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
         * <p>The name of the prefix list. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). It must start with a letter and cannot start with <code>http://</code>, <code>https://</code>, <code>com.aliyun</code>, or <code>com.alibabacloud</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrefixListNameSample</p>
         */
        public Builder prefixListName(String prefixListName) {
            this.putQueryParameter("PrefixListName", prefixListName);
            this.prefixListName = prefixListName;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the prefix list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreatePrefixListRequest build() {
            return new CreatePrefixListRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrefixListRequest} extends {@link TeaModel}
     *
     * <p>CreatePrefixListRequest</p>
     */
    public static class Entry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Entry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entry create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 

            private Builder() {
            } 

            private Builder(Entry model) {
                this.cidr = model.cidr;
                this.description = model.description;
            } 

            /**
             * <p>The CIDR block in entry N. Valid values of N: 0 to 200. Take note of the following items:</p>
             * <ul>
             * <li>The total number of entries cannot exceed the <code>MaxEntries</code> value.</li>
             * <li>CIDR block types are determined by the IP address family. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.</li>
             * <li>CIDR blocks must be unique across all entries in a prefix list. For example, you cannot specify 192.168.1.0/24 twice in the entries of the prefix list.</li>
             * <li>IP addresses are supported. The system converts IP addresses into CIDR blocks. For example, if you specify 192.168.1.100, the system converts it into the 192.168.1.100/32 CIDR block.</li>
             * <li>If an IPv6 CIDR block is used, the system converts it into the zero compression format and changes uppercase letters into lowercase ones. For example, if you specify 2001:0DB8:0000:0000:0000:0000:0000:0000/32, the system converts it into 2001:db8::/32.</li>
             * </ul>
             * <p>For more information about CIDR blocks, see the <a href="https://help.aliyun.com/document_detail/40637.html#title-gu4-uzk-12r">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</p>
             * <p>This parameter is empty by default.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description in entry N. The description must be 2 to 32 characters in length and cannot start with <code>http://</code> or <code>https://</code>. Valid values of N: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>Description Sample 01</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Entry build() {
                return new Entry(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePrefixListRequest} extends {@link TeaModel}
     *
     * <p>CreatePrefixListRequest</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
