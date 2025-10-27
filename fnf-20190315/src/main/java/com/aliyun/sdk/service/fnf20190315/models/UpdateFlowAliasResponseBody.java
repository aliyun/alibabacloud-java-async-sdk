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
 * {@link UpdateFlowAliasResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFlowAliasResponseBody</p>
 */
public class UpdateFlowAliasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alias")
    private Alias alias;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateFlowAliasResponseBody(Builder builder) {
        this.alias = builder.alias;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowAliasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public Alias getAlias() {
        return this.alias;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Alias alias; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateFlowAliasResponseBody model) {
            this.alias = model.alias;
            this.requestId = model.requestId;
        } 

        /**
         * Alias.
         */
        public Builder alias(Alias alias) {
            this.alias = alias;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>294D68C1-5108-5971-853A-1A9CC87B4816</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateFlowAliasResponseBody build() {
            return new UpdateFlowAliasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFlowAliasResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateFlowAliasResponseBody</p>
     */
    public static class RoutingConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

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
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String version; 
            private Integer weight; 

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
            public Builder weight(Integer weight) {
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
     * {@link UpdateFlowAliasResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateFlowAliasResponseBody</p>
     */
    public static class Alias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RoutingConfigurations")
        private java.util.List<RoutingConfigurations> routingConfigurations;

        private Alias(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.name = builder.name;
            this.routingConfigurations = builder.routingConfigurations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alias create() {
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

            private Builder(Alias model) {
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

            public Alias build() {
                return new Alias(this);
            } 

        } 

    }
}
