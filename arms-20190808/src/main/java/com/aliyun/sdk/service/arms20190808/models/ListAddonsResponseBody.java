// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAddonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAddonsResponseBody</p>
 */
public class ListAddonsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAddonsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Status code: 200 indicates success.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the alert rule was deleted. Valid values:
         * <p>
         * 
         * *   `true`: The alert rule was deleted.
         * *   `false`: The alert rule failed to be deleted.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAddonsResponseBody build() {
            return new ListAddonsResponseBody(this);
        } 

    } 

    public static class Dashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            /**
             * Description of the dashboard.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name of the dashboard.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * URL of the dashboard.
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
    public static class Dependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterTypes")
        private java.util.List < String > clusterTypes;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.Map < String, Boolean > features;

        @com.aliyun.core.annotation.NameInMap("Services")
        private java.util.List < String > services;

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
        public java.util.List < String > getClusterTypes() {
            return this.clusterTypes;
        }

        /**
         * @return features
         */
        public java.util.Map < String, Boolean > getFeatures() {
            return this.features;
        }

        /**
         * @return services
         */
        public java.util.List < String > getServices() {
            return this.services;
        }

        public static final class Builder {
            private java.util.List < String > clusterTypes; 
            private java.util.Map < String, Boolean > features; 
            private java.util.List < String > services; 

            /**
             * ClusterTypes.
             */
            public Builder clusterTypes(java.util.List < String > clusterTypes) {
                this.clusterTypes = clusterTypes;
                return this;
            }

            /**
             * Name of the Feature.
             */
            public Builder features(java.util.Map < String, Boolean > features) {
                this.features = features;
                return this;
            }

            /**
             * Service list.
             */
            public Builder services(java.util.List < String > services) {
                this.services = services;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
    public static class MetricCheckRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromQL")
        private java.util.List < String > promQL;

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
        public java.util.List < String > getPromQL() {
            return this.promQL;
        }

        public static final class Builder {
            private java.util.List < String > promQL; 

            /**
             * PromQL list.
             */
            public Builder promQL(java.util.List < String > promQL) {
                this.promQL = promQL;
                return this;
            }

            public MetricCheckRule build() {
                return new MetricCheckRule(this);
            } 

        } 

    }
    public static class Protocols extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            /**
             * Description of the Protocol.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Icon address.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Label of the Protocol.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name of the Protocol.
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
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDefaultStatus")
        private String alertDefaultStatus;

        @com.aliyun.core.annotation.NameInMap("DefaultInstall")
        private Boolean defaultInstall;

        @com.aliyun.core.annotation.NameInMap("EnableServiceAccount")
        private Boolean enableServiceAccount;

        @com.aliyun.core.annotation.NameInMap("MetricCheckRule")
        private MetricCheckRule metricCheckRule;

        @com.aliyun.core.annotation.NameInMap("NeedRestartAfterIntegration")
        private Boolean needRestartAfterIntegration;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List < Protocols> protocols;

        @com.aliyun.core.annotation.NameInMap("TargetAddonName")
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
        public java.util.List < Protocols> getProtocols() {
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
            private java.util.List < Protocols> protocols; 
            private String targetAddonName; 

            /**
             * Default alert status.
             */
            public Builder alertDefaultStatus(String alertDefaultStatus) {
                this.alertDefaultStatus = alertDefaultStatus;
                return this;
            }

            /**
             * Default install status.
             */
            public Builder defaultInstall(Boolean defaultInstall) {
                this.defaultInstall = defaultInstall;
                return this;
            }

            /**
             * Whether to enable a service account.
             */
            public Builder enableServiceAccount(Boolean enableServiceAccount) {
                this.enableServiceAccount = enableServiceAccount;
                return this;
            }

            /**
             * Metric check rule PromQL.
             */
            public Builder metricCheckRule(MetricCheckRule metricCheckRule) {
                this.metricCheckRule = metricCheckRule;
                return this;
            }

            /**
             * Whether to restart after integration.
             */
            public Builder needRestartAfterIntegration(Boolean needRestartAfterIntegration) {
                this.needRestartAfterIntegration = needRestartAfterIntegration;
                return this;
            }

            /**
             * Protocol list.
             */
            public Builder protocols(java.util.List < Protocols> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * Target Addon name.
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
    public static class Environments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dependencies")
        private Dependencies dependencies;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private Policies policies;

        private Environments(Builder builder) {
            this.dependencies = builder.dependencies;
            this.description = builder.description;
            this.enable = builder.enable;
            this.label = builder.label;
            this.name = builder.name;
            this.policies = builder.policies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environments create() {
            return builder().build();
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

        public static final class Builder {
            private Dependencies dependencies; 
            private String description; 
            private Boolean enable; 
            private String label; 
            private String name; 
            private Policies policies; 

            /**
             * Dependency list.
             */
            public Builder dependencies(Dependencies dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * Description of environment.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Whether to enable it.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Label of the environment.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name of the environment.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Policies list.
             */
            public Builder policies(Policies policies) {
                this.policies = policies;
                return this;
            }

            public Environments build() {
                return new Environments(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < String > categories;

        @com.aliyun.core.annotation.NameInMap("Dashboards")
        private java.util.List < Dashboards> dashboards;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Environments")
        private java.util.List < Environments> environments;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List < String > keywords;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LatestReleaseCreateTime")
        private String latestReleaseCreateTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Once")
        private Boolean once;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return dashboards
         */
        public java.util.List < Dashboards> getDashboards() {
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
        public java.util.List < Environments> getEnvironments() {
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
        public java.util.List < String > getKeywords() {
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
            private java.util.List < String > categories; 
            private java.util.List < Dashboards> dashboards; 
            private String description; 
            private java.util.List < Environments> environments; 
            private String icon; 
            private java.util.List < String > keywords; 
            private String language; 
            private String latestReleaseCreateTime; 
            private String name; 
            private Boolean once; 
            private String scene; 
            private String version; 
            private String weight; 

            /**
             * Ailas of the Addon.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Categories list.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * Dashboard list.
             */
            public Builder dashboards(java.util.List < Dashboards> dashboards) {
                this.dashboards = dashboards;
                return this;
            }

            /**
             * Description of the Addon.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Environment list.
             */
            public Builder environments(java.util.List < Environments> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * Icon address.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Keyword list.
             */
            public Builder keywords(java.util.List < String > keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Last installation time.
             */
            public Builder latestReleaseCreateTime(String latestReleaseCreateTime) {
                this.latestReleaseCreateTime = latestReleaseCreateTime;
                return this;
            }

            /**
             * Name of the Addon.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Whether to install it only once.
             */
            public Builder once(Boolean once) {
                this.once = once;
                return this;
            }

            /**
             * Scene of the Addon.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Version of the Addon.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * Weight of the Addon.
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
