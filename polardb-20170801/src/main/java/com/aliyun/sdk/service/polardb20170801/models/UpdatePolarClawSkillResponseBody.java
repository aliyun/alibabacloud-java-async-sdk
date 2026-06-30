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
 * {@link UpdatePolarClawSkillResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePolarClawSkillResponseBody</p>
 */
public class UpdatePolarClawSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillKey")
    private String skillKey;

    private UpdatePolarClawSkillResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.config = builder.config;
        this.message = builder.message;
        this.ok = builder.ok;
        this.requestId = builder.requestId;
        this.skillKey = builder.skillKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return config
     */
    public Config getConfig() {
        return this.config;
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
     * @return skillKey
     */
    public String getSkillKey() {
        return this.skillKey;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private Config config; 
        private String message; 
        private Boolean ok; 
        private String requestId; 
        private String skillKey; 

        private Builder() {
        } 

        private Builder(UpdatePolarClawSkillResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.config = model.config;
            this.message = model.message;
            this.ok = model.ok;
            this.requestId = model.requestId;
            this.skillKey = model.skillKey;
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
         * Config.
         */
        public Builder config(Config config) {
            this.config = config;
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
         * SkillKey.
         */
        public Builder skillKey(String skillKey) {
            this.skillKey = skillKey;
            return this;
        }

        public UpdatePolarClawSkillResponseBody build() {
            return new UpdatePolarClawSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePolarClawSkillResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawSkillResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Env")
        private java.util.Map<String, String> env;

        private Config(Builder builder) {
            this.enabled = builder.enabled;
            this.env = builder.env;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return env
         */
        public java.util.Map<String, String> getEnv() {
            return this.env;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.Map<String, String> env; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.enabled = model.enabled;
                this.env = model.env;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(java.util.Map<String, String> env) {
                this.env = env;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
