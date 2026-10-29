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
 * {@link CreateSdnsRuleCategoryRequest} extends {@link RequestModel}
 *
 * <p>CreateSdnsRuleCategoryRequest</p>
 */
public class CreateSdnsRuleCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIpRanges")
    private java.util.List<String> clientIpRanges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LineId")
    private String lineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Paths")
    private java.util.List<Paths> paths;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private CreateSdnsRuleCategoryRequest(Builder builder) {
        super(builder);
        this.clientIpRanges = builder.clientIpRanges;
        this.domainName = builder.domainName;
        this.enable = builder.enable;
        this.lineId = builder.lineId;
        this.matchType = builder.matchType;
        this.paths = builder.paths;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSdnsRuleCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIpRanges
     */
    public java.util.List<String> getClientIpRanges() {
        return this.clientIpRanges;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return paths
     */
    public java.util.List<Paths> getPaths() {
        return this.paths;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateSdnsRuleCategoryRequest, Builder> {
        private java.util.List<String> clientIpRanges; 
        private String domainName; 
        private Boolean enable; 
        private String lineId; 
        private String matchType; 
        private java.util.List<Paths> paths; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateSdnsRuleCategoryRequest request) {
            super(request);
            this.clientIpRanges = request.clientIpRanges;
            this.domainName = request.domainName;
            this.enable = request.enable;
            this.lineId = request.lineId;
            this.matchType = request.matchType;
            this.paths = request.paths;
            this.rules = request.rules;
        } 

        /**
         * <p>The array of client IP address ranges required for the IP_RANGE pattern. Send this parameter as a JSON form field. Do not specify this parameter for the LINE pattern. This parameter supports single IPv4 and IPv6 addresses, CIDR blocks, and start-end ranges. Multiple entries have an OR relationship. For CIDR blocks, the IPv4 prefix length ranges from 0 to 32, and the IPv6 prefix length ranges from 0 to 128. Start-end ranges are inclusive and must belong to the same address family, and the start address cannot be greater than the end address. Duplicates, inclusions, and overlaps are allowed within the same policy. When the policy is saved and read back, the array sequence, duplicates, and original text of each string are preserved. The array can contain up to 2,000 array elements. The total number of parsed non-empty address expressions ranges from 1 to 2,000, and duplicates are counted. We recommend that you specify one expression per array element. It is compatible with line breaks within an array element. Each expression can contain up to 128 characters, including leading and trailing spaces. The serialized UTF-8 JSON content cannot exceed 65,535 bytes. The quantity and byte limits take effect simultaneously. Overlaps are not allowed between different IP_RANGE policies for the same account, domain name, and address family. Disabled policies are also checked. Disabling a policy does not release the ranges. This limit does not compare independent configurations of LINE policies and the legacy SetIPRegionResult operation.</p>
         */
        public Builder clientIpRanges(java.util.List<String> clientIpRanges) {
            String clientIpRangesShrink = shrink(clientIpRanges, "ClientIpRanges", "json");
            this.putBodyParameter("ClientIpRanges", clientIpRangesShrink);
            this.clientIpRanges = clientIpRanges;
            return this;
        }

        /**
         * <p>The domain name connected to HTTPDNS for the current account. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the policy upon creation. If this parameter is omitted or set to false, the policy is disabled (Status=0). If this parameter is set to true, the policy is enabled (Status=1), and you do not need to call the enable operation. This parameter applies to the LINE and IP_RANGE modes. Actual resolution still requires waiting for configuration propagation.</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The line identifier required for the LINE mode. Valid values:</p>
         * <ul>
         * <li>internal: the Chinese mainland.</li>
         * <li>overseas: outside the Chinese mainland.</li>
         * </ul>
         * <p>Do not specify this parameter for the IP_RANGE mode.</p>
         * 
         * <strong>example:</strong>
         * <p>internal</p>
         */
        public Builder lineId(String lineId) {
            this.putBodyParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The match type. Valid values:</p>
         * <ul>
         * <li>LINE: the line mode.</li>
         * <li>IP_RANGE: the client IP address range mode.</li>
         * </ul>
         * <p>If this parameter is omitted, it is processed as LINE. To create an IP address range policy, you must explicitly set this parameter to IP_RANGE and provide ClientIpRanges. You cannot provide LineId or Paths at the same time. The match type cannot be changed after creation.</p>
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
         * <p>The line selection path that describes the line conditions at each level. This parameter applies only to the LINE mode. The IP_RANGE mode does not use line paths. When you create a line policy, provide valid options at each level. Use x for the default option. For the Chinese mainland, the levels include ISP, region, and province. For regions outside the Chinese mainland, the levels include continent and region.</p>
         */
        public Builder paths(java.util.List<Paths> paths) {
            String pathsShrink = shrink(paths, "Paths", "json");
            this.putBodyParameter("Paths", pathsShrink);
            this.paths = paths;
            return this;
        }

        /**
         * <p>The complete list of rules. This parameter is required and must contain at least one rule. When matching only by IP address range, configure a default rule without ArgKeys and Args, and configure the A or AAAA destination addresses in the Records of this rule. When saved, the serialized UTF-8 JSON content must be less than 65,535 bytes.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putBodyParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateSdnsRuleCategoryRequest build() {
            return new CreateSdnsRuleCategoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSdnsRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>CreateSdnsRuleCategoryRequest</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        private Paths(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String id; 
            private String key; 
            private Integer level; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.id = model.id;
                this.key = model.key;
                this.level = model.level;
            } 

            /**
             * <p>The code of the option at this level. For example, chinanet at the isps level indicates China Telecom. Use valid options for the associated line and maintain consistent hierarchical subordination.</p>
             * 
             * <strong>example:</strong>
             * <p>chinanet</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The level identifier. For the Chinese mainland, use isps, subRegions, and provinces. For regions outside the Chinese mainland, use continents and geoRegions. This parameter corresponds to Level.</p>
             * 
             * <strong>example:</strong>
             * <p>isps</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The sequence number of the line level. For the Chinese mainland, the values are 1 (ISP), 2 (region), and 3 (province). For regions outside the Chinese mainland, the values are 1 (continent) and 2 (region).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSdnsRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>CreateSdnsRuleCategoryRequest</p>
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
             * <p>The single destination IP address corresponding to the record. If Type is set to 1, the value is an IPv4 address, such as 192.0.2.200. If Type is set to 28, the value is an IPv6 address, such as 2001:db8::200. Do not use CIDR blocks, start-end ranges, or domain names.</p>
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
             * <li>28: AAAA record.</li>
             * </ul>
             * <p>Specify an integer. Do not use the string A or AAAA.</p>
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
             * <p>The relative weight of the record. This parameter is used to select one record of the same queried type only when ResultMode is set to 1. We recommend that you set this parameter to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This parameter does not participate in selection when ResultMode is set to 0.</p>
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
     * {@link CreateSdnsRuleCategoryRequest} extends {@link TeaModel}
     *
     * <p>CreateSdnsRuleCategoryRequest</p>
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
             * <p>The optional list of custom parameter names used to record the display order. Omit this parameter when matching only by IP address range. If Args is used, the names must correspond to the parameter names in Args.</p>
             */
            public Builder argKeys(java.util.List<String> argKeys) {
                this.argKeys = argKeys;
                return this;
            }

            /**
             * <p>The optional custom parameter conditions. The key is the parameter name, and the value is the match value. Omit this parameter when matching only by IP address range. You do not need to add business parameters.</p>
             */
            public Builder args(java.util.Map<String, String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The rule name. This parameter is required and cannot be null. We recommend that you use a non-empty name with business meaning. This parameter cannot replace the policy Id.</p>
             * 
             * <strong>example:</strong>
             * <p>Default rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of configured resolution records, which can include A and AAAA records. Actual resolution returns only records of the queried type. If the list is empty or does not contain records of the queried type, the system continues to fall back.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The record return mode. Valid values:</p>
             * <ul>
             * <li>0: returns all records of the queried type.</li>
             * <li>1: returns one record of the queried type based on the weight.</li>
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
