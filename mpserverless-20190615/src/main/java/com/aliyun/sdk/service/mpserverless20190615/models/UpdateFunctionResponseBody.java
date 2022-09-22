// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFunctionResponseBody</p>
 */
public class UpdateFunctionResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spec")
    private Spec spec;

    @NameInMap("TimingTriggerConfig")
    private String timingTriggerConfig;

    @NameInMap("TimingTriggerUserPayload")
    private String timingTriggerUserPayload;

    private UpdateFunctionResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.desc = builder.desc;
        this.httpTriggerPath = builder.httpTriggerPath;
        this.modifiedAt = builder.modifiedAt;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.spec = builder.spec;
        this.timingTriggerConfig = builder.timingTriggerConfig;
        this.timingTriggerUserPayload = builder.timingTriggerUserPayload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return timingTriggerUserPayload
     */
    public String getTimingTriggerUserPayload() {
        return this.timingTriggerUserPayload;
    }

    public static final class Builder {
        private String createdAt; 
        private String desc; 
        private String httpTriggerPath; 
        private String modifiedAt; 
        private String name; 
        private String requestId; 
        private Spec spec; 
        private String timingTriggerConfig; 
        private String timingTriggerUserPayload; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * TimingTriggerUserPayload.
         */
        public Builder timingTriggerUserPayload(String timingTriggerUserPayload) {
            this.timingTriggerUserPayload = timingTriggerUserPayload;
            return this;
        }

        public UpdateFunctionResponseBody build() {
            return new UpdateFunctionResponseBody(this);
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
}
