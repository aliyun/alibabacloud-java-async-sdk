// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEurekaInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEurekaInstancesResponseBody</p>
 */
public class ListEurekaInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEurekaInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEurekaInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The details of the data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEurekaInstancesResponseBody build() {
            return new ListEurekaInstancesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("DurationInSecs")
        private Integer durationInSecs;

        @com.aliyun.core.annotation.NameInMap("HomePageUrl")
        private String homePageUrl;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpAddr")
        private String ipAddr;

        @com.aliyun.core.annotation.NameInMap("LastDirtyTimestamp")
        private Long lastDirtyTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastUpdatedTimestamp")
        private Long lastUpdatedTimestamp;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RenewalIntervalInSecs")
        private Integer renewalIntervalInSecs;

        @com.aliyun.core.annotation.NameInMap("SecurePort")
        private Integer securePort;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VipAddress")
        private String vipAddress;

        private Data(Builder builder) {
            this.app = builder.app;
            this.durationInSecs = builder.durationInSecs;
            this.homePageUrl = builder.homePageUrl;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.ipAddr = builder.ipAddr;
            this.lastDirtyTimestamp = builder.lastDirtyTimestamp;
            this.lastUpdatedTimestamp = builder.lastUpdatedTimestamp;
            this.metadata = builder.metadata;
            this.port = builder.port;
            this.renewalIntervalInSecs = builder.renewalIntervalInSecs;
            this.securePort = builder.securePort;
            this.status = builder.status;
            this.vipAddress = builder.vipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return durationInSecs
         */
        public Integer getDurationInSecs() {
            return this.durationInSecs;
        }

        /**
         * @return homePageUrl
         */
        public String getHomePageUrl() {
            return this.homePageUrl;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipAddr
         */
        public String getIpAddr() {
            return this.ipAddr;
        }

        /**
         * @return lastDirtyTimestamp
         */
        public Long getLastDirtyTimestamp() {
            return this.lastDirtyTimestamp;
        }

        /**
         * @return lastUpdatedTimestamp
         */
        public Long getLastUpdatedTimestamp() {
            return this.lastUpdatedTimestamp;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return renewalIntervalInSecs
         */
        public Integer getRenewalIntervalInSecs() {
            return this.renewalIntervalInSecs;
        }

        /**
         * @return securePort
         */
        public Integer getSecurePort() {
            return this.securePort;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vipAddress
         */
        public String getVipAddress() {
            return this.vipAddress;
        }

        public static final class Builder {
            private String app; 
            private Integer durationInSecs; 
            private String homePageUrl; 
            private String hostName; 
            private String instanceId; 
            private String ipAddr; 
            private Long lastDirtyTimestamp; 
            private Long lastUpdatedTimestamp; 
            private java.util.Map < String, ? > metadata; 
            private Integer port; 
            private Integer renewalIntervalInSecs; 
            private Integer securePort; 
            private String status; 
            private String vipAddress; 

            /**
             * The name of the application.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * The timeout period of the instance.\
             * <p>
             * After the specified timeout period expires, the service is unavailable by default and is deleted.
             */
            public Builder durationInSecs(Integer durationInSecs) {
                this.durationInSecs = durationInSecs;
                return this;
            }

            /**
             * The URL of the homepage.
             */
            public Builder homePageUrl(String homePageUrl) {
                this.homePageUrl = homePageUrl;
                return this;
            }

            /**
             * The hostname.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * The time when the instance was last modified.
             */
            public Builder lastDirtyTimestamp(Long lastDirtyTimestamp) {
                this.lastDirtyTimestamp = lastDirtyTimestamp;
                return this;
            }

            /**
             * The time when the instance heartbeat was last checked.
             */
            public Builder lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
                this.lastUpdatedTimestamp = lastUpdatedTimestamp;
                return this;
            }

            /**
             * The metadata.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * The service port number.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The maximum interval between two heartbeat checks after a heartbeat check times out.\
             * <p>
             * Default value: 10.
             */
            public Builder renewalIntervalInSecs(Integer renewalIntervalInSecs) {
                this.renewalIntervalInSecs = renewalIntervalInSecs;
                return this;
            }

            /**
             * The security port.
             */
            public Builder securePort(Integer securePort) {
                this.securePort = securePort;
                return this;
            }

            /**
             * The number of service providers. The value is in the following format: Number of healthy instances/Total number of instances.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The virtual IP address (VIP).
             */
            public Builder vipAddress(String vipAddress) {
                this.vipAddress = vipAddress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
