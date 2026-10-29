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
 * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>SdnsGetRuleCategoryResponseBody</p>
 */
public class SdnsGetRuleCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SdnsGetRuleCategoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsGetRuleCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SdnsGetRuleCategoryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SdnsGetRuleCategoryResponseBody build() {
            return new SdnsGetRuleCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Level.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * LineId.
             */
            public Builder lineId(String lineId) {
                this.lineId = lineId;
                return this;
            }

            /**
             * LineLabel.
             */
            public Builder lineLabel(String lineLabel) {
                this.lineLabel = lineLabel;
                return this;
            }

            /**
             * Paths.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Area.
             */
            public Builder area(Area area) {
                this.area = area;
                return this;
            }

            /**
             * City.
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * Continent.
             */
            public Builder continent(Continent continent) {
                this.continent = continent;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(Country country) {
                this.country = country;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(Isp isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Province.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * TypeLabel.
             */
            public Builder typeLabel(String typeLabel) {
                this.typeLabel = typeLabel;
                return this;
            }

            /**
             * Weight.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
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
             * ArgKeys.
             */
            public Builder argKeys(java.util.List<String> argKeys) {
                this.argKeys = argKeys;
                return this;
            }

            /**
             * Args.
             */
            public Builder args(java.util.Map<String, String> args) {
                this.args = args;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * ResultMode.
             */
            public Builder resultMode(Integer resultMode) {
                this.resultMode = resultMode;
                return this;
            }

            /**
             * Ttl.
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
     * {@link SdnsGetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>SdnsGetRuleCategoryResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
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
             * ClientIpRanges.
             */
            public Builder clientIpRanges(java.util.List<String> clientIpRanges) {
                this.clientIpRanges = clientIpRanges;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * RecordLine.
             */
            public Builder recordLine(RecordLine recordLine) {
                this.recordLine = recordLine;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(Region region) {
                this.region = region;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
