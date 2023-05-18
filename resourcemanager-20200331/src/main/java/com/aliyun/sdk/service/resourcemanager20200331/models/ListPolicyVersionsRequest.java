// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyVersionsRequest</p>
 */
public class ListPolicyVersionsRequest extends Request {
    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("PolicyType")
    @Validation(required = true)
    private String policyType;

    private ListPolicyVersionsRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyVersionsRequest create() {
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
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<ListPolicyVersionsRequest, Builder> {
        private String policyName; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyVersionsRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.policyType = request.policyType;
        } 

        /**
         * The name of the policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The type of the policy. Valid values:
         * <p>
         * 
         * *   Custom: custom policy
         * *   System: system policy
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListPolicyVersionsRequest build() {
            return new ListPolicyVersionsRequest(this);
        } 

    } 

}
