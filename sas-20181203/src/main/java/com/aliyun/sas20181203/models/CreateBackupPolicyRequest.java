// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPolicyRequest</p>
 */
public class CreateBackupPolicyRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Policy")
    private java.util.Map < String, ? > policy;

    @Query
    @NameInMap("PolicyRegionId")
    private String policyRegionId;

    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    @Query
    @NameInMap("UuidList")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String name; 
        private java.util.Map < String, ? > policy; 
        private String policyRegionId; 
        private String policyVersion; 
        private java.util.List < String > uuidList; 

        /**
         * <p>Name.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Policy.</p>
         */
        public Builder policy(java.util.Map < String, ? > policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>PolicyRegionId.</p>
         */
        public Builder policyRegionId(String policyRegionId) {
            this.putQueryParameter("PolicyRegionId", policyRegionId);
            this.policyRegionId = policyRegionId;
            return this;
        }

        /**
         * <p>PolicyVersion.</p>
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>UuidList.</p>
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        public CreateBackupPolicyRequest build() {
            return new CreateBackupPolicyRequest(this);
        } 

    } 

}
