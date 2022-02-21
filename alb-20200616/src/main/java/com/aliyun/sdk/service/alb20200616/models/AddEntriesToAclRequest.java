// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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

    private AddEntriesToAclRequest(Builder builder) {
        super(builder);
        this.aclEntries = builder.aclEntries;
        this.aclId = builder.aclId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
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

    public static final class Builder extends Request.Builder<AddEntriesToAclRequest, Builder> {
        private java.util.List < AclEntries> aclEntries; 
        private String aclId; 
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(AddEntriesToAclRequest response) {
            super(response);
            this.aclEntries = response.aclEntries;
            this.aclId = response.aclId;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
        } 

        /**
         * 条目信息列表
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.putQueryParameter("AclEntries", aclEntries);
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * AclId
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * 幂等Token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * dryRun
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public AddEntriesToAclRequest build() {
            return new AddEntriesToAclRequest(this);
        } 

    } 

    public static class AclEntries extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Entry")
        @Validation(required = true)
        private String entry;

        private AclEntries(Builder builder) {
            this.description = builder.description;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
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
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String description; 
            private String entry; 

            /**
             * 描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 条目
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
}
