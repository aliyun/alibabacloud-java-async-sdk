// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPolicyMachineRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPolicyMachineRequest</p>
 */
public class DeleteBackupPolicyMachineRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private Long policyId;

    @Query
    @NameInMap("PolicyVersion")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteBackupPolicyMachineRequest, Builder> {
        private Long policyId; 
        private String policyVersion; 
        private String uuid; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPolicyMachineRequest response) {
            super(response);
            this.policyId = response.policyId;
            this.policyVersion = response.policyVersion;
            this.uuid = response.uuid;
            this.uuidList = response.uuidList;
        } 

        /**
         * PolicyId.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
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
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
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
        public DeleteBackupPolicyMachineRequest build() {
            return new DeleteBackupPolicyMachineRequest(this);
        } 

    } 

}
