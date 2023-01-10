// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAliasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliasesResponseBody</p>
 */
public class ListAliasesResponseBody extends TeaModel {
    @NameInMap("aliases")
    private java.util.List < Aliases> aliases;

    @NameInMap("nextToken")
    private String nextToken;

    private ListAliasesResponseBody(Builder builder) {
        this.aliases = builder.aliases;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliases
     */
    public java.util.List < Aliases> getAliases() {
        return this.aliases;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Aliases> aliases; 
        private String nextToken; 

        /**
         * The list of aliases.
         */
        public Builder aliases(java.util.List < Aliases> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * The token used to obtain more results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListAliasesResponseBody build() {
            return new ListAliasesResponseBody(this);
        } 

    } 

    public static class Aliases extends TeaModel {
        @NameInMap("additionalVersionWeight")
        private java.util.Map < String, Float > additionalVersionWeight;

        @NameInMap("aliasName")
        private String aliasName;

        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("description")
        private String description;

        @NameInMap("lastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("resolvePolicy")
        private String resolvePolicy;

        @NameInMap("routePolicy")
        private RoutePolicy routePolicy;

        @NameInMap("versionId")
        private String versionId;

        private Aliases(Builder builder) {
            this.additionalVersionWeight = builder.additionalVersionWeight;
            this.aliasName = builder.aliasName;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.resolvePolicy = builder.resolvePolicy;
            this.routePolicy = builder.routePolicy;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aliases create() {
            return builder().build();
        }

        /**
         * @return additionalVersionWeight
         */
        public java.util.Map < String, Float > getAdditionalVersionWeight() {
            return this.additionalVersionWeight;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return resolvePolicy
         */
        public String getResolvePolicy() {
            return this.resolvePolicy;
        }

        /**
         * @return routePolicy
         */
        public RoutePolicy getRoutePolicy() {
            return this.routePolicy;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private java.util.Map < String, Float > additionalVersionWeight; 
            private String aliasName; 
            private String createdTime; 
            private String description; 
            private String lastModifiedTime; 
            private String resolvePolicy; 
            private RoutePolicy routePolicy; 
            private String versionId; 

            /**
             * The weight of the canary release version.
             */
            public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
                this.additionalVersionWeight = additionalVersionWeight;
                return this;
            }

            /**
             * The name of the alias.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The description of the alias.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The last update time.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * 灰度方式：随机灰度或者规则灰度，默认值为随机灰度
             * <p>
             * 枚举值：
             * Random
             * Content
             */
            public Builder resolvePolicy(String resolvePolicy) {
                this.resolvePolicy = resolvePolicy;
                return this;
            }

            /**
             * 灰度规则：满足灰度规则条件的流量，会被路由至灰度实例
             */
            public Builder routePolicy(RoutePolicy routePolicy) {
                this.routePolicy = routePolicy;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Aliases build() {
                return new Aliases(this);
            } 

        } 

    }
}
