// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Policy")
    @Validation(required = true)
    private java.util.Map < String, ? > policy;

    @Query
    @NameInMap("PolicyRegionId")
    private String policyRegionId;

    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    @Query
    @NameInMap("UuidList")
    @Validation(required = true)
    private java.util.List < String > uuidList;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.policy = builder.policy;
        this.policyRegionId = builder.policyRegionId;
        this.policyVersion = builder.policyVersion;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public java.util.Map < String, ? > getPolicy() {
        return this.policy;
    }

    /**
     * @return policyRegionId
     */
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private Long id; 
        private String name; 
        private java.util.Map < String, ? > policy; 
        private String policyRegionId; 
        private String policyVersion; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest response) {
            super(response);
            this.id = response.id;
            this.name = response.name;
            this.policy = response.policy;
            this.policyRegionId = response.policyRegionId;
            this.policyVersion = response.policyVersion;
            this.uuidList = response.uuidList;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(java.util.Map < String, ? > policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * PolicyRegionId.
         */
        public Builder policyRegionId(String policyRegionId) {
            this.putQueryParameter("PolicyRegionId", policyRegionId);
            this.policyRegionId = policyRegionId;
            return this;
        }

        /**
         * PolicyVersion.
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
