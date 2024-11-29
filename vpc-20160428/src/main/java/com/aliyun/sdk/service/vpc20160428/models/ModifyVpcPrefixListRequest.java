// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVpcPrefixListRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcPrefixListRequest</p>
 */
public class ModifyVpcPrefixListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddPrefixListEntry")
    private java.util.List < AddPrefixListEntry> addPrefixListEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEntries")
    private Integer maxEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixListDescription")
    private String prefixListDescription;

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
    @com.aliyun.core.annotation.NameInMap("RemovePrefixListEntry")
    private java.util.List < RemovePrefixListEntry> removePrefixListEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyVpcPrefixListRequest(Builder builder) {
        super(builder);
        this.addPrefixListEntry = builder.addPrefixListEntry;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.maxEntries = builder.maxEntries;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.prefixListDescription = builder.prefixListDescription;
        this.prefixListId = builder.prefixListId;
        this.prefixListName = builder.prefixListName;
        this.regionId = builder.regionId;
        this.removePrefixListEntry = builder.removePrefixListEntry;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcPrefixListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addPrefixListEntry
     */
    public java.util.List < AddPrefixListEntry> getAddPrefixListEntry() {
        return this.addPrefixListEntry;
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
     * @return prefixListDescription
     */
    public String getPrefixListDescription() {
        return this.prefixListDescription;
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
     * @return removePrefixListEntry
     */
    public java.util.List < RemovePrefixListEntry> getRemovePrefixListEntry() {
        return this.removePrefixListEntry;
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

    public static final class Builder extends Request.Builder<ModifyVpcPrefixListRequest, Builder> {
        private java.util.List < AddPrefixListEntry> addPrefixListEntry; 
        private String clientToken; 
        private Boolean dryRun; 
        private Integer maxEntries; 
        private String ownerAccount; 
        private Long ownerId; 
        private String prefixListDescription; 
        private String prefixListId; 
        private String prefixListName; 
        private String regionId; 
        private java.util.List < RemovePrefixListEntry> removePrefixListEntry; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcPrefixListRequest request) {
            super(request);
            this.addPrefixListEntry = request.addPrefixListEntry;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.maxEntries = request.maxEntries;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.prefixListDescription = request.prefixListDescription;
            this.prefixListId = request.prefixListId;
            this.prefixListName = request.prefixListName;
            this.regionId = request.regionId;
            this.removePrefixListEntry = request.removePrefixListEntry;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The information about CIDR blocks to be added to the prefix list.</p>
         */
        public Builder addPrefixListEntry(java.util.List < AddPrefixListEntry> addPrefixListEntry) {
            this.putQueryParameter("AddPrefixListEntry", addPrefixListEntry);
            this.addPrefixListEntry = addPrefixListEntry;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: checks the request without performing the operation. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The maximum number of CIDR blocks supported by the prefix list after the configuration of the prefix list is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The new description of the prefix list.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>newdescription</p>
         */
        public Builder prefixListDescription(String prefixListDescription) {
            this.putQueryParameter("PrefixListDescription", prefixListDescription);
            this.prefixListDescription = prefixListDescription;
            return this;
        }

        /**
         * <p>The ID of the prefix list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-0b7hwu67****</p>
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * <p>The new name of the prefix list.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>newname</p>
         */
        public Builder prefixListName(String prefixListName) {
            this.putQueryParameter("PrefixListName", prefixListName);
            this.prefixListName = prefixListName;
            return this;
        }

        /**
         * <p>The region ID of the prefix list.</p>
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
         * <p>The information about CIDR blocks to be deleted to the prefix list.</p>
         */
        public Builder removePrefixListEntry(java.util.List < RemovePrefixListEntry> removePrefixListEntry) {
            this.putQueryParameter("RemovePrefixListEntry", removePrefixListEntry);
            this.removePrefixListEntry = removePrefixListEntry;
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
        public ModifyVpcPrefixListRequest build() {
            return new ModifyVpcPrefixListRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyVpcPrefixListRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpcPrefixListRequest</p>
     */
    public static class AddPrefixListEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private AddPrefixListEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddPrefixListEntry create() {
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
             * <p>The CIDR block to be added to the prefix list.</p>
             * <blockquote>
             * <p> If the CIDR block already exists in the prefix list, you can only modify the description of the CIDR block by setting the <strong>AddPrefixListEntry.N.Description</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/12</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the CIDR block to be added to the prefix list.</p>
             * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>newcidr</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AddPrefixListEntry build() {
                return new AddPrefixListEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpcPrefixListRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpcPrefixListRequest</p>
     */
    public static class RemovePrefixListEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private RemovePrefixListEntry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovePrefixListEntry create() {
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
             * <p>The CIDR block that you want to delete from the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The description of the CIDR block that you want to delete.</p>
             * 
             * <strong>example:</strong>
             * <p>cidr</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public RemovePrefixListEntry build() {
                return new RemovePrefixListEntry(this);
            } 

        } 

    }
}
