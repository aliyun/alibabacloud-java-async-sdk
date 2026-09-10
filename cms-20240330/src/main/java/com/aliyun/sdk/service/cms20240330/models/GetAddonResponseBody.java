// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetAddonResponseBody} extends {@link TeaModel}
 *
 * <p>GetAddonResponseBody</p>
 */
public class GetAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAddonResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAddonResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAddonResponseBody build() {
            return new GetAddonResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class Dashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Dashboards(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dashboards create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String url; 

            private Builder() {
            } 

            private Builder(Dashboards model) {
                this.description = model.description;
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * <p>The description of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>rum_api_dot_metric_set</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The URL of the preview image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://iac-service-transfer.oss-cn-hangzhou.aliyuncs.com/78c5_288850010070719968_bdcf7cca781844c8ac4add133791713f">http://iac-service-transfer.oss-cn-hangzhou.aliyuncs.com/78c5_288850010070719968_bdcf7cca781844c8ac4add133791713f</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Dashboards build() {
                return new Dashboards(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class CommonSchemaRefs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private CommonSchemaRefs(Builder builder) {
            this.group = builder.group;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonSchemaRefs create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String group; 
            private String version; 

            private Builder() {
            } 

            private Builder(CommonSchemaRefs model) {
                this.group = model.group;
                this.version = model.version;
            } 

            /**
             * <p>The group name of the common schema.</p>
             * 
             * <strong>example:</strong>
             * <p>acs-ecs</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The version of the common schema.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public CommonSchemaRefs build() {
                return new CommonSchemaRefs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class Dependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterTypes")
        private java.util.List<String> clusterTypes;

        @com.aliyun.core.annotation.NameInMap("features")
        private java.util.Map<String, Boolean> features;

        @com.aliyun.core.annotation.NameInMap("services")
        private java.util.List<String> services;

        private Dependencies(Builder builder) {
            this.clusterTypes = builder.clusterTypes;
            this.features = builder.features;
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dependencies create() {
            return builder().build();
        }

        /**
         * @return clusterTypes
         */
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        /**
         * @return features
         */
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        /**
         * @return services
         */
        public java.util.List<String> getServices() {
            return this.services;
        }

        public static final class Builder {
            private java.util.List<String> clusterTypes; 
            private java.util.Map<String, Boolean> features; 
            private java.util.List<String> services; 

            private Builder() {
            } 

            private Builder(Dependencies model) {
                this.clusterTypes = model.clusterTypes;
                this.features = model.features;
                this.services = model.services;
            } 

            /**
             * <p>The dependencies on cluster types.</p>
             */
            public Builder clusterTypes(java.util.List<String> clusterTypes) {
                this.clusterTypes = clusterTypes;
                return this;
            }

            /**
             * <p>The dependencies on probes.</p>
             */
            public Builder features(java.util.Map<String, Boolean> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The dependencies on activated services.</p>
             */
            public Builder services(java.util.List<String> services) {
                this.services = services;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class MetricCheckRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("promQL")
        private java.util.List<String> promQL;

        private MetricCheckRule(Builder builder) {
            this.promQL = builder.promQL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricCheckRule create() {
            return builder().build();
        }

        /**
         * @return promQL
         */
        public java.util.List<String> getPromQL() {
            return this.promQL;
        }

        public static final class Builder {
            private java.util.List<String> promQL; 

            private Builder() {
            } 

            private Builder(MetricCheckRule model) {
                this.promQL = model.promQL;
            } 

            /**
             * <p>The data check rule that is used after installation.</p>
             */
            public Builder promQL(java.util.List<String> promQL) {
                this.promQL = promQL;
                return this;
            }

            public MetricCheckRule build() {
                return new MetricCheckRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class Protocols extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Protocols(Builder builder) {
            this.description = builder.description;
            this.icon = builder.icon;
            this.label = builder.label;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocols create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String icon; 
            private String label; 
            private String name; 

            private Builder() {
            } 

            private Builder(Protocols model) {
                this.description = model.description;
                this.icon = model.icon;
                this.label = model.label;
                this.name = model.name;
            } 

            /**
             * <p>The description of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>Support OpenTelemetry Protocol</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the icon.</p>
             * 
             * <strong>example:</strong>
             * <p>icon URL</p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The display name of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenTelemetry</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The name of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenTelemetry</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Protocols build() {
                return new Protocols(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertDefaultStatus")
        private String alertDefaultStatus;

        @com.aliyun.core.annotation.NameInMap("defaultInstall")
        private Boolean defaultInstall;

        @com.aliyun.core.annotation.NameInMap("enableServiceAccount")
        private Boolean enableServiceAccount;

        @com.aliyun.core.annotation.NameInMap("metricCheckRule")
        private MetricCheckRule metricCheckRule;

        @com.aliyun.core.annotation.NameInMap("needRestartAfterIntegration")
        private Boolean needRestartAfterIntegration;

        @com.aliyun.core.annotation.NameInMap("protocols")
        private java.util.List<Protocols> protocols;

        @com.aliyun.core.annotation.NameInMap("targetAddonName")
        private String targetAddonName;

        private Policies(Builder builder) {
            this.alertDefaultStatus = builder.alertDefaultStatus;
            this.defaultInstall = builder.defaultInstall;
            this.enableServiceAccount = builder.enableServiceAccount;
            this.metricCheckRule = builder.metricCheckRule;
            this.needRestartAfterIntegration = builder.needRestartAfterIntegration;
            this.protocols = builder.protocols;
            this.targetAddonName = builder.targetAddonName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return alertDefaultStatus
         */
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        /**
         * @return defaultInstall
         */
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        /**
         * @return enableServiceAccount
         */
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        /**
         * @return metricCheckRule
         */
        public MetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        /**
         * @return needRestartAfterIntegration
         */
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        /**
         * @return protocols
         */
        public java.util.List<Protocols> getProtocols() {
            return this.protocols;
        }

        /**
         * @return targetAddonName
         */
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

        public static final class Builder {
            private String alertDefaultStatus; 
            private Boolean defaultInstall; 
            private Boolean enableServiceAccount; 
            private MetricCheckRule metricCheckRule; 
            private Boolean needRestartAfterIntegration; 
            private java.util.List<Protocols> protocols; 
            private String targetAddonName; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.alertDefaultStatus = model.alertDefaultStatus;
                this.defaultInstall = model.defaultInstall;
                this.enableServiceAccount = model.enableServiceAccount;
                this.metricCheckRule = model.metricCheckRule;
                this.needRestartAfterIntegration = model.needRestartAfterIntegration;
                this.protocols = model.protocols;
                this.targetAddonName = model.targetAddonName;
            } 

            /**
             * <p>The status of the default policy for alert rules.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder alertDefaultStatus(String alertDefaultStatus) {
                this.alertDefaultStatus = alertDefaultStatus;
                return this;
            }

            /**
             * <p>Indicates whether the add-on is installed by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultInstall(Boolean defaultInstall) {
                this.defaultInstall = defaultInstall;
                return this;
            }

            /**
             * <p>Indicates whether a service account is assigned for communication with the console API.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableServiceAccount(Boolean enableServiceAccount) {
                this.enableServiceAccount = enableServiceAccount;
                return this;
            }

            /**
             * <p>The metric check rule.</p>
             */
            public Builder metricCheckRule(MetricCheckRule metricCheckRule) {
                this.metricCheckRule = metricCheckRule;
                return this;
            }

            /**
             * <p>Indicates whether to guide the user to restart pods after the add-on is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needRestartAfterIntegration(Boolean needRestartAfterIntegration) {
                this.needRestartAfterIntegration = needRestartAfterIntegration;
                return this;
            }

            /**
             * <p>The protocol.</p>
             */
            public Builder protocols(java.util.List<Protocols> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The name of the target add-on to which the system redirects.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-default</p>
             */
            public Builder targetAddonName(String targetAddonName) {
                this.targetAddonName = targetAddonName;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class Environments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commonSchemaRefs")
        private java.util.List<CommonSchemaRefs> commonSchemaRefs;

        @com.aliyun.core.annotation.NameInMap("dependencies")
        private Dependencies dependencies;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("policies")
        private Policies policies;

        @com.aliyun.core.annotation.NameInMap("policyType")
        private String policyType;

        private Environments(Builder builder) {
            this.commonSchemaRefs = builder.commonSchemaRefs;
            this.dependencies = builder.dependencies;
            this.description = builder.description;
            this.enable = builder.enable;
            this.label = builder.label;
            this.name = builder.name;
            this.policies = builder.policies;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environments create() {
            return builder().build();
        }

        /**
         * @return commonSchemaRefs
         */
        public java.util.List<CommonSchemaRefs> getCommonSchemaRefs() {
            return this.commonSchemaRefs;
        }

        /**
         * @return dependencies
         */
        public Dependencies getDependencies() {
            return this.dependencies;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policies
         */
        public Policies getPolicies() {
            return this.policies;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private java.util.List<CommonSchemaRefs> commonSchemaRefs; 
            private Dependencies dependencies; 
            private String description; 
            private Boolean enable; 
            private String label; 
            private String name; 
            private Policies policies; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(Environments model) {
                this.commonSchemaRefs = model.commonSchemaRefs;
                this.dependencies = model.dependencies;
                this.description = model.description;
                this.enable = model.enable;
                this.label = model.label;
                this.name = model.name;
                this.policies = model.policies;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The list of associated common schemas.</p>
             */
            public Builder commonSchemaRefs(java.util.List<CommonSchemaRefs> commonSchemaRefs) {
                this.commonSchemaRefs = commonSchemaRefs;
                return this;
            }

            /**
             * <p>The dependencies.</p>
             */
            public Builder dependencies(Dependencies dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Observability integration.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The display name of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>容器环境</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-default-umodel-1752755202744_k8s.metric.high_level_metric_deployment_cn-hangzhou/c0a686118449c4390b9cc0a07ea3e0e85</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             */
            public Builder policies(Policies policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The type of the integration policy.</p>
             * 
             * <strong>example:</strong>
             * <p>CS</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public Environments build() {
                return new Environments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAddonResponseBody} extends {@link TeaModel}
     *
     * <p>GetAddonResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("dashboards")
        private java.util.List<Dashboards> dashboards;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environments")
        private java.util.List<Environments> environments;

        @com.aliyun.core.annotation.NameInMap("icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("keywords")
        private java.util.List<String> keywords;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("latestReleaseCreateTime")
        private String latestReleaseCreateTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("once")
        private Boolean once;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("weight")
        private String weight;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.categories = builder.categories;
            this.dashboards = builder.dashboards;
            this.description = builder.description;
            this.environments = builder.environments;
            this.icon = builder.icon;
            this.keywords = builder.keywords;
            this.language = builder.language;
            this.latestReleaseCreateTime = builder.latestReleaseCreateTime;
            this.name = builder.name;
            this.once = builder.once;
            this.scene = builder.scene;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return dashboards
         */
        public java.util.List<Dashboards> getDashboards() {
            return this.dashboards;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environments
         */
        public java.util.List<Environments> getEnvironments() {
            return this.environments;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return keywords
         */
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return latestReleaseCreateTime
         */
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return once
         */
        public Boolean getOnce() {
            return this.once;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List<String> categories; 
            private java.util.List<Dashboards> dashboards; 
            private String description; 
            private java.util.List<Environments> environments; 
            private String icon; 
            private java.util.List<String> keywords; 
            private String language; 
            private String latestReleaseCreateTime; 
            private String name; 
            private Boolean once; 
            private String scene; 
            private String version; 
            private String weight; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alias = model.alias;
                this.categories = model.categories;
                this.dashboards = model.dashboards;
                this.description = model.description;
                this.environments = model.environments;
                this.icon = model.icon;
                this.keywords = model.keywords;
                this.language = model.language;
                this.latestReleaseCreateTime = model.latestReleaseCreateTime;
                this.name = model.name;
                this.once = model.once;
                this.scene = model.scene;
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * <p>The alias of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>resume_vector_alias</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The list of component categories.</p>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The list of dashboards.</p>
             */
            public Builder dashboards(java.util.List<Dashboards> dashboards) {
                this.dashboards = dashboards;
                return this;
            }

            /**
             * <p>The description of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>o11y-demo-cn-heyuan</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment information.</p>
             */
            public Builder environments(java.util.List<Environments> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * <p>The URL of the icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx">https://xxxxx</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The keywords.</p>
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The time when the latest version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-12 12:30:30</p>
             */
            public Builder latestReleaseCreateTime(String latestReleaseCreateTime) {
                this.latestReleaseCreateTime = latestReleaseCreateTime;
                return this;
            }

            /**
             * <p>The name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>rum_api_dashboard_explorer_link_metric_set</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the add-on can be installed only once.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder once(Boolean once) {
                this.once = once;
                return this;
            }

            /**
             * <p>The scenario of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>middleware</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The version of the component.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The weight.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
