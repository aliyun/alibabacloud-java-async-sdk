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
 * {@link ListQuotasMinEffectPlanResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotasMinEffectPlanResponseBody</p>
 */
public class ListQuotasMinEffectPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List<Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQuotasMinEffectPlanResponseBody(Builder builder) {
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasMinEffectPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotas
     */
    public java.util.List<Quotas> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Quotas> quotas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQuotasMinEffectPlanResponseBody model) {
            this.quotas = model.quotas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of minimum effective plan editions for quotas.</p>
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQuotasMinEffectPlanResponseBody build() {
            return new ListQuotasMinEffectPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotasMinEffectPlanResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasMinEffectPlanResponseBody</p>
     */
    public static class QuotaValueDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEffect")
        private String isEffect;

        @com.aliyun.core.annotation.NameInMap("MinEffectPlan")
        private String minEffectPlan;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QuotaValueDetail(Builder builder) {
            this.isEffect = builder.isEffect;
            this.minEffectPlan = builder.minEffectPlan;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaValueDetail create() {
            return builder().build();
        }

        /**
         * @return isEffect
         */
        public String getIsEffect() {
            return this.isEffect;
        }

        /**
         * @return minEffectPlan
         */
        public String getMinEffectPlan() {
            return this.minEffectPlan;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String isEffect; 
            private String minEffectPlan; 
            private String value; 

            private Builder() {
            } 

            private Builder(QuotaValueDetail model) {
                this.isEffect = model.isEffect;
                this.minEffectPlan = model.minEffectPlan;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the quota value is available in the plan edition associated with the current site. Valid values:</p>
             * <ul>
             * <li>true: Available.</li>
             * <li>false: Not available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isEffect(String isEffect) {
                this.isEffect = isEffect;
                return this;
            }

            /**
             * <p>The minimum plan edition in which the quota value is available. Valid values:</p>
             * <ul>
             * <li>basic: Basic Edition.</li>
             * <li>medium: Standard Edition.</li>
             * <li>high: Pro Edition.</li>
             * <li>enterprise_standard_cn: Enterprise Edition.</li>
             * </ul>
             * <p>This parameter follows these rules:</p>
             * <ul>
             * <li>If the quota value is already available in the current edition, this parameter is empty, meaning the minimum available plan edition is not displayed.</li>
             * <li>If the quota value is not available in the current edition, the minimum available edition is displayed.</li>
             * <li>If the current plan is already the Enterprise Edition, this parameter is always empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder minEffectPlan(String minEffectPlan) {
                this.minEffectPlan = minEffectPlan;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>quotaValue1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QuotaValueDetail build() {
                return new QuotaValueDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasMinEffectPlanResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasMinEffectPlanResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaValueDetail")
        private java.util.List<QuotaValueDetail> quotaValueDetail;

        @com.aliyun.core.annotation.NameInMap("QuotaValueType")
        private String quotaValueType;

        private Quotas(Builder builder) {
            this.quotaName = builder.quotaName;
            this.quotaValueDetail = builder.quotaValueDetail;
            this.quotaValueType = builder.quotaValueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return quotaValueDetail
         */
        public java.util.List<QuotaValueDetail> getQuotaValueDetail() {
            return this.quotaValueDetail;
        }

        /**
         * @return quotaValueType
         */
        public String getQuotaValueType() {
            return this.quotaValueType;
        }

        public static final class Builder {
            private String quotaName; 
            private java.util.List<QuotaValueDetail> quotaValueDetail; 
            private String quotaValueType; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.quotaName = model.quotaName;
                this.quotaValueDetail = model.quotaValueDetail;
                this.quotaValueType = model.quotaValueType;
            } 

            /**
             * <p>The quota name. Valid values:</p>
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
             * <li><strong>waitingroom|wr_queueing_method</strong>: waiting room - queuing method.</li>
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
             * <li><strong>waitingroom_event</strong>: waiting room - scheduled event.</li>
             * <li><strong>waitingroom_rule</strong>: waiting room - bypass waiting room.</li>
             * <li><strong>waitingroom|wr_json_response</strong>: waiting room - enable JSON response.</li>
             * <li><strong>waitingroom|wr_disable_session_renewal</strong>: waiting room - disable session renewal.</li>
             * <li><strong>origin_rules|dns_record</strong>: back-to-origin rule - DNS record.</li>
             * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: whether the real client IP header is active in transform rules.</li>
             * <li><strong>tiered_cache|regional_enable</strong>: area cache.</li>
             * <li><strong>real_client_ip_header</strong>: client IP header.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>waf:phase:http_anti_scan:actions</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The list of quota threshold details.</p>
             */
            public Builder quotaValueDetail(java.util.List<QuotaValueDetail> quotaValueDetail) {
                this.quotaValueDetail = quotaValueDetail;
                return this;
            }

            /**
             * <p>The threshold type of the quota. Valid values:</p>
             * <ul>
             * <li>value: enumeration type. An enumeration-type quota has multiple enumeration thresholds. For each enumeration threshold, the system indicates whether it is available in the current edition and, if not, the minimum plan edition in which it becomes available.</li>
             * <li>bool: Boolean type. A Boolean-type quota is abstracted into two enumeration thresholds: true and false. To check whether the quota is available in the current plan edition and the minimum available plan edition, you only need to check the quota details for the true enumeration in the quota details list.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder quotaValueType(String quotaValueType) {
                this.quotaValueType = quotaValueType;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
