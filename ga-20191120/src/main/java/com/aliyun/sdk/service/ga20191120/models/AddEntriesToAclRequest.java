// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEntriesToAclRequest} extends {@link RequestModel}
 *
 * <p>AddEntriesToAclRequest</p>
 */
public class AddEntriesToAclRequest extends Request {
    @Query
    @NameInMap("AclEntries")
    @Validation(required = true)
    private java.util.List < AclEntries> aclEntries;

    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddEntriesToAclRequest(Builder builder) {
        super(builder);
        this.aclEntries = builder.aclEntries;
        this.aclId = builder.aclId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEntriesToAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntries
     */
    public java.util.List < AclEntries> getAclEntries() {
        return this.aclEntries;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddEntriesToAclRequest, Builder> {
        private java.util.List < AclEntries> aclEntries; 
        private String aclId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddEntriesToAclRequest response) {
            super(response);
            this.aclEntries = response.aclEntries;
            this.aclId = response.aclId;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.regionId = response.regionId;
        } 

        /**
         * AclEntries.
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.putQueryParameter("AclEntries", aclEntries);
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddEntriesToAclRequest build() {
            return new AddEntriesToAclRequest(this);
        } 

    } 

    public static class AclEntries extends TeaModel {
        @NameInMap("Entry")
        private String entry;

        @NameInMap("EntryDescription")
        private String entryDescription;

        private AclEntries(Builder builder) {
            this.entry = builder.entry;
            this.entryDescription = builder.entryDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        /**
         * @return entryDescription
         */
        public String getEntryDescription() {
            return this.entryDescription;
        }

        public static final class Builder {
            private String entry; 
            private String entryDescription; 

            /**
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            /**
             * EntryDescription.
             */
            public Builder entryDescription(String entryDescription) {
                this.entryDescription = entryDescription;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
}
