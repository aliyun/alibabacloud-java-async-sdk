// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAICoachTaskSessionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAICoachTaskSessionResponseBody</p>
 */
public class ListAICoachTaskSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionList")
    private java.util.List<SessionList> sessionList;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListAICoachTaskSessionResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sessionList = builder.sessionList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAICoachTaskSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionList
     */
    public java.util.List<SessionList> getSessionList() {
        return this.sessionList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List<SessionList> sessionList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAICoachTaskSessionResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.sessionList = model.sessionList;
            this.success = model.success;
        } 

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>56AC346B-AF40-5E4F-AFFE-FD8BA5E6FB3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sessionList.
         */
        public Builder sessionList(java.util.List<SessionList> sessionList) {
            this.sessionList = sessionList;
            return this;
        }

        /**
         * <p>result</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAICoachTaskSessionResponseBody build() {
            return new ListAICoachTaskSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAICoachTaskSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAICoachTaskSessionResponseBody</p>
     */
    public static class SessionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sessionCreateTime")
        private String sessionCreateTime;

        @com.aliyun.core.annotation.NameInMap("sessionDuration")
        private Long sessionDuration;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("sessionStatus")
        private Integer sessionStatus;

        private SessionList(Builder builder) {
            this.sessionCreateTime = builder.sessionCreateTime;
            this.sessionDuration = builder.sessionDuration;
            this.sessionId = builder.sessionId;
            this.sessionStatus = builder.sessionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionList create() {
            return builder().build();
        }

        /**
         * @return sessionCreateTime
         */
        public String getSessionCreateTime() {
            return this.sessionCreateTime;
        }

        /**
         * @return sessionDuration
         */
        public Long getSessionDuration() {
            return this.sessionDuration;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sessionStatus
         */
        public Integer getSessionStatus() {
            return this.sessionStatus;
        }

        public static final class Builder {
            private String sessionCreateTime; 
            private Long sessionDuration; 
            private String sessionId; 
            private Integer sessionStatus; 

            private Builder() {
            } 

            private Builder(SessionList model) {
                this.sessionCreateTime = model.sessionCreateTime;
                this.sessionDuration = model.sessionDuration;
                this.sessionId = model.sessionId;
                this.sessionStatus = model.sessionStatus;
            } 

            /**
             * sessionCreateTime.
             */
            public Builder sessionCreateTime(String sessionCreateTime) {
                this.sessionCreateTime = sessionCreateTime;
                return this;
            }

            /**
             * sessionDuration.
             */
            public Builder sessionDuration(Long sessionDuration) {
                this.sessionDuration = sessionDuration;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * sessionStatus.
             */
            public Builder sessionStatus(Integer sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            public SessionList build() {
                return new SessionList(this);
            } 

        } 

    }
}
