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
 * {@link CreateFlowAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowAliasRequest</p>
 */
public class CreateFlowAliasRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RoutingConfigurations> routingConfigurations;

    private CreateFlowAliasRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.flowName = builder.flowName;
        this.name = builder.name;
        this.routingConfigurations = builder.routingConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowAliasRequest create() {
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

    public static final class Builder extends Request.Builder<CreateFlowAliasRequest, Builder> {
        private String description; 
        private String flowName; 
        private String name; 
        private java.util.List<RoutingConfigurations> routingConfigurations; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowAliasRequest request) {
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
         * <p>example-alias-name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routingConfigurations(java.util.List<RoutingConfigurations> routingConfigurations) {
            String routingConfigurationsShrink = shrink(routingConfigurations, "RoutingConfigurations", "json");
            this.putBodyParameter("RoutingConfigurations", routingConfigurationsShrink);
            this.routingConfigurations = routingConfigurations;
            return this;
        }

        @Override
        public CreateFlowAliasRequest build() {
            return new CreateFlowAliasRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFlowAliasRequest} extends {@link TeaModel}
     *
     * <p>CreateFlowAliasRequest</p>
     */
    public static class RoutingConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
