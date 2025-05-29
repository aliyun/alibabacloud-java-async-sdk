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
 * {@link ListRenderingSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingSessionsResponseBody</p>
 */
public class ListRenderingSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private java.util.List<Sessions> sessions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRenderingSessionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingSessionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessions
     */
    public java.util.List<Sessions> getSessions() {
        return this.sessions;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Sessions> sessions; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRenderingSessionsResponseBody model) {
            this.requestId = model.requestId;
            this.sessions = model.sessions;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sessions.
         */
        public Builder sessions(java.util.List<Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRenderingSessionsResponseBody build() {
            return new ListRenderingSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingSessionsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Sessions(Builder builder) {
            this.appId = builder.appId;
            this.clientId = builder.clientId;
            this.sessionId = builder.sessionId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String appId; 
            private String clientId; 
            private String sessionId; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.appId = model.appId;
                this.clientId = model.clientId;
                this.sessionId = model.sessionId;
                this.startTime = model.startTime;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
