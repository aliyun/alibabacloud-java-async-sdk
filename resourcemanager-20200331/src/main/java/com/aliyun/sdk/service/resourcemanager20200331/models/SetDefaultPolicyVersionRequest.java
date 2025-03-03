// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link SetDefaultPolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultPolicyVersionRequest</p>
 */
public class SetDefaultPolicyVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private SetDefaultPolicyVersionRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultPolicyVersionRequest create() {
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

    public static final class Builder extends Request.Builder<SetDefaultPolicyVersionRequest, Builder> {
        private String policyName; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultPolicyVersionRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The name of the policy.</p>
         * <p>The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the policy version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public SetDefaultPolicyVersionRequest build() {
            return new SetDefaultPolicyVersionRequest(this);
        } 

    } 

}
