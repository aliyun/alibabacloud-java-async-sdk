// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdatePolarClawAgentToolsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePolarClawAgentToolsResponseBody</p>
 */
public class UpdatePolarClawAgentToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tools")
    private Tools tools;

    private UpdatePolarClawAgentToolsResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.ok = builder.ok;
        this.requestId = builder.requestId;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawAgentToolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tools
     */
    public Tools getTools() {
        return this.tools;
    }

    public static final class Builder {
        private String agentId; 
        private String applicationId; 
        private Integer code; 
        private String message; 
        private Boolean ok; 
        private String requestId; 
        private Tools tools; 

        private Builder() {
        } 

        private Builder(UpdatePolarClawAgentToolsResponseBody model) {
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.ok = model.ok;
            this.requestId = model.requestId;
            this.tools = model.tools;
        } 

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Ok.
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tools.
         */
        public Builder tools(Tools tools) {
            this.tools = tools;
            return this;
        }

        public UpdatePolarClawAgentToolsResponseBody build() {
            return new UpdatePolarClawAgentToolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePolarClawAgentToolsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawAgentToolsResponseBody</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Allow")
        private java.util.List<String> allow;

        @com.aliyun.core.annotation.NameInMap("AlsoAllow")
        private java.util.List<String> alsoAllow;

        @com.aliyun.core.annotation.NameInMap("Deny")
        private java.util.List<String> deny;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        private Tools(Builder builder) {
            this.allow = builder.allow;
            this.alsoAllow = builder.alsoAllow;
            this.deny = builder.deny;
            this.profile = builder.profile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return allow
         */
        public java.util.List<String> getAllow() {
            return this.allow;
        }

        /**
         * @return alsoAllow
         */
        public java.util.List<String> getAlsoAllow() {
            return this.alsoAllow;
        }

        /**
         * @return deny
         */
        public java.util.List<String> getDeny() {
            return this.deny;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        public static final class Builder {
            private java.util.List<String> allow; 
            private java.util.List<String> alsoAllow; 
            private java.util.List<String> deny; 
            private String profile; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.allow = model.allow;
                this.alsoAllow = model.alsoAllow;
                this.deny = model.deny;
                this.profile = model.profile;
            } 

            /**
             * Allow.
             */
            public Builder allow(java.util.List<String> allow) {
                this.allow = allow;
                return this;
            }

            /**
             * AlsoAllow.
             */
            public Builder alsoAllow(java.util.List<String> alsoAllow) {
                this.alsoAllow = alsoAllow;
                return this;
            }

            /**
             * Deny.
             */
            public Builder deny(java.util.List<String> deny) {
                this.deny = deny;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
}
