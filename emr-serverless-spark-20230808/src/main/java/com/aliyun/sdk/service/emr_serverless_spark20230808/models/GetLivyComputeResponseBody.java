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
 * {@link GetLivyComputeResponseBody} extends {@link TeaModel}
 *
 * <p>GetLivyComputeResponseBody</p>
 */
public class GetLivyComputeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetLivyComputeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLivyComputeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLivyComputeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. A value of 1000000 indicates a successful request. Other values indicate a failed request. Check the message parameter for the error details.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLivyComputeResponseBody build() {
            return new GetLivyComputeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLivyComputeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLivyComputeResponseBody</p>
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
             * <p>Indicates whether to automatically start the gateway after it is created.</p>
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
    /**
     * 
     * {@link GetLivyComputeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLivyComputeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("autoStopConfiguration")
        private AutoStopConfiguration autoStopConfiguration;

        @com.aliyun.core.annotation.NameInMap("computeId")
        private String computeId;

        @com.aliyun.core.annotation.NameInMap("cpuLimit")
        private String cpuLimit;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("enablePublic")
        private Boolean enablePublic;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("endpointInner")
        private String endpointInner;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("fusion")
        private Boolean fusion;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("livyServerConf")
        private String livyServerConf;

        @com.aliyun.core.annotation.NameInMap("livyVersion")
        private String livyVersion;

        @com.aliyun.core.annotation.NameInMap("memoryLimit")
        private String memoryLimit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkName")
        private String networkName;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("ramUserId")
        private String ramUserId;

        @com.aliyun.core.annotation.NameInMap("releaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.authType = builder.authType;
            this.autoStopConfiguration = builder.autoStopConfiguration;
            this.computeId = builder.computeId;
            this.cpuLimit = builder.cpuLimit;
            this.createdBy = builder.createdBy;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.enablePublic = builder.enablePublic;
            this.endpoint = builder.endpoint;
            this.endpointInner = builder.endpointInner;
            this.environmentId = builder.environmentId;
            this.fusion = builder.fusion;
            this.gmtCreate = builder.gmtCreate;
            this.livyServerConf = builder.livyServerConf;
            this.livyVersion = builder.livyVersion;
            this.memoryLimit = builder.memoryLimit;
            this.name = builder.name;
            this.networkName = builder.networkName;
            this.queueName = builder.queueName;
            this.ramUserId = builder.ramUserId;
            this.releaseVersion = builder.releaseVersion;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return autoStopConfiguration
         */
        public AutoStopConfiguration getAutoStopConfiguration() {
            return this.autoStopConfiguration;
        }

        /**
         * @return computeId
         */
        public String getComputeId() {
            return this.computeId;
        }

        /**
         * @return cpuLimit
         */
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return endpointInner
         */
        public String getEndpointInner() {
            return this.endpointInner;
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
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
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
         * @return ramUserId
         */
        public String getRamUserId() {
            return this.ramUserId;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String authType; 
            private AutoStopConfiguration autoStopConfiguration; 
            private String computeId; 
            private String cpuLimit; 
            private String createdBy; 
            private String displayReleaseVersion; 
            private Boolean enablePublic; 
            private String endpoint; 
            private String endpointInner; 
            private String environmentId; 
            private Boolean fusion; 
            private Long gmtCreate; 
            private String livyServerConf; 
            private String livyVersion; 
            private String memoryLimit; 
            private String name; 
            private String networkName; 
            private String queueName; 
            private String ramUserId; 
            private String releaseVersion; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authType = model.authType;
                this.autoStopConfiguration = model.autoStopConfiguration;
                this.computeId = model.computeId;
                this.cpuLimit = model.cpuLimit;
                this.createdBy = model.createdBy;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.enablePublic = model.enablePublic;
                this.endpoint = model.endpoint;
                this.endpointInner = model.endpointInner;
                this.environmentId = model.environmentId;
                this.fusion = model.fusion;
                this.gmtCreate = model.gmtCreate;
                this.livyServerConf = model.livyServerConf;
                this.livyVersion = model.livyVersion;
                this.memoryLimit = model.memoryLimit;
                this.name = model.name;
                this.networkName = model.networkName;
                this.queueName = model.queueName;
                this.ramUserId = model.ramUserId;
                this.releaseVersion = model.releaseVersion;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>Token</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The auto-stop configuration.</p>
             */
            public Builder autoStopConfiguration(AutoStopConfiguration autoStopConfiguration) {
                this.autoStopConfiguration = autoStopConfiguration;
                return this;
            }

            /**
             * <p>The ID of the Livy Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>lc-xxxxxxxxxxxxx</p>
             */
            public Builder computeId(String computeId) {
                this.computeId = computeId;
                return this;
            }

            /**
             * <p>The number of CPU cores for the Livy server.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuLimit(String cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The version number of the Spark engine.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The status of the public endpoint switch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enablePublic(Boolean enablePublic) {
                this.enablePublic = enablePublic;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-livy-gateway-cn-hangzhou.data.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-spark-livy-gateway-cn-hangzhou-internal.aliyun.com/api/v1/workspace/w-xxxxxxxxx/livycompute/lc-xxxxxxxxxxx</p>
             */
            public Builder endpointInner(String endpointInner) {
                this.endpointInner = endpointInner;
                return this;
            }

            /**
             * <p>The ID of the runtime environment.</p>
             * 
             * <strong>example:</strong>
             * <p>ev-cq31c7tlhtgm9nrrlj4g</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Indicates whether the fusion switch is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fusion(Boolean fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The Livy Gateway configuration in JSON format. The following files are supported:</p>
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
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder ramUserId(String ramUserId) {
                this.ramUserId = ramUserId;
                return this;
            }

            /**
             * <p>The version number of the Spark engine. This parameter is deprecated. Use displayReleaseVersion instead.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.3.0 (Spark 3.5.2, Scala 2.12, Java Runtime)</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The running status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
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
