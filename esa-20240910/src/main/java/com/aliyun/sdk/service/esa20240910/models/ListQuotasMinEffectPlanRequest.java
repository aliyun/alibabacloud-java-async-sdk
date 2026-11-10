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
         * <p>The plan instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to query the ID. You must specify at least one of the InstanceId and SiteId parameters.</p>
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
         * <p>The names of the plan quotas. Separate multiple names with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>waf:phase:http_anti_scan:actions</strong>: WAF scan protection - action enumeration</li>
         * <li><strong>waf:phase:http_bot:actions</strong>: WAF bot management - all action enumerations</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc_dev:characteristic:fields</strong>: WAF bot management - statistical object enumeration for custom device rate limiting</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc_ip:characteristic:fields</strong>: WAF bot management - statistical object enumeration for custom IP rate limiting</li>
         * <li><strong><strong>waf:phase:http_bot:match:symbols</strong></strong>: WAF bot management - match symbol enumeration</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc:characteristic:fields</strong>: WAF bot management - statistical object enumeration for custom session rate limiting</li>
         * <li><strong>waf:phase:http_bot:match:fields</strong>: WAF bot management phase - match field enumeration</li>
         * <li><strong>waf:phase:http_whitelist:match:symbols</strong>: WAF whitelist - match symbol enumeration</li>
         * <li><strong>waf:phase:http_whitelist:match:fields</strong>: WAF whitelist - match field enumeration</li>
         * <li><strong>waf:phase:http_anti_scan:http_directory_traversal:characteristic:fields</strong>: WAF scan protection - statistical object enumeration for folder traverse blocking</li>
         * <li><strong>waf:phase:http_anti_scan:http_high_frequency:characteristic:fields</strong>: WAF scan protection - statistical object enumeration for high-frequency scan blocking</li>
         * <li><strong>waf:phase:http_anti_scan:match:symbols</strong>: WAF scan protection - match symbol enumeration</li>
         * <li><strong>waf:phase:http_anti_scan:match:fields</strong>: WAF scan protection - match field enumeration</li>
         * <li><strong>waf:phase:http_managed:actions</strong>: WAF managed rules - action enumeration</li>
         * <li><strong>waf:phase:http_managed:group:reference:ids</strong>: WAF managed rules - referenced rule group enumeration</li>
         * <li><strong>waf:phase:http_ratelimit:actions</strong>: WAF rate limiting - action enumeration</li>
         * <li><strong>waf:phase:http_ratelimit:ttls</strong>: WAF rate limiting - duration enumeration</li>
         * <li><strong>waf:phase:http_ratelimit:intervals</strong>: WAF rate limiting - statistical duration</li>
         * <li><strong>waf:phase:http_ratelimit:http_ratelimit:characteristic:fields</strong>: WAF rate limiting - match characteristic enumeration for control type rules</li>
         * <li><strong>waf:phase:http_ratelimit:match:symbols</strong>: WAF rate limiting rule phase - match symbol enumeration</li>
         * <li><strong>waf:phase:http_ratelimit:match:fields</strong>: WAF rate limiting rule phase - match field enumeration</li>
         * <li><strong>waf:phase:http_custom:actions</strong>: WAF custom rule phase - action enumeration</li>
         * <li><strong>waf:phase:http_custom:match:symbols</strong>: WAF custom rule phase - match symbol enumeration</li>
         * <li><strong>waf:phase:http_custom:match:fields</strong>: WAF custom rule phase - match fields</li>
         * <li><strong>waiting_room|queuing_method</strong>: Waiting room - queuing method</li>
         * <li><strong>origin_rules|origin_scheme</strong>: Back-to-origin rules - back-to-origin protocol</li>
         * <li><strong>origin_rules|origin_sni</strong>: Back-to-origin rules - back-to-origin SNI</li>
         * <li><strong>origin_rules|origin_host</strong>: Back-to-origin rules - back-to-origin host</li>
         * <li><strong>fourlayeracceleration</strong>: Layer 4 acceleration</li>
         * <li><strong>rtlog_service</strong>: Real-time log feature switch</li>
         * <li><strong>dashboard_traffic</strong>: Value-added capability for network traffic analysis</li>
         * <li><strong>custom_name_server</strong>: Custom NS name</li>
         * <li><strong>waf:phase:http_bot:enable</strong>: WAF bot management switch</li>
         * <li><strong>waf:phase:http_whitelist:enable</strong>: WAF whitelist switch</li>
         * <li><strong>instantlog</strong>: Whether instant logs are active</li>
         * <li><strong>waf:phase:http_anti_scan:enable</strong>: WAF scan protection switch</li>
         * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: WAF managed rules - configure referenced rule group switch</li>
         * <li><strong>waf:phase:http_managed:enable</strong>: WAF managed rules switch</li>
         * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: WAF rate limiting - apply to cached requests switch</li>
         * <li><strong>ddos</strong>: DDoS instance</li>
         * <li><strong>waf:phase:http_ratelimit:enable</strong>: WAF rate limiting rule phase switch</li>
         * <li><strong>waf:phase:http_custom:enable</strong>: WAF custom rule phase switch</li>
         * <li><strong>waf:phase:all:page:reference:enable</strong>: WAF custom response page switch</li>
         * <li><strong>rules_support_regex</strong>: Whether the rule DPI engine supports regular expression operations</li>
         * <li><strong>waiting_room_event</strong>: Waiting room - scheduled events</li>
         * <li><strong>waiting_room_rule</strong>: Waiting room - bypass waiting room</li>
         * <li><strong>waiting_room|json_response</strong>: Waiting room - enable JSON response</li>
         * <li><strong>waiting_room|disable_session_renewal</strong>: Waiting room - disable session renewal</li>
         * <li><strong>origin_rules|dns_record</strong>: Back-to-origin rules - DNS record</li>
         * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: Whether the real client IP header is active in transformation rules</li>
         * <li><strong>tiered_cache|regional_enable</strong>: Area cache</li>
         * <li><strong>real_client_ip_header</strong>: Client IP header</li>
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
         * <p>The ID of the site. You can call the <a href="~~ListSites~~">ListSites</a> operation to query the ID.</p>
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
