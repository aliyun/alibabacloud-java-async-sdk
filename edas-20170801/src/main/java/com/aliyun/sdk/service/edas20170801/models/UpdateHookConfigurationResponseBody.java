// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateHookConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateHookConfigurationResponseBody</p>
 */
public class UpdateHookConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("HooksConfiguration")
    private java.util.List<HooksConfiguration> hooksConfiguration;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<HooksConfiguration> getHooksConfiguration() {
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
        private java.util.List<HooksConfiguration> hooksConfiguration; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateHookConfigurationResponseBody model) {
            this.code = model.code;
            this.hooksConfiguration = model.hooksConfiguration;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the mounted script.</p>
         */
        public Builder hooksConfiguration(java.util.List<HooksConfiguration> hooksConfiguration) {
            this.hooksConfiguration = hooksConfiguration;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>d498****-1dd8ec229862</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateHookConfigurationResponseBody build() {
            return new UpdateHookConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateHookConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateHookConfigurationResponseBody</p>
     */
    public static class HooksConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreFail")
        private Boolean ignoreFail;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Script")
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

            private Builder() {
            } 

            private Builder(HooksConfiguration model) {
                this.ignoreFail = model.ignoreFail;
                this.name = model.name;
                this.script = model.script;
            } 

            /**
             * <p>Indicates whether a mount failure is ignored. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A mount failure is ignored.</li>
             * <li><strong>false</strong>: A mount failure is not ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreFail(Boolean ignoreFail) {
                this.ignoreFail = ignoreFail;
                return this;
            }

            /**
             * <p>The name of the mounted script.</p>
             * 
             * <strong>example:</strong>
             * <p>postprepareInstanceEnvironmentOnScaleOut</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The content of the mounted script.</p>
             * 
             * <strong>example:</strong>
             * <p>ls</p>
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
