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
 * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SdnsListRuleCategoriesResponseBody</p>
 */
public class SdnsListRuleCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SdnsListRuleCategoriesResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsListRuleCategoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SdnsListRuleCategoriesResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of all custom resolution policies for the domain name, including LINE and IP_RANGE policies, as well as enabled and disabled policies. The order of the list is not guaranteed.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to troubleshoot call issues and is not the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SdnsListRuleCategoriesResponseBody build() {
            return new SdnsListRuleCategoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        private Paths(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.label = builder.label;
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
         * @return label
         */
        public String getLabel() {
            return this.label;
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
            private String label; 
            private Integer level; 

            private Builder() {
            } 

            private Builder(Paths model) {
                this.id = model.id;
                this.key = model.key;
                this.label = model.label;
                this.level = model.level;
            } 

            /**
             * <p>The code of the option at this level. For example, chinanet at the isps level indicates China Telecom. Use valid options for the associated line and maintain consistent hierarchical relationships.</p>
             * 
             * <strong>example:</strong>
             * <p>chinanet</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The level identifier. For the Chinese mainland, valid values are isps, subRegions, and provinces. For regions outside the Chinese mainland, valid values are continents and geoRegions. This corresponds to the Level field.</p>
             * 
             * <strong>example:</strong>
             * <p>isps</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name of the line option. The display name of the default option can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>China Telecom</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The sequence number of the line level. For the Chinese mainland, the values are 1 (ISP), 2 (region), and 3 (province). For regions outside the Chinese mainland, the values are 1 (continent) and 2 (geographical region).</p>
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
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class RecordLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LineId")
        private String lineId;

        @com.aliyun.core.annotation.NameInMap("LineLabel")
        private String lineLabel;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<Paths> paths;

        private RecordLine(Builder builder) {
            this.lineId = builder.lineId;
            this.lineLabel = builder.lineLabel;
            this.paths = builder.paths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLine create() {
            return builder().build();
        }

        /**
         * @return lineId
         */
        public String getLineId() {
            return this.lineId;
        }

        /**
         * @return lineLabel
         */
        public String getLineLabel() {
            return this.lineLabel;
        }

        /**
         * @return paths
         */
        public java.util.List<Paths> getPaths() {
            return this.paths;
        }

        public static final class Builder {
            private String lineId; 
            private String lineLabel; 
            private java.util.List<Paths> paths; 

            private Builder() {
            } 

            private Builder(RecordLine model) {
                this.lineId = model.lineId;
                this.lineLabel = model.lineLabel;
                this.paths = model.paths;
            } 

            /**
             * <p>The line identifier. Valid values: internal: the Chinese mainland. overseas: outside the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>internal</p>
             */
            public Builder lineId(String lineId) {
                this.lineId = lineId;
                return this;
            }

            /**
             * <p>The display name of the line.</p>
             * 
             * <strong>example:</strong>
             * <p>The Chinese mainland</p>
             */
            public Builder lineLabel(String lineLabel) {
                this.lineLabel = lineLabel;
                return this;
            }

            /**
             * <p>The line selection path, which describes the line conditions at each level. This field applies only to LINE policies. IP_RANGE policies do not use line paths.</p>
             */
            public Builder paths(java.util.List<Paths> paths) {
                this.paths = paths;
                return this;
            }

            public RecordLine build() {
                return new RecordLine(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Area extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Area(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Area create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(Area model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * <p>The code of the region. The value x indicates the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>huadong</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the region. An empty string can be returned for the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>East China</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Area build() {
                return new Area(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class City extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private City(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(City model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * <p>The code of the city. This is a reserved field for compatibility. The default value is x, which indicates that no city is specified. The example uses the JSON string literal &quot;x&quot;, where the double quotes are not part of the actual field content.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;x&quot;</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the city. This is a reserved field for compatibility, and an empty string is returned. The example uses the JSON literal &quot;&quot; to represent an empty string, where the double quotes are not part of the actual field content.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Continent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Continent(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Continent create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(Continent model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * <p>The code of the continent. The value x indicates the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the continent. An empty string can be returned for the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Continent build() {
                return new Continent(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Country extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Country(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Country create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(Country model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * <p>The code of the country or region. The value x indicates the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the country or region. An empty string can be returned for the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>The Chinese mainland</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Country build() {
                return new Country(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Isp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Isp(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isp create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(Isp model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * <p>The code of the ISP. The value x indicates the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>chinanet</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the ISP. An empty string can be returned for the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>China Telecom</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Isp build() {
                return new Isp(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Province extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Province(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Province create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String id; 
            private String label; 

            private Builder() {
            } 

            private Builder(Province model) {
                this.id = model.id;
                this.label = model.label;
            } 

            /**
             * <p>The code of the province. The value x indicates the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>zhejiang</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The display name of the province. An empty string can be returned for the default item.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Province build() {
                return new Province(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private Area area;

        @com.aliyun.core.annotation.NameInMap("City")
        private City city;

        @com.aliyun.core.annotation.NameInMap("Continent")
        private Continent continent;

        @com.aliyun.core.annotation.NameInMap("Country")
        private Country country;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private Isp isp;

        @com.aliyun.core.annotation.NameInMap("Province")
        private Province province;

        private Region(Builder builder) {
            this.area = builder.area;
            this.city = builder.city;
            this.continent = builder.continent;
            this.country = builder.country;
            this.isp = builder.isp;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public Area getArea() {
            return this.area;
        }

        /**
         * @return city
         */
        public City getCity() {
            return this.city;
        }

        /**
         * @return continent
         */
        public Continent getContinent() {
            return this.continent;
        }

        /**
         * @return country
         */
        public Country getCountry() {
            return this.country;
        }

        /**
         * @return isp
         */
        public Isp getIsp() {
            return this.isp;
        }

        /**
         * @return province
         */
        public Province getProvince() {
            return this.province;
        }

        public static final class Builder {
            private Area area; 
            private City city; 
            private Continent continent; 
            private Country country; 
            private Isp isp; 
            private Province province; 

            private Builder() {
            } 

            private Builder(Region model) {
                this.area = model.area;
                this.city = model.city;
                this.continent = model.continent;
                this.country = model.country;
                this.isp = model.isp;
                this.province = model.province;
            } 

            /**
             * <p>The code and display name of the region.</p>
             */
            public Builder area(Area area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The code and display name of the city. This is a reserved field for compatibility. City-level granularity is not currently provided.</p>
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The code and display name of the continent.</p>
             */
            public Builder continent(Continent continent) {
                this.continent = continent;
                return this;
            }

            /**
             * <p>The code and display name of the country or region.</p>
             */
            public Builder country(Country country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The code and display name of the ISP.</p>
             */
            public Builder isp(Isp isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The code and display name of the province.</p>
             */
            public Builder province(Province province) {
                this.province = province;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
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
             * <p>The single destination IP address corresponding to the record. When Type is 1, it is an IPv4 address, such as 192.0.2.200. When Type is 28, it is an IPv6 address, such as 2001:db8::200. CIDR blocks, IP ranges, or domain names are not used.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.200</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The DNS record type. Valid values: 1: A record. 28: AAAA record. Enter an integer instead of the string A or AAAA.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The auxiliary display text for the record type, which is not used for matching or resolution decisions. This field can be omitted in requests.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder typeLabel(String typeLabel) {
                this.typeLabel = typeLabel;
                return this;
            }

            /**
             * <p>The relative weight of the record, which is used to select one record of the same query type only when ResultMode is 1. Set this to a positive integer from 1 to 100. The sum of the weights of all records does not need to be 100. This field is not used for selection when ResultMode is 0.</p>
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
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
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
             * <p>The names and display order of custom parameters. This field can be empty if no custom parameters are used.</p>
             */
            public Builder argKeys(java.util.List<String> argKeys) {
                this.argKeys = argKeys;
                return this;
            }

            /**
             * <p>The custom parameter matching conditions attached to the rule. If not configured, no parameter restrictions are applied.</p>
             */
            public Builder args(java.util.Map<String, String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The name of the rule, which is used to identify the rule and cannot replace the policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Default rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of configured DNS records, which can include A and AAAA records. Actual resolution returns only records of the queried type. If the list is empty or contains no records of the queried type, the system continues to fall back.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The record return mode. Valid values: 0: returns all records of the queried type. 1: returns one record of the queried type based on weight.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resultMode(Integer resultMode) {
                this.resultMode = resultMode;
                return this;
            }

            /**
             * <p>The cache validity period of the record, in seconds. This value must be a positive integer.</p>
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
    /**
     * 
     * {@link SdnsListRuleCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsListRuleCategoriesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIpRanges")
        private java.util.List<String> clientIpRanges;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("RecordLine")
        private RecordLine recordLine;

        @com.aliyun.core.annotation.NameInMap("Region")
        private Region region;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private List(Builder builder) {
            this.clientIpRanges = builder.clientIpRanges;
            this.domainName = builder.domainName;
            this.id = builder.id;
            this.matchType = builder.matchType;
            this.recordLine = builder.recordLine;
            this.region = builder.region;
            this.rules = builder.rules;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return recordLine
         */
        public RecordLine getRecordLine() {
            return this.recordLine;
        }

        /**
         * @return region
         */
        public Region getRegion() {
            return this.region;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> clientIpRanges; 
            private String domainName; 
            private String id; 
            private String matchType; 
            private RecordLine recordLine; 
            private Region region; 
            private java.util.List<Rules> rules; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(List model) {
                this.clientIpRanges = model.clientIpRanges;
                this.domainName = model.domainName;
                this.id = model.id;
                this.matchType = model.matchType;
                this.recordLine = model.recordLine;
                this.region = model.region;
                this.rules = model.rules;
                this.status = model.status;
            } 

            /**
             * <p>The array of original CIDR blocks from the most recent successful submission for an IP_RANGE policy. The order, duplicates, and content of each string are preserved. The response is a JSON array, not a text string of an array. This field is not used for LINE policies.</p>
             */
            public Builder clientIpRanges(java.util.List<String> clientIpRanges) {
                this.clientIpRanges = clientIpRanges;
                return this;
            }

            /**
             * <p>The domain name to which the policy is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>api.example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the policy, which can be used to query, update, enable, disable, or delete the policy. Treat it as a string to avoid precision loss of large integers.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012345678</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The match type of the policy. Valid values: LINE: line policy. IP_RANGE: client CIDR block policy.</p>
             * 
             * <strong>example:</strong>
             * <p>IP_RANGE</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The line display information for a LINE policy. This field can be empty or omitted for an IP_RANGE policy.</p>
             */
            public Builder recordLine(RecordLine recordLine) {
                this.recordLine = recordLine;
                return this;
            }

            /**
             * <p>The line and region display information for compatibility with existing clients. This field applies only to LINE policies and can be empty or omitted for IP_RANGE policies.</p>
             */
            public Builder region(Region region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The list of custom resolution rules included in the policy. If multiple rules have no parameter conditions, only the first rule is prioritized. Multiple return addresses should be configured in a single rule.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values: 0: disabled. 1: enabled. After a policy is enabled, actual resolution requires waiting for configuration propagation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
