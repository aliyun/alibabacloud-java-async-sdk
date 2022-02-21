// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployAppEnvResponseBody} extends {@link TeaModel}
 *
 * <p>DeployAppEnvResponseBody</p>
 */
public class DeployAppEnvResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EnvChange")
    private EnvChange envChange;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DeployAppEnvResponseBody(Builder builder) {
        this.code = builder.code;
        this.envChange = builder.envChange;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployAppEnvResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envChange
     */
    public EnvChange getEnvChange() {
        return this.envChange;
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
        private String code; 
        private EnvChange envChange; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EnvChange.
         */
        public Builder envChange(EnvChange envChange) {
            this.envChange = envChange;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeployAppEnvResponseBody build() {
            return new DeployAppEnvResponseBody(this);
        } 

    } 

    public static class EnvChange extends TeaModel {
        @NameInMap("ChangeId")
        private String changeId;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("StartTime")
        private String startTime;

        private EnvChange(Builder builder) {
            this.changeId = builder.changeId;
            this.envId = builder.envId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvChange create() {
            return builder().build();
        }

        /**
         * @return changeId
         */
        public String getChangeId() {
            return this.changeId;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String changeId; 
            private String envId; 
            private String startTime; 

            /**
             * ChangeId.
             */
            public Builder changeId(String changeId) {
                this.changeId = changeId;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public EnvChange build() {
                return new EnvChange(this);
            } 

        } 

    }
}
