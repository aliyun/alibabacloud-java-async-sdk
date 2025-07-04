// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyVersionRequest</p>
 */
public class DeletePolicyVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
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

        private Builder(DeletePolicyVersionRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-Administrator</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The ID of the policy version that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
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
