// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDcdnWafPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDcdnWafPolicyRequest</p>
 */
public class ModifyDcdnWafPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyStatus")
    private String policyStatus;

    private ModifyDcdnWafPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.policyStatus = builder.policyStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDcdnWafPolicyRequest create() {
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyStatus
     */
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDcdnWafPolicyRequest, Builder> {
        private Long policyId; 
        private String policyName; 
        private String policyStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDcdnWafPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.policyStatus = request.policyStatus;
        } 

        /**
         * <p>The ID of the protection policy that you want to modify. You can specify only one ID in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        public Builder policyId(Long policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The new name of the protection policy.</p>
         * <blockquote>
         * <p>You must specify PolicyName or PolicyStatus.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The new status of the protection policy. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * <blockquote>
         * <p>You must specify PolicyName or PolicyStatus.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder policyStatus(String policyStatus) {
            this.putBodyParameter("PolicyStatus", policyStatus);
            this.policyStatus = policyStatus;
            return this;
        }

        @Override
        public ModifyDcdnWafPolicyRequest build() {
            return new ModifyDcdnWafPolicyRequest(this);
        } 

    } 

}
