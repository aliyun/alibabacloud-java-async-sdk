// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlbAPsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSlbAPsResponseBody</p>
 */
public class ListSlbAPsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListSlbAPsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlbAPsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorMsg; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSlbAPsResponseBody build() {
            return new ListSlbAPsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
