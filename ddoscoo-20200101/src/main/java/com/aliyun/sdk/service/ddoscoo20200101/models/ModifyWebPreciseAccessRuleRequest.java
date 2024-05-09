// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPreciseAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebPreciseAccessRuleRequest</p>
 */
public class ModifyWebPreciseAccessRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expires")
    private Integer expires;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    private ModifyWebPreciseAccessRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.expires = builder.expires;
        this.resourceGroupId = builder.resourceGroupId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebPreciseAccessRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return expires
     */
    public Integer getExpires() {
        return this.expires;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifyWebPreciseAccessRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Integer expires; 
        private String resourceGroupId; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebPreciseAccessRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.expires = request.expires;
            this.resourceGroupId = request.resourceGroupId;
            this.rules = request.rules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The validity period of the rule. Unit: seconds. This parameter takes effect only when **action** of a rule is **block**. Access requests that match the rule are blocked within the specified validity period of the rule. If you do not specify this parameter, this rule takes effect all the time.
         */
        public Builder expires(Integer expires) {
            this.putQueryParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The settings of the accurate access control rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:
         * <p>
         * 
         * *   **action**: the action that is performed if the rule is matched. This field is required and must be of the string type. Valid values:
         * 
         *     *   **accept**: allows the requests that match the rule.
         *     *   **block**: blocks the requests that match the rule.
         *     *   **challenge**: implements a CAPTCHA for the requests that match the rule.
         * 
         * *   **name**: the name of the rule. This field is required and must be of the string type.
         * 
         * *   **condition**: the match conditions. This field is required and must be of the map type. A match condition contains the following parameters.
         * 
         *     **
         * 
         *     **Note**The AND logical operator is used to define the relationship among multiple match conditions.
         * 
         *     *   **field**: the match field. This parameter is required and must be of the string type.
         * 
         *     *   **match_method**: the logical relation. This parameter is required and must be of the string type.
         * 
         *         **
         * 
         *         **Note**For information about the mappings between the **field** and **match_method** parameters, see the Mappings between the field and match_method parameters table in this topic.
         * 
         *     *   **content**: the match content. This parameter is required and must be of the string type.
         * 
         * *   **header_name**: the HTTP header. This parameter is optional and must be of the string type. This parameter takes effect only when **field** is **header**.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifyWebPreciseAccessRuleRequest build() {
            return new ModifyWebPreciseAccessRuleRequest(this);
        } 

    } 

}
