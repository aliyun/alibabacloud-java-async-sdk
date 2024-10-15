// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CarSceneQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarSceneQueryResponseBody</p>
 */
public class CarSceneQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List < Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private CarSceneQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarSceneQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List < Module> getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * module.
         */
        public Builder module(java.util.List < Module> module) {
            this.module = module;
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

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CarSceneQueryResponseBody build() {
            return new CarSceneQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CarSceneQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CarSceneQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scenarioTemplateId")
        private String scenarioTemplateId;

        @com.aliyun.core.annotation.NameInMap("scenarioTemplateName")
        private String scenarioTemplateName;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private Module(Builder builder) {
            this.scenarioTemplateId = builder.scenarioTemplateId;
            this.scenarioTemplateName = builder.scenarioTemplateName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return scenarioTemplateId
         */
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        /**
         * @return scenarioTemplateName
         */
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String scenarioTemplateId; 
            private String scenarioTemplateName; 
            private String state; 

            /**
             * scenarioTemplateId.
             */
            public Builder scenarioTemplateId(String scenarioTemplateId) {
                this.scenarioTemplateId = scenarioTemplateId;
                return this;
            }

            /**
             * scenarioTemplateName.
             */
            public Builder scenarioTemplateName(String scenarioTemplateName) {
                this.scenarioTemplateName = scenarioTemplateName;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
