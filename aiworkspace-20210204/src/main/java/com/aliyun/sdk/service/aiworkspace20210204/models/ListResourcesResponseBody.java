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
 * {@link ListResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesResponseBody</p>
 */
public class ListResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1e195c5116124202371861018d5bde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The number of resources that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourcesResponseBody build() {
            return new ListResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Encryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Encryption(Builder builder) {
            this.algorithm = builder.algorithm;
            this.enabled = builder.enabled;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String algorithm; 
            private Boolean enabled; 
            private String key; 

            private Builder() {
            } 

            private Builder(Encryption model) {
                this.algorithm = model.algorithm;
                this.enabled = model.enabled;
                this.key = model.key;
            } 

            /**
             * <p>The encryption algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>AESCTR</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>Indicates whether the resources are encrypted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The primary key for the encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Executor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        private Executor(Builder builder) {
            this.ownerId = builder.ownerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executor create() {
            return builder().build();
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        public static final class Builder {
            private String ownerId; 

            private Builder() {
            } 

            private Builder(Executor model) {
                this.ownerId = model.ownerId;
            } 

            /**
             * <p>This parameter is invalid and deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>110973******7793</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            public Executor build() {
                return new Executor(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>system.supported.dsw</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
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
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Specs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Specs(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Specs model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>cu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The specification description.</p>
             * 
             * <strong>example:</strong>
             * <p>11500</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Specs build() {
                return new Specs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardType")
        private String cardType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("Specs")
        private java.util.List<Specs> specs;

        private Quotas(Builder builder) {
            this.cardType = builder.cardType;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.mode = builder.mode;
            this.name = builder.name;
            this.productCode = builder.productCode;
            this.quotaType = builder.quotaType;
            this.specs = builder.specs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return cardType
         */
        public String getCardType() {
            return this.cardType;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return specs
         */
        public java.util.List<Specs> getSpecs() {
            return this.specs;
        }

        public static final class Builder {
            private String cardType; 
            private String displayName; 
            private String id; 
            private String mode; 
            private String name; 
            private String productCode; 
            private String quotaType; 
            private java.util.List<Specs> specs; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.cardType = model.cardType;
                this.displayName = model.displayName;
                this.id = model.id;
                this.mode = model.mode;
                this.name = model.name;
                this.productCode = model.productCode;
                this.quotaType = model.quotaType;
                this.specs = model.specs;
            } 

            /**
             * <p>The resource group type. Valid values:</p>
             * <ul>
             * <li>CPU</li>
             * <li>GPU</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
             */
            public Builder cardType(String cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * <p>The alias of the quota.</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>isolate: subscription</li>
             * <li>share: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>develop</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>QuotaName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The product code. Valid values:</p>
             * <ul>
             * <li>PAI_isolate: CPU subscription resource groups of PAI</li>
             * <li>PAI_share: GPU pay-as-you-go resource groups of PAI</li>
             * <li>MaxCompute_share: pay-as-you-go resource groups of MaxCompute</li>
             * <li>MaxCompute_isolate: subscription resource groups of MaxCompute</li>
             * <li>DataWorks_isolate: subscription resource groups of DataWorks</li>
             * <li>DataWorks_share: pay-as-you-go resource groups of DataWorks</li>
             * <li>DLC_share: pay-as-you-go resource groups of Deep Learning Containers (DLC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute_isolate</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota type. Valid values:</p>
             * <ul>
             * <li>PAI</li>
             * <li>MaxCompute</li>
             * <li>DLC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The quota specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cu&quot;:&quot;11500&quot;,&quot;minCu&quot;:&quot;2300&quot;,&quot;parentId&quot;:&quot;0&quot;}</p>
             */
            public Builder specs(java.util.List<Specs> specs) {
                this.specs = specs;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private Executor executor;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
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
        private String workspaceId;

        private Resources(Builder builder) {
            this.encryption = builder.encryption;
            this.envType = builder.envType;
            this.executor = builder.executor;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.groupName = builder.groupName;
            this.id = builder.id;
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
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return executor
         */
        public Executor getExecutor() {
            return this.executor;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
            private Encryption encryption; 
            private String envType; 
            private Executor executor; 
            private String gmtCreateTime; 
            private String groupName; 
            private String id; 
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
                this.encryption = model.encryption;
                this.envType = model.envType;
                this.executor = model.executor;
                this.gmtCreateTime = model.gmtCreateTime;
                this.groupName = model.groupName;
                this.id = model.id;
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
             * <p>The encryption information, which is valid only for MaxCompute resources.</p>
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The environment type. Valid values:</p>
             * <ul>
             * <li>dev: development environment</li>
             * <li>prod: production environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>This parameter is invalid and deprecated.</p>
             */
            public Builder executor(Executor executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The time when the resource group is created, in UTC. The time follows the ISO 8601 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-21T17:12:35.232Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The name of the resource group, which is unique within the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>groupName</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the resource is the default resource. Each type of resources has a default resource. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>**This field is no longer used and will be removed. Use the ResourceType field.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The quotas.</p>
             */
            public Builder quotas(java.util.List<Quotas> quotas) {
                this.quotas = quotas;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li>MaxCompute</li>
             * <li>DLC</li>
             * <li>FLINK</li>
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
             * <p>The resource specification.</p>
             * 
             * <strong>example:</strong>
             * <p>对于MaxCompute {&quot;Endpoint&quot;: &quot;odps.alibaba-inc.com&quot;, &quot;Project&quot;: &quot;mignshi&quot;}</p>
             */
            public Builder spec(java.util.Map<String, ?> spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
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
