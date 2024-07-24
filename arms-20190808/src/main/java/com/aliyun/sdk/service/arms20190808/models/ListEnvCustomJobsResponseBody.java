// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvCustomJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvCustomJobsResponseBody</p>
 */
public class ListEnvCustomJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEnvCustomJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvCustomJobsResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnvCustomJobsResponseBody build() {
            return new ListEnvCustomJobsResponseBody(this);
        } 

    } 

    public static class ScrapeConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("MetricsPath")
        private String metricsPath;

        @com.aliyun.core.annotation.NameInMap("ScrapeDiscoverys")
        private java.util.List < String > scrapeDiscoverys;

        @com.aliyun.core.annotation.NameInMap("ScrapeInterval")
        private String scrapeInterval;

        private ScrapeConfigs(Builder builder) {
            this.jobName = builder.jobName;
            this.metricsPath = builder.metricsPath;
            this.scrapeDiscoverys = builder.scrapeDiscoverys;
            this.scrapeInterval = builder.scrapeInterval;
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
         * @return metricsPath
         */
        public String getMetricsPath() {
            return this.metricsPath;
        }

        /**
         * @return scrapeDiscoverys
         */
        public java.util.List < String > getScrapeDiscoverys() {
            return this.scrapeDiscoverys;
        }

        /**
         * @return scrapeInterval
         */
        public String getScrapeInterval() {
            return this.scrapeInterval;
        }

        public static final class Builder {
            private String jobName; 
            private String metricsPath; 
            private java.util.List < String > scrapeDiscoverys; 
            private String scrapeInterval; 

            /**
             * The name of the job.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The path of the metric.
             */
            public Builder metricsPath(String metricsPath) {
                this.metricsPath = metricsPath;
                return this;
            }

            /**
             * The service discovery methods.
             */
            public Builder scrapeDiscoverys(java.util.List < String > scrapeDiscoverys) {
                this.scrapeDiscoverys = scrapeDiscoverys;
                return this;
            }

            /**
             * The capture interval.
             */
            public Builder scrapeInterval(String scrapeInterval) {
                this.scrapeInterval = scrapeInterval;
                return this;
            }

            public ScrapeConfigs build() {
                return new ScrapeConfigs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("AddonReleaseName")
        private String addonReleaseName;

        @com.aliyun.core.annotation.NameInMap("AddonVersion")
        private String addonVersion;

        @com.aliyun.core.annotation.NameInMap("ConfigYaml")
        private String configYaml;

        @com.aliyun.core.annotation.NameInMap("CreationTimestamp")
        private String creationTimestamp;

        @com.aliyun.core.annotation.NameInMap("CustomJobName")
        private String customJobName;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScrapeConfigs")
        private java.util.List < ScrapeConfigs> scrapeConfigs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.addonName = builder.addonName;
            this.addonReleaseName = builder.addonReleaseName;
            this.addonVersion = builder.addonVersion;
            this.configYaml = builder.configYaml;
            this.creationTimestamp = builder.creationTimestamp;
            this.customJobName = builder.customJobName;
            this.environmentId = builder.environmentId;
            this.regionId = builder.regionId;
            this.scrapeConfigs = builder.scrapeConfigs;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return creationTimestamp
         */
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        /**
         * @return customJobName
         */
        public String getCustomJobName() {
            return this.customJobName;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scrapeConfigs
         */
        public java.util.List < ScrapeConfigs> getScrapeConfigs() {
            return this.scrapeConfigs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String addonName; 
            private String addonReleaseName; 
            private String addonVersion; 
            private String configYaml; 
            private String creationTimestamp; 
            private String customJobName; 
            private String environmentId; 
            private String regionId; 
            private java.util.List < ScrapeConfigs> scrapeConfigs; 
            private String status; 

            /**
             * The name of the add-on to which the custom job belongs.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * The instance name of the add-on.
             */
            public Builder addonReleaseName(String addonReleaseName) {
                this.addonReleaseName = addonReleaseName;
                return this;
            }

            /**
             * The version of the add-on.
             */
            public Builder addonVersion(String addonVersion) {
                this.addonVersion = addonVersion;
                return this;
            }

            /**
             * If the request parameter EncryptYaml is set to true, a Base64-encoded YAML string is returned. Otherwise, a plaintext YAML string is returned.
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * The time when the custom job was created. The value of this parameter is a timestamp.
             */
            public Builder creationTimestamp(String creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * The name of the custom job.
             */
            public Builder customJobName(String customJobName) {
                this.customJobName = customJobName;
                return this;
            }

            /**
             * The ID of the environment instance.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The capture configurations.
             */
            public Builder scrapeConfigs(java.util.List < ScrapeConfigs> scrapeConfigs) {
                this.scrapeConfigs = scrapeConfigs;
                return this;
            }

            /**
             * The status of the custom job.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
