// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceLinkedRoleForDeletingResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleForDeletingResponseBody</p>
 */
public class CheckServiceLinkedRoleForDeletingResponseBody extends TeaModel {
    @NameInMap("Deletable")
    private Boolean deletable;

    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleUsages")
    private RoleUsages roleUsages;

    private CheckServiceLinkedRoleForDeletingResponseBody(Builder builder) {
        this.deletable = builder.deletable;
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.roleUsages = builder.roleUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleForDeletingResponseBody create() {
        return builder().build();
    }

    /**
     * @return deletable
     */
    public Boolean getDeletable() {
        return this.deletable;
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleUsages
     */
    public RoleUsages getRoleUsages() {
        return this.roleUsages;
    }

    public static final class Builder {
        private Boolean deletable; 
        private Instances instances; 
        private String requestId; 
        private RoleUsages roleUsages; 

        /**
         * Deletable.
         */
        public Builder deletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleUsages.
         */
        public Builder roleUsages(RoleUsages roleUsages) {
            this.roleUsages = roleUsages;
            return this;
        }

        public CheckServiceLinkedRoleForDeletingResponseBody build() {
            return new CheckServiceLinkedRoleForDeletingResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        private Instance(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < String > resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < String > getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < String > resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < String > resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class RoleUsage extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("Resources")
        private Resources resources;

        private RoleUsage(Builder builder) {
            this.region = builder.region;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleUsage create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String region; 
            private Resources resources; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            public RoleUsage build() {
                return new RoleUsage(this);
            } 

        } 

    }
    public static class RoleUsages extends TeaModel {
        @NameInMap("RoleUsage")
        private java.util.List < RoleUsage> roleUsage;

        private RoleUsages(Builder builder) {
            this.roleUsage = builder.roleUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleUsages create() {
            return builder().build();
        }

        /**
         * @return roleUsage
         */
        public java.util.List < RoleUsage> getRoleUsage() {
            return this.roleUsage;
        }

        public static final class Builder {
            private java.util.List < RoleUsage> roleUsage; 

            /**
             * RoleUsage.
             */
            public Builder roleUsage(java.util.List < RoleUsage> roleUsage) {
                this.roleUsage = roleUsage;
                return this;
            }

            public RoleUsages build() {
                return new RoleUsages(this);
            } 

        } 

    }
}
