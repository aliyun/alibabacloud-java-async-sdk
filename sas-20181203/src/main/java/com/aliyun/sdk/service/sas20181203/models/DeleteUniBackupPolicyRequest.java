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
 * {@link DeleteUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteUniBackupPolicyRequest</p>
 */
public class DeleteUniBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
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
         * <p>The ID of the anti-ransomware policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the IDs of anti-ransomware policies. You must specify at least one of the PolicyId parameter and the <strong>PolicyIds</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The IDs of anti-ransomware policies.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the IDs of anti-ransomware policies. You must specify at least one of the <strong>PolicyId</strong> parameter and the PolicyIds parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123,124</p>
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
