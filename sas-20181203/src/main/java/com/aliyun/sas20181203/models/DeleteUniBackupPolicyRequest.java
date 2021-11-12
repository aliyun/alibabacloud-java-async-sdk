// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteUniBackupPolicyRequest</p>
 */
public class DeleteUniBackupPolicyRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    private Long policyId;

    @Query
    @NameInMap("PolicyIds")
    private String policyIds;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private DeleteUniBackupPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyIds = builder.policyIds;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUniBackupPolicyRequest create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyIds
     */
    public String getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder {
        private Long policyId; 
        private String policyIds; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        /**
         * <p>PolicyId.</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>PolicyIds.</p>
         */
        public Builder policyIds(String policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public DeleteUniBackupPolicyRequest build() {
            return new DeleteUniBackupPolicyRequest(this);
        } 

    } 

}
