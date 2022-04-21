// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFunctionResponseBody</p>
 */
public class CreateFunctionResponseBody extends TeaModel {
    @NameInMap("CreatedAt")
    private String createdAt;

    @NameInMap("Desc")
    private String desc;

    @NameInMap("ModifiedAt")
    private String modifiedAt;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spec")
    private Spec spec;

    private CreateFunctionResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.desc = builder.desc;
        this.modifiedAt = builder.modifiedAt;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionResponseBody create() {
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

    public static final class Builder {
        private String createdAt; 
        private String desc; 
        private String modifiedAt; 
        private String name; 
        private String requestId; 
        private Spec spec; 

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

        public CreateFunctionResponseBody build() {
            return new CreateFunctionResponseBody(this);
        } 

    } 

    public static class Spec extends TeaModel {
        @NameInMap("InstanceConcurrency")
        private String instanceConcurrency;

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
        public String getInstanceConcurrency() {
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
            private String instanceConcurrency; 
            private String memory; 
            private String runtime; 
            private String timeout; 

            /**
             * InstanceConcurrency.
             */
            public Builder instanceConcurrency(String instanceConcurrency) {
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
