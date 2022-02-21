// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrefixListRequest} extends {@link RequestModel}
 *
 * <p>CreatePrefixListRequest</p>
 */
public class CreatePrefixListRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("Entry")
    private java.util.List < Entry> entry;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AddressFamily")
    private String addressFamily;

    @Query
    @NameInMap("PrefixListName")
    private String prefixListName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MaxEntries")
    private Integer maxEntries;

    private CreatePrefixListRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.entry = builder.entry;
        this.regionId = builder.regionId;
        this.addressFamily = builder.addressFamily;
        this.prefixListName = builder.prefixListName;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.maxEntries = builder.maxEntries;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return entry
     */
    public java.util.List < Entry> getEntry() {
        return this.entry;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return addressFamily
     */
    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * @return prefixListName
     */
    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return maxEntries
     */
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public static final class Builder extends Request.Builder<CreatePrefixListRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private java.util.List < Entry> entry; 
        private String regionId; 
        private String addressFamily; 
        private String prefixListName; 
        private String description; 
        private String clientToken; 
        private Integer maxEntries; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrefixListRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.entry = response.entry;
            this.regionId = response.regionId;
            this.addressFamily = response.addressFamily;
            this.prefixListName = response.prefixListName;
            this.description = response.description;
            this.clientToken = response.clientToken;
            this.maxEntries = response.maxEntries;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * Entry.
         */
        public Builder entry(java.util.List < Entry> entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The address family of the prefix list. Valid values:
         * <p>
         * 
         * -IPv4
         * -IPv6
         */
        public Builder addressFamily(String addressFamily) {
            this.putQueryParameter("AddressFamily", addressFamily);
            this.addressFamily = addressFamily;
            return this;
        }

        /**
         * The name of the prefix list. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// ", "https://", "com.aliyun", or "com.alibabacloud. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         */
        public Builder prefixListName(String prefixListName) {
            this.putQueryParameter("PrefixListName", prefixListName);
            this.prefixListName = prefixListName;
            return this;
        }

        /**
         * The description of the prefix list. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. "ClientToken" only supports ASCII characters and cannot exceed 64 characters in length. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The maximum number of entries supported by the prefix list. Valid values: 1 to 200.
         */
        public Builder maxEntries(Integer maxEntries) {
            this.putQueryParameter("MaxEntries", maxEntries);
            this.maxEntries = maxEntries;
            return this;
        }

        @Override
        public CreatePrefixListRequest build() {
            return new CreatePrefixListRequest(this);
        } 

    } 

    public static class Entry extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Cidr")
        private String cidr;

        private Entry(Builder builder) {
            this.description = builder.description;
            this.cidr = builder.cidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entry create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        public static final class Builder {
            private String description; 
            private String cidr; 

            /**
             * 前缀列表条目的描述信息。长度为2~32个英文或中文字符，不能以`http://`和`https://`开头。N的取值范围：0~200。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 前缀列表条目的CIDR地址块信息。N的取值范围：0~200。注意事项：
             * <p>
             * 
             * - 前缀列表的条目数量不能大于最大条目容量（`MaxEntries`）。
             * - 条目中的CIDR地址块类型根据地址族决定，一个前缀列表不能同时包含IPv4和IPv6的CIDR地址块。
             * - 多个条目中的CIDR地址块不能重复。例如，您不能设置两个192.168.1.0/24。
             * - 支持设置单IP地址，系统会自动转换为CIDR地址块。例如，您设置192.168.1.100，系统会自动转换成192.168.1.100/32。
             * - 如果使用IPv6 CIDR地址块，系统会自动转换成零压缩表示形式且字母转换为小写。例如，您设置2001:0DB8:0000:0000:0000:0000:0000:0000/32，系统会自动转换成2001:db8::/32。
             * 
             * <props="china">关于CIDR地址块的详细信息，请参见[什么是CIDR](https://help.aliyun.com/knowledge_detail/40637.html#title-gu4-uzk-12r)。</props>
             * 
             * <props="intl">关于CIDR地址块的详细信息，请参见[什么是CIDR](https://www.alibabacloud.com/help/doc-detail/40637.htm#title-gu4-uzk-12r)。</props>
             * 
             * <props="partner">关于CIDR地址块的详细信息，请参见[什么是CIDR](https://partners-intl.aliyun.com/help/doc-detail/40637.htm#title-gu4-uzk-12r)。</props>
             * 
             * 
             * 默认值：空
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            public Entry build() {
                return new Entry(this);
            } 

        } 

    }
}
