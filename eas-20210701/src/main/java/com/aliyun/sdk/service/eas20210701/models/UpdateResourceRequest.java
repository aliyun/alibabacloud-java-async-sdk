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
    @NameInMap("ResourceName")
    private String resourceName;

    @Body
    @NameInMap("SelfManagedResourceOptions")
    private SelfManagedResourceOptions selfManagedResourceOptions;

    private UpdateResourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.selfManagedResourceOptions = builder.selfManagedResourceOptions;
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return selfManagedResourceOptions
     */
    public SelfManagedResourceOptions getSelfManagedResourceOptions() {
        return this.selfManagedResourceOptions;
    }

    public static final class Builder extends Request.Builder<UpdateResourceRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String resourceName; 
        private SelfManagedResourceOptions selfManagedResourceOptions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.selfManagedResourceOptions = request.selfManagedResourceOptions;
        } 

        /**
         * The ID of the region to which the resource group belongs.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the resource group. For more information about how to query the ID of a resource group, see [ListResources](~~412133~~).
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The new name of the resource group after the update. The name can be up to 27 characters in length.
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * The configurable options for self managed resource group.
         */
        public Builder selfManagedResourceOptions(SelfManagedResourceOptions selfManagedResourceOptions) {
            this.putBodyParameter("SelfManagedResourceOptions", selfManagedResourceOptions);
            this.selfManagedResourceOptions = selfManagedResourceOptions;
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
             * The effect.
             * <p>
             * 
             * Valid values:
             * - PreferNoSchedule
             * - NoSchedule
             * - NoExecute
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * The name of the key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Relationship between key names and key values.
             * <p>
             * Valid values:
             * - Equal
             * - Exists
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The name of the value.
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
    public static class SelfManagedResourceOptions extends TeaModel {
        @NameInMap("NodeMatchLabels")
        private java.util.Map < String, String > nodeMatchLabels;

        @NameInMap("NodeTolerations")
        private java.util.List < NodeTolerations> nodeTolerations;

        private SelfManagedResourceOptions(Builder builder) {
            this.nodeMatchLabels = builder.nodeMatchLabels;
            this.nodeTolerations = builder.nodeTolerations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelfManagedResourceOptions create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.Map < String, String > nodeMatchLabels; 
            private java.util.List < NodeTolerations> nodeTolerations; 

            /**
             * The key-value pairs for matched nodes.
             */
            public Builder nodeMatchLabels(java.util.Map < String, String > nodeMatchLabels) {
                this.nodeMatchLabels = nodeMatchLabels;
                return this;
            }

            /**
             * Tolerations for nodes.
             */
            public Builder nodeTolerations(java.util.List < NodeTolerations> nodeTolerations) {
                this.nodeTolerations = nodeTolerations;
                return this;
            }

            public SelfManagedResourceOptions build() {
                return new SelfManagedResourceOptions(this);
            } 

        } 

    }
}
