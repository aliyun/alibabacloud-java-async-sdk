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
 * {@link CreateFlowAliasResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowAliasResponseBody</p>
 */
public class CreateFlowAliasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoutingConfigurations")
    private java.util.List<RoutingConfigurations> routingConfigurations;

    private CreateFlowAliasResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.flowName = builder.flowName;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.routingConfigurations = builder.routingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowAliasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String flowName; 
        private String name; 
        private String requestId; 
        private java.util.List<RoutingConfigurations> routingConfigurations; 

        private Builder() {
        } 

        private Builder(CreateFlowAliasResponseBody model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.flowName = model.flowName;
            this.name = model.name;
            this.requestId = model.requestId;
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
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoutingConfigurations.
         */
        public Builder routingConfigurations(java.util.List<RoutingConfigurations> routingConfigurations) {
            this.routingConfigurations = routingConfigurations;
            return this;
        }

        public CreateFlowAliasResponseBody build() {
            return new CreateFlowAliasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFlowAliasResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFlowAliasResponseBody</p>
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
}
