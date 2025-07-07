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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * requestId.
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
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * idleTimeoutMinutes.
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
             * authType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * autoStopConfiguration.
             */
            public Builder autoStopConfiguration(AutoStopConfiguration autoStopConfiguration) {
                this.autoStopConfiguration = autoStopConfiguration;
                return this;
            }

            /**
             * computeId.
             */
            public Builder computeId(String computeId) {
                this.computeId = computeId;
                return this;
            }

            /**
             * cpuLimit.
             */
            public Builder cpuLimit(String cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * displayReleaseVersion.
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * enablePublic.
             */
            public Builder enablePublic(Boolean enablePublic) {
                this.enablePublic = enablePublic;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * endpointInner.
             */
            public Builder endpointInner(String endpointInner) {
                this.endpointInner = endpointInner;
                return this;
            }

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * fusion.
             */
            public Builder fusion(Boolean fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * livyServerConf.
             */
            public Builder livyServerConf(String livyServerConf) {
                this.livyServerConf = livyServerConf;
                return this;
            }

            /**
             * livyVersion.
             */
            public Builder livyVersion(String livyVersion) {
                this.livyVersion = livyVersion;
                return this;
            }

            /**
             * memoryLimit.
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
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
             * networkName.
             */
            public Builder networkName(String networkName) {
                this.networkName = networkName;
                return this;
            }

            /**
             * queueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * ramUserId.
             */
            public Builder ramUserId(String ramUserId) {
                this.ramUserId = ramUserId;
                return this;
            }

            /**
             * releaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
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
