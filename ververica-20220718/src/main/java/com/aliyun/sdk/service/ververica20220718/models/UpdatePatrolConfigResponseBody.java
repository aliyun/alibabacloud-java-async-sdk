// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link UpdatePatrolConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePatrolConfigResponseBody</p>
 */
public class UpdatePatrolConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdatePatrolConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePatrolConfigResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdatePatrolConfigResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdatePatrolConfigResponseBody build() {
            return new UpdatePatrolConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePatrolConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePatrolConfigResponseBody</p>
     */
    public static class ScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploymentIds")
        private java.util.List<String> deploymentIds;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, java.util.List<String>> tags;

        private ScopeConfig(Builder builder) {
            this.deploymentIds = builder.deploymentIds;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeConfig create() {
            return builder().build();
        }

        /**
         * @return deploymentIds
         */
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> deploymentIds; 
            private java.util.Map<String, java.util.List<String>> tags; 

            private Builder() {
            } 

            private Builder(ScopeConfig model) {
                this.deploymentIds = model.deploymentIds;
                this.tags = model.tags;
            } 

            /**
             * deploymentIds.
             */
            public Builder deploymentIds(java.util.List<String> deploymentIds) {
                this.deploymentIds = deploymentIds;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.Map<String, java.util.List<String>> tags) {
                this.tags = tags;
                return this;
            }

            public ScopeConfig build() {
                return new ScopeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePatrolConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePatrolConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configCreatedAt")
        private Long configCreatedAt;

        @com.aliyun.core.annotation.NameInMap("configUpdatedAt")
        private Long configUpdatedAt;

        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("nextPatrolAt")
        private Long nextPatrolAt;

        @com.aliyun.core.annotation.NameInMap("scopeConfig")
        private ScopeConfig scopeConfig;

        @com.aliyun.core.annotation.NameInMap("scopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Data(Builder builder) {
            this.configCreatedAt = builder.configCreatedAt;
            this.configUpdatedAt = builder.configUpdatedAt;
            this.cron = builder.cron;
            this.enabled = builder.enabled;
            this.namespace = builder.namespace;
            this.nextPatrolAt = builder.nextPatrolAt;
            this.scopeConfig = builder.scopeConfig;
            this.scopeType = builder.scopeType;
            this.timezone = builder.timezone;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configCreatedAt
         */
        public Long getConfigCreatedAt() {
            return this.configCreatedAt;
        }

        /**
         * @return configUpdatedAt
         */
        public Long getConfigUpdatedAt() {
            return this.configUpdatedAt;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nextPatrolAt
         */
        public Long getNextPatrolAt() {
            return this.nextPatrolAt;
        }

        /**
         * @return scopeConfig
         */
        public ScopeConfig getScopeConfig() {
            return this.scopeConfig;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private Long configCreatedAt; 
            private Long configUpdatedAt; 
            private String cron; 
            private Boolean enabled; 
            private String namespace; 
            private Long nextPatrolAt; 
            private ScopeConfig scopeConfig; 
            private String scopeType; 
            private String timezone; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configCreatedAt = model.configCreatedAt;
                this.configUpdatedAt = model.configUpdatedAt;
                this.cron = model.cron;
                this.enabled = model.enabled;
                this.namespace = model.namespace;
                this.nextPatrolAt = model.nextPatrolAt;
                this.scopeConfig = model.scopeConfig;
                this.scopeType = model.scopeType;
                this.timezone = model.timezone;
                this.workspace = model.workspace;
            } 

            /**
             * configCreatedAt.
             */
            public Builder configCreatedAt(Long configCreatedAt) {
                this.configCreatedAt = configCreatedAt;
                return this;
            }

            /**
             * configUpdatedAt.
             */
            public Builder configUpdatedAt(Long configUpdatedAt) {
                this.configUpdatedAt = configUpdatedAt;
                return this;
            }

            /**
             * cron.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
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
             * nextPatrolAt.
             */
            public Builder nextPatrolAt(Long nextPatrolAt) {
                this.nextPatrolAt = nextPatrolAt;
                return this;
            }

            /**
             * scopeConfig.
             */
            public Builder scopeConfig(ScopeConfig scopeConfig) {
                this.scopeConfig = scopeConfig;
                return this;
            }

            /**
             * scopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
