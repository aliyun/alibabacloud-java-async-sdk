// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeatureDetailsResponseBody</p>
 */
public class GetFeatureDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceCleaner")
    private ResourceCleaner resourceCleaner;

    @NameInMap("TemplateParameterConstraints")
    private TemplateParameterConstraints templateParameterConstraints;

    @NameInMap("TemplateScratch")
    private TemplateScratch templateScratch;

    @NameInMap("Terraform")
    private Terraform terraform;

    private GetFeatureDetailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceCleaner = builder.resourceCleaner;
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
        private String requestId; 
        private ResourceCleaner resourceCleaner; 
        private TemplateParameterConstraints templateParameterConstraints; 
        private TemplateScratch templateScratch; 
        private Terraform terraform; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceCleaner.
         */
        public Builder resourceCleaner(ResourceCleaner resourceCleaner) {
            this.resourceCleaner = resourceCleaner;
            return this;
        }

        /**
         * TemplateParameterConstraints.
         */
        public Builder templateParameterConstraints(TemplateParameterConstraints templateParameterConstraints) {
            this.templateParameterConstraints = templateParameterConstraints;
            return this;
        }

        /**
         * TemplateScratch.
         */
        public Builder templateScratch(TemplateScratch templateScratch) {
            this.templateScratch = templateScratch;
            return this;
        }

        /**
         * Terraform.
         */
        public Builder terraform(Terraform terraform) {
            this.terraform = terraform;
            return this;
        }

        public GetFeatureDetailsResponseBody build() {
            return new GetFeatureDetailsResponseBody(this);
        } 

    } 

    public static class SupportedResourceTypes extends TeaModel {
        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SideEffects")
        private java.util.List < String > sideEffects;

        @NameInMap("SupportedFilters")
        private java.util.List < String > supportedFilters;

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
        public java.util.List < String > getSideEffects() {
            return this.sideEffects;
        }

        /**
         * @return supportedFilters
         */
        public java.util.List < String > getSupportedFilters() {
            return this.supportedFilters;
        }

        public static final class Builder {
            private String resourceType; 
            private java.util.List < String > sideEffects; 
            private java.util.List < String > supportedFilters; 

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SideEffects.
             */
            public Builder sideEffects(java.util.List < String > sideEffects) {
                this.sideEffects = sideEffects;
                return this;
            }

            /**
             * SupportedFilters.
             */
            public Builder supportedFilters(java.util.List < String > supportedFilters) {
                this.supportedFilters = supportedFilters;
                return this;
            }

            public SupportedResourceTypes build() {
                return new SupportedResourceTypes(this);
            } 

        } 

    }
    public static class ResourceCleaner extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        private java.util.List < SupportedResourceTypes> supportedResourceTypes;

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
        public java.util.List < SupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List < SupportedResourceTypes> supportedResourceTypes; 

            /**
             * SupportedResourceTypes.
             */
            public Builder supportedResourceTypes(java.util.List < SupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public ResourceCleaner build() {
                return new ResourceCleaner(this);
            } 

        } 

    }
    public static class TemplateParameterConstraintsSupportedResourceTypes extends TeaModel {
        @NameInMap("Properties")
        private java.util.List < String > properties;

        @NameInMap("ResourceType")
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
        public java.util.List < String > getProperties() {
            return this.properties;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > properties; 
            private String resourceType; 

            /**
             * Properties.
             */
            public Builder properties(java.util.List < String > properties) {
                this.properties = properties;
                return this;
            }

            /**
             * ResourceType.
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
    public static class TemplateParameterConstraints extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        private java.util.List < TemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes;

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
        public java.util.List < TemplateParameterConstraintsSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List < TemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes; 

            /**
             * SupportedResourceTypes.
             */
            public Builder supportedResourceTypes(java.util.List < TemplateParameterConstraintsSupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public TemplateParameterConstraints build() {
                return new TemplateParameterConstraints(this);
            } 

        } 

    }
    public static class TemplateScratchSupportedResourceTypes extends TeaModel {
        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SourceResourceGroupSupported")
        private Boolean sourceResourceGroupSupported;

        @NameInMap("SourceResourcesSupported")
        private Boolean sourceResourcesSupported;

        @NameInMap("SourceSupported")
        private Boolean sourceSupported;

        @NameInMap("SourceTagSupported")
        private Boolean sourceTagSupported;

        private TemplateScratchSupportedResourceTypes(Builder builder) {
            this.resourceType = builder.resourceType;
            this.sourceResourceGroupSupported = builder.sourceResourceGroupSupported;
            this.sourceResourcesSupported = builder.sourceResourcesSupported;
            this.sourceSupported = builder.sourceSupported;
            this.sourceTagSupported = builder.sourceTagSupported;
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

        public static final class Builder {
            private String resourceType; 
            private Boolean sourceResourceGroupSupported; 
            private Boolean sourceResourcesSupported; 
            private Boolean sourceSupported; 
            private Boolean sourceTagSupported; 

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SourceResourceGroupSupported.
             */
            public Builder sourceResourceGroupSupported(Boolean sourceResourceGroupSupported) {
                this.sourceResourceGroupSupported = sourceResourceGroupSupported;
                return this;
            }

            /**
             * SourceResourcesSupported.
             */
            public Builder sourceResourcesSupported(Boolean sourceResourcesSupported) {
                this.sourceResourcesSupported = sourceResourcesSupported;
                return this;
            }

            /**
             * SourceSupported.
             */
            public Builder sourceSupported(Boolean sourceSupported) {
                this.sourceSupported = sourceSupported;
                return this;
            }

            /**
             * SourceTagSupported.
             */
            public Builder sourceTagSupported(Boolean sourceTagSupported) {
                this.sourceTagSupported = sourceTagSupported;
                return this;
            }

            public TemplateScratchSupportedResourceTypes build() {
                return new TemplateScratchSupportedResourceTypes(this);
            } 

        } 

    }
    public static class TemplateScratch extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        private java.util.List < TemplateScratchSupportedResourceTypes> supportedResourceTypes;

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
        public java.util.List < TemplateScratchSupportedResourceTypes> getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public static final class Builder {
            private java.util.List < TemplateScratchSupportedResourceTypes> supportedResourceTypes; 

            /**
             * SupportedResourceTypes.
             */
            public Builder supportedResourceTypes(java.util.List < TemplateScratchSupportedResourceTypes> supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            public TemplateScratch build() {
                return new TemplateScratch(this);
            } 

        } 

    }
    public static class StackOperationRisk extends TeaModel {
        @NameInMap("DeleteStack")
        private java.util.List < String > deleteStack;

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
        public java.util.List < String > getDeleteStack() {
            return this.deleteStack;
        }

        public static final class Builder {
            private java.util.List < String > deleteStack; 

            /**
             * DeleteStack.
             */
            public Builder deleteStack(java.util.List < String > deleteStack) {
                this.deleteStack = deleteStack;
                return this;
            }

            public StackOperationRisk build() {
                return new StackOperationRisk(this);
            } 

        } 

    }
    public static class TerraformSupportedResourceTypes extends TeaModel {
        @NameInMap("CustomTag")
        private java.util.List < String > customTag;

        @NameInMap("EstimateCost")
        private java.util.List < String > estimateCost;

        @NameInMap("ResourceGroup")
        private java.util.List < String > resourceGroup;

        @NameInMap("StackOperationRisk")
        private StackOperationRisk stackOperationRisk;

        @NameInMap("SystemTag")
        private java.util.List < String > systemTag;

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
        public java.util.List < String > getCustomTag() {
            return this.customTag;
        }

        /**
         * @return estimateCost
         */
        public java.util.List < String > getEstimateCost() {
            return this.estimateCost;
        }

        /**
         * @return resourceGroup
         */
        public java.util.List < String > getResourceGroup() {
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
        public java.util.List < String > getSystemTag() {
            return this.systemTag;
        }

        public static final class Builder {
            private java.util.List < String > customTag; 
            private java.util.List < String > estimateCost; 
            private java.util.List < String > resourceGroup; 
            private StackOperationRisk stackOperationRisk; 
            private java.util.List < String > systemTag; 

            /**
             * CustomTag.
             */
            public Builder customTag(java.util.List < String > customTag) {
                this.customTag = customTag;
                return this;
            }

            /**
             * EstimateCost.
             */
            public Builder estimateCost(java.util.List < String > estimateCost) {
                this.estimateCost = estimateCost;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(java.util.List < String > resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * StackOperationRisk.
             */
            public Builder stackOperationRisk(StackOperationRisk stackOperationRisk) {
                this.stackOperationRisk = stackOperationRisk;
                return this;
            }

            /**
             * SystemTag.
             */
            public Builder systemTag(java.util.List < String > systemTag) {
                this.systemTag = systemTag;
                return this;
            }

            public TerraformSupportedResourceTypes build() {
                return new TerraformSupportedResourceTypes(this);
            } 

        } 

    }
    public static class ProviderVersions extends TeaModel {
        @NameInMap("ProviderName")
        private String providerName;

        @NameInMap("SupportedVersions")
        private java.util.List < String > supportedVersions;

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
        public java.util.List < String > getSupportedVersions() {
            return this.supportedVersions;
        }

        public static final class Builder {
            private String providerName; 
            private java.util.List < String > supportedVersions; 

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * SupportedVersions.
             */
            public Builder supportedVersions(java.util.List < String > supportedVersions) {
                this.supportedVersions = supportedVersions;
                return this;
            }

            public ProviderVersions build() {
                return new ProviderVersions(this);
            } 

        } 

    }
    public static class SupportedVersions extends TeaModel {
        @NameInMap("ProviderVersions")
        private java.util.List < ProviderVersions> providerVersions;

        @NameInMap("TerraformVersion")
        private String terraformVersion;

        @NameInMap("Transform")
        private String transform;

        @NameInMap("UpdateAllowedTransforms")
        private java.util.List < String > updateAllowedTransforms;

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
        public java.util.List < ProviderVersions> getProviderVersions() {
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
        public java.util.List < String > getUpdateAllowedTransforms() {
            return this.updateAllowedTransforms;
        }

        public static final class Builder {
            private java.util.List < ProviderVersions> providerVersions; 
            private String terraformVersion; 
            private String transform; 
            private java.util.List < String > updateAllowedTransforms; 

            /**
             * ProviderVersions.
             */
            public Builder providerVersions(java.util.List < ProviderVersions> providerVersions) {
                this.providerVersions = providerVersions;
                return this;
            }

            /**
             * TerraformVersion.
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * Transform.
             */
            public Builder transform(String transform) {
                this.transform = transform;
                return this;
            }

            /**
             * UpdateAllowedTransforms.
             */
            public Builder updateAllowedTransforms(java.util.List < String > updateAllowedTransforms) {
                this.updateAllowedTransforms = updateAllowedTransforms;
                return this;
            }

            public SupportedVersions build() {
                return new SupportedVersions(this);
            } 

        } 

    }
    public static class Terraform extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        private TerraformSupportedResourceTypes supportedResourceTypes;

        @NameInMap("SupportedVersions")
        private java.util.List < SupportedVersions> supportedVersions;

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
        public java.util.List < SupportedVersions> getSupportedVersions() {
            return this.supportedVersions;
        }

        public static final class Builder {
            private TerraformSupportedResourceTypes supportedResourceTypes; 
            private java.util.List < SupportedVersions> supportedVersions; 

            /**
             * SupportedResourceTypes.
             */
            public Builder supportedResourceTypes(TerraformSupportedResourceTypes supportedResourceTypes) {
                this.supportedResourceTypes = supportedResourceTypes;
                return this;
            }

            /**
             * SupportedVersions.
             */
            public Builder supportedVersions(java.util.List < SupportedVersions> supportedVersions) {
                this.supportedVersions = supportedVersions;
                return this;
            }

            public Terraform build() {
                return new Terraform(this);
            } 

        } 

    }
}
