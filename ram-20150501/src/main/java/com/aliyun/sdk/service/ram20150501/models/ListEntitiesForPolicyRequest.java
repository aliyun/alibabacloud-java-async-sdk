// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntitiesForPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListEntitiesForPolicyRequest</p>
 */
public class ListEntitiesForPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    private ListEntitiesForPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntitiesForPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<ListEntitiesForPolicyRequest, Builder> {
        private String policyName; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListEntitiesForPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.policyType = request.policyType;
        } 

        /**
         * The name of the policy.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The type of the policy. Valid values: `System` and `Custom`.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListEntitiesForPolicyRequest build() {
            return new ListEntitiesForPolicyRequest(this);
        } 

    } 

}
