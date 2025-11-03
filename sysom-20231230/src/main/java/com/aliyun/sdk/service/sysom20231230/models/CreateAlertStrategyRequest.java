// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CreateAlertStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertStrategyRequest</p>
 */
public class CreateAlertStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("k8sLabel")
    private Boolean k8sLabel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Strategy strategy;

    private CreateAlertStrategyRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.k8sLabel = builder.k8sLabel;
        this.name = builder.name;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return k8sLabel
     */
    public Boolean getK8sLabel() {
        return this.k8sLabel;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return strategy
     */
    public Strategy getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<CreateAlertStrategyRequest, Builder> {
        private Boolean enabled; 
        private Boolean k8sLabel; 
        private String name; 
        private Strategy strategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertStrategyRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.k8sLabel = request.k8sLabel;
            this.name = request.name;
            this.strategy = request.strategy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * k8sLabel.
         */
        public Builder k8sLabel(Boolean k8sLabel) {
            this.putBodyParameter("k8sLabel", k8sLabel);
            this.k8sLabel = k8sLabel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>strategy1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder strategy(Strategy strategy) {
            this.putBodyParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public CreateAlertStrategyRequest build() {
            return new CreateAlertStrategyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlertStrategyRequest} extends {@link TeaModel}
     *
     * <p>CreateAlertStrategyRequest</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusters")
        private java.util.List<String> clusters;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<String> items;

        private Strategy(Builder builder) {
            this.clusters = builder.clusters;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return clusters
         */
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        /**
         * @return items
         */
        public java.util.List<String> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<String> clusters; 
            private java.util.List<String> items; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.clusters = model.clusters;
                this.items = model.items;
            } 

            /**
             * clusters.
             */
            public Builder clusters(java.util.List<String> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<String> items) {
                this.items = items;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
}
