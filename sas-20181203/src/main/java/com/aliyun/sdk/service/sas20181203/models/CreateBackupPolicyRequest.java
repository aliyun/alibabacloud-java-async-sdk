// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPolicyRequest</p>
 */
public class CreateBackupPolicyRequest extends Request {
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
    @Validation(required = true)
    private String policyVersion;

    @Query
    @NameInMap("UuidList")
    @Validation(required = true)
    private java.util.List < String > uuidList;

    private CreateBackupPolicyRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.policy = builder.policy;
        this.policyRegionId = builder.policyRegionId;
        this.policyVersion = builder.policyVersion;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateBackupPolicyRequest, Builder> {
        private String name; 
        private java.util.Map < String, ? > policy; 
        private String policyRegionId; 
        private String policyVersion; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPolicyRequest request) {
            super(request);
            this.name = request.name;
            this.policy = request.policy;
            this.policyRegionId = request.policyRegionId;
            this.policyVersion = request.policyVersion;
            this.uuidList = request.uuidList;
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
        public CreateBackupPolicyRequest build() {
            return new CreateBackupPolicyRequest(this);
        } 

    } 

}
