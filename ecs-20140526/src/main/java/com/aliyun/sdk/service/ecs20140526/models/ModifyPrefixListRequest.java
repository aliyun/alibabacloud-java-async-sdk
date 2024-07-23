// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrefixListRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrefixListRequest</p>
 */
public class ModifyPrefixListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddEntry")
    private java.util.List < AddEntry> addEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefixListId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixListName")
    private String prefixListName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveEntry")
    private java.util.List < RemoveEntry> removeEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyPrefixListRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.addEntry = builder.addEntry;
        this.description = builder.description;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.prefixListId = builder.prefixListId;
        this.prefixListName = builder.prefixListName;
        this.regionId = builder.regionId;
        this.removeEntry = builder.removeEntry;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return addEntry
     */
    public java.util.List < AddEntry> getAddEntry() {
        return this.addEntry;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
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
     * @return removeEntry
     */
    public java.util.List < RemoveEntry> getRemoveEntry() {
        return this.removeEntry;
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

    public static final class Builder extends Request.Builder<ModifyPrefixListRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List < AddEntry> addEntry; 
        private String description; 
        private String ownerAccount; 
        private Long ownerId; 
        private String prefixListId; 
        private String prefixListName; 
        private String regionId; 
        private java.util.List < RemoveEntry> removeEntry; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrefixListRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.addEntry = request.addEntry;
            this.description = request.description;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.prefixListId = request.prefixListId;
            this.prefixListName = request.prefixListName;
            this.regionId = request.regionId;
            this.removeEntry = request.removeEntry;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The entries to be added to the prefix list.
         */
        public Builder addEntry(java.util.List < AddEntry> addEntry) {
            this.putQueryParameter("AddEntry", addEntry);
            this.addEntry = addEntry;
            return this;
        }

        /**
         * The description of the prefix list. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The ID of the prefix list.
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * The name of the prefix list. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://`, `https://`, `com.aliyun`, or `com.alibabacloud`. The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder prefixListName(String prefixListName) {
            this.putQueryParameter("PrefixListName", prefixListName);
            this.prefixListName = prefixListName;
            return this;
        }

        /**
         * The region ID of the prefix list. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The entries to be deleted from the prefix list.
         */
        public Builder removeEntry(java.util.List < RemoveEntry> removeEntry) {
            this.putQueryParameter("RemoveEntry", removeEntry);
            this.removeEntry = removeEntry;
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

        @Override
        public ModifyPrefixListRequest build() {
            return new ModifyPrefixListRequest(this);
        } 

    } 

    public static class AddEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private AddEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddEntry create() {
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

            /**
             * The CIDR block in entry N to be added to the prefix list. Valid values of N: 0 to 200.
             * <p>
             * 
             * Take note of the following items when you add the entries:
             * 
             * *   The total number of entries in the prefix list cannot exceed the maximum number of entries you specified for the prefix list. You can call the [DescribePrefixListAttributes](~~205872~~) operation to query the maximum number of entries that the prefix list can contain.
             * *   You cannot specify duplicate CIDR blocks.
             * *   The CIDR blocks cannot be the same as the `RemoveEntry.N.Cidr` values.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * The description in entry N. The description must be 2 to 32 characters in length and cannot start with `http://` or `https://`. Valid values of N: 0 to 200.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AddEntry build() {
                return new AddEntry(this);
            } 

        } 

    }
    public static class RemoveEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * The CIDR block in entry N to be deleted from the prefix list. Valid values of N: 0 to 200.
             * <p>
             * 
             * Take note of the following items when you delete the entries:
             * 
             * *   You cannot specify duplicate CIDR blocks.
             * *   The CIDR blocks cannot be the same as the `AddEntry.N.Cidr` values.
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
