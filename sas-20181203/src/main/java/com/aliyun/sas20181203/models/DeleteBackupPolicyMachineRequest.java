// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteBackupPolicyMachineRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPolicyMachineRequest</p>
 */
public class DeleteBackupPolicyMachineRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    private Long policyId;

    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;


    private DeleteBackupPolicyMachineRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyVersion = builder.policyVersion;
        this.uuid = builder.uuid;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPolicyMachineRequest create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder {
        private Long policyId; 
        private String policyVersion; 
        private String uuid; 
        private java.util.List < String > uuidList; 

        /**
         * <p>PolicyId.</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
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
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
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

        public DeleteBackupPolicyMachineRequest build() {
            return new DeleteBackupPolicyMachineRequest(this);
        } 

    } 

}
