// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
    private java.util.List<Resources> resources;

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
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String option; 
        private java.util.List<Resources> resources; 

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
         * <p>The ID of the workspace. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The creation behavior. Valid values:</p>
         * <ul>
         * <li><p><code>CreateAndAttach</code>: Creates a resource and attaches it to the workspace.</p>
         * </li>
         * <li><p><code>Attach</code>: Attaches an existing resource to the workspace. This option requires you to specify the <code>Name</code>, <code>ResourceType</code>, <code>GroupName</code>, and <code>EnvType</code> parameters.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>MaxCompute resources only support the <code>Attach</code> option.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CreateAndAttach</p>
         */
        public Builder option(String option) {
            this.putBodyParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>The list of resources.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public CreateWorkspaceResourceRequest build() {
            return new CreateWorkspaceResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkspaceResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceResourceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>system.support.eas</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreateWorkspaceResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceResourceRequest</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
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

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.id = model.id;
            } 

            /**
             * <p>The ID of the resource quota. To obtain the resource quota ID, see <a href="https://help.aliyun.com/document_detail/449144.html">ListQuotas</a>. This parameter is required only for subscription MaxCompute resources.
             * For ECS, Lingjun, and ACS resources, you do not need to specify this parameter. Their quota information is configured in the <code>Spec</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>232892******92912</p>
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
    /**
     * 
     * {@link CreateWorkspaceResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceResourceRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String envType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Quotas")
        private java.util.List<Quotas> quotas;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private java.util.Map<String, ?> spec;

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
        public java.util.List<Labels> getLabels() {
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
        public java.util.List<Quotas> getQuotas() {
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
        public java.util.Map<String, ?> getSpec() {
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
            private java.util.List<Labels> labels; 
            private String name; 
            private String productType; 
            private java.util.List<Quotas> quotas; 
            private String resourceType; 
            private java.util.Map<String, ?> spec; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.envType = model.envType;
                this.groupName = model.groupName;
                this.isDefault = model.isDefault;
                this.labels = model.labels;
                this.name = model.name;
                this.productType = model.productType;
                this.quotas = model.quotas;
                this.resourceType = model.resourceType;
                this.spec = model.spec;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The environment type. Valid values:</p>
             * <ul>
             * <li><p><code>dev</code>: development environment</p>
             * </li>
             * <li><p><code>prod</code>: production environment</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The name of the resource group. The name must be unique within an Alibaba Cloud account. This parameter is required for MaxCompute, ECS, Lingjun, ACS, and Flink resources.</p>
             * 
             * <strong>example:</strong>
             * <p>groupName</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Indicates whether this is the default resource for its type. Each resource type can have only one default resource.</p>
             * <ul>
             * <li><p><code>false</code> (default): The resource is not the default resource.</p>
             * </li>
             * <li><p><code>true</code>: The resource is the default resource.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>An array of resource tags.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The resource name. The name must meet the following requirements:</p>
             * <ul>
             * <li><p>Must be 3 to 28 characters long, start with a letter, and can contain only letters, digits, and underscores (_).</p>
             * </li>
             * <li><p>Must be unique within the same region.</p>
             * </li>
             * <li><p>If <code>Option</code> is set to <code>Attach</code> and <code>ResourceType</code> is set to <code>MaxCompute</code>, this parameter specifies the project name.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated and will be removed in a future version. Use the <code>ResourceType</code> parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The resource quotas. Currently, only MaxCompute resources have resource quotas.</p>
             */
            public Builder quotas(java.util.List<Quotas> quotas) {
                this.quotas = quotas;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li><p><code>MaxCompute</code>: MaxCompute resources</p>
             * </li>
             * <li><p><code>ECS</code>: general-purpose computing resources</p>
             * </li>
             * <li><p><code>Lingjun</code>: Lingjun intelligent computing resources</p>
             * </li>
             * <li><p><code>ACS</code>: ACS computing resources</p>
             * </li>
             * <li><p><code>Flink</code>: Flink resources</p>
             * </li>
             * <li><p><code>SelfManagedAckPro</code>: unified managed cluster resource (AckPro)</p>
             * </li>
             * <li><p><code>SelfManagedAckLingjun</code>: unified managed cluster resource (AckLingjun)</p>
             * </li>
             * <li><p><code>SelfManagedASI</code>: unified managed cluster resource for third-party clouds (ASI)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The resource specification in JSON format. For ECS and Lingjun resources, the format is as follows:
             * {<br>
             * &quot;clusterType&quot;: &quot;The type of the cluster&quot;,
             * &quot;resourceId&quot;: &quot;The ID of the quota&quot;,
             * &quot;resourceName&quot;: &quot;The name of the quota&quot;
             * }
             * The <code>clusterType</code> parameter can have the following values:<br></p>
             * <ul>
             * <li><p><code>share</code>: shared resource group</p>
             * </li>
             * <li><p><code>private</code>: dedicated resource group</p>
             * </li>
             * <li><p><code>FullyManaged</code>: fully managed ACS resource</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;clusterType&quot;: &quot;private&quot;,
             *         &quot;resourceId&quot;: &quot;quota1c<strong><strong><strong>b4&quot;,
             *         &quot;resourceName&quot;: &quot;unif</strong></strong></strong>90&quot;
             *       }</p>
             */
            public Builder spec(java.util.Map<String, ?> spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the resource belongs. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
