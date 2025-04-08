// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateSessionClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateSessionClusterRequest</p>
 */
public class CreateSessionClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("applicationConfigs")
    private java.util.List<ApplicationConfigs> applicationConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoStartConfiguration")
    private AutoStartConfiguration autoStartConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoStopConfiguration")
    private AutoStopConfiguration autoStopConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("envId")
    private String envId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fusion")
    private Boolean fusion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("releaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateSessionClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.applicationConfigs = builder.applicationConfigs;
        this.autoStartConfiguration = builder.autoStartConfiguration;
        this.autoStopConfiguration = builder.autoStopConfiguration;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.envId = builder.envId;
        this.fusion = builder.fusion;
        this.kind = builder.kind;
        this.name = builder.name;
        this.queueName = builder.queueName;
        this.releaseVersion = builder.releaseVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionClusterRequest create() {
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
     * @return applicationConfigs
     */
    public java.util.List<ApplicationConfigs> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return autoStartConfiguration
     */
    public AutoStartConfiguration getAutoStartConfiguration() {
        return this.autoStartConfiguration;
    }

    /**
     * @return autoStopConfiguration
     */
    public AutoStopConfiguration getAutoStopConfiguration() {
        return this.autoStopConfiguration;
    }

    /**
     * @return displayReleaseVersion
     */
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return fusion
     */
    public Boolean getFusion() {
        return this.fusion;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSessionClusterRequest, Builder> {
        private String workspaceId; 
        private java.util.List<ApplicationConfigs> applicationConfigs; 
        private AutoStartConfiguration autoStartConfiguration; 
        private AutoStopConfiguration autoStopConfiguration; 
        private String displayReleaseVersion; 
        private String envId; 
        private Boolean fusion; 
        private String kind; 
        private String name; 
        private String queueName; 
        private String releaseVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSessionClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.applicationConfigs = request.applicationConfigs;
            this.autoStartConfiguration = request.autoStartConfiguration;
            this.autoStopConfiguration = request.autoStopConfiguration;
            this.displayReleaseVersion = request.displayReleaseVersion;
            this.envId = request.envId;
            this.fusion = request.fusion;
            this.kind = request.kind;
            this.name = request.name;
            this.queueName = request.queueName;
            this.releaseVersion = request.releaseVersion;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-790b443d72394bfc</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The Spark configurations.</p>
         */
        public Builder applicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
            this.putBodyParameter("applicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * <p>The automatic startup configuration.</p>
         */
        public Builder autoStartConfiguration(AutoStartConfiguration autoStartConfiguration) {
            this.putBodyParameter("autoStartConfiguration", autoStartConfiguration);
            this.autoStartConfiguration = autoStartConfiguration;
            return this;
        }

        /**
         * <p>The automatic termination configurations.</p>
         */
        public Builder autoStopConfiguration(AutoStopConfiguration autoStopConfiguration) {
            this.putBodyParameter("autoStopConfiguration", autoStopConfiguration);
            this.autoStopConfiguration = autoStopConfiguration;
            return this;
        }

        /**
         * <p>The version of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-3.3.1</p>
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.putBodyParameter("displayReleaseVersion", displayReleaseVersion);
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The ID of the Python environment. This parameter takes effect only for notebook sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cpv569tlhtgndjl86t40</p>
         */
        public Builder envId(String envId) {
            this.putBodyParameter("envId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * <p>Specifies whether to enable Fusion engine for acceleration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fusion(Boolean fusion) {
            this.putBodyParameter("fusion", fusion);
            this.fusion = fusion;
            return this;
        }

        /**
         * <p>The session type.</p>
         * <ul>
         * <li>SQL</li>
         * <li>NOTEBOOK</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        public Builder kind(String kind) {
            this.putBodyParameter("kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>The name of the Spark job.</p>
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
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        public Builder queueName(String queueName) {
            this.putBodyParameter("queueName", queueName);
            this.queueName = queueName;
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
        public CreateSessionClusterRequest build() {
            return new CreateSessionClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSessionClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateSessionClusterRequest</p>
     */
    public static class ApplicationConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("configItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("configItemValue")
        private String configItemValue;

        private ApplicationConfigs(Builder builder) {
            this.configFileName = builder.configFileName;
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationConfigs create() {
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

            private Builder() {
            } 

            private Builder(ApplicationConfigs model) {
                this.configFileName = model.configFileName;
                this.configItemKey = model.configItemKey;
                this.configItemValue = model.configItemValue;
            } 

            /**
             * <p>The name of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-defaults.conf</p>
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
             * <p>test</p>
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            public ApplicationConfigs build() {
                return new ApplicationConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSessionClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateSessionClusterRequest</p>
     */
    public static class AutoStartConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private AutoStartConfiguration(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoStartConfiguration create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(AutoStartConfiguration model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Specifies whether to enable automatic startup is enabled.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AutoStartConfiguration build() {
                return new AutoStartConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSessionClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateSessionClusterRequest</p>
     */
    public static class AutoStopConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutMinutes")
        private Integer idleTimeoutMinutes;

        private AutoStopConfiguration(Builder builder) {
            this.enable = builder.enable;
            this.idleTimeoutMinutes = builder.idleTimeoutMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoStopConfiguration create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return idleTimeoutMinutes
         */
        public Integer getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer idleTimeoutMinutes; 

            private Builder() {
            } 

            private Builder(AutoStopConfiguration model) {
                this.enable = model.enable;
                this.idleTimeoutMinutes = model.idleTimeoutMinutes;
            } 

            /**
             * <p>Specifies whether to enable automatic termination.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The idle timeout period. The session is automatically terminated when the idle timeout period is exceeded.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder idleTimeoutMinutes(Integer idleTimeoutMinutes) {
                this.idleTimeoutMinutes = idleTimeoutMinutes;
                return this;
            }

            public AutoStopConfiguration build() {
                return new AutoStopConfiguration(this);
            } 

        } 

    }
}
