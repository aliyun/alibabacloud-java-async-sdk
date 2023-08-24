// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceRequest</p>
 */
public class UpdateResourceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Body
    @NameInMap("NodeMatchLabels")
    private java.util.Map < String, String > nodeMatchLabels;

    @Body
    @NameInMap("NodeTolerations")
    private java.util.List < NodeTolerations> nodeTolerations;

    @Body
    @NameInMap("ResourceName")
    private String resourceName;

    private UpdateResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.nodeMatchLabels = builder.nodeMatchLabels;
        this.nodeTolerations = builder.nodeTolerations;
        this.resourceName = builder.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return nodeMatchLabels
     */
    public java.util.Map < String, String > getNodeMatchLabels() {
        return this.nodeMatchLabels;
    }

    /**
     * @return nodeTolerations
     */
    public java.util.List < NodeTolerations> getNodeTolerations() {
        return this.nodeTolerations;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    public static final class Builder extends Request.Builder<UpdateResourceRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private java.util.Map < String, String > nodeMatchLabels; 
        private java.util.List < NodeTolerations> nodeTolerations; 
        private String resourceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.nodeMatchLabels = request.nodeMatchLabels;
            this.nodeTolerations = request.nodeTolerations;
            this.resourceName = request.resourceName;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * NodeMatchLabels.
         */
        public Builder nodeMatchLabels(java.util.Map < String, String > nodeMatchLabels) {
            this.putBodyParameter("NodeMatchLabels", nodeMatchLabels);
            this.nodeMatchLabels = nodeMatchLabels;
            return this;
        }

        /**
         * NodeTolerations.
         */
        public Builder nodeTolerations(java.util.List < NodeTolerations> nodeTolerations) {
            this.putBodyParameter("NodeTolerations", nodeTolerations);
            this.nodeTolerations = nodeTolerations;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        @Override
        public UpdateResourceRequest build() {
            return new UpdateResourceRequest(this);
        } 

    } 

    public static class NodeTolerations extends TeaModel {
        @NameInMap("effect")
        private String effect;

        @NameInMap("key")
        private String key;

        @NameInMap("operator")
        private String operator;

        @NameInMap("value")
        private String value;

        private NodeTolerations(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTolerations create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String operator; 
            private String value; 

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
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
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NodeTolerations build() {
                return new NodeTolerations(this);
            } 

        } 

    }
}
