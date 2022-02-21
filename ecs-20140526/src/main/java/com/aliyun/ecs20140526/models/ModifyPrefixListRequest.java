// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrefixListRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrefixListRequest</p>
 */
public class ModifyPrefixListRequest extends Request {
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
    @NameInMap("AddEntry")
    private java.util.List < AddEntry> addEntry;

    @Query
    @NameInMap("RemoveEntry")
    private java.util.List < RemoveEntry> removeEntry;

    @Query
    @NameInMap("PrefixListId")
    private String prefixListId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PrefixListName")
    private String prefixListName;

    @Query
    @NameInMap("Description")
    private String description;

    private ModifyPrefixListRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.addEntry = builder.addEntry;
        this.removeEntry = builder.removeEntry;
        this.prefixListId = builder.prefixListId;
        this.regionId = builder.regionId;
        this.prefixListName = builder.prefixListName;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrefixListRequest create() {
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
     * @return addEntry
     */
    public java.util.List < AddEntry> getAddEntry() {
        return this.addEntry;
    }

    /**
     * @return removeEntry
     */
    public java.util.List < RemoveEntry> getRemoveEntry() {
        return this.removeEntry;
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyPrefixListRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private java.util.List < AddEntry> addEntry; 
        private java.util.List < RemoveEntry> removeEntry; 
        private String prefixListId; 
        private String regionId; 
        private String prefixListName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrefixListRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.addEntry = response.addEntry;
            this.removeEntry = response.removeEntry;
            this.prefixListId = response.prefixListId;
            this.regionId = response.regionId;
            this.prefixListName = response.prefixListName;
            this.description = response.description;
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
         * AddEntry.
         */
        public Builder addEntry(java.util.List < AddEntry> addEntry) {
            this.putQueryParameter("AddEntry", addEntry);
            this.addEntry = addEntry;
            return this;
        }

        /**
         * RemoveEntry.
         */
        public Builder removeEntry(java.util.List < RemoveEntry> removeEntry) {
            this.putQueryParameter("RemoveEntry", removeEntry);
            this.removeEntry = removeEntry;
            return this;
        }

        /**
         * The ID of the prefix list.
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * The ID of the region.
         * <p>
         * 
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public ModifyPrefixListRequest build() {
            return new ModifyPrefixListRequest(this);
        } 

    } 

    public static class AddEntry extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Cidr")
        private String cidr;

        private AddEntry(Builder builder) {
            this.description = builder.description;
            this.cidr = builder.cidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddEntry create() {
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
             * 添加的前缀列表条目的CIDR地址块信息。N的取值范围：0~200。
             * <p>
             * 
             * 添加时请您注意：
             * - 前缀列表的条目数量，不能大于前缀列表支持的最大条目容量。您可以调用[DescribePrefixListAttributes](~~205872~~)查询指定前缀列表的最大条目容量信息。
             * - 不允许设置重复的CIDR地址块信息。
             * - 不允许与`RemoveEntry.N.Cidr`参数值重复。
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            public AddEntry build() {
                return new AddEntry(this);
            } 

        } 

    }
    public static class RemoveEntry extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        private RemoveEntry(Builder builder) {
            this.cidr = builder.cidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveEntry create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        public static final class Builder {
            private String cidr; 

            /**
             * 删除的前缀列表条目的CIDR地址块信息。N的取值范围：0~200。
             * <p>
             * 
             * 删除时请您注意：
             * - 不允许设置重复的CIDR地址块信息。
             * - 不允许与`AddEntry.N.Cidr`参数值重复。
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            public RemoveEntry build() {
                return new RemoveEntry(this);
            } 

        } 

    }
}
