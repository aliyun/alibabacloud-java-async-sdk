// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    private DeleteUniBackupPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUniBackupPolicyRequest create() {
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
     * @return policyIds
     */
    public String getPolicyIds() {
        return this.policyIds;
    }

    public static final class Builder extends Request.Builder<DeleteUniBackupPolicyRequest, Builder> {
        private Long policyId; 
        private String policyIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUniBackupPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyIds = request.policyIds;
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
         * PolicyIds.
         */
        public Builder policyIds(String policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public DeleteUniBackupPolicyRequest build() {
            return new DeleteUniBackupPolicyRequest(this);
        } 

    } 

}
