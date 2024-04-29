// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisconnectDesktopSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DisconnectDesktopSessionsResponseBody</p>
 */
public class DisconnectDesktopSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvalidSessions")
    private java.util.List < InvalidSessions> invalidSessions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisconnectDesktopSessionsResponseBody(Builder builder) {
        this.invalidSessions = builder.invalidSessions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisconnectDesktopSessionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return invalidSessions
     */
    public java.util.List < InvalidSessions> getInvalidSessions() {
        return this.invalidSessions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InvalidSessions> invalidSessions; 
        private String requestId; 

        /**
         * The list of invalid sessions.
         */
        public Builder invalidSessions(java.util.List < InvalidSessions> invalidSessions) {
            this.invalidSessions = invalidSessions;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisconnectDesktopSessionsResponseBody build() {
            return new DisconnectDesktopSessionsResponseBody(this);
        } 

    } 

    public static class InvalidSessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        private InvalidSessions(Builder builder) {
            this.desktopId = builder.desktopId;
            this.endUserId = builder.endUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidSessions create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        public static final class Builder {
            private String desktopId; 
            private String endUserId; 

            /**
             * The cloud desktop ID.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The end user ID.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            public InvalidSessions build() {
                return new InvalidSessions(this);
            } 

        } 

    }
}
