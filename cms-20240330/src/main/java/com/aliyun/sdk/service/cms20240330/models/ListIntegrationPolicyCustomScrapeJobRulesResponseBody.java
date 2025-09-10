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
 * {@link ListIntegrationPolicyCustomScrapeJobRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationPolicyCustomScrapeJobRulesResponseBody</p>
 */
public class ListIntegrationPolicyCustomScrapeJobRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("customScrapeJobRules")
    private java.util.List<CustomScrapeJobRules> customScrapeJobRules;

    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListIntegrationPolicyCustomScrapeJobRulesResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.customScrapeJobRules = builder.customScrapeJobRules;
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyCustomScrapeJobRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return customScrapeJobRules
     */
    public java.util.List<CustomScrapeJobRules> getCustomScrapeJobRules() {
        return this.customScrapeJobRules;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private java.util.List<CustomScrapeJobRules> customScrapeJobRules; 
        private String policyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListIntegrationPolicyCustomScrapeJobRulesResponseBody model) {
            this.clusterId = model.clusterId;
            this.customScrapeJobRules = model.customScrapeJobRules;
            this.policyId = model.policyId;
            this.requestId = model.requestId;
        } 

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * customScrapeJobRules.
         */
        public Builder customScrapeJobRules(java.util.List<CustomScrapeJobRules> customScrapeJobRules) {
            this.customScrapeJobRules = customScrapeJobRules;
            return this;
        }

        /**
         * policyId.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBody build() {
            return new ListIntegrationPolicyCustomScrapeJobRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPolicyCustomScrapeJobRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyCustomScrapeJobRulesResponseBody</p>
     */
    public static class ScrapeConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("metricsPath")
        private String metricsPath;

        @com.aliyun.core.annotation.NameInMap("scheme")
        private String scheme;

        @com.aliyun.core.annotation.NameInMap("scrapeInterval")
        private String scrapeInterval;

        @com.aliyun.core.annotation.NameInMap("scrapeTimeout")
        private String scrapeTimeout;

        @com.aliyun.core.annotation.NameInMap("serviceDiscoveryConfigs")
        private java.util.List<String> serviceDiscoveryConfigs;

        private ScrapeConfigs(Builder builder) {
            this.jobName = builder.jobName;
            this.message = builder.message;
            this.metricsPath = builder.metricsPath;
            this.scheme = builder.scheme;
            this.scrapeInterval = builder.scrapeInterval;
            this.scrapeTimeout = builder.scrapeTimeout;
            this.serviceDiscoveryConfigs = builder.serviceDiscoveryConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScrapeConfigs create() {
            return builder().build();
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return metricsPath
         */
        public String getMetricsPath() {
            return this.metricsPath;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        /**
         * @return scrapeInterval
         */
        public String getScrapeInterval() {
            return this.scrapeInterval;
        }

        /**
         * @return scrapeTimeout
         */
        public String getScrapeTimeout() {
            return this.scrapeTimeout;
        }

        /**
         * @return serviceDiscoveryConfigs
         */
        public java.util.List<String> getServiceDiscoveryConfigs() {
            return this.serviceDiscoveryConfigs;
        }

        public static final class Builder {
            private String jobName; 
            private String message; 
            private String metricsPath; 
            private String scheme; 
            private String scrapeInterval; 
            private String scrapeTimeout; 
            private java.util.List<String> serviceDiscoveryConfigs; 

            private Builder() {
            } 

            private Builder(ScrapeConfigs model) {
                this.jobName = model.jobName;
                this.message = model.message;
                this.metricsPath = model.metricsPath;
                this.scheme = model.scheme;
                this.scrapeInterval = model.scrapeInterval;
                this.scrapeTimeout = model.scrapeTimeout;
                this.serviceDiscoveryConfigs = model.serviceDiscoveryConfigs;
            } 

            /**
             * jobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * metricsPath.
             */
            public Builder metricsPath(String metricsPath) {
                this.metricsPath = metricsPath;
                return this;
            }

            /**
             * scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            /**
             * scrapeInterval.
             */
            public Builder scrapeInterval(String scrapeInterval) {
                this.scrapeInterval = scrapeInterval;
                return this;
            }

            /**
             * scrapeTimeout.
             */
            public Builder scrapeTimeout(String scrapeTimeout) {
                this.scrapeTimeout = scrapeTimeout;
                return this;
            }

            /**
             * serviceDiscoveryConfigs.
             */
            public Builder serviceDiscoveryConfigs(java.util.List<String> serviceDiscoveryConfigs) {
                this.serviceDiscoveryConfigs = serviceDiscoveryConfigs;
                return this;
            }

            public ScrapeConfigs build() {
                return new ScrapeConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPolicyCustomScrapeJobRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyCustomScrapeJobRulesResponseBody</p>
     */
    public static class CustomScrapeJobRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("addonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("addonReleaseName")
        private String addonReleaseName;

        @com.aliyun.core.annotation.NameInMap("addonVersion")
        private String addonVersion;

        @com.aliyun.core.annotation.NameInMap("configYaml")
        private String configYaml;

        @com.aliyun.core.annotation.NameInMap("enableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("encryptYaml")
        private Boolean encryptYaml;

        @com.aliyun.core.annotation.NameInMap("matchedPodCount")
        private Long matchedPodCount;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("scrapeConfigs")
        private java.util.List<ScrapeConfigs> scrapeConfigs;

        private CustomScrapeJobRules(Builder builder) {
            this.addonName = builder.addonName;
            this.addonReleaseName = builder.addonReleaseName;
            this.addonVersion = builder.addonVersion;
            this.configYaml = builder.configYaml;
            this.enableStatus = builder.enableStatus;
            this.encryptYaml = builder.encryptYaml;
            this.matchedPodCount = builder.matchedPodCount;
            this.message = builder.message;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.scrapeConfigs = builder.scrapeConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomScrapeJobRules create() {
            return builder().build();
        }

        /**
         * @return addonName
         */
        public String getAddonName() {
            return this.addonName;
        }

        /**
         * @return addonReleaseName
         */
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        /**
         * @return addonVersion
         */
        public String getAddonVersion() {
            return this.addonVersion;
        }

        /**
         * @return configYaml
         */
        public String getConfigYaml() {
            return this.configYaml;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return encryptYaml
         */
        public Boolean getEncryptYaml() {
            return this.encryptYaml;
        }

        /**
         * @return matchedPodCount
         */
        public Long getMatchedPodCount() {
            return this.matchedPodCount;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return scrapeConfigs
         */
        public java.util.List<ScrapeConfigs> getScrapeConfigs() {
            return this.scrapeConfigs;
        }

        public static final class Builder {
            private String addonName; 
            private String addonReleaseName; 
            private String addonVersion; 
            private String configYaml; 
            private String enableStatus; 
            private Boolean encryptYaml; 
            private Long matchedPodCount; 
            private String message; 
            private String name; 
            private String namespace; 
            private java.util.List<ScrapeConfigs> scrapeConfigs; 

            private Builder() {
            } 

            private Builder(CustomScrapeJobRules model) {
                this.addonName = model.addonName;
                this.addonReleaseName = model.addonReleaseName;
                this.addonVersion = model.addonVersion;
                this.configYaml = model.configYaml;
                this.enableStatus = model.enableStatus;
                this.encryptYaml = model.encryptYaml;
                this.matchedPodCount = model.matchedPodCount;
                this.message = model.message;
                this.name = model.name;
                this.namespace = model.namespace;
                this.scrapeConfigs = model.scrapeConfigs;
            } 

            /**
             * addonName.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * addonReleaseName.
             */
            public Builder addonReleaseName(String addonReleaseName) {
                this.addonReleaseName = addonReleaseName;
                return this;
            }

            /**
             * addonVersion.
             */
            public Builder addonVersion(String addonVersion) {
                this.addonVersion = addonVersion;
                return this;
            }

            /**
             * configYaml.
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * enableStatus.
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * encryptYaml.
             */
            public Builder encryptYaml(Boolean encryptYaml) {
                this.encryptYaml = encryptYaml;
                return this;
            }

            /**
             * matchedPodCount.
             */
            public Builder matchedPodCount(Long matchedPodCount) {
                this.matchedPodCount = matchedPodCount;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * scrapeConfigs.
             */
            public Builder scrapeConfigs(java.util.List<ScrapeConfigs> scrapeConfigs) {
                this.scrapeConfigs = scrapeConfigs;
                return this;
            }

            public CustomScrapeJobRules build() {
                return new CustomScrapeJobRules(this);
            } 

        } 

    }
}
