// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDcdnWafPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnWafPolicyRequest</p>
 */
public class CreateDcdnWafPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    private CreateDcdnWafPolicyRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.policyName = builder.policyName;
        this.policyStatus = builder.policyStatus;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnWafPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScene
     */
    public String getDefenseScene() {
        return this.defenseScene;
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

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<CreateDcdnWafPolicyRequest, Builder> {
        private String defenseScene; 
        private String policyName; 
        private String policyStatus; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnWafPolicyRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.policyName = request.policyName;
            this.policyStatus = request.policyStatus;
            this.policyType = request.policyType;
        } 

        /**
         * <p>The type of the WAF protection policy. Valid values:</p>
         * <ul>
         * <li>waf_group: basic web protection</li>
         * <li>custom_acl: custom protection</li>
         * <li>whitelist: IP address whitelist</li>
         * <li>ip_blacklist: IP address blacklist</li>
         * <li>region_block: region blacklist</li>
         * <li>bot: bot management</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        public Builder defenseScene(String defenseScene) {
            this.putBodyParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * <p>The name of the protection policy. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter is required.</p>
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
         * <p>The status of the protection policy. Valid values:</p>
         * <ul>
         * <li>on: The policy is enabled.</li>
         * <li>off: The policy is disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder policyStatus(String policyStatus) {
            this.putBodyParameter("PolicyStatus", policyStatus);
            this.policyStatus = policyStatus;
            return this;
        }

        /**
         * <p>Specifies whether to set the current policy as the default policy. Valid values:</p>
         * <ul>
         * <li>default: sets the current policy as the default policy.</li>
         * <li>custom: does not set the current policy as the default policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public CreateDcdnWafPolicyRequest build() {
            return new CreateDcdnWafPolicyRequest(this);
        } 

    } 

}
