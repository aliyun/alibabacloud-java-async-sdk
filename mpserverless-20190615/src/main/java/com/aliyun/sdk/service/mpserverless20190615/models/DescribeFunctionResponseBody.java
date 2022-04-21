// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFunctionResponseBody</p>
 */
public class DescribeFunctionResponseBody extends TeaModel {
    @NameInMap("Deployment")
    private Deployment deployment;

    @NameInMap("Function")
    private Function function;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFunctionResponseBody(Builder builder) {
        this.deployment = builder.deployment;
        this.function = builder.function;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFunctionResponseBody create() {
        return builder().build();
    }

    /**
     * @return deployment
     */
    public Deployment getDeployment() {
        return this.deployment;
    }

    /**
     * @return function
     */
    public Function getFunction() {
        return this.function;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Deployment deployment; 
        private Function function; 
        private String requestId; 

        /**
         * Deployment.
         */
        public Builder deployment(Deployment deployment) {
            this.deployment = deployment;
            return this;
        }

        /**
         * Function.
         */
        public Builder function(Function function) {
            this.function = function;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFunctionResponseBody build() {
            return new DescribeFunctionResponseBody(this);
        } 

    } 

    public static class Deployment extends TeaModel {
        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("DeploymentId")
        private String deploymentId;

        @NameInMap("DownloadSignedUrl")
        private String downloadSignedUrl;

        @NameInMap("ModifiedAt")
        private String modifiedAt;

        @NameInMap("VersionNo")
        private String versionNo;

        private Deployment(Builder builder) {
            this.createdAt = builder.createdAt;
            this.deploymentId = builder.deploymentId;
            this.downloadSignedUrl = builder.downloadSignedUrl;
            this.modifiedAt = builder.modifiedAt;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deployment create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return downloadSignedUrl
         */
        public String getDownloadSignedUrl() {
            return this.downloadSignedUrl;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return versionNo
         */
        public String getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private String createdAt; 
            private String deploymentId; 
            private String downloadSignedUrl; 
            private String modifiedAt; 
            private String versionNo; 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DeploymentId.
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * DownloadSignedUrl.
             */
            public Builder downloadSignedUrl(String downloadSignedUrl) {
                this.downloadSignedUrl = downloadSignedUrl;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * VersionNo.
             */
            public Builder versionNo(String versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public Deployment build() {
                return new Deployment(this);
            } 

        } 

    }
    public static class Spec extends TeaModel {
        @NameInMap("InstanceConcurrency")
        private Integer instanceConcurrency;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("Runtime")
        private String runtime;

        @NameInMap("Timeout")
        private String timeout;

        private Spec(Builder builder) {
            this.instanceConcurrency = builder.instanceConcurrency;
            this.memory = builder.memory;
            this.runtime = builder.runtime;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return instanceConcurrency
         */
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer instanceConcurrency; 
            private String memory; 
            private String runtime; 
            private String timeout; 

            /**
             * InstanceConcurrency.
             */
            public Builder instanceConcurrency(Integer instanceConcurrency) {
                this.instanceConcurrency = instanceConcurrency;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class Function extends TeaModel {
        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("HttpTriggerPath")
        private String httpTriggerPath;

        @NameInMap("ModifiedAt")
        private String modifiedAt;

        @NameInMap("Name")
        private String name;

        @NameInMap("Spec")
        private Spec spec;

        @NameInMap("TimingTriggerConfig")
        private String timingTriggerConfig;

        private Function(Builder builder) {
            this.createdAt = builder.createdAt;
            this.desc = builder.desc;
            this.httpTriggerPath = builder.httpTriggerPath;
            this.modifiedAt = builder.modifiedAt;
            this.name = builder.name;
            this.spec = builder.spec;
            this.timingTriggerConfig = builder.timingTriggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return httpTriggerPath
         */
        public String getHttpTriggerPath() {
            return this.httpTriggerPath;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        /**
         * @return timingTriggerConfig
         */
        public String getTimingTriggerConfig() {
            return this.timingTriggerConfig;
        }

        public static final class Builder {
            private String createdAt; 
            private String desc; 
            private String httpTriggerPath; 
            private String modifiedAt; 
            private String name; 
            private Spec spec; 
            private String timingTriggerConfig; 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * HttpTriggerPath.
             */
            public Builder httpTriggerPath(String httpTriggerPath) {
                this.httpTriggerPath = httpTriggerPath;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * TimingTriggerConfig.
             */
            public Builder timingTriggerConfig(String timingTriggerConfig) {
                this.timingTriggerConfig = timingTriggerConfig;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
}
