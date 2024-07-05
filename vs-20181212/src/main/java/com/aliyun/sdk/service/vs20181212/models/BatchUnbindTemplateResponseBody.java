// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUnbindTemplateResponseBody</p>
 */
public class BatchUnbindTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bindings")
    private java.util.List < Bindings> bindings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchUnbindTemplateResponseBody(Builder builder) {
        this.bindings = builder.bindings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUnbindTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return bindings
     */
    public java.util.List < Bindings> getBindings() {
        return this.bindings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Bindings> bindings; 
        private String requestId; 

        /**
         * Bindings.
         */
        public Builder bindings(java.util.List < Bindings> bindings) {
            this.bindings = bindings;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchUnbindTemplateResponseBody build() {
            return new BatchUnbindTemplateResponseBody(this);
        } 

    } 

    public static class Bindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Bindings(Builder builder) {
            this.error = builder.error;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bindings create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String error; 
            private String instanceId; 
            private String instanceType; 
            private String templateId; 

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Bindings build() {
                return new Bindings(this);
            } 

        } 

    }
}
