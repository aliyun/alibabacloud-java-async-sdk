// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPolicyRequest</p>
 */
public class DeleteBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
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
         * <p>The ID of the mitigation policies that you want to delete.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The version of the mitigation policies that you want to delete. You can invoke the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query this parameter. Valid values:</p>
         * <ul>
         * <li><strong>1.0.0</strong>: The mitigation policies version is 1.0.0.</li>
         * <li><strong>2.0.0</strong>: The mitigation policies version is 2.0.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
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
