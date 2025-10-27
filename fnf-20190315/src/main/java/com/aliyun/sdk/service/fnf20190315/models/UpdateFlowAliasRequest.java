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
 * {@link UpdateFlowAliasRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowAliasRequest</p>
 */
public class UpdateFlowAliasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoutingConfigurations")
    private java.util.List<RoutingConfigurations> routingConfigurations;

    private UpdateFlowAliasRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.flowName = builder.flowName;
        this.name = builder.name;
        this.routingConfigurations = builder.routingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return routingConfigurations
     */
    public java.util.List<RoutingConfigurations> getRoutingConfigurations() {
        return this.routingConfigurations;
    }

    public static final class Builder extends Request.Builder<UpdateFlowAliasRequest, Builder> {
        private String description; 
        private String flowName; 
        private String name; 
        private java.util.List<RoutingConfigurations> routingConfigurations; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowAliasRequest request) {
            super(request);
            this.description = request.description;
            this.flowName = request.flowName;
            this.name = request.name;
            this.routingConfigurations = request.routingConfigurations;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-flow-name</p>
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alias name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RoutingConfigurations.
         */
        public Builder routingConfigurations(java.util.List<RoutingConfigurations> routingConfigurations) {
            String routingConfigurationsShrink = shrink(routingConfigurations, "RoutingConfigurations", "json");
            this.putBodyParameter("RoutingConfigurations", routingConfigurationsShrink);
            this.routingConfigurations = routingConfigurations;
            return this;
        }

        @Override
        public UpdateFlowAliasRequest build() {
            return new UpdateFlowAliasRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFlowAliasRequest} extends {@link TeaModel}
     *
     * <p>UpdateFlowAliasRequest</p>
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
