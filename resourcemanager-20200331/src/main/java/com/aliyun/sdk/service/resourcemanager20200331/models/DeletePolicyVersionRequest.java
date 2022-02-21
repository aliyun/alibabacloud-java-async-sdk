// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyVersionRequest</p>
 */
public class DeletePolicyVersionRequest extends Request {
    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private DeletePolicyVersionRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DeletePolicyVersionRequest, Builder> {
        private String policyName; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyVersionRequest response) {
            super(response);
            this.policyName = response.policyName;
            this.versionId = response.versionId;
        } 

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeletePolicyVersionRequest build() {
            return new DeletePolicyVersionRequest(this);
        } 

    } 

}
