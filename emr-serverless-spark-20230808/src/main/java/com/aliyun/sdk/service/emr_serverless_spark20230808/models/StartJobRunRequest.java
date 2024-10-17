// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartJobRunRequest} extends {@link RequestModel}
 *
 * <p>StartJobRunRequest</p>
 */
public class StartJobRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeType")
    private String codeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configurationOverrides")
    private ConfigurationOverrides configurationOverrides;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executionTimeoutSeconds")
    private Integer executionTimeoutSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fusion")
    private Boolean fusion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobDriver")
    private JobDriver jobDriver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("releaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceQueueId")
    private String resourceQueueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tag > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private StartJobRunRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clientToken = builder.clientToken;
        this.codeType = builder.codeType;
        this.configurationOverrides = builder.configurationOverrides;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.executionTimeoutSeconds = builder.executionTimeoutSeconds;
        this.fusion = builder.fusion;
        this.jobDriver = builder.jobDriver;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.releaseVersion = builder.releaseVersion;
        this.resourceQueueId = builder.resourceQueueId;
        this.tags = builder.tags;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartJobRunRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * @return configurationOverrides
     */
    public ConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * @return displayReleaseVersion
     */
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    /**
     * @return executionTimeoutSeconds
     */
    public Integer getExecutionTimeoutSeconds() {
        return this.executionTimeoutSeconds;
    }

    /**
     * @return fusion
     */
    public Boolean getFusion() {
        return this.fusion;
    }

    /**
     * @return jobDriver
     */
    public JobDriver getJobDriver() {
        return this.jobDriver;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return resourceQueueId
     */
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartJobRunRequest, Builder> {
        private String workspaceId; 
        private String clientToken; 
        private String codeType; 
        private ConfigurationOverrides configurationOverrides; 
        private String displayReleaseVersion; 
        private Integer executionTimeoutSeconds; 
        private Boolean fusion; 
        private JobDriver jobDriver; 
        private String jobId; 
        private String name; 
        private String releaseVersion; 
        private String resourceQueueId; 
        private java.util.List < Tag > tags; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartJobRunRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clientToken = request.clientToken;
            this.codeType = request.codeType;
            this.configurationOverrides = request.configurationOverrides;
            this.displayReleaseVersion = request.displayReleaseVersion;
            this.executionTimeoutSeconds = request.executionTimeoutSeconds;
            this.fusion = request.fusion;
            this.jobDriver = request.jobDriver;
            this.jobId = request.jobId;
            this.name = request.name;
            this.releaseVersion = request.releaseVersion;
            this.resourceQueueId = request.resourceQueueId;
            this.tags = request.tags;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-123213123131</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8e6aae2810c8f67229ca70bb31cd6028</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The code type of the job. Valid values:</p>
         * <ul>
         * <li>SQL</li>
         * <li>JAR</li>
         * <li>PYTHON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        public Builder codeType(String codeType) {
            this.putBodyParameter("codeType", codeType);
            this.codeType = codeType;
            return this;
        }

        /**
         * <p>The advanced configurations of Spark.</p>
         */
        public Builder configurationOverrides(ConfigurationOverrides configurationOverrides) {
            this.putBodyParameter("configurationOverrides", configurationOverrides);
            this.configurationOverrides = configurationOverrides;
            return this;
        }

        /**
         * displayReleaseVersion.
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.putBodyParameter("displayReleaseVersion", displayReleaseVersion);
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The timeout period of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder executionTimeoutSeconds(Integer executionTimeoutSeconds) {
            this.putBodyParameter("executionTimeoutSeconds", executionTimeoutSeconds);
            this.executionTimeoutSeconds = executionTimeoutSeconds;
            return this;
        }

        /**
         * fusion.
         */
        public Builder fusion(Boolean fusion) {
            this.putBodyParameter("fusion", fusion);
            this.fusion = fusion;
            return this;
        }

        /**
         * <p>The information about Spark Driver.</p>
         */
        public Builder jobDriver(JobDriver jobDriver) {
            this.putBodyParameter("jobDriver", jobDriver);
            this.jobDriver = jobDriver;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-12345</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>spark_job_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The version number of Spark.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-3.3.1</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putBodyParameter("releaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>The name of the resource queue on which the Spark job runs.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        public Builder resourceQueueId(String resourceQueueId) {
            this.putBodyParameter("resourceQueueId", resourceQueueId);
            this.resourceQueueId = resourceQueueId;
            return this;
        }

        /**
         * <p>The tags of the job.</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StartJobRunRequest build() {
            return new StartJobRunRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartJobRunRequest} extends {@link TeaModel}
     *
     * <p>StartJobRunRequest</p>
     */
    public static class Configurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("configItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("configItemValue")
        private String configItemValue;

        private Configurations(Builder builder) {
            this.configFileName = builder.configFileName;
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configurations create() {
            return builder().build();
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return configItemKey
         */
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        /**
         * @return configItemValue
         */
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public static final class Builder {
            private String configFileName; 
            private String configItemKey; 
            private String configItemValue; 

            /**
             * <p>The configuration file of SparkConf.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-default.conf</p>
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * <p>The key of SparkConf.</p>
             * 
             * <strong>example:</strong>
             * <p>spark.app.name</p>
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * <p>The value of SparkConf.</p>
             * 
             * <strong>example:</strong>
             * <p>test_app</p>
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public Configurations build() {
                return new Configurations(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartJobRunRequest} extends {@link TeaModel}
     *
     * <p>StartJobRunRequest</p>
     */
    public static class ConfigurationOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configurations")
        private java.util.List < Configurations> configurations;

        private ConfigurationOverrides(Builder builder) {
            this.configurations = builder.configurations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationOverrides create() {
            return builder().build();
        }

        /**
         * @return configurations
         */
        public java.util.List < Configurations> getConfigurations() {
            return this.configurations;
        }

        public static final class Builder {
            private java.util.List < Configurations> configurations; 

            /**
             * <p>The SparkConf objects.</p>
             */
            public Builder configurations(java.util.List < Configurations> configurations) {
                this.configurations = configurations;
                return this;
            }

            public ConfigurationOverrides build() {
                return new ConfigurationOverrides(this);
            } 

        } 

    }
}
