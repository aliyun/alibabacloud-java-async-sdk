// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPolicyRequest</p>
 */
public class DeleteBackupPolicyRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    private DeleteBackupPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.policyVersion = builder.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPolicyRequest create() {
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
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public static final class Builder extends Request.Builder<DeleteBackupPolicyRequest, Builder> {
        private Long id; 
        private String policyVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPolicyRequest request) {
            super(request);
            this.id = request.id;
            this.policyVersion = request.policyVersion;
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
         * PolicyVersion.
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        @Override
        public DeleteBackupPolicyRequest build() {
            return new DeleteBackupPolicyRequest(this);
        } 

    } 

}
