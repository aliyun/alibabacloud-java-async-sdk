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
 * {@link GetUserMaxPlanQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetUserMaxPlanQuotaRequest</p>
 */
public class GetUserMaxPlanQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaName;

    private GetUserMaxPlanQuotaRequest(Builder builder) {
        super(builder);
        this.quotaName = builder.quotaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserMaxPlanQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    public static final class Builder extends Request.Builder<GetUserMaxPlanQuotaRequest, Builder> {
        private String quotaName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserMaxPlanQuotaRequest request) {
            super(request);
            this.quotaName = request.quotaName;
        } 

        /**
         * <p>The name of the plan quota. Valid values:</p>
         * <ul>
         * <li><strong>waf:phase:http_anti_scan:actions</strong>: Actions for WAF scan protection.</li>
         * <li><strong>waf:phase:http_bot:actions</strong>: All actions for WAF bot management.</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc_dev:characteristic:fields</strong>: Statistical objects for custom device rate limiting in WAF bot management.</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc_ip:characteristic:fields</strong>: Statistical objects for custom IP rate limiting in WAF bot management.</li>
         * <li><strong>waf:phase:http_bot:match:symbols</strong>: Match symbols for WAF bot management.</li>
         * <li><strong>waf:phase:http_bot:http_custom_cc:characteristic:fields</strong>: Statistical objects for custom session rate limiting in WAF bot management.</li>
         * <li><strong>waf:phase:http_bot:match:fields</strong>: Match fields for WAF bot management.</li>
         * <li><strong>waf:phase:http_whitelist:match:symbols</strong>: Match symbols for the WAF whitelist.</li>
         * <li><strong>waf:phase:http_whitelist:match:fields</strong>: Match fields for the WAF whitelist.</li>
         * <li><strong>waf:phase:http_anti_scan:http_directory_traversal:characteristic:fields</strong>: Statistical objects for folder traverse blocking in WAF scan protection.</li>
         * <li><strong>waf:phase:http_anti_scan:http_high_frequency:characteristic:fields</strong>: Statistical objects for high-frequency scan blocking in WAF scan protection.</li>
         * <li><strong>waf:phase:http_anti_scan:match:symbols</strong>: Match symbols for WAF scan protection.</li>
         * <li><strong>waf:phase:http_anti_scan:match:fields</strong>: Match fields for WAF scan protection.</li>
         * <li><strong>waf:phase:http_managed:actions</strong>: Actions for WAF managed rules.</li>
         * <li><strong>waf:phase:http_managed:group:reference:ids</strong>: Referenced rule groups for WAF managed rules.</li>
         * <li><strong>waf:phase:http_ratelimit:actions</strong>: Actions for WAF rate limiting.</li>
         * <li><strong>waf:phase:http_ratelimit:ttls</strong>: Durations for WAF rate limiting.</li>
         * <li><strong>waf:phase:http_ratelimit:intervals</strong>: Statistical durations for WAF rate limiting.</li>
         * <li><strong>waf:phase:http_ratelimit:http_ratelimit:characteristic:fields</strong>: Match features for control type rules in WAF rate limiting.</li>
         * <li><strong>waf:phase:http_ratelimit:match:symbols</strong>: Match symbols for the WAF rate limiting rule phase.</li>
         * <li><strong>waf:phase:http_ratelimit:match:fields</strong>: Match fields for the WAF rate limiting rule phase.</li>
         * <li><strong>waf:phase:http_custom:actions</strong>: Actions for the WAF custom rule phase.</li>
         * <li><strong>waf:phase:http_custom:match:symbols</strong>: Match symbols for the WAF custom rule phase.</li>
         * <li><strong>waf:phase:http_custom:match:fields</strong>: Match fields for the WAF custom rule phase.</li>
         * <li><strong>waiting_room|queuing_method</strong>: Queuing method for the waiting room.</li>
         * <li><strong>origin_rules|origin_scheme</strong>: Back-to-origin protocol for back-to-origin rules.</li>
         * <li><strong>origin_rules|origin_sni</strong>: Back-to-origin SNI for back-to-origin rules.</li>
         * <li><strong>origin_rules|origin_host</strong>: Back-to-origin host for back-to-origin rules.</li>
         * <li><strong>fourlayeracceleration</strong>: Layer 4 acceleration.</li>
         * <li><strong>rtlog_service</strong>: Real-time log feature switch.</li>
         * <li><strong>dashboard_traffic</strong>: Value-added capability for network traffic analysis.</li>
         * <li><strong>custom_name_server</strong>: Custom NS name.</li>
         * <li><strong>waf:phase:http_bot:enable</strong>: WAF bot management switch.</li>
         * <li><strong>waf:phase:http_whitelist:enable</strong>: WAF whitelist switch.</li>
         * <li><strong>instantlog</strong>: Whether instant logs are active.</li>
         * <li><strong>waf:phase:http_anti_scan:enable</strong>: WAF scan protection switch.</li>
         * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: Switch for configuring referenced rule groups in WAF managed rules.</li>
         * <li><strong>waf:phase:http_managed:enable</strong>: WAF managed rules switch.</li>
         * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: Switch for applying WAF rate limiting to cached requests.</li>
         * <li><strong>ddos</strong>: DDoS instance.</li>
         * <li><strong>waf:phase:http_ratelimit:enable</strong>: Switch for the WAF rate limiting rule phase.</li>
         * <li><strong>waf:phase:http_custom:enable</strong>: Switch for the WAF custom rule phase.</li>
         * <li><strong>waf:phase:all:page:reference:enable</strong>: WAF custom response page switch.</li>
         * <li><strong>rules_support_regex</strong>: Whether the rule DPI engine supports regular expressions.</li>
         * <li><strong>waiting_room_event</strong>: Scheduled events for the waiting room.</li>
         * <li><strong>waiting_room_rule</strong>: Bypass the waiting room.</li>
         * <li><strong>waiting_room|json_response</strong>: Enable JSON response for the waiting room.</li>
         * <li><strong>waiting_room|disable_session_renewal</strong>: Disable session renewal for the waiting room.</li>
         * <li><strong>origin_rules|dns_record</strong>: DNS record for back-to-origin rules.</li>
         * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: Whether the real client IP header is available in transformation rules.</li>
         * <li><strong>tiered_cache|regional_enable</strong>: Area cache.</li>
         * <li><strong>real_client_ip_header</strong>: Client IP header.</li>
         * <li><strong>data_timerange</strong>: Data query time in minutes.</li>
         * <li><strong>cache_rules|edge_cache_ttl</strong>: Edge node TTL for cache.</li>
         * <li><strong>cache_rules|browser_cache_ttl</strong>: Browser TTL for cache.</li>
         * <li><strong>fourLayerRecordCount</strong>: Record count limit for Layer 4 acceleration.</li>
         * <li><strong>waitingroomRuleCount</strong>: Number of rules that can be associated with a single waitingRoomId.</li>
         * <li><strong>waitingroomEventCount</strong>: Number of events that can be associated with a single waitingRoomId.</li>
         * <li><strong>waitingroom_custom_pathhost</strong>: Hostname and path for the waiting room.</li>
         * <li><strong>er_routers</strong>: Function routing.</li>
         * <li><strong>cache_rules|rule_quota</strong>: Cache rules.</li>
         * <li><strong>configuration_rules|rule_quota</strong>: Configuration rules.</li>
         * <li><strong>redirect_rules|rule_quota</strong>: Redirect rules.</li>
         * <li><strong>compression_rules|rule_quota</strong>: Compression rules.</li>
         * <li><strong>origin_rules|rule_quota</strong>: Back-to-origin rules.</li>
         * <li><strong>waf:phase:http_bot:rulesets_per_instance:less_than_or_equal</strong>: Maximum number of rule groups per instance in WAF bot management.</li>
         * <li><strong>waf:phase:http_whitelist:rules_per_instance:less_than_or_equal</strong>: Maximum number of rules per instance in the WAF whitelist.</li>
         * <li><strong>rtlog_quota</strong>: Quota for the number of real-time log push tasks.</li>
         * <li><strong>waf:phase:http_anti_scan:rulesets_per_instance:less_than_or_equal</strong>: Maximum number of rule groups per instance in WAF scan protection.</li>
         * <li><strong>ddos_instance</strong>: Number of DDoS instances.</li>
         * <li><strong>waf:phase:http_ratelimit:rules_per_instance:less_than_or_equal</strong>: Maximum number of WAF rate limiting rules.</li>
         * <li><strong>waf:phase:http_custom:rules_per_instance:less_than_or_equal</strong>: Maximum number of rules per instance in the WAF custom rule phase.</li>
         * <li><strong>ruleNestedConditionalCount</strong>: Nesting level of rules.</li>
         * <li><strong>waiting_room</strong>: Waiting room.</li>
         * <li><strong>transition_rule</strong>: Transformation rules.</li>
         * <li><strong>customHttpCert</strong>: Number of custom certificates.</li>
         * <li><strong>free_cert</strong>: Number of free certificates.</li>
         * <li><strong>preload</strong>: Prefetch.</li>
         * <li><strong>refresh_cache_tag</strong>: Refresh - cache tag.</li>
         * <li><strong>refresh_ignore_param</strong>: Refresh - refresh ignoring parameters.</li>
         * <li><strong>refresh_directory</strong>: Refresh - refresh by folder.</li>
         * <li><strong>refresh_hostname</strong>: Refresh - refresh by hostname.</li>
         * <li><strong>refresh_all</strong>: Refresh - purge all cache.</li>
         * <li><strong>refresh_file</strong>: URL refresh.</li>
         * <li><strong>wildcard</strong>: Number of wildcard domain names.</li>
         * <li><strong>recordCount</strong>: Number of Layer 7 records.</li>
         * <li><strong>siteCount</strong>: Number of sites.</li>
         * <li><strong>https|rule_quota</strong>: Number of SSL/TLS rules.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>siteCount</p>
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        @Override
        public GetUserMaxPlanQuotaRequest build() {
            return new GetUserMaxPlanQuotaRequest(this);
        } 

    } 

}
