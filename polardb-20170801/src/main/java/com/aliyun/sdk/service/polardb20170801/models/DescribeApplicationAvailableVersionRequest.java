// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationAvailableVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationAvailableVersionRequest</p>
 */
public class DescribeApplicationAvailableVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeApplicationAvailableVersionRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.components = builder.components;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationAvailableVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationAvailableVersionRequest, Builder> {
        private String applicationId; 
        private String applicationType; 
        private java.util.List<Components> components; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationAvailableVersionRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationType = request.applicationType;
            this.components = request.components;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>The list of application subcomponents.</p>
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putQueryParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeApplicationAvailableVersionRequest build() {
            return new DescribeApplicationAvailableVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationAvailableVersionRequest} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableVersionRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentClass")
        private String componentClass;

        @com.aliyun.core.annotation.NameInMap("ComponentMaxReplica")
        private Long componentMaxReplica;

        @com.aliyun.core.annotation.NameInMap("ComponentReplica")
        private Long componentReplica;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        private Components(Builder builder) {
            this.componentClass = builder.componentClass;
            this.componentMaxReplica = builder.componentMaxReplica;
            this.componentReplica = builder.componentReplica;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentClass
         */
        public String getComponentClass() {
            return this.componentClass;
        }

        /**
         * @return componentMaxReplica
         */
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        /**
         * @return componentReplica
         */
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        public static final class Builder {
            private String componentClass; 
            private Long componentMaxReplica; 
            private Long componentReplica; 
            private String componentType; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentClass = model.componentClass;
                this.componentMaxReplica = model.componentMaxReplica;
                this.componentReplica = model.componentReplica;
                this.componentType = model.componentType;
            } 

            /**
             * <p>The specifications of the application subcomponent.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.app.g2.medium</p>
             */
            public Builder componentClass(String componentClass) {
                this.componentClass = componentClass;
                return this;
            }

            /**
             * <p>The maximum number of application subcomponents of the same specifications. Default value: the value of ComponentReplica. This parameter is supported only by raycluster applications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder componentMaxReplica(Long componentMaxReplica) {
                this.componentMaxReplica = componentMaxReplica;
                return this;
            }

            /**
             * <p>The number of replicas for the application subcomponent. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder componentReplica(Long componentReplica) {
                this.componentReplica = componentReplica;
                return this;
            }

            /**
             * <p>The type of the application subcomponent.</p>
             * 
             * <strong>example:</strong>
             * <p>gateway</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
