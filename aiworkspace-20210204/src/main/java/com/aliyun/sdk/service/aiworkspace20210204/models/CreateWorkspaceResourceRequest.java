// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceResourceRequest</p>
 */
public class CreateWorkspaceResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private String option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Resources> resources;

    private CreateWorkspaceResourceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.option = builder.option;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String option; 
        private java.util.List < Resources> resources; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceResourceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.option = request.option;
            this.resources = request.resources;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(String option) {
            this.putBodyParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public CreateWorkspaceResourceRequest build() {
            return new CreateWorkspaceResourceRequest(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private Quotas(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String envType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Quotas")
        private java.util.List < Quotas> quotas;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private java.util.Map < String, ? > spec;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String workspaceId;

        private Resources(Builder builder) {
            this.envType = builder.envType;
            this.groupName = builder.groupName;
            this.isDefault = builder.isDefault;
            this.labels = builder.labels;
            this.name = builder.name;
            this.productType = builder.productType;
            this.quotas = builder.quotas;
            this.resourceType = builder.resourceType;
            this.spec = builder.spec;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return quotas
         */
        public java.util.List < Quotas> getQuotas() {
            return this.quotas;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return spec
         */
        public java.util.Map < String, ? > getSpec() {
            return this.spec;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String envType; 
            private String groupName; 
            private Boolean isDefault; 
            private java.util.List < Labels> labels; 
            private String name; 
            private String productType; 
            private java.util.List < Quotas> quotas; 
            private String resourceType; 
            private java.util.Map < String, ? > spec; 
            private String workspaceId; 

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
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
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Quotas.
             */
            public Builder quotas(java.util.List < Quotas> quotas) {
                this.quotas = quotas;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(java.util.Map < String, ? > spec) {
                this.spec = spec;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
