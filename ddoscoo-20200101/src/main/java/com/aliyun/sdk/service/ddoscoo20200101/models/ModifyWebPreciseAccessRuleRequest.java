// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
         * <p>The domain of the website.</p>
         * <blockquote>
         * <p>You must configure a forwarding rule for the domain. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domains.</p>
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
         * <p>The validity period of the rule, in seconds. This parameter applies only when <strong>action</strong> is set to <strong>block</strong>. Requests that match the rule are blocked for the specified duration. If you do not specify this parameter, the rule is permanently effective.</p>
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
         * <p>The ID of the resource group to which the Anti-DDoS Pro instance belongs. If you do not specify this parameter, the instance belongs to the default resource group.</p>
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
         * <p>The configuration of the precise access control rule, specified as a JSON-formatted string. The string has the following structure:</p>
         * <ul>
         * <li><p><strong>action</strong>: String. Required. The action to perform on matching requests. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: Allows the request.</p>
         * </li>
         * <li><p><strong>block</strong>: Blocks the request.</p>
         * </li>
         * <li><p><strong>challenge</strong>: Initiates a challenge to verify the request.</p>
         * </li>
         * <li><p><strong>watch</strong>: Monitors the request.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>name</strong>: String. Required. The name of the rule.</p>
         * </li>
         * <li><p><strong>condition</strong>: Map. Required. The match conditions. The structure is as follows:</p>
         * <blockquote>
         * <p>If you specify multiple match conditions, they are evaluated with a logical AND.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>field</strong>: String. Required. The match field.</p>
         * </li>
         * <li><p><strong>match_method</strong>: String. Required. The match method.</p>
         * <blockquote>
         * <p>For information about the valid values for <strong>field</strong> and <strong>match_method</strong>, see the &quot;Additional information about request parameters&quot; section.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>content</strong>: String. The value to match. You can specify either this parameter or <code>content_list</code>.</p>
         * </li>
         * <li><p><strong>content_list</strong>: String. A list of values to match. You can specify either this parameter or <code>content</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For information about the valid values for <strong>match_method</strong> and <strong>content/content_list</strong>, see the &quot;Additional information about request parameters&quot; section.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>header_name</strong>: String. Optional. The name of the request header. This parameter applies only when <strong>field</strong> is set to <strong>header</strong>.</p>
         * </li>
         * <li><p><strong>case_insensitive</strong>: Boolean. Optional. The default value is false. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: case-sensitive</p>
         * </li>
         * <li><p><strong>true</strong>: case-insensitive</p>
         * </li>
         * </ul>
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
