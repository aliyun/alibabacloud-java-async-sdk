// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterBootstrapActionRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterBootstrapActionRequest</p>
 */
public class ModifyClusterBootstrapActionRequest extends Request {
    @Query
    @NameInMap("BootstrapAction")
    private java.util.List < BootstrapAction> bootstrapAction;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyClusterBootstrapActionRequest(Builder builder) {
        super(builder);
        this.bootstrapAction = builder.bootstrapAction;
        this.clusterId = builder.clusterId;
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterBootstrapActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bootstrapAction
     */
    public java.util.List < BootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyClusterBootstrapActionRequest, Builder> {
        private java.util.List < BootstrapAction> bootstrapAction; 
        private String clusterId; 
        private String id; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterBootstrapActionRequest response) {
            super(response);
            this.bootstrapAction = response.bootstrapAction;
            this.clusterId = response.clusterId;
            this.id = response.id;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * BootstrapAction.
         */
        public Builder bootstrapAction(java.util.List < BootstrapAction> bootstrapAction) {
            this.putQueryParameter("BootstrapAction", bootstrapAction);
            this.bootstrapAction = bootstrapAction;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyClusterBootstrapActionRequest build() {
            return new ModifyClusterBootstrapActionRequest(this);
        } 

    } 

    public static class BootstrapAction extends TeaModel {
        @NameInMap("Arg")
        private String arg;

        @NameInMap("ExecutionFailStrategy")
        private String executionFailStrategy;

        @NameInMap("ExecutionMoment")
        private String executionMoment;

        @NameInMap("ExecutionTarget")
        private String executionTarget;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Path")
        @Validation(required = true)
        private String path;

        private BootstrapAction(Builder builder) {
            this.arg = builder.arg;
            this.executionFailStrategy = builder.executionFailStrategy;
            this.executionMoment = builder.executionMoment;
            this.executionTarget = builder.executionTarget;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BootstrapAction create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return executionFailStrategy
         */
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        /**
         * @return executionMoment
         */
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        /**
         * @return executionTarget
         */
        public String getExecutionTarget() {
            return this.executionTarget;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String arg; 
            private String executionFailStrategy; 
            private String executionMoment; 
            private String executionTarget; 
            private String name; 
            private String path; 

            /**
             * Arg.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * ExecutionFailStrategy.
             */
            public Builder executionFailStrategy(String executionFailStrategy) {
                this.executionFailStrategy = executionFailStrategy;
                return this;
            }

            /**
             * ExecutionMoment.
             */
            public Builder executionMoment(String executionMoment) {
                this.executionMoment = executionMoment;
                return this;
            }

            /**
             * ExecutionTarget.
             */
            public Builder executionTarget(String executionTarget) {
                this.executionTarget = executionTarget;
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public BootstrapAction build() {
                return new BootstrapAction(this);
            } 

        } 

    }
}
