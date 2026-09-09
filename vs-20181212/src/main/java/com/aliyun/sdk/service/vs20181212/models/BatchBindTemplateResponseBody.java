// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchBindTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>BatchBindTemplateResponseBody</p>
 */
public class BatchBindTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bindings")
    private java.util.List<Bindings> bindings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchBindTemplateResponseBody(Builder builder) {
        this.bindings = builder.bindings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindings
     */
    public java.util.List<Bindings> getBindings() {
        return this.bindings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Bindings> bindings; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchBindTemplateResponseBody model) {
            this.bindings = model.bindings;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Result list.</p>
         */
        public Builder bindings(java.util.List<Bindings> bindings) {
            this.bindings = bindings;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchBindTemplateResponseBody build() {
            return new BatchBindTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchBindTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>BatchBindTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Bindings model) {
                this.error = model.error;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.templateId = model.templateId;
            } 

            /**
             * <p>Error message.</p>
             * <blockquote>
             * <p>This field exists only when the operation fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>some error</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>323*****994-cn-qingdao</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>323*****998-cn-qingdao</p>
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
