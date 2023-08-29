// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnWafPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnWafPolicyRequest</p>
 */
public class CreateDcdnWafPolicyRequest extends Request {
    @Body
    @NameInMap("DefenseScene")
    @Validation(required = true)
    private String defenseScene;

    @Body
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Body
    @NameInMap("PolicyStatus")
    @Validation(required = true)
    private String policyStatus;

    @Body
    @NameInMap("PolicyType")
    @Validation(required = true)
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
         * The type of the WAF protection policy. Valid values:
         * <p>
         * 
         * *   waf_group: basic web protection
         * *   custom_acl: custom protection
         * *   whitelist: IP address whitelist
         * *   ip_blacklist: IP address blacklist
         * *   region_block: region blacklist
         * *   bot: bot management
         */
        public Builder defenseScene(String defenseScene) {
            this.putBodyParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * The name of the protection policy. The name can be up to 64 characters in length and can contain letters, digits, and underscores (\_).
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The status of the protection policy. Valid values:
         * <p>
         * 
         * *   on: The policy is enabled.
         * *   off: The policy is disabled.
         */
        public Builder policyStatus(String policyStatus) {
            this.putBodyParameter("PolicyStatus", policyStatus);
            this.policyStatus = policyStatus;
            return this;
        }

        /**
         * Specifies whether to set the current policy as the default policy. Valid values:
         * <p>
         * 
         * *   default: sets the current policy as the default policy.
         * *   custom: does not set the current policy as the default policy.
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
