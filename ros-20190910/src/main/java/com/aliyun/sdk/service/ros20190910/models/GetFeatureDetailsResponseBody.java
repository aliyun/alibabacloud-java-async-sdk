// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeatureDetailsResponseBody</p>
 */
public class GetFeatureDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DriftDetection")
    private DriftDetection driftDetection;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCleaner")
    private ResourceCleaner resourceCleaner;

    @com.aliyun.core.annotation.NameInMap("ResourceImport")
    private ResourceImport resourceImport;

    @com.aliyun.core.annotation.NameInMap("TemplateParameterConstraints")
    private TemplateParameterConstraints templateParameterConstraints;

    @com.aliyun.core.annotation.NameInMap("TemplateScratch")
    private TemplateScratch templateScratch;

    @com.aliyun.core.annotation.NameInMap("Terraform")
    private Terraform terraform;

    private GetFeatureDetailsResponseBody(Builder builder) {
        this.driftDetection = builder.driftDetection;
        this.requestId = builder.requestId;
        this.resourceCleaner = builder.resourceCleaner;
        this.resourceImport = builder.resourceImport;
        this.templateParameterConstraints = builder.templateParameterConstraints;
        this.templateScratch = builder.templateScratch;
        this.terraform = builder.terraform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driftDetection
     */
    public DriftDetection getDriftDetection() {
        return this.driftDetection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceCleaner
     */
    public ResourceCleaner getResourceCleaner() {
        return this.resourceCleaner;
    }

    /**
     * @return resourceImport
     */
    public ResourceImport getResourceImport() {
        return this.resourceImport;
    }

    /**
     * @return templateParameterConstraints
     */
    public TemplateParameterConstraints getTemplateParameterConstraints() {
        return this.templateParameterConstraints;
    }

    /**
     * @return templateScratch
     */
    public TemplateScratch getTemplateScratch() {
        return this.templateScratch;
    }

    /**
     * @return terraform
     */
    public Terraform getTerraform() {
        return this.terraform;
    }

    public static final class Builder {
        private DriftDetection driftDetection; 
        private String requestId; 
        private ResourceCleaner resourceCleaner; 
        private ResourceImport resourceImport; 
        private TemplateParameterConstraints templateParameterConstraints; 
        private TemplateScratch templateScratch; 
        private Terraform terraform; 

        private Builder() {
        } 

        private Builder(GetFeatureDetailsResponseBody model) {
            this.driftDetection = model.driftDetection;
            this.requestId = model.requestId;
            this.resourceCleaner = model.resourceCleaner;
            this.resourceImport = model.resourceImport;
            this.templateParameterConstraints = model.templateParameterConstraints;
            this.templateScratch = model.templateScratch;
            this.terraform = model.terraform;
        } 

        /**
         * <p>Details of the drift detection feature.</p>
         */
        public Builder driftDetection(DriftDetection driftDetection) {
            this.driftDetection = driftDetection;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EBF833DA-D0E2-52BE-92E2-59CA56BE834E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the resource cleaner feature.</p>
         */
        public Builder resourceCleaner(ResourceCleaner resourceCleaner) {
            this.resourceCleaner = resourceCleaner;
            return this;
        }

        /**
         * <p>Details of the resource import feature.</p>
         */
        public Builder resourceImport(ResourceImport resourceImport) {
            this.resourceImport = resourceImport;
            return this;
        }

        /**
         * <p>Details of the template parameter constraint feature.</p>
         */
        public Builder templateParameterConstraints(TemplateParameterConstraints templateParameterConstraints) {
            this.templateParameterConstraints = templateParameterConstraints;
            return this;
        }

        /**
         * <p>Details of the scenario feature.</p>
         */
        public Builder templateScratch(TemplateScratch templateScratch) {
            this.templateScratch = templateScratch;
            return this;
        }

        /**
         * <p>Details of the Terraform hosting feature.</p>
         */
        public Builder terraform(Terraform terraform) {
            this.terraform = terraform;
            return this;
        }

        public GetFeatureDetailsResponseBody build() {
            return new GetFeatureDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class DriftDetection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResourceTypes")
        private java.util.List<String> supportedResourceTypes;

        private DriftDetection(Builder builder) {
            this.supportedResourceTypes = builder.supportedResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriftDetection create() {
            return builder().build();
        }

        /**
         * @return supportedResourceTypes
         */
        public java.util.List<String> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List<String> supportedResourceTypes; 

            private Builder() {
            } 

            private Builder(DriftDetection model) {
                this.supportedResourceTypes = model.supportedResourceTypes;
            } 

            /**
             * <p>The resource types that are supported by the drift detection feature.</p>
             */
            public Builder supportedResourceTypes(java.util.List<String> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public DriftDetection build() {
                return new DriftDetection(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class SupportedResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SideEffects")
        private java.util.List<String> sideEffects;

        @com.aliyun.core.annotation.NameInMap("SupportedFilters")
        private java.util.List<String> supportedFilters;

        private SupportedResourceTypes(Builder builder) {
            this.resourceType = builder.resourceType;
            this.sideEffects = builder.sideEffects;
            this.supportedFilters = builder.supportedFilters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResourceTypes create() {
            return builder().build();
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sideEffects
         */
        public java.util.List<String> getSideEffects() {
            return this.sideEffects;
        }

        /**
         * @return supportedFilters
         */
        public java.util.List<String> getSupportedFilters() {
            return this.supportedFilters;
        }

        public static final class Builder {
            private String resourceType; 
            private java.util.List<String> sideEffects; 
            private java.util.List<String> supportedFilters; 

            private Builder() {
            } 

            private Builder(SupportedResourceTypes model) {
                this.resourceType = model.resourceType;
                this.sideEffects = model.sideEffects;
                this.supportedFilters = model.supportedFilters;
            } 

            /**
             * <p>The resource type that supports the resource cleaner feature.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS:Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The names of the side effects that may be caused by the cleanup operation performed on the resources of the specified type.</p>
             */
            public Builder sideEffects(java.util.List<String> sideEffects) {
                this.sideEffects = sideEffects;
                return this;
            }

            /**
             * <p>The names of the filters that are supported by the resource type.</p>
             */
            public Builder supportedFilters(java.util.List<String> supportedFilters) {
                this.supportedFilters = supportedFilters;
                return this;
            }

            public SupportedResourceTypes build() {
                return new SupportedResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class ResourceCleaner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResourceTypes")
        private java.util.List<SupportedResourceTypes> supportedResourceTypes;

        private ResourceCleaner(Builder builder) {
            this.supportedResourceTypes = builder.supportedResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCleaner create() {
            return builder().build();
        }

        /**
         * @return supportedResourceTypes
         */
        public java.util.List<SupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List<SupportedResourceTypes> supportedResourceTypes; 

            private Builder() {
            } 

            private Builder(ResourceCleaner model) {
                this.supportedResourceTypes = model.supportedResourceTypes;
            } 

            /**
             * <p>The resource types that can be cleaned up.</p>
             */
            public Builder supportedResourceTypes(java.util.List<SupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public ResourceCleaner build() {
                return new ResourceCleaner(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class ResourceImportSupportedResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceIdentifiers")
        private java.util.List<String> resourceIdentifiers;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceImportSupportedResourceTypes(Builder builder) {
            this.resourceIdentifiers = builder.resourceIdentifiers;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceImportSupportedResourceTypes create() {
            return builder().build();
        }

        /**
         * @return resourceIdentifiers
         */
        public java.util.List<String> getResourceIdentifiers() {
            return this.resourceIdentifiers;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<String> resourceIdentifiers; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceImportSupportedResourceTypes model) {
                this.resourceIdentifiers = model.resourceIdentifiers;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The resource identifiers.</p>
             */
            public Builder resourceIdentifiers(java.util.List<String> resourceIdentifiers) {
                this.resourceIdentifiers = resourceIdentifiers;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::Disk</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceImportSupportedResourceTypes build() {
                return new ResourceImportSupportedResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class ResourceImport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResourceTypes")
        private java.util.List<ResourceImportSupportedResourceTypes> supportedResourceTypes;

        private ResourceImport(Builder builder) {
            this.supportedResourceTypes = builder.supportedResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceImport create() {
            return builder().build();
        }

        /**
         * @return supportedResourceTypes
         */
        public java.util.List<ResourceImportSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List<ResourceImportSupportedResourceTypes> supportedResourceTypes; 

            private Builder() {
            } 

            private Builder(ResourceImport model) {
                this.supportedResourceTypes = model.supportedResourceTypes;
            } 

            /**
             * <p>The resource types that are supported by the resource import feature.</p>
             */
            public Builder supportedResourceTypes(java.util.List<ResourceImportSupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public ResourceImport build() {
                return new ResourceImport(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class TemplateParameterConstraintsSupportedResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<String> properties;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private TemplateParameterConstraintsSupportedResourceTypes(Builder builder) {
            this.properties = builder.properties;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateParameterConstraintsSupportedResourceTypes create() {
            return builder().build();
        }

        /**
         * @return properties
         */
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<String> properties; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(TemplateParameterConstraintsSupportedResourceTypes model) {
                this.properties = model.properties;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The names of properties that are supported by the resource type.</p>
             */
            public Builder properties(java.util.List<String> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::Disk</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public TemplateParameterConstraintsSupportedResourceTypes build() {
                return new TemplateParameterConstraintsSupportedResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class TemplateParameterConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResourceTypes")
        private java.util.List<TemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes;

        private TemplateParameterConstraints(Builder builder) {
            this.supportedResourceTypes = builder.supportedResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateParameterConstraints create() {
            return builder().build();
        }

        /**
         * @return supportedResourceTypes
         */
        public java.util.List<TemplateParameterConstraintsSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List<TemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes; 

            private Builder() {
            } 

            private Builder(TemplateParameterConstraints model) {
                this.supportedResourceTypes = model.supportedResourceTypes;
            } 

            /**
             * <p>The resource types that support the template parameter constraint feature.</p>
             */
            public Builder supportedResourceTypes(java.util.List<TemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public TemplateParameterConstraints build() {
                return new TemplateParameterConstraints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class TemplateScratchSupportedResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SourceResourceGroupSupported")
        private Boolean sourceResourceGroupSupported;

        @com.aliyun.core.annotation.NameInMap("SourceResourcesSupported")
        private Boolean sourceResourcesSupported;

        @com.aliyun.core.annotation.NameInMap("SourceSupported")
        private Boolean sourceSupported;

        @com.aliyun.core.annotation.NameInMap("SourceTagSupported")
        private Boolean sourceTagSupported;

        @com.aliyun.core.annotation.NameInMap("SupportedTemplateScratchTypes")
        private java.util.List<String> supportedTemplateScratchTypes;

        private TemplateScratchSupportedResourceTypes(Builder builder) {
            this.resourceType = builder.resourceType;
            this.sourceResourceGroupSupported = builder.sourceResourceGroupSupported;
            this.sourceResourcesSupported = builder.sourceResourcesSupported;
            this.sourceSupported = builder.sourceSupported;
            this.sourceTagSupported = builder.sourceTagSupported;
            this.supportedTemplateScratchTypes = builder.supportedTemplateScratchTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateScratchSupportedResourceTypes create() {
            return builder().build();
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sourceResourceGroupSupported
         */
        public Boolean getSourceResourceGroupSupported() {
            return this.sourceResourceGroupSupported;
        }

        /**
         * @return sourceResourcesSupported
         */
        public Boolean getSourceResourcesSupported() {
            return this.sourceResourcesSupported;
        }

        /**
         * @return sourceSupported
         */
        public Boolean getSourceSupported() {
            return this.sourceSupported;
        }

        /**
         * @return sourceTagSupported
         */
        public Boolean getSourceTagSupported() {
            return this.sourceTagSupported;
        }

        /**
         * @return supportedTemplateScratchTypes
         */
        public java.util.List<String> getSupportedTemplateScratchTypes() {
            return this.supportedTemplateScratchTypes;
        }

        public static final class Builder {
            private String resourceType; 
            private Boolean sourceResourceGroupSupported; 
            private Boolean sourceResourcesSupported; 
            private Boolean sourceSupported; 
            private Boolean sourceTagSupported; 
            private java.util.List<String> supportedTemplateScratchTypes; 

            private Builder() {
            } 

            private Builder(TemplateScratchSupportedResourceTypes model) {
                this.resourceType = model.resourceType;
                this.sourceResourceGroupSupported = model.sourceResourceGroupSupported;
                this.sourceResourcesSupported = model.sourceResourcesSupported;
                this.sourceSupported = model.sourceSupported;
                this.sourceTagSupported = model.sourceTagSupported;
                this.supportedTemplateScratchTypes = model.supportedTemplateScratchTypes;
            } 

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::Disk</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Indicates whether the resource scope can be specified by source resource group. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sourceResourceGroupSupported(Boolean sourceResourceGroupSupported) {
                this.sourceResourceGroupSupported = sourceResourceGroupSupported;
                return this;
            }

            /**
             * <p>Indicates whether the resource scope can be specified by source resource. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sourceResourcesSupported(Boolean sourceResourcesSupported) {
                this.sourceResourcesSupported = sourceResourcesSupported;
                return this;
            }

            /**
             * <p>Indicates whether the resource scope can be specified by source tag, resource group, or resource. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sourceSupported(Boolean sourceSupported) {
                this.sourceSupported = sourceSupported;
                return this;
            }

            /**
             * <p>Indicates whether the resource scope can be specified by source tag. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sourceTagSupported(Boolean sourceTagSupported) {
                this.sourceTagSupported = sourceTagSupported;
                return this;
            }

            /**
             * <p>The scenario types that are supported.</p>
             */
            public Builder supportedTemplateScratchTypes(java.util.List<String> supportedTemplateScratchTypes) {
                this.supportedTemplateScratchTypes = supportedTemplateScratchTypes;
                return this;
            }

            public TemplateScratchSupportedResourceTypes build() {
                return new TemplateScratchSupportedResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class TemplateScratch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResourceTypes")
        private java.util.List<TemplateScratchSupportedResourceTypes> supportedResourceTypes;

        private TemplateScratch(Builder builder) {
            this.supportedResourceTypes = builder.supportedResourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateScratch create() {
            return builder().build();
        }

        /**
         * @return supportedResourceTypes
         */
        public java.util.List<TemplateScratchSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List<TemplateScratchSupportedResourceTypes> supportedResourceTypes; 

            private Builder() {
            } 

            private Builder(TemplateScratch model) {
                this.supportedResourceTypes = model.supportedResourceTypes;
            } 

            /**
             * <p>The resource types that are supported by the scenario feature.</p>
             */
            public Builder supportedResourceTypes(java.util.List<TemplateScratchSupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public TemplateScratch build() {
                return new TemplateScratch(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class StackOperationRisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteStack")
        private java.util.List<String> deleteStack;

        private StackOperationRisk(Builder builder) {
            this.deleteStack = builder.deleteStack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackOperationRisk create() {
            return builder().build();
        }

        /**
         * @return deleteStack
         */
        public java.util.List<String> getDeleteStack() {
            return this.deleteStack;
        }

        public static final class Builder {
            private java.util.List<String> deleteStack; 

            private Builder() {
            } 

            private Builder(StackOperationRisk model) {
                this.deleteStack = model.deleteStack;
            } 

            /**
             * <p>The resource types that support the risk check performed to detect risks caused by a stack deletion operation.</p>
             */
            public Builder deleteStack(java.util.List<String> deleteStack) {
                this.deleteStack = deleteStack;
                return this;
            }

            public StackOperationRisk build() {
                return new StackOperationRisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class TerraformSupportedResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomTag")
        private java.util.List<String> customTag;

        @com.aliyun.core.annotation.NameInMap("EstimateCost")
        private java.util.List<String> estimateCost;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private java.util.List<String> resourceGroup;

        @com.aliyun.core.annotation.NameInMap("StackOperationRisk")
        private StackOperationRisk stackOperationRisk;

        @com.aliyun.core.annotation.NameInMap("SystemTag")
        private java.util.List<String> systemTag;

        private TerraformSupportedResourceTypes(Builder builder) {
            this.customTag = builder.customTag;
            this.estimateCost = builder.estimateCost;
            this.resourceGroup = builder.resourceGroup;
            this.stackOperationRisk = builder.stackOperationRisk;
            this.systemTag = builder.systemTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerraformSupportedResourceTypes create() {
            return builder().build();
        }

        /**
         * @return customTag
         */
        public java.util.List<String> getCustomTag() {
            return this.customTag;
        }

        /**
         * @return estimateCost
         */
        public java.util.List<String> getEstimateCost() {
            return this.estimateCost;
        }

        /**
         * @return resourceGroup
         */
        public java.util.List<String> getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return stackOperationRisk
         */
        public StackOperationRisk getStackOperationRisk() {
            return this.stackOperationRisk;
        }

        /**
         * @return systemTag
         */
        public java.util.List<String> getSystemTag() {
            return this.systemTag;
        }

        public static final class Builder {
            private java.util.List<String> customTag; 
            private java.util.List<String> estimateCost; 
            private java.util.List<String> resourceGroup; 
            private StackOperationRisk stackOperationRisk; 
            private java.util.List<String> systemTag; 

            private Builder() {
            } 

            private Builder(TerraformSupportedResourceTypes model) {
                this.customTag = model.customTag;
                this.estimateCost = model.estimateCost;
                this.resourceGroup = model.resourceGroup;
                this.stackOperationRisk = model.stackOperationRisk;
                this.systemTag = model.systemTag;
            } 

            /**
             * <p>The resource types that support the custom tag feature.</p>
             */
            public Builder customTag(java.util.List<String> customTag) {
                this.customTag = customTag;
                return this;
            }

            /**
             * <p>The resource types that support the price inquiry feature.</p>
             */
            public Builder estimateCost(java.util.List<String> estimateCost) {
                this.estimateCost = estimateCost;
                return this;
            }

            /**
             * <p>The resource types that support the resource group feature.</p>
             */
            public Builder resourceGroup(java.util.List<String> resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The resource type that support the risk check feature.</p>
             */
            public Builder stackOperationRisk(StackOperationRisk stackOperationRisk) {
                this.stackOperationRisk = stackOperationRisk;
                return this;
            }

            /**
             * <p>The resource types that support the system tag <code>acs:ros:stackId</code>.</p>
             */
            public Builder systemTag(java.util.List<String> systemTag) {
                this.systemTag = systemTag;
                return this;
            }

            public TerraformSupportedResourceTypes build() {
                return new TerraformSupportedResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class ProviderVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("SupportedVersions")
        private java.util.List<String> supportedVersions;

        private ProviderVersions(Builder builder) {
            this.providerName = builder.providerName;
            this.supportedVersions = builder.supportedVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProviderVersions create() {
            return builder().build();
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return supportedVersions
         */
        public java.util.List<String> getSupportedVersions() {
            return this.supportedVersions;
        }

        public static final class Builder {
            private String providerName; 
            private java.util.List<String> supportedVersions; 

            private Builder() {
            } 

            private Builder(ProviderVersions model) {
                this.providerName = model.providerName;
                this.supportedVersions = model.supportedVersions;
            } 

            /**
             * <p>The name of the provider.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * <p>The provider versions.</p>
             */
            public Builder supportedVersions(java.util.List<String> supportedVersions) {
                this.supportedVersions = supportedVersions;
                return this;
            }

            public ProviderVersions build() {
                return new ProviderVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class SupportedVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProviderVersions")
        private java.util.List<ProviderVersions> providerVersions;

        @com.aliyun.core.annotation.NameInMap("TerraformVersion")
        private String terraformVersion;

        @com.aliyun.core.annotation.NameInMap("Transform")
        private String transform;

        @com.aliyun.core.annotation.NameInMap("UpdateAllowedTransforms")
        private java.util.List<String> updateAllowedTransforms;

        private SupportedVersions(Builder builder) {
            this.providerVersions = builder.providerVersions;
            this.terraformVersion = builder.terraformVersion;
            this.transform = builder.transform;
            this.updateAllowedTransforms = builder.updateAllowedTransforms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedVersions create() {
            return builder().build();
        }

        /**
         * @return providerVersions
         */
        public java.util.List<ProviderVersions> getProviderVersions() {
            return this.providerVersions;
        }

        /**
         * @return terraformVersion
         */
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        /**
         * @return transform
         */
        public String getTransform() {
            return this.transform;
        }

        /**
         * @return updateAllowedTransforms
         */
        public java.util.List<String> getUpdateAllowedTransforms() {
            return this.updateAllowedTransforms;
        }

        public static final class Builder {
            private java.util.List<ProviderVersions> providerVersions; 
            private String terraformVersion; 
            private String transform; 
            private java.util.List<String> updateAllowedTransforms; 

            private Builder() {
            } 

            private Builder(SupportedVersions model) {
                this.providerVersions = model.providerVersions;
                this.terraformVersion = model.terraformVersion;
                this.transform = model.transform;
                this.updateAllowedTransforms = model.updateAllowedTransforms;
            } 

            /**
             * <p>The names and versions of the providers that correspond to the Terraform versions.</p>
             */
            public Builder providerVersions(java.util.List<ProviderVersions> providerVersions) {
                this.providerVersions = providerVersions;
                return this;
            }

            /**
             * <p>The Terraform version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.11</p>
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * <p>The Terraform version that is supported by ROS. The parameter value is the same as the value of the Transform parameter in a Terraform template.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun::Terraform-v1.0</p>
             */
            public Builder transform(String transform) {
                this.transform = transform;
                return this;
            }

            /**
             * <p>The Terraform versions that can be updated in ROS.</p>
             */
            public Builder updateAllowedTransforms(java.util.List<String> updateAllowedTransforms) {
                this.updateAllowedTransforms = updateAllowedTransforms;
                return this;
            }

            public SupportedVersions build() {
                return new SupportedVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetFeatureDetailsResponseBody</p>
     */
    public static class Terraform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResourceTypes")
        private TerraformSupportedResourceTypes supportedResourceTypes;

        @com.aliyun.core.annotation.NameInMap("SupportedVersions")
        private java.util.List<SupportedVersions> supportedVersions;

        private Terraform(Builder builder) {
            this.supportedResourceTypes = builder.supportedResourceTypes;
            this.supportedVersions = builder.supportedVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terraform create() {
            return builder().build();
        }

        /**
         * @return supportedResourceTypes
         */
        public TerraformSupportedResourceTypes getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        /**
         * @return supportedVersions
         */
        public java.util.List<SupportedVersions> getSupportedVersions() {
            return this.supportedVersions;
        }

        public static final class Builder {
            private TerraformSupportedResourceTypes supportedResourceTypes; 
            private java.util.List<SupportedVersions> supportedVersions; 

            private Builder() {
            } 

            private Builder(Terraform model) {
                this.supportedResourceTypes = model.supportedResourceTypes;
                this.supportedVersions = model.supportedVersions;
            } 

            /**
             * <p>The resource types that support the scenario feature.</p>
             */
            public Builder supportedResourceTypes(TerraformSupportedResourceTypes supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            /**
             * <p>The Terraform versions.</p>
             */
            public Builder supportedVersions(java.util.List<SupportedVersions> supportedVersions) {
                this.supportedVersions = supportedVersions;
                return this;
            }

            public Terraform build() {
                return new Terraform(this);
            } 

        } 

    }
}
