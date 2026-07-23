// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkAgentRunParameters} extends {@link TeaModel}
 *
 * <p>SinkAgentRunParameters</p>
 */
public class SinkAgentRunParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentRuntimeName")
    private String agentRuntimeName;

    @com.aliyun.core.annotation.NameInMap("Body")
    private SinkAgentRunParametersBody body;

    @com.aliyun.core.annotation.NameInMap("EndpointName")
    private String endpointName;

    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.NameInMap("Timeout")
    private String timeout;

    private SinkAgentRunParameters(Builder builder) {
        this.agentRuntimeName = builder.agentRuntimeName;
        this.body = builder.body;
        this.endpointName = builder.endpointName;
        this.roleName = builder.roleName;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkAgentRunParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeName
     */
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    /**
     * @return body
     */
    public SinkAgentRunParametersBody getBody() {
        return this.body;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return timeout
     */
    public String getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private String agentRuntimeName; 
        private SinkAgentRunParametersBody body; 
        private String endpointName; 
        private String roleName; 
        private String timeout; 

        private Builder() {
        } 

        private Builder(SinkAgentRunParameters model) {
            this.agentRuntimeName = model.agentRuntimeName;
            this.body = model.body;
            this.endpointName = model.endpointName;
            this.roleName = model.roleName;
            this.timeout = model.timeout;
        } 

        /**
         * AgentRuntimeName.
         */
        public Builder agentRuntimeName(String agentRuntimeName) {
            this.agentRuntimeName = agentRuntimeName;
            return this;
        }

        /**
         * Body.
         */
        public Builder body(SinkAgentRunParametersBody body) {
            this.body = body;
            return this;
        }

        /**
         * EndpointName.
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(String timeout) {
            this.timeout = timeout;
            return this;
        }

        public SinkAgentRunParameters build() {
            return new SinkAgentRunParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkAgentRunParameters} extends {@link TeaModel}
     *
     * <p>SinkAgentRunParameters</p>
     */
    public static class SinkAgentRunParametersBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SinkAgentRunParametersBody(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkAgentRunParametersBody create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(SinkAgentRunParametersBody model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SinkAgentRunParametersBody build() {
                return new SinkAgentRunParametersBody(this);
            } 

        } 

    }
}
