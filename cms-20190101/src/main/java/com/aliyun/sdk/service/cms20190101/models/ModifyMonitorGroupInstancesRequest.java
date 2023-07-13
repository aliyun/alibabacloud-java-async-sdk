// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>ModifyMonitorGroupInstancesRequest</p>
 */
public class ModifyMonitorGroupInstancesRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("Instances")
    @Validation(required = true)
    private java.util.List < Instances> instances;

    private ModifyMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMonitorGroupInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<ModifyMonitorGroupInstancesRequest, Builder> {
        private Long groupId; 
        private java.util.List < Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMonitorGroupInstancesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instances = request.instances;
        } 

        /**
         * The ID of the region where the instance resides. Valid values of N: 1 to 2000.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public ModifyMonitorGroupInstancesRequest build() {
            return new ModifyMonitorGroupInstancesRequest(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        private String instanceName;

        @NameInMap("RegionId")
        @Validation(required = true)
        private String regionId;

        private Instances(Builder builder) {
            this.category = builder.category;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String category; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            /**
             * The ID of the instance. Valid values of N: 1 to 2000.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The name of the instance. Valid values of N: 1 to 2000.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
