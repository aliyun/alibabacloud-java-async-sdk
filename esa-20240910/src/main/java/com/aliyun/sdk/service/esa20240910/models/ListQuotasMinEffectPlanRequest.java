// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListQuotasMinEffectPlanRequest} extends {@link RequestModel}
 *
 * <p>ListQuotasMinEffectPlanRequest</p>
 */
public class ListQuotasMinEffectPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListQuotasMinEffectPlanRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.quotaNames = builder.quotaNames;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasMinEffectPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return quotaNames
     */
    public String getQuotaNames() {
        return this.quotaNames;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListQuotasMinEffectPlanRequest, Builder> {
        private String instanceId; 
        private String quotaNames; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasMinEffectPlanRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.quotaNames = request.quotaNames;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The plan instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the instance ID. You must specify at least one of this parameter and SiteId.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-aug976vv2u4g</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The plan quota names, separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>waf:phase:http_anti_scan:actions</strong>: WAF scan protection - action enumeration.</li>
         * <li><strong>waf:phase:http_bot:actions</strong>: WAF bot management - all action enumeration.</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc_dev:characteristic:fields</strong>: WAF bot management - custom device rate limiting statistical object enumeration.</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc_ip:characteristic:fields</strong>: WAF bot management - custom IP rate limiting statistical object enumeration.</li>
         * <li><strong><strong>waf:phase:http_bot:match:symbols</strong></strong>: WAF bot management - match operator enumeration.</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc:characteristic:fields</strong>: WAF bot management - custom session rate limiting statistical object enumeration.</li>
         * <li><strong>waf:phase:http_bot:match:fields</strong>: WAF bot management - match field enumeration.</li>
         * <li><strong>waf:phase:http_whitelist:match:symbols</strong>: WAF whitelist - match operator enumeration.</li>
         * <li><strong>waf:phase:http_whitelist:match:fields</strong>: WAF whitelist - match field enumeration.</li>
         * <li><strong>waf:phase:http_anti_scan:http_directory_traversal:characteristic:fields</strong>: WAF scan protection - folder traverse blocking statistical object enumeration.</li>
         * <li><strong>waf:phase:http_anti_scan:http_high_frequency:characteristic:fields</strong>: WAF scan protection - high-frequency scan blocking statistical object enumeration.</li>
         * <li><strong>waf:phase:http_anti_scan:match:symbols</strong>: WAF scan protection - match operator enumeration.</li>
         * <li><strong>waf:phase:http_anti_scan:match:fields</strong>: WAF scan protection - match field enumeration.</li>
         * <li><strong>waf:phase:http_managed:actions</strong>: WAF managed rules - action enumeration.</li>
         * <li><strong>waf:phase:http_managed:group:reference:ids</strong>: WAF managed rules - referenced rule group enumeration.</li>
         * <li><strong>waf:phase:http_ratelimit:actions</strong>: WAF rate limiting - action enumeration.</li>
         * <li><strong>waf:phase:http_ratelimit:ttls</strong>: WAF rate limiting - duration enumeration.</li>
         * <li><strong>waf:phase:http_ratelimit:intervals</strong>: WAF rate limiting - statistical period.</li>
         * <li><strong>waf:phase:http_ratelimit:http_ratelimit:characteristic:fields</strong>: WAF rate limiting - control type rule match characteristic enumeration.</li>
         * <li><strong>waf:phase:http_ratelimit:match:symbols</strong>: WAF rate limiting rule phase match operator enumeration.</li>
         * <li><strong>waf:phase:http_ratelimit:match:fields</strong>: WAF rate limiting rule phase match field enumeration.</li>
         * <li><strong>waf:phase:http_custom:actions</strong>: WAF custom rule phase action enumeration.</li>
         * <li><strong>waf:phase:http_custom:match:symbols</strong>: WAF custom rule phase match operator enumeration.</li>
         * <li><strong>waf:phase:http_custom:match:fields</strong>: WAF custom rule phase match field.</li>
         * <li><strong>waiting_room|queuing_method</strong>: waiting room - queuing method.</li>
         * <li><strong>origin_rules|origin_scheme</strong>: back-to-origin rule - back-to-origin protocol.</li>
         * <li><strong>origin_rules|origin_sni</strong>: back-to-origin rule - back-to-origin SNI.</li>
         * <li><strong>origin_rules|origin_host</strong>: back-to-origin rule - back-to-origin host.</li>
         * <li><strong>fourlayeracceleration</strong>: Layer 4 acceleration.</li>
         * <li><strong>rtlog_service</strong>: real-time log feature switch.</li>
         * <li><strong>dashboard_traffic</strong>: value-added capability for network traffic analysis.</li>
         * <li><strong>custom_name_server</strong>: custom NS name.</li>
         * <li><strong>waf:phase:http_bot:enable</strong>: WAF bot management switch.</li>
         * <li><strong>waf:phase:http_whitelist:enable</strong>: WAF whitelist switch.</li>
         * <li><strong>instantlog</strong>: instant log active or not.</li>
         * <li><strong>waf:phase:http_anti_scan:enable</strong>: WAF scan protection switch.</li>
         * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: WAF managed rules - referenced rule group configuration switch.</li>
         * <li><strong>waf:phase:http_managed:enable</strong>: WAF managed rules switch.</li>
         * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: WAF rate limiting - apply to cache-hit requests switch.</li>
         * <li><strong>ddos</strong>: DDoS instance.</li>
         * <li><strong>waf:phase:http_ratelimit:enable</strong>: WAF rate limiting rule phase switch.</li>
         * <li><strong>waf:phase:http_custom:enable</strong>: WAF custom rule phase switch.</li>
         * <li><strong>waf:phase:all:page:reference:enable</strong>: WAF custom response page switch.</li>
         * <li><strong>rules_support_regex</strong>: whether the DPI engine supports regular expressions.</li>
         * <li><strong>waiting_room_event</strong>: waiting room - scheduled event.</li>
         * <li><strong>waiting_room_rule</strong>: waiting room - bypass waiting room.</li>
         * <li><strong>waiting_room|json_response</strong>: waiting room - enable JSON response.</li>
         * <li><strong>waiting_room|disable_session_renewal</strong>: waiting room - disable session renewal.</li>
         * <li><strong>origin_rules|dns_record</strong>: back-to-origin rule - DNS record.</li>
         * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: whether the real client IP header is active in transform rules.</li>
         * <li><strong>tiered_cache|regional_enable</strong>: area cache.</li>
         * <li><strong>real_client_ip_header</strong>: client IP header.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf:phase:http_anti_scan:actions</p>
         */
        public Builder quotaNames(String quotaNames) {
            this.putQueryParameter("QuotaNames", quotaNames);
            this.quotaNames = quotaNames;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListQuotasMinEffectPlanRequest build() {
            return new ListQuotasMinEffectPlanRequest(this);
        } 

    } 

}
