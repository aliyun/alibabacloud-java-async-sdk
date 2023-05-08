// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupPolicyDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniBackupPolicyDetailRequest</p>
 */
public class DescribeUniBackupPolicyDetailRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
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
         * $.parameters[2].schema.enumValueTitles
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
