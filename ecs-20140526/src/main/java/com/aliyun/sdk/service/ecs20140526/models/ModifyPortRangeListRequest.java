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
 * {@link ModifyPortRangeListRequest} extends {@link RequestModel}
 *
 * <p>ModifyPortRangeListRequest</p>
 */
public class ModifyPortRangeListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddEntry")
    private java.util.List<AddEntry> addEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("PortRangeListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portRangeListId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRangeListName")
    private String portRangeListName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveEntry")
    private java.util.List<RemoveEntry> removeEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyPortRangeListRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.addEntry = builder.addEntry;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portRangeListId = builder.portRangeListId;
        this.portRangeListName = builder.portRangeListName;
        this.regionId = builder.regionId;
        this.removeEntry = builder.removeEntry;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPortRangeListRequest create() {
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
    public java.util.List<AddEntry> getAddEntry() {
        return this.addEntry;
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
     * @return portRangeListId
     */
    public String getPortRangeListId() {
        return this.portRangeListId;
    }

    /**
     * @return portRangeListName
     */
    public String getPortRangeListName() {
        return this.portRangeListName;
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
    public java.util.List<RemoveEntry> getRemoveEntry() {
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

    public static final class Builder extends Request.Builder<ModifyPortRangeListRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<AddEntry> addEntry; 
        private String clientToken; 
        private String description; 
        private String ownerAccount; 
        private Long ownerId; 
        private String portRangeListId; 
        private String portRangeListName; 
        private String regionId; 
        private java.util.List<RemoveEntry> removeEntry; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPortRangeListRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.addEntry = request.addEntry;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portRangeListId = request.portRangeListId;
            this.portRangeListName = request.portRangeListName;
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
         * <p>The entries that you want to add or modify for the port list.</p>
         */
        public Builder addEntry(java.util.List<AddEntry> addEntry) {
            this.putQueryParameter("AddEntry", addEntry);
            this.addEntry = addEntry;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the port list. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The ID of the port list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prl-2ze9743****</p>
         */
        public Builder portRangeListId(String portRangeListId) {
            this.putQueryParameter("PortRangeListId", portRangeListId);
            this.portRangeListId = portRangeListId;
            return this;
        }

        /**
         * <p>The name of the port list. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http://, https://, com.aliyun, or com.alibabacloud. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>PortRangeListNameSample</p>
         */
        public Builder portRangeListName(String portRangeListName) {
            this.putQueryParameter("PortRangeListName", portRangeListName);
            this.portRangeListName = portRangeListName;
            return this;
        }

        /**
         * <p>The region ID of the port list. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The entries that you want to remove from the port list.</p>
         */
        public Builder removeEntry(java.util.List<RemoveEntry> removeEntry) {
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
        public ModifyPortRangeListRequest build() {
            return new ModifyPortRangeListRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPortRangeListRequest} extends {@link TeaModel}
     *
     * <p>ModifyPortRangeListRequest</p>
     */
    public static class AddEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        private AddEntry(Builder builder) {
            this.description = builder.description;
            this.portRange = builder.portRange;
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
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        public static final class Builder {
            private String description; 
            private String portRange; 

            private Builder() {
            } 

            private Builder(AddEntry model) {
                this.description = model.description;
                this.portRange = model.portRange;
            } 

            /**
             * <p>The description of the port range in entry N. The description must be 2 to 32 characters in length and cannot start with http:// or https://. Valid values of N: 0 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The port range in entry N. Valid values of N: 0 to 200. Take note of the following limits:</p>
             * <ul>
             * <li>The total number of entries in the port list cannot exceed the <code>MaxEntries</code> value.</li>
             * <li><code>PortRange</code> in different entries cannot be duplicated.</li>
             * <li>The value of this parameter cannot be the same as the value of <code>RemoveEntry.N.PortRange</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            public AddEntry build() {
                return new AddEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyPortRangeListRequest} extends {@link TeaModel}
     *
     * <p>ModifyPortRangeListRequest</p>
     */
    public static class RemoveEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        private RemoveEntry(Builder builder) {
            this.portRange = builder.portRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveEntry create() {
            return builder().build();
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        public static final class Builder {
            private String portRange; 

            private Builder() {
            } 

            private Builder(RemoveEntry model) {
                this.portRange = model.portRange;
            } 

            /**
             * <p>The port range in entry N. Valid values of N: 0 to 200. Take note of the following limits:</p>
             * <ul>
             * <li><code>PortRange</code> in different entries cannot be duplicated.</li>
             * <li>The value of this parameter cannot be the same as the value of <code>AddEntry.N.PortRange</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            public RemoveEntry build() {
                return new RemoveEntry(this);
            } 

        } 

    }
}
