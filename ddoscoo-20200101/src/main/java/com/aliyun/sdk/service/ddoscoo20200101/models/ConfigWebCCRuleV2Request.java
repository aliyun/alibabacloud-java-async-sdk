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
 * {@link ConfigWebCCRuleV2Request} extends {@link RequestModel}
 *
 * <p>ConfigWebCCRuleV2Request</p>
 */
public class ConfigWebCCRuleV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expires")
    private Long expires;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleList;

    private ConfigWebCCRuleV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.expires = builder.expires;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigWebCCRuleV2Request create() {
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
    public Long getExpires() {
        return this.expires;
    }

    /**
     * @return ruleList
     */
    public String getRuleList() {
        return this.ruleList;
    }

    public static final class Builder extends Request.Builder<ConfigWebCCRuleV2Request, Builder> {
        private String regionId; 
        private String domain; 
        private Long expires; 
        private String ruleList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigWebCCRuleV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.expires = request.expires;
            this.ruleList = request.ruleList;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Expires.
         */
        public Builder expires(Long expires) {
            this.putQueryParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * <p>The frequency control rule. This parameter is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>action</strong>: the action that is performed if the rule is matched. This field is required and must be of the string type. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: The requests that match the rule are blocked.</li>
         * <li><strong>challenge</strong>: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.</li>
         * <li><strong>watch</strong>: The requests that match the rule are recorded in logs and allowed.</li>
         * </ul>
         * </li>
         * <li><p><strong>name</strong>: the name of the rule. This field is required and must be of the string type.</p>
         * </li>
         * <li><p><strong>condition</strong>: the match conditions. This field is required and must be of the map type. This field contains the following parameters:</p>
         * <p>**</p>
         * <p><strong>Note</strong> The AND logical operator is used to evaluate multiple match conditions.</p>
         * <ul>
         * <li><p><strong>field</strong>: the match field. This field is required and must be of the string type.</p>
         * </li>
         * <li><p><strong>match_method</strong>: the logical relation. This field is required and must be of the string type.</p>
         * <p>**</p>
         * <p><strong>Note</strong> For information about the mappings between the <strong>field</strong> and <strong>match_method</strong> parameters, see the &quot;Mappings between the field and match_method parameters&quot; section of this topic.</p>
         * </li>
         * <li><p><strong>header_name</strong>: the name of the custom HTTP header. This field is optional and must be of the string type.</p>
         * <p>**</p>
         * <p><strong>Note</strong> This field is required only when <strong>field</strong> is set to <strong>header</strong>.</p>
         * </li>
         * <li><p><strong>content</strong>: the match content. This field is required and must be of the string type.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>ratelimit</strong>: the frequency control field. This field is optional and must be of the string type. The frequency can be measured based on IP addresses or custom headers. This field contains the following parameters:</p>
         * <ul>
         * <li><strong>interval</strong>: the statistical duration. Unit: seconds. This field is required and must be of the integer type.</li>
         * <li><strong>ttl</strong>: the period during which the specified action is performed. Unit: seconds. This field is required and must be of the integer type.</li>
         * <li><strong>threshold</strong>: the threshold. This field is required and must be of the integer type.</li>
         * <li><strong>subkey</strong>: the name of the field. This field is optional and must be of the string type. This field is required only when target is set to header.</li>
         * <li><strong>target</strong>: the statistical source. This field is required and must be of the string type. Valid values: ip and header.</li>
         * </ul>
         * </li>
         * <li><p><strong>status_code</strong>: the frequency control field. This field is optional and must be of the string type. Frequency control can be performed based on the quantity or percentage of status codes. This field contains the following parameters:</p>
         * <ul>
         * <li><strong>enabled</strong>: specifies whether to enable status code statistics. This field is required and must be of the Boolean type.</li>
         * <li><strong>code</strong>: the status code. This field is required and must be of the integer type. Valid values: <strong>100</strong> to <strong>599</strong>.</li>
         * <li><strong>use_ratio</strong>: specifies whether to use a ratio. This field is required and must be of the Boolean type. To use a ratio, set this field to true.</li>
         * <li><strong>ratio_threshold</strong>: the ratio of the status code. This field is optional and must be of the integer type. If a ratio is used, the action specified in the rule is performed only when the ratio of the status code reaches <strong>ratio_threshold</strong>. Valid values: <strong>1</strong> to <strong>100</strong>.</li>
         * <li><strong>count_threshold</strong>: the quantity of the status code. This field is optional and must be of the integer type. If a ratio is not used, the action specified in the rule is performed only when the quantity of the status code reaches <strong>count_threshold</strong>. Valid values: <strong>2</strong> to <strong>50000</strong>.</li>
         * </ul>
         * </li>
         * <li><p><strong>statistics</strong>: specifies whether deduplication is used for statistics. This field is optional and must be of the string type. By default, deduplication is not used for statistics. This field contains the following parameters:</p>
         * <ul>
         * <li><p><strong>mode</strong>: specifies whether deduplication is used for status code statistics. This field is required and must be of the string type. Valid values:</p>
         * <ul>
         * <li><strong>count</strong>: Deduplication is not used for statistics.</li>
         * <li><strong>distinct</strong>: Deduplication is used for statistics.</li>
         * </ul>
         * </li>
         * <li><p><strong>field</strong>: the statistical source. This field is required and must be of the string type. Valid values: ip, header, and uri.</p>
         * </li>
         * <li><p><strong>header_name</strong>: the name of the header. This field is optional and must be of the string type. This field is required only when field is set to header.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;action&quot;:&quot;block&quot;,&quot;name&quot;:&quot;trdsss&quot;,&quot;ratelimit&quot;:{&quot;interval&quot;:60,&quot;ttl&quot;:300,&quot;threshold&quot;:70,&quot;target&quot;:&quot;ip&quot;},&quot;condition&quot;:[{&quot;field&quot;:&quot;ip&quot;,&quot;match_method&quot;:&quot;belong&quot;,&quot;content&quot;:&quot;1.1.1.1&quot;}]}]</p>
         */
        public Builder ruleList(String ruleList) {
            this.putQueryParameter("RuleList", ruleList);
            this.ruleList = ruleList;
            return this;
        }

        @Override
        public ConfigWebCCRuleV2Request build() {
            return new ConfigWebCCRuleV2Request(this);
        } 

    } 

}
