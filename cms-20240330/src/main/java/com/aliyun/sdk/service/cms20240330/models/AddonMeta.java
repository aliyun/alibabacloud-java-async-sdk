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
 * {@link AddonMeta} extends {@link TeaModel}
 *
 * <p>AddonMeta</p>
 */
public class AddonMeta extends TeaModel {
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
    private Integer weight;

    private AddonMeta(Builder builder) {
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

    public static AddonMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getWeight() {
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
        private Integer weight; 

        private Builder() {
        } 

        private Builder(AddonMeta model) {
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
         * <p>The alias of the component. This is the display name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS 监控</p>
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * <p>The categorization information of the component.</p>
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>A list of component diagrams.</p>
         */
        public Builder dashboards(java.util.List<Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>The out-of-the-box and comprehensive ECS observe dashboards and alarm rules. Based on AliYun CloudMonitor agentless metrics, exporter agent metrics, host audit logs, host events and other data.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The list of supported environment types.</p>
         */
        public Builder environments(java.util.List<Environments> environments) {
            this.environments = environments;
            return this;
        }

        /**
         * <p>The icon of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>assets/logos/ecs.svg</p>
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * <p>The list of keywords.</p>
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><p>zh: Chinese (default)</p>
         * </li>
         * <li><p>en: English</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The last time the component was integrated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-25 09:12:12</p>
         */
        public Builder latestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-acs-ecs</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the component can be installed only once under a policy.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        public Builder once(Boolean once) {
            this.once = once;
            return this;
        }

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>feature</p>
         */
        public Builder scene(String scene) {
            this.scene = scene;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The sorting weight of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public AddonMeta build() {
            return new AddonMeta(this);
        } 

    } 

    /**
     * 
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
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
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>描述信息</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the diagram.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS 监控概览大盘</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The URL of the diagram.</p>
             * 
             * <strong>example:</strong>
             * <p>assets/dashboards/ecs.png</p>
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
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
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
             * <p>The group name of the CommonSchema.</p>
             * 
             * <strong>example:</strong>
             * <p>acs-ecs</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The group version of the CommonSchema.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0</p>
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
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
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
             * <p>The supported cluster types.</p>
             */
            public Builder clusterTypes(java.util.List<String> clusterTypes) {
                this.clusterTypes = clusterTypes;
                return this;
            }

            /**
             * <p>The probe dependency description. This is the component name. In later versions, this field is replaced by the collectors field.</p>
             */
            public Builder features(java.util.Map<String, Boolean> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The list of dependent services.</p>
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
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
     */
    public static class BindEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entityGroupMode")
        private Boolean entityGroupMode;

        @com.aliyun.core.annotation.NameInMap("entityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("singleEntityMode")
        private Boolean singleEntityMode;

        @com.aliyun.core.annotation.NameInMap("vpcIdFieldKey")
        private String vpcIdFieldKey;

        private BindEntity(Builder builder) {
            this.entityGroupMode = builder.entityGroupMode;
            this.entityType = builder.entityType;
            this.singleEntityMode = builder.singleEntityMode;
            this.vpcIdFieldKey = builder.vpcIdFieldKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindEntity create() {
            return builder().build();
        }

        /**
         * @return entityGroupMode
         */
        public Boolean getEntityGroupMode() {
            return this.entityGroupMode;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return singleEntityMode
         */
        public Boolean getSingleEntityMode() {
            return this.singleEntityMode;
        }

        /**
         * @return vpcIdFieldKey
         */
        public String getVpcIdFieldKey() {
            return this.vpcIdFieldKey;
        }

        public static final class Builder {
            private Boolean entityGroupMode; 
            private String entityType; 
            private Boolean singleEntityMode; 
            private String vpcIdFieldKey; 

            private Builder() {
            } 

            private Builder(BindEntity model) {
                this.entityGroupMode = model.entityGroupMode;
                this.entityType = model.entityType;
                this.singleEntityMode = model.singleEntityMode;
                this.vpcIdFieldKey = model.vpcIdFieldKey;
            } 

            /**
             * <p>Indicates whether group mode is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder entityGroupMode(Boolean entityGroupMode) {
                this.entityGroupMode = entityGroupMode;
                return this;
            }

            /**
             * <p>The entity type.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.ecs.instance</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>Indicates whether single-entity mode is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder singleEntityMode(Boolean singleEntityMode) {
                this.singleEntityMode = singleEntityMode;
                return this;
            }

            /**
             * <p>The field in the entity from which to fetch the VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpcId</p>
             */
            public Builder vpcIdFieldKey(String vpcIdFieldKey) {
                this.vpcIdFieldKey = vpcIdFieldKey;
                return this;
            }

            public BindEntity build() {
                return new BindEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
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
             * <p>The Prometheus Query Language (PromQL) for the check rule.</p>
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
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
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
             * <p>使用 Prometheus 协议写入指标数据</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display icon for the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>assets/logos/ecs.svg</p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The display name of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>Prometheus 协议</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The name of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>Prometheus</p>
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
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertDefaultStatus")
        private String alertDefaultStatus;

        @com.aliyun.core.annotation.NameInMap("bindDefaultPolicy")
        private Boolean bindDefaultPolicy;

        @com.aliyun.core.annotation.NameInMap("bindEntity")
        private BindEntity bindEntity;

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
            this.bindDefaultPolicy = builder.bindDefaultPolicy;
            this.bindEntity = builder.bindEntity;
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
         * @return bindDefaultPolicy
         */
        public Boolean getBindDefaultPolicy() {
            return this.bindDefaultPolicy;
        }

        /**
         * @return bindEntity
         */
        public BindEntity getBindEntity() {
            return this.bindEntity;
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
            private Boolean bindDefaultPolicy; 
            private BindEntity bindEntity; 
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
                this.bindDefaultPolicy = model.bindDefaultPolicy;
                this.bindEntity = model.bindEntity;
                this.defaultInstall = model.defaultInstall;
                this.enableServiceAccount = model.enableServiceAccount;
                this.metricCheckRule = model.metricCheckRule;
                this.needRestartAfterIntegration = model.needRestartAfterIntegration;
                this.protocols = model.protocols;
                this.targetAddonName = model.targetAddonName;
            } 

            /**
             * <p>Indicates whether the alert rule is enabled by default after installation.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder alertDefaultStatus(String alertDefaultStatus) {
                this.alertDefaultStatus = alertDefaultStatus;
                return this;
            }

            /**
             * <p>The default mode. This integration mode does not require attaching an entity.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder bindDefaultPolicy(Boolean bindDefaultPolicy) {
                this.bindDefaultPolicy = bindDefaultPolicy;
                return this;
            }

            /**
             * <p>Information about the attached target entity.</p>
             */
            public Builder bindEntity(BindEntity bindEntity) {
                this.bindEntity = bindEntity;
                return this;
            }

            /**
             * <p>Indicates whether the component is installed by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder defaultInstall(Boolean defaultInstall) {
                this.defaultInstall = defaultInstall;
                return this;
            }

            /**
             * <p>Indicates whether to enable internal authorization token allocation.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder enableServiceAccount(Boolean enableServiceAccount) {
                this.enableServiceAccount = enableServiceAccount;
                return this;
            }

            /**
             * <p>The data check rule after the component is integrated.</p>
             */
            public Builder metricCheckRule(MetricCheckRule metricCheckRule) {
                this.metricCheckRule = metricCheckRule;
                return this;
            }

            /**
             * <p>Indicates whether to prompt for a workload restart after integration.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder needRestartAfterIntegration(Boolean needRestartAfterIntegration) {
                this.needRestartAfterIntegration = needRestartAfterIntegration;
                return this;
            }

            /**
             * <p>The list of supported client protocols.</p>
             */
            public Builder protocols(java.util.List<Protocols> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The name of the target component for redirection.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud-acs-ecs</p>
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
     * {@link AddonMeta} extends {@link TeaModel}
     *
     * <p>AddonMeta</p>
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
             * <p>The list of attached CommonSchemas.</p>
             */
            public Builder commonSchemaRefs(java.util.List<CommonSchemaRefs> commonSchemaRefs) {
                this.commonSchemaRefs = commonSchemaRefs;
                return this;
            }

            /**
             * <p>The dependency description.</p>
             */
            public Builder dependencies(Dependencies dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>The description of the environment type.</p>
             * 
             * <strong>example:</strong>
             * <p>支持容器集群的工作覆盖监控</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the environment type is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The display name of the environment type.</p>
             * 
             * <strong>example:</strong>
             * <p>容器环境</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The name of the environment type.</p>
             * 
             * <strong>example:</strong>
             * <p>CS/ECS/Cloud/Client</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Information about the control policy group for the component.</p>
             */
            public Builder policies(Policies policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
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
}
