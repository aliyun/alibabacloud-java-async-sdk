// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListInspectionTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInspectionTemplatesResponseBody</p>
 */
public class ListInspectionTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListInspectionTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListInspectionTemplatesResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListInspectionTemplatesResponseBody build() {
            return new ListInspectionTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInspectionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInspectionTemplatesResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("default")
        private Object _default;

        @com.aliyun.core.annotation.NameInMap("enum")
        private java.util.List<String> _enum;

        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("maxLookbackSeconds")
        private Long maxLookbackSeconds;

        @com.aliyun.core.annotation.NameInMap("maximum")
        private Double maximum;

        @com.aliyun.core.annotation.NameInMap("minimum")
        private Double minimum;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("wholeDays")
        private Boolean wholeDays;

        private Parameters(Builder builder) {
            this._default = builder._default;
            this._enum = builder._enum;
            this.format = builder.format;
            this.key = builder.key;
            this.maxLookbackSeconds = builder.maxLookbackSeconds;
            this.maximum = builder.maximum;
            this.minimum = builder.minimum;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
            this.unit = builder.unit;
            this.wholeDays = builder.wholeDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Object get_default() {
            return this._default;
        }

        /**
         * @return _enum
         */
        public java.util.List<String> get_enum() {
            return this._enum;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return maxLookbackSeconds
         */
        public Long getMaxLookbackSeconds() {
            return this.maxLookbackSeconds;
        }

        /**
         * @return maximum
         */
        public Double getMaximum() {
            return this.maximum;
        }

        /**
         * @return minimum
         */
        public Double getMinimum() {
            return this.minimum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return wholeDays
         */
        public Boolean getWholeDays() {
            return this.wholeDays;
        }

        public static final class Builder {
            private Object _default; 
            private java.util.List<String> _enum; 
            private String format; 
            private String key; 
            private Long maxLookbackSeconds; 
            private Double maximum; 
            private Double minimum; 
            private String name; 
            private Boolean required; 
            private String type; 
            private String unit; 
            private Boolean wholeDays; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this._default = model._default;
                this._enum = model._enum;
                this.format = model.format;
                this.key = model.key;
                this.maxLookbackSeconds = model.maxLookbackSeconds;
                this.maximum = model.maximum;
                this.minimum = model.minimum;
                this.name = model.name;
                this.required = model.required;
                this.type = model.type;
                this.unit = model.unit;
                this.wholeDays = model.wholeDays;
            } 

            /**
             * default.
             */
            public Builder _default(Object _default) {
                this._default = _default;
                return this;
            }

            /**
             * enum.
             */
            public Builder _enum(java.util.List<String> _enum) {
                this._enum = _enum;
                return this;
            }

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * maxLookbackSeconds.
             */
            public Builder maxLookbackSeconds(Long maxLookbackSeconds) {
                this.maxLookbackSeconds = maxLookbackSeconds;
                return this;
            }

            /**
             * maximum.
             */
            public Builder maximum(Double maximum) {
                this.maximum = maximum;
                return this;
            }

            /**
             * minimum.
             */
            public Builder minimum(Double minimum) {
                this.minimum = minimum;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * wholeDays.
             */
            public Builder wholeDays(Boolean wholeDays) {
                this.wholeDays = wholeDays;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInspectionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInspectionTemplatesResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        private Configuration(Builder builder) {
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private java.util.List<Parameters> parameters; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.parameters = model.parameters;
            } 

            /**
             * parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInspectionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInspectionTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("scopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
            this.description = builder.description;
            this.name = builder.name;
            this.params = builder.params;
            this.scopeType = builder.scopeType;
            this.templateCode = builder.templateCode;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Configuration configuration; 
            private String description; 
            private String name; 
            private Object params; 
            private String scopeType; 
            private String templateCode; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
                this.description = model.description;
                this.name = model.name;
                this.params = model.params;
                this.scopeType = model.scopeType;
                this.templateCode = model.templateCode;
                this.version = model.version;
            } 

            /**
             * configuration.
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * params.
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * scopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * templateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
