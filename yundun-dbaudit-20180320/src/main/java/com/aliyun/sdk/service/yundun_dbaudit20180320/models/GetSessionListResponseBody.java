// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetSessionListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSessionListResponseBody</p>
 */
public class GetSessionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeginDate")
    private String beginDate;

    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("Incomplete")
    private String incomplete;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetSessionListResponseBody(Builder builder) {
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.incomplete = builder.incomplete;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return incomplete
     */
    public String getIncomplete() {
        return this.incomplete;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String beginDate; 
        private String endDate; 
        private String incomplete; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Results> results; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetSessionListResponseBody model) {
            this.beginDate = model.beginDate;
            this.endDate = model.endDate;
            this.incomplete = model.incomplete;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.results = model.results;
            this.totalCount = model.totalCount;
        } 

        /**
         * BeginDate.
         */
        public Builder beginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Incomplete.
         */
        public Builder incomplete(String incomplete) {
            this.incomplete = incomplete;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetSessionListResponseBody build() {
            return new GetSessionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSessionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSessionListResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CaptureTime")
        private String captureTime;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientIpAlias")
        private String clientIpAlias;

        @com.aliyun.core.annotation.NameInMap("ClientMac")
        private String clientMac;

        @com.aliyun.core.annotation.NameInMap("ClientOsUser")
        private String clientOsUser;

        @com.aliyun.core.annotation.NameInMap("ClientPort")
        private Integer clientPort;

        @com.aliyun.core.annotation.NameInMap("ClientProgram")
        private String clientProgram;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("DbUser")
        private String dbUser;

        @com.aliyun.core.annotation.NameInMap("LoginCode")
        private Integer loginCode;

        @com.aliyun.core.annotation.NameInMap("LoginMessage")
        private String loginMessage;

        @com.aliyun.core.annotation.NameInMap("ServerIp")
        private String serverIp;

        @com.aliyun.core.annotation.NameInMap("ServerMac")
        private String serverMac;

        @com.aliyun.core.annotation.NameInMap("ServerPort")
        private Integer serverPort;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Results(Builder builder) {
            this.action = builder.action;
            this.captureTime = builder.captureTime;
            this.clientIp = builder.clientIp;
            this.clientIpAlias = builder.clientIpAlias;
            this.clientMac = builder.clientMac;
            this.clientOsUser = builder.clientOsUser;
            this.clientPort = builder.clientPort;
            this.clientProgram = builder.clientProgram;
            this.dbId = builder.dbId;
            this.dbUser = builder.dbUser;
            this.loginCode = builder.loginCode;
            this.loginMessage = builder.loginMessage;
            this.serverIp = builder.serverIp;
            this.serverMac = builder.serverMac;
            this.serverPort = builder.serverPort;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return captureTime
         */
        public String getCaptureTime() {
            return this.captureTime;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientIpAlias
         */
        public String getClientIpAlias() {
            return this.clientIpAlias;
        }

        /**
         * @return clientMac
         */
        public String getClientMac() {
            return this.clientMac;
        }

        /**
         * @return clientOsUser
         */
        public String getClientOsUser() {
            return this.clientOsUser;
        }

        /**
         * @return clientPort
         */
        public Integer getClientPort() {
            return this.clientPort;
        }

        /**
         * @return clientProgram
         */
        public String getClientProgram() {
            return this.clientProgram;
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return dbUser
         */
        public String getDbUser() {
            return this.dbUser;
        }

        /**
         * @return loginCode
         */
        public Integer getLoginCode() {
            return this.loginCode;
        }

        /**
         * @return loginMessage
         */
        public String getLoginMessage() {
            return this.loginMessage;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverMac
         */
        public String getServerMac() {
            return this.serverMac;
        }

        /**
         * @return serverPort
         */
        public Integer getServerPort() {
            return this.serverPort;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String action; 
            private String captureTime; 
            private String clientIp; 
            private String clientIpAlias; 
            private String clientMac; 
            private String clientOsUser; 
            private Integer clientPort; 
            private String clientProgram; 
            private Integer dbId; 
            private String dbUser; 
            private Integer loginCode; 
            private String loginMessage; 
            private String serverIp; 
            private String serverMac; 
            private Integer serverPort; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.action = model.action;
                this.captureTime = model.captureTime;
                this.clientIp = model.clientIp;
                this.clientIpAlias = model.clientIpAlias;
                this.clientMac = model.clientMac;
                this.clientOsUser = model.clientOsUser;
                this.clientPort = model.clientPort;
                this.clientProgram = model.clientProgram;
                this.dbId = model.dbId;
                this.dbUser = model.dbUser;
                this.loginCode = model.loginCode;
                this.loginMessage = model.loginMessage;
                this.serverIp = model.serverIp;
                this.serverMac = model.serverMac;
                this.serverPort = model.serverPort;
                this.sessionId = model.sessionId;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * CaptureTime.
             */
            public Builder captureTime(String captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ClientIpAlias.
             */
            public Builder clientIpAlias(String clientIpAlias) {
                this.clientIpAlias = clientIpAlias;
                return this;
            }

            /**
             * ClientMac.
             */
            public Builder clientMac(String clientMac) {
                this.clientMac = clientMac;
                return this;
            }

            /**
             * ClientOsUser.
             */
            public Builder clientOsUser(String clientOsUser) {
                this.clientOsUser = clientOsUser;
                return this;
            }

            /**
             * ClientPort.
             */
            public Builder clientPort(Integer clientPort) {
                this.clientPort = clientPort;
                return this;
            }

            /**
             * ClientProgram.
             */
            public Builder clientProgram(String clientProgram) {
                this.clientProgram = clientProgram;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbUser.
             */
            public Builder dbUser(String dbUser) {
                this.dbUser = dbUser;
                return this;
            }

            /**
             * LoginCode.
             */
            public Builder loginCode(Integer loginCode) {
                this.loginCode = loginCode;
                return this;
            }

            /**
             * LoginMessage.
             */
            public Builder loginMessage(String loginMessage) {
                this.loginMessage = loginMessage;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * ServerMac.
             */
            public Builder serverMac(String serverMac) {
                this.serverMac = serverMac;
                return this;
            }

            /**
             * ServerPort.
             */
            public Builder serverPort(Integer serverPort) {
                this.serverPort = serverPort;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
