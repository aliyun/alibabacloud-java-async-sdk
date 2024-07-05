// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParentPlatformsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParentPlatformsResponseBody</p>
 */
public class DescribeParentPlatformsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Platforms")
    private java.util.List < Platforms> platforms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeParentPlatformsResponseBody(Builder builder) {
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.platforms = builder.platforms;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentPlatformsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platforms
     */
    public java.util.List < Platforms> getPlatforms() {
        return this.platforms;
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
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private java.util.List < Platforms> platforms; 
        private String requestId; 
        private Long totalCount; 

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Platforms.
         */
        public Builder platforms(java.util.List < Platforms> platforms) {
            this.platforms = platforms;
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

        public DescribeParentPlatformsResponseBody build() {
            return new DescribeParentPlatformsResponseBody(this);
        } 

    } 

    public static class Platforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoStart")
        private Boolean autoStart;

        @com.aliyun.core.annotation.NameInMap("ClientAuth")
        private Boolean clientAuth;

        @com.aliyun.core.annotation.NameInMap("ClientGbId")
        private String clientGbId;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientPassword")
        private String clientPassword;

        @com.aliyun.core.annotation.NameInMap("ClientPort")
        private Long clientPort;

        @com.aliyun.core.annotation.NameInMap("ClientUsername")
        private String clientUsername;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GbId")
        private String gbId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Platforms(Builder builder) {
            this.autoStart = builder.autoStart;
            this.clientAuth = builder.clientAuth;
            this.clientGbId = builder.clientGbId;
            this.clientIp = builder.clientIp;
            this.clientPassword = builder.clientPassword;
            this.clientPort = builder.clientPort;
            this.clientUsername = builder.clientUsername;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.gbId = builder.gbId;
            this.id = builder.id;
            this.ip = builder.ip;
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return autoStart
         */
        public Boolean getAutoStart() {
            return this.autoStart;
        }

        /**
         * @return clientAuth
         */
        public Boolean getClientAuth() {
            return this.clientAuth;
        }

        /**
         * @return clientGbId
         */
        public String getClientGbId() {
            return this.clientGbId;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientPassword
         */
        public String getClientPassword() {
            return this.clientPassword;
        }

        /**
         * @return clientPort
         */
        public Long getClientPort() {
            return this.clientPort;
        }

        /**
         * @return clientUsername
         */
        public String getClientUsername() {
            return this.clientUsername;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoStart; 
            private Boolean clientAuth; 
            private String clientGbId; 
            private String clientIp; 
            private String clientPassword; 
            private Long clientPort; 
            private String clientUsername; 
            private String createdTime; 
            private String description; 
            private String gbId; 
            private String id; 
            private String ip; 
            private String name; 
            private Long port; 
            private String protocol; 
            private String status; 

            /**
             * AutoStart.
             */
            public Builder autoStart(Boolean autoStart) {
                this.autoStart = autoStart;
                return this;
            }

            /**
             * ClientAuth.
             */
            public Builder clientAuth(Boolean clientAuth) {
                this.clientAuth = clientAuth;
                return this;
            }

            /**
             * ClientGbId.
             */
            public Builder clientGbId(String clientGbId) {
                this.clientGbId = clientGbId;
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
             * ClientPassword.
             */
            public Builder clientPassword(String clientPassword) {
                this.clientPassword = clientPassword;
                return this;
            }

            /**
             * ClientPort.
             */
            public Builder clientPort(Long clientPort) {
                this.clientPort = clientPort;
                return this;
            }

            /**
             * ClientUsername.
             */
            public Builder clientUsername(String clientUsername) {
                this.clientUsername = clientUsername;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
}
