// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHookConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateHookConfigurationResponseBody</p>
 */
public class UpdateHookConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("HooksConfiguration")
    private java.util.List < HooksConfiguration> hooksConfiguration;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateHookConfigurationResponseBody(Builder builder) {
        this.code = builder.code;
        this.hooksConfiguration = builder.hooksConfiguration;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHookConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return hooksConfiguration
     */
    public java.util.List < HooksConfiguration> getHooksConfiguration() {
        return this.hooksConfiguration;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < HooksConfiguration> hooksConfiguration; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the mounted script.
         */
        public Builder hooksConfiguration(java.util.List < HooksConfiguration> hooksConfiguration) {
            this.hooksConfiguration = hooksConfiguration;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateHookConfigurationResponseBody build() {
            return new UpdateHookConfigurationResponseBody(this);
        } 

    } 

    public static class HooksConfiguration extends TeaModel {
        @NameInMap("IgnoreFail")
        private Boolean ignoreFail;

        @NameInMap("Name")
        private String name;

        @NameInMap("Script")
        private String script;

        private HooksConfiguration(Builder builder) {
            this.ignoreFail = builder.ignoreFail;
            this.name = builder.name;
            this.script = builder.script;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HooksConfiguration create() {
            return builder().build();
        }

        /**
         * @return ignoreFail
         */
        public Boolean getIgnoreFail() {
            return this.ignoreFail;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private Boolean ignoreFail; 
            private String name; 
            private String script; 

            /**
             * Indicates whether a mount failure is ignored. Valid values:
             * <p>
             * 
             * *   **true**: A mount failure is ignored.
             * *   **false**: A mount failure is not ignored.
             */
            public Builder ignoreFail(Boolean ignoreFail) {
                this.ignoreFail = ignoreFail;
                return this;
            }

            /**
             * The name of the mounted script.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The content of the mounted script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            public HooksConfiguration build() {
                return new HooksConfiguration(this);
            } 

        } 

    }
}
