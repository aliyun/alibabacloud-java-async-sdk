// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketHttpRoute} extends {@link TeaModel}
 *
 * <p>HiMarketHttpRoute</p>
 */
public class HiMarketHttpRoute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("builtin")
    private Boolean builtin;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domains")
    private java.util.List<HiMarketDomain> domains;

    @com.aliyun.core.annotation.NameInMap("match")
    private Match match;

    private HiMarketHttpRoute(Builder builder) {
        this.builtin = builder.builtin;
        this.description = builder.description;
        this.domains = builder.domains;
        this.match = builder.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketHttpRoute create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return builtin
     */
    public Boolean getBuiltin() {
        return this.builtin;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domains
     */
    public java.util.List<HiMarketDomain> getDomains() {
        return this.domains;
    }

    /**
     * @return match
     */
    public Match getMatch() {
        return this.match;
    }

    public static final class Builder {
        private Boolean builtin; 
        private String description; 
        private java.util.List<HiMarketDomain> domains; 
        private Match match; 

        private Builder() {
        } 

        private Builder(HiMarketHttpRoute model) {
            this.builtin = model.builtin;
            this.description = model.description;
            this.domains = model.domains;
            this.match = model.match;
        } 

        /**
         * builtin.
         */
        public Builder builtin(Boolean builtin) {
            this.builtin = builtin;
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
         * domains.
         */
        public Builder domains(java.util.List<HiMarketDomain> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * match.
         */
        public Builder match(Match match) {
            this.match = match;
            return this;
        }

        public HiMarketHttpRoute build() {
            return new HiMarketHttpRoute(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketHttpRoute} extends {@link TeaModel}
     *
     * <p>HiMarketHttpRoute</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseSensitive")
        private Boolean caseSensitive;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Headers(Builder builder) {
            this.caseSensitive = builder.caseSensitive;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.caseSensitive = model.caseSensitive;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * caseSensitive.
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link HiMarketHttpRoute} extends {@link TeaModel}
     *
     * <p>HiMarketHttpRoute</p>
     */
    public static class ModelMatches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseSensitive")
        private Boolean caseSensitive;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ModelMatches(Builder builder) {
            this.caseSensitive = builder.caseSensitive;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelMatches create() {
            return builder().build();
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(ModelMatches model) {
                this.caseSensitive = model.caseSensitive;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * caseSensitive.
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ModelMatches build() {
                return new ModelMatches(this);
            } 

        } 

    }
    /**
     * 
     * {@link HiMarketHttpRoute} extends {@link TeaModel}
     *
     * <p>HiMarketHttpRoute</p>
     */
    public static class MatchPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseSensitive")
        private Boolean caseSensitive;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private MatchPath(Builder builder) {
            this.caseSensitive = builder.caseSensitive;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchPath create() {
            return builder().build();
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(MatchPath model) {
                this.caseSensitive = model.caseSensitive;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * caseSensitive.
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
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
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchPath build() {
                return new MatchPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link HiMarketHttpRoute} extends {@link TeaModel}
     *
     * <p>HiMarketHttpRoute</p>
     */
    public static class QueryParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseSensitive")
        private Boolean caseSensitive;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private QueryParams(Builder builder) {
            this.caseSensitive = builder.caseSensitive;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParams create() {
            return builder().build();
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean caseSensitive; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueryParams model) {
                this.caseSensitive = model.caseSensitive;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * caseSensitive.
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryParams build() {
                return new QueryParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link HiMarketHttpRoute} extends {@link TeaModel}
     *
     * <p>HiMarketHttpRoute</p>
     */
    public static class Match extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.List<Headers> headers;

        @com.aliyun.core.annotation.NameInMap("methods")
        private java.util.List<String> methods;

        @com.aliyun.core.annotation.NameInMap("modelMatches")
        private java.util.List<ModelMatches> modelMatches;

        @com.aliyun.core.annotation.NameInMap("path")
        private MatchPath path;

        @com.aliyun.core.annotation.NameInMap("queryParams")
        private java.util.List<QueryParams> queryParams;

        private Match(Builder builder) {
            this.headers = builder.headers;
            this.methods = builder.methods;
            this.modelMatches = builder.modelMatches;
            this.path = builder.path;
            this.queryParams = builder.queryParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Match create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.List<Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return methods
         */
        public java.util.List<String> getMethods() {
            return this.methods;
        }

        /**
         * @return modelMatches
         */
        public java.util.List<ModelMatches> getModelMatches() {
            return this.modelMatches;
        }

        /**
         * @return path
         */
        public MatchPath getPath() {
            return this.path;
        }

        /**
         * @return queryParams
         */
        public java.util.List<QueryParams> getQueryParams() {
            return this.queryParams;
        }

        public static final class Builder {
            private java.util.List<Headers> headers; 
            private java.util.List<String> methods; 
            private java.util.List<ModelMatches> modelMatches; 
            private MatchPath path; 
            private java.util.List<QueryParams> queryParams; 

            private Builder() {
            } 

            private Builder(Match model) {
                this.headers = model.headers;
                this.methods = model.methods;
                this.modelMatches = model.modelMatches;
                this.path = model.path;
                this.queryParams = model.queryParams;
            } 

            /**
             * headers.
             */
            public Builder headers(java.util.List<Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * methods.
             */
            public Builder methods(java.util.List<String> methods) {
                this.methods = methods;
                return this;
            }

            /**
             * modelMatches.
             */
            public Builder modelMatches(java.util.List<ModelMatches> modelMatches) {
                this.modelMatches = modelMatches;
                return this;
            }

            /**
             * path.
             */
            public Builder path(MatchPath path) {
                this.path = path;
                return this;
            }

            /**
             * queryParams.
             */
            public Builder queryParams(java.util.List<QueryParams> queryParams) {
                this.queryParams = queryParams;
                return this;
            }

            public Match build() {
                return new Match(this);
            } 

        } 

    }
}
