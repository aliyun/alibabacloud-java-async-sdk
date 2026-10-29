// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link SdnsVerifyRuleCategoryRequest} extends {@link RequestModel}
 *
 * <p>SdnsVerifyRuleCategoryRequest</p>
 */
public class SdnsVerifyRuleCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Args")
    private java.util.Map<String, String> args;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cip")
    private String cip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIpRanges")
    private java.util.List<String> clientIpRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private SdnsVerifyRuleCategoryRequest(Builder builder) {
        super(builder);
        this.args = builder.args;
        this.cip = builder.cip;
        this.clientIpRanges = builder.clientIpRanges;
        this.matchType = builder.matchType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsVerifyRuleCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.Map<String, String> getArgs() {
        return this.args;
    }

    /**
     * @return cip
     */
    public String getCip() {
        return this.cip;
    }

    /**
     * @return clientIpRanges
     */
    public java.util.List<String> getClientIpRanges() {
        return this.clientIpRanges;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<SdnsVerifyRuleCategoryRequest, Builder> {
        private java.util.Map<String, String> args; 
        private String cip; 
        private java.util.List<String> clientIpRanges; 
        private String matchType; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(SdnsVerifyRuleCategoryRequest request) {
            super(request);
            this.args = request.args;
            this.cip = request.cip;
            this.clientIpRanges = request.clientIpRanges;
            this.matchType = request.matchType;
            this.rules = request.rules;
        } 

        /**
         * <p>The parameter object used for the current validation. If no custom parameters are used, pass an empty JSON object {}. Do not pass an empty string or null.</p>
         */
        public Builder args(java.util.Map<String, String> args) {
            String argsShrink = shrink(args, "Args", "json");
            this.putBodyParameter("Args", argsShrink);
            this.args = args;
            return this;
        }

        /**
         * <p>The simulated client IP address. This parameter is required in IP_RANGE mode. Supports a single IPv4 or IPv6 address. CIDR blocks and start-to-end ranges are not supported. This parameter is used for CIDR block matching in the current request and does not change the source of the actual DNS resolution request.</p>
         * 
         * <strong>example:</strong>
         * <p>198.51.100.10</p>
         */
        public Builder cip(String cip) {
            this.putBodyParameter("Cip", cip);
            this.cip = cip;
            return this;
        }

        /**
         * <p>The array of client CIDR blocks that must be provided in the IP_RANGE pattern. Send this parameter as a JSON form field. Do not pass this parameter in the LINE pattern. Supports single IPv4 and IPv6 addresses, CIDR blocks, and start-to-end ranges. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-to-end ranges are inclusive and must belong to the same address family, with the start address not greater than the end address. Overlapping, containing, and duplicate ranges are allowed within the same policy. When the policy is saved and read back, the array sequence, duplicate items, and the original text of each string are preserved. The array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, including duplicates. Specify one expression per array element. It is compatible with line breaks within an array element. Each expression can contain up to 128 characters, including leading and trailing whitespace. The serialized UTF-8 JSON content cannot exceed 65,535 bytes. Both the quantity and byte limits apply simultaneously. To authenticate, the system only checks the ranges that you commit and does not check for conflicts with saved policies.</p>
         */
        public Builder clientIpRanges(java.util.List<String> clientIpRanges) {
            String clientIpRangesShrink = shrink(clientIpRanges, "ClientIpRanges", "json");
            this.putBodyParameter("ClientIpRanges", clientIpRangesShrink);
            this.clientIpRanges = clientIpRanges;
            return this;
        }

        /**
         * <p>The match type. Valid values:</p>
         * <ul>
         * <li>LINE: line mode</li>
         * <li>IP_RANGE: client CIDR block mode
         * If this parameter is omitted, LINE is used. In IP_RANGE mode, you must provide both ClientIpRanges and Cip.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IP_RANGE</p>
         */
        public Builder matchType(String matchType) {
            this.putBodyParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The complete list of rules. This parameter is required and must contain at least one rule. If you only need to match CIDR blocks, configure a default rule without ArgKeys and Args, and configure the A/AAAA destination addresses in the Records field of this rule. This operation is used for match validation and does not save the rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public SdnsVerifyRuleCategoryRequest build() {
            return new SdnsVerifyRuleCategoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link SdnsVerifyRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>SdnsVerifyRuleCategoryRequest</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("TypeLabel")
        private String typeLabel;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Records(Builder builder) {
            this.ip = builder.ip;
            this.type = builder.type;
            this.typeLabel = builder.typeLabel;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeLabel
         */
        public String getTypeLabel() {
            return this.typeLabel;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String ip; 
            private Integer type; 
            private String typeLabel; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.ip = model.ip;
                this.type = model.type;
                this.typeLabel = model.typeLabel;
                this.weight = model.weight;
            } 

            /**
             * <p>The single destination IP address for the record. If Type is set to 1, specify an IPv4 address, such as 192.0.2.200. If Type is set to 28, specify an IPv6 address, such as 2001:db8::200. Do not use CIDR blocks, start-to-end ranges, or domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.200</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The DNS record type. Valid values:</p>
             * <ul>
             * <li>1: A record</li>
             * <li>28: AAAA record
             * Specify an integer. Do not use the strings A or AAAA.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The auxiliary display text for the record type. This parameter does not participate in matching or resolution decisions and can be omitted in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder typeLabel(String typeLabel) {
                this.typeLabel = typeLabel;
                return this;
            }

            /**
             * <p>The relative weight of the record. This parameter is used to select one record of the same query type only when ResultMode is set to 1. Set this parameter to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This parameter does not participate in selection when ResultMode is set to 0.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsVerifyRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>SdnsVerifyRuleCategoryRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgKeys")
        private java.util.List<String> argKeys;

        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.Map<String, String> args;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("ResultMode")
        private Integer resultMode;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private Rules(Builder builder) {
            this.argKeys = builder.argKeys;
            this.args = builder.args;
            this.name = builder.name;
            this.records = builder.records;
            this.resultMode = builder.resultMode;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return argKeys
         */
        public java.util.List<String> getArgKeys() {
            return this.argKeys;
        }

        /**
         * @return args
         */
        public java.util.Map<String, String> getArgs() {
            return this.args;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return resultMode
         */
        public Integer getResultMode() {
            return this.resultMode;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private java.util.List<String> argKeys; 
            private java.util.Map<String, String> args; 
            private String name; 
            private java.util.List<Records> records; 
            private Integer resultMode; 
            private Integer ttl; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.argKeys = model.argKeys;
                this.args = model.args;
                this.name = model.name;
                this.records = model.records;
                this.resultMode = model.resultMode;
                this.ttl = model.ttl;
            } 

            /**
             * <p>The optional list of custom parameter names, used to record the display order. Omit this parameter if you only match CIDR blocks. If you use Args, the names must correspond to the parameter names in Args.</p>
             */
            public Builder argKeys(java.util.List<String> argKeys) {
                this.argKeys = argKeys;
                return this;
            }

            /**
             * <p>The optional custom parameter conditions. The key is the parameter name and the value is the match value. Omit this parameter if you only match CIDR blocks. You do not need to add business parameters.</p>
             */
            public Builder args(java.util.Map<String, String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The rule name. This parameter is required and cannot be null. Use a non-empty name with business meaning. This parameter cannot replace the policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Default rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of configured DNS records, which can include A and AAAA records. Actual DNS resolution returns only records of the queried type. If the list is empty or does not contain records of the queried type, the system continues to fall back. This operation returns the records configured in the rule and does not filter them by query type.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The record return mode. Valid values:</p>
             * <ul>
             * <li>0: Returns all records of the queried type.</li>
             * <li>1: Returns one record of the queried type based on weight.
             * Policy validation only returns the rule configuration and does not perform weight sampling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resultMode(Integer resultMode) {
                this.resultMode = resultMode;
                return this;
            }

            /**
             * <p>The cache validity period of the record, in seconds. This parameter must be a positive integer.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
