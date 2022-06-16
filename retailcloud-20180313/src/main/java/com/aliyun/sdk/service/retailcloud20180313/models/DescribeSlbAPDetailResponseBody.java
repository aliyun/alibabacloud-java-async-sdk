// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlbAPDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlbAPDetailResponseBody</p>
 */
public class DescribeSlbAPDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSlbAPDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlbAPDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSlbAPDetailResponseBody build() {
            return new DescribeSlbAPDetailResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("CookieTimeout")
        private Integer cookieTimeout;

        @NameInMap("EnvId")
        private Long envId;

        @NameInMap("EstablishedTimeout")
        private Integer establishedTimeout;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetworkMode")
        private String networkMode;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServerPort")
        private Integer realServerPort;

        @NameInMap("SlbAPId")
        private Long slbAPId;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SslCertId")
        private String sslCertId;

        @NameInMap("StickySession")
        private Integer stickySession;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.cookieTimeout = builder.cookieTimeout;
            this.envId = builder.envId;
            this.establishedTimeout = builder.establishedTimeout;
            this.listenerPort = builder.listenerPort;
            this.name = builder.name;
            this.networkMode = builder.networkMode;
            this.protocol = builder.protocol;
            this.realServerPort = builder.realServerPort;
            this.slbAPId = builder.slbAPId;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.sslCertId = builder.sslCertId;
            this.stickySession = builder.stickySession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return cookieTimeout
         */
        public Integer getCookieTimeout() {
            return this.cookieTimeout;
        }

        /**
         * @return envId
         */
        public Long getEnvId() {
            return this.envId;
        }

        /**
         * @return establishedTimeout
         */
        public Integer getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkMode
         */
        public String getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return realServerPort
         */
        public Integer getRealServerPort() {
            return this.realServerPort;
        }

        /**
         * @return slbAPId
         */
        public Long getSlbAPId() {
            return this.slbAPId;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return sslCertId
         */
        public String getSslCertId() {
            return this.sslCertId;
        }

        /**
         * @return stickySession
         */
        public Integer getStickySession() {
            return this.stickySession;
        }

        public static final class Builder {
            private Long appId; 
            private Integer cookieTimeout; 
            private Long envId; 
            private Integer establishedTimeout; 
            private Integer listenerPort; 
            private String name; 
            private String networkMode; 
            private String protocol; 
            private Integer realServerPort; 
            private Long slbAPId; 
            private String slbId; 
            private String slbIp; 
            private String sslCertId; 
            private Integer stickySession; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CookieTimeout.
             */
            public Builder cookieTimeout(Integer cookieTimeout) {
                this.cookieTimeout = cookieTimeout;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(Long envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EstablishedTimeout.
             */
            public Builder establishedTimeout(Integer establishedTimeout) {
                this.establishedTimeout = establishedTimeout;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetworkMode.
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RealServerPort.
             */
            public Builder realServerPort(Integer realServerPort) {
                this.realServerPort = realServerPort;
                return this;
            }

            /**
             * SlbAPId.
             */
            public Builder slbAPId(Long slbAPId) {
                this.slbAPId = slbAPId;
                return this;
            }

            /**
             * SlbId.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * SlbIp.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * SslCertId.
             */
            public Builder sslCertId(String sslCertId) {
                this.sslCertId = sslCertId;
                return this;
            }

            /**
             * StickySession.
             */
            public Builder stickySession(Integer stickySession) {
                this.stickySession = stickySession;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
