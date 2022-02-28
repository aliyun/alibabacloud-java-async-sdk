// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

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

    @NameInMap("Terraform")
    private Terraform terraform;

    private GetFeatureDetailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
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
     * @return terraform
     */
    public Terraform getTerraform() {
        return this.terraform;
    }

    public static final class Builder {
        private String requestId; 
        private Terraform terraform; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
        @NameInMap("CustomTag")
        private java.util.List < String > customTag;

        @NameInMap("EstimateCost")
        private java.util.List < String > estimateCost;

        @NameInMap("ResourceGroup")
        private java.util.List < String > resourceGroup;

        @NameInMap("SystemTag")
        private java.util.List < String > systemTag;

        private SupportedResourceTypes(Builder builder) {
            this.customTag = builder.customTag;
            this.estimateCost = builder.estimateCost;
            this.resourceGroup = builder.resourceGroup;
            this.systemTag = builder.systemTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResourceTypes create() {
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
         * @return systemTag
         */
        public java.util.List < String > getSystemTag() {
            return this.systemTag;
        }

        public static final class Builder {
            private java.util.List < String > customTag; 
            private java.util.List < String > estimateCost; 
            private java.util.List < String > resourceGroup; 
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
             * SystemTag.
             */
            public Builder systemTag(java.util.List < String > systemTag) {
                this.systemTag = systemTag;
                return this;
            }

            public SupportedResourceTypes build() {
                return new SupportedResourceTypes(this);
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
        private SupportedResourceTypes supportedResourceTypes;

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
        public SupportedResourceTypes getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        /**
         * @return supportedVersions
         */
        public java.util.List < SupportedVersions> getSupportedVersions() {
            return this.supportedVersions;
        }

        public static final class Builder {
            private SupportedResourceTypes supportedResourceTypes; 
            private java.util.List < SupportedVersions> supportedVersions; 

            /**
             * SupportedResourceTypes.
             */
            public Builder supportedResourceTypes(SupportedResourceTypes supportedResourceTypes) {
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
