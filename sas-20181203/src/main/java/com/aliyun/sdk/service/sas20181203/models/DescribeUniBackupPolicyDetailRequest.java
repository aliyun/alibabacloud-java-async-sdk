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
 * {@link DescribeUniBackupPolicyDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniBackupPolicyDetailRequest</p>
 */
public class DescribeUniBackupPolicyDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private DescribeUniBackupPolicyDetailRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupPolicyDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DescribeUniBackupPolicyDetailRequest, Builder> {
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUniBackupPolicyDetailRequest request) {
            super(request);
            this.policyId = request.policyId;
        } 

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the IDs of anti-ransomware policies.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribeUniBackupPolicyDetailRequest build() {
            return new DescribeUniBackupPolicyDetailRequest(this);
        } 

    } 

}
