// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link ListFlowAliasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowAliasesResponseBody</p>
 */
public class ListFlowAliasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aliases")
    private java.util.List<Aliases> aliases;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFlowAliasesResponseBody(Builder builder) {
        this.aliases = builder.aliases;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowAliasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliases
     */
    public java.util.List<Aliases> getAliases() {
        return this.aliases;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Aliases> aliases; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFlowAliasesResponseBody model) {
            this.aliases = model.aliases;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Aliases.
         */
        public Builder aliases(java.util.List<Aliases> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * <p>list token</p>
         * 
         * <strong>example:</strong>
         * <p>testNextToken</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFlowAliasesResponseBody build() {
            return new ListFlowAliasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowAliasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowAliasesResponseBody</p>
     */
    public static class RoutingConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private RoutingConfigurations(Builder builder) {
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutingConfigurations create() {
            return builder().build();
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String version; 
            private String weight; 

            private Builder() {
            } 

            private Builder(RoutingConfigurations model) {
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public RoutingConfigurations build() {
                return new RoutingConfigurations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowAliasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowAliasesResponseBody</p>
     */
    public static class Aliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RoutingConfigurations")
        private java.util.List<RoutingConfigurations> routingConfigurations;

        private Aliases(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.name = builder.name;
            this.routingConfigurations = builder.routingConfigurations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aliases create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routingConfigurations
         */
        public java.util.List<RoutingConfigurations> getRoutingConfigurations() {
            return this.routingConfigurations;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String name; 
            private java.util.List<RoutingConfigurations> routingConfigurations; 

            private Builder() {
            } 

            private Builder(Aliases model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.name = model.name;
                this.routingConfigurations = model.routingConfigurations;
            } 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * RoutingConfigurations.
             */
            public Builder routingConfigurations(java.util.List<RoutingConfigurations> routingConfigurations) {
                this.routingConfigurations = routingConfigurations;
                return this;
            }

            public Aliases build() {
                return new Aliases(this);
            } 

        } 

    }
}
