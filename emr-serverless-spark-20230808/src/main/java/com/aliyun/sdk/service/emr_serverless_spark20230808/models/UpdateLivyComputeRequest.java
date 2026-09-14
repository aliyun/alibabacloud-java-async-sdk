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
 * {@link UpdateLivyComputeRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivyComputeRequest</p>
 */
public class UpdateLivyComputeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("livyComputeId")
    private String livyComputeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoStartConfiguration")
    private AutoStartConfiguration autoStartConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoStopConfiguration")
    private AutoStopConfiguration autoStopConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpuLimit")
    private String cpuLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enablePublic")
    private Boolean enablePublic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fusion")
    private Boolean fusion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("livyServerConf")
    private String livyServerConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("livyVersion")
    private String livyVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memoryLimit")
    private String memoryLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkName")
    private String networkName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("releaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private UpdateLivyComputeRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.livyComputeId = builder.livyComputeId;
        this.authType = builder.authType;
        this.autoStartConfiguration = builder.autoStartConfiguration;
        this.autoStopConfiguration = builder.autoStopConfiguration;
        this.cpuLimit = builder.cpuLimit;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.enablePublic = builder.enablePublic;
        this.environmentId = builder.environmentId;
        this.fusion = builder.fusion;
        this.livyServerConf = builder.livyServerConf;
        this.livyVersion = builder.livyVersion;
        this.memoryLimit = builder.memoryLimit;
        this.name = builder.name;
        this.networkName = builder.networkName;
        this.queueName = builder.queueName;
        this.releaseVersion = builder.releaseVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivyComputeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceBizId
     */
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

    /**
     * @return livyComputeId
     */
    public String getLivyComputeId() {
        return this.livyComputeId;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
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
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    /**
     * @return displayReleaseVersion
     */
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    /**
     * @return enablePublic
     */
    public Boolean getEnablePublic() {
        return this.enablePublic;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return fusion
     */
    public Boolean getFusion() {
        return this.fusion;
    }

    /**
     * @return livyServerConf
     */
    public String getLivyServerConf() {
        return this.livyServerConf;
    }

    /**
     * @return livyVersion
     */
    public String getLivyVersion() {
        return this.livyVersion;
    }

    /**
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkName
     */
    public String getNetworkName() {
        return this.networkName;
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

    public static final class Builder extends Request.Builder<UpdateLivyComputeRequest, Builder> {
        private String workspaceBizId; 
        private String livyComputeId; 
        private String authType; 
        private AutoStartConfiguration autoStartConfiguration; 
        private AutoStopConfiguration autoStopConfiguration; 
        private String cpuLimit; 
        private String displayReleaseVersion; 
        private Boolean enablePublic; 
        private String environmentId; 
        private Boolean fusion; 
        private String livyServerConf; 
        private String livyVersion; 
        private String memoryLimit; 
        private String name; 
        private String networkName; 
        private String queueName; 
        private String releaseVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivyComputeRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.livyComputeId = request.livyComputeId;
            this.authType = request.authType;
            this.autoStartConfiguration = request.autoStartConfiguration;
            this.autoStopConfiguration = request.autoStopConfiguration;
            this.cpuLimit = request.cpuLimit;
            this.displayReleaseVersion = request.displayReleaseVersion;
            this.enablePublic = request.enablePublic;
            this.environmentId = request.environmentId;
            this.fusion = request.fusion;
            this.livyServerConf = request.livyServerConf;
            this.livyVersion = request.livyVersion;
            this.memoryLimit = request.memoryLimit;
            this.name = request.name;
            this.networkName = request.networkName;
            this.queueName = request.queueName;
            this.releaseVersion = request.releaseVersion;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-8adde60aa809701f</p>
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * <p>The ID of the Livy Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-i8xogcdfa4fk3yn1</p>
         */
        public Builder livyComputeId(String livyComputeId) {
            this.putPathParameter("livyComputeId", livyComputeId);
            this.livyComputeId = livyComputeId;
            return this;
        }

        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>Token</p>
         */
        public Builder authType(String authType) {
            this.putBodyParameter("authType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The auto-start configuration.</p>
         */
        public Builder autoStartConfiguration(AutoStartConfiguration autoStartConfiguration) {
            this.putBodyParameter("autoStartConfiguration", autoStartConfiguration);
            this.autoStartConfiguration = autoStartConfiguration;
            return this;
        }

        /**
         * <p>The auto-stop configuration.</p>
         */
        public Builder autoStopConfiguration(AutoStopConfiguration autoStopConfiguration) {
            this.putBodyParameter("autoStopConfiguration", autoStopConfiguration);
            this.autoStopConfiguration = autoStopConfiguration;
            return this;
        }

        /**
         * <p>The number of vCPUs for the Livy server.</p>
         * <ul>
         * <li><p>1</p>
         * </li>
         * <li><p>2</p>
         * </li>
         * <li><p>4</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuLimit(String cpuLimit) {
            this.putBodyParameter("cpuLimit", cpuLimit);
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * <p>The version number of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.putBodyParameter("displayReleaseVersion", displayReleaseVersion);
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The status of the switch for the Internet endpoint.</p>
         */
        public Builder enablePublic(Boolean enablePublic) {
            this.putBodyParameter("enablePublic", enablePublic);
            this.enablePublic = enablePublic;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ev-cq146allhtgkulp5smk0</p>
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Fusion engine for acceleration.</p>
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
         * <p>The configurations of the Livy Gateway. This parameter is in JSON format and supports the following files:</p>
         * <ul>
         * <li><p>sparkDefaultsConf</p>
         * </li>
         * <li><p>sparkBlackListConf</p>
         * </li>
         * <li><p>livyConf</p>
         * </li>
         * <li><p>livyClientConf</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;sparkDefaultsConf&quot;: &quot;spark.driver.cores     1\nspark.driver.memory    4g\nspark.executor.cores   1\nspark.executor.memory  4g\n&quot;,
         *   &quot;sparkBlackListConf&quot;: &quot;spark.driver.cores\nspark.driver.memory&quot;,
         *   &quot;livyConf&quot;: &quot;livy.server.session.timeout  1h\n&quot;,
         *   &quot;livyClientConf&quot;: &quot;livy.rsc.sql.num-rows  1000\n&quot;
         * }</p>
         */
        public Builder livyServerConf(String livyServerConf) {
            this.putBodyParameter("livyServerConf", livyServerConf);
            this.livyServerConf = livyServerConf;
            return this;
        }

        /**
         * <p>The Livy version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8.0</p>
         */
        public Builder livyVersion(String livyVersion) {
            this.putBodyParameter("livyVersion", livyVersion);
            this.livyVersion = livyVersion;
            return this;
        }

        /**
         * <p>The memory size of the Livy server.</p>
         * 
         * <strong>example:</strong>
         * <p>4Gi</p>
         */
        public Builder memoryLimit(String memoryLimit) {
            this.putBodyParameter("memoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder networkName(String networkName) {
            this.putBodyParameter("networkName", networkName);
            this.networkName = networkName;
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
         * <p>The version number of the Spark engine. This parameter is deprecated. Use displayReleaseVersion instead.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12, Java Runtime)</p>
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
        public UpdateLivyComputeRequest build() {
            return new UpdateLivyComputeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLivyComputeRequest} extends {@link TeaModel}
     *
     * <p>UpdateLivyComputeRequest</p>
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
             * <p>Specifies whether to automatically start the Livy Gateway after it is created.</p>
             * <ul>
             * <li><p>true: Yes.</p>
             * </li>
             * <li><p>false: No.</p>
             * </li>
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
     * {@link UpdateLivyComputeRequest} extends {@link TeaModel}
     *
     * <p>UpdateLivyComputeRequest</p>
     */
    public static class AutoStopConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutMinutes")
        private Long idleTimeoutMinutes;

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
        public Long getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

        public static final class Builder {
            private Boolean enable; 
            private Long idleTimeoutMinutes; 

            private Builder() {
            } 

            private Builder(AutoStopConfiguration model) {
                this.enable = model.enable;
                this.idleTimeoutMinutes = model.idleTimeoutMinutes;
            } 

            /**
             * <p>Specifies whether to enable auto-stop for the Livy Gateway.</p>
             * <ul>
             * <li><p>true: Yes.</p>
             * </li>
             * <li><p>false: No.</p>
             * </li>
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
             * <p>The number of minutes after which the Livy Gateway is automatically stopped if it is idle.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder idleTimeoutMinutes(Long idleTimeoutMinutes) {
                this.idleTimeoutMinutes = idleTimeoutMinutes;
                return this;
            }

            public AutoStopConfiguration build() {
                return new AutoStopConfiguration(this);
            } 

        } 

    }
}
