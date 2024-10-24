// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The validity period of the rule. Unit: seconds. This parameter takes effect only when <strong>action</strong> of a rule is <strong>block</strong>. Access requests that match the rule are blocked within the specified validity period of the rule. If you do not specify this parameter, this rule takes effect all the time.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder expires(Integer expires) {
            this.putQueryParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The settings of the accurate access control rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
         * <ul>
         * <li><p><strong>action</strong>: the action that is performed if the rule is matched. This field is required and must be of the string type. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the requests that match the rule.</li>
         * <li><strong>block</strong>: blocks the requests that match the rule.</li>
         * <li><strong>challenge</strong>: implements a CAPTCHA for the requests that match the rule.</li>
         * </ul>
         * </li>
         * <li><p><strong>name</strong>: the name of the rule. This field is required and must be of the string type.</p>
         * </li>
         * <li><p><strong>condition</strong>: the match conditions. This field is required and must be of the map type. A match condition contains the following parameters.</p>
         * <p>**</p>
         * <p><strong>Note</strong>The AND logical operator is used to define the relationship among multiple match conditions.</p>
         * <ul>
         * <li><p><strong>field</strong>: the match field. This parameter is required and must be of the string type.</p>
         * </li>
         * <li><p><strong>match_method</strong>: the logical relation. This parameter is required and must be of the string type.</p>
         * <p>**</p>
         * <p><strong>Note</strong>For information about the mappings between the <strong>field</strong> and <strong>match_method</strong> parameters, see the Mappings between the field and match_method parameters table in this topic.</p>
         * </li>
         * <li><p><strong>content</strong>: the match content. This parameter is required and must be of the string type.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>header_name</strong>: the HTTP header. This parameter is optional and must be of the string type. This parameter takes effect only when <strong>field</strong> is <strong>header</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;action&quot;:&quot;block&quot;,&quot;name&quot;:&quot;testrule&quot;,&quot;condition&quot;:[{&quot;field&quot;:&quot;uri&quot;,&quot;match_method&quot;:&quot;contain&quot;,&quot;content&quot;:&quot;/test/123&quot;}]}]</p>
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
