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
 * {@link UpdateSdnsRuleCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateSdnsRuleCategoryRequest</p>
 */
public class UpdateSdnsRuleCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIpRanges")
    private String clientIpRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private UpdateSdnsRuleCategoryRequest(Builder builder) {
        super(builder);
        this.clientIpRanges = builder.clientIpRanges;
        this.id = builder.id;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSdnsRuleCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIpRanges
     */
    public String getClientIpRanges() {
        return this.clientIpRanges;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<UpdateSdnsRuleCategoryRequest, Builder> {
        private String clientIpRanges; 
        private String id; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSdnsRuleCategoryRequest request) {
            super(request);
            this.clientIpRanges = request.clientIpRanges;
            this.id = request.id;
            this.rules = request.rules;
        } 

        /**
         * <p>The JSON text string of the IP address range array. This parameter is used only to update IP_RANGE policies. If this parameter is omitted, the original IP address ranges are retained. If this parameter is provided, the original IP address ranges are replaced as a whole. You cannot pass an empty string, an empty array [], null, or a non-string array. Single IP addresses, CIDR blocks, and start-end ranges of IPv4 and IPv6 are supported. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-end ranges are inclusive and must belong to the same address family, and the start address must not be greater than the end address. Overlapping, containing, and duplicate ranges are allowed within the same policy. When the policy is saved and read back, the array order, duplicate items, and the original text of each string are retained. An array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, and duplicate items are counted. We recommend that you specify one expression per element. It is compatible with line breaks within an element. Each expression can contain up to 128 characters, including leading and trailing whitespace. The serialized UTF-8 JSON sequence cannot exceed 65,535 bytes. The quantity and byte limits take effect at the same time. Overlapping is not allowed among different IP_RANGE policies of the same account, the same domain name, and the same address family. Disabled policies are also checked. Disabling a policy does not release its IP address ranges. This limit does not compare LINE policies and the independent configurations of the legacy SetIPRegionResult operation. The new ranges do not conflict with the old ranges of the same policy during an update. Send this parameter as a single form field, and do not add quotes to the JSON text again.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;198.51.100.0/24&quot;,&quot;2001:db8:1::/64&quot;]</p>
         */
        public Builder clientIpRanges(String clientIpRanges) {
            this.putBodyParameter("ClientIpRanges", clientIpRanges);
            this.clientIpRanges = clientIpRanges;
            return this;
        }

        /**
         * <p>The ID of the policy for the current account. This parameter is required. You can obtain the ID from the Id field in the response of CreateSdnsRuleCategory or from the list returned by SdnsListRuleCategories. Use a decimal string to avoid precision loss for large integers.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012345678</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The complete list of rules. This parameter is required and must contain at least one rule. If you match only by IP address range, you can configure a default rule without ArgKeys and Args, and configure the A or AAAA destination addresses in the Records field of the rule. The update replaces the original rule list as a whole. Old rules that are not included in the new list are removed. When the rules are saved, the serialized UTF-8 JSON content must be less than 65,535 bytes.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public UpdateSdnsRuleCategoryRequest build() {
            return new UpdateSdnsRuleCategoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSdnsRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>UpdateSdnsRuleCategoryRequest</p>
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
             * <p>The single destination IP address corresponding to the record. When Type is set to 1, the IP address is an IPv4 address, such as 192.0.2.200. When Type is set to 28, the IP address is an IPv6 address, such as 2001:db8::200. Do not use CIDR blocks, start-end ranges, or domain names.</p>
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
             * <li>1: A record.</li>
             * <li>28: AAAA record.
             * Specify an integer. Do not use the string A or AAAA.</li>
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
             * <p>The auxiliary display text for the record type. This text is not used for matching or DNS resolution decisions. You can omit this parameter in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder typeLabel(String typeLabel) {
                this.typeLabel = typeLabel;
                return this;
            }

            /**
             * <p>The relative weight of the record. This parameter is used to select one record of the same queried type only when ResultMode is set to 1. We recommend that you set this parameter to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This parameter is not used for selection when ResultMode is set to 0.</p>
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
     * {@link UpdateSdnsRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>UpdateSdnsRuleCategoryRequest</p>
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
             * <p>The optional list of custom parameter names, which is used to record the display order. Omit this parameter if you match only by IP address range. If you use Args, the names must correspond to the parameter names in Args.</p>
             */
            public Builder argKeys(java.util.List<String> argKeys) {
                this.argKeys = argKeys;
                return this;
            }

            /**
             * <p>The optional custom parameter conditions. The key is the parameter name, and the value is the match value. Omit this parameter if you match only by IP address range. You do not need to add business parameters.</p>
             */
            public Builder args(java.util.Map<String, String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The name of the rule. This parameter is required and cannot be null. We recommend that you use a non-empty name that has business meaning. The name cannot replace the policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Default rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of configured DNS records. The list can include A and AAAA records. Actual DNS resolution returns only the records of the queried type. If the list is empty or does not contain records of the queried type, the system continues to fall back.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The record return mode. Valid values:</p>
             * <ul>
             * <li>0: Returns all records of the queried type.</li>
             * <li>1: Returns one record of the queried type based on the weight.</li>
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
             * <p>The cache validity period of the record, in seconds. The value must be a positive integer.</p>
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
