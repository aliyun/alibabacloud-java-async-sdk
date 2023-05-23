// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEurekaInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEurekaInstancesResponseBody</p>
 */
public class ListEurekaInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("App")
        private String app;

        @NameInMap("DurationInSecs")
        private Integer durationInSecs;

        @NameInMap("HomePageUrl")
        private String homePageUrl;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpAddr")
        private String ipAddr;

        @NameInMap("LastDirtyTimestamp")
        private Long lastDirtyTimestamp;

        @NameInMap("LastUpdatedTimestamp")
        private Long lastUpdatedTimestamp;

        @NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RenewalIntervalInSecs")
        private Integer renewalIntervalInSecs;

        @NameInMap("SecurePort")
        private Integer securePort;

        @NameInMap("Status")
        private String status;

        @NameInMap("VipAddress")
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
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * DurationInSecs.
             */
            public Builder durationInSecs(Integer durationInSecs) {
                this.durationInSecs = durationInSecs;
                return this;
            }

            /**
             * HomePageUrl.
             */
            public Builder homePageUrl(String homePageUrl) {
                this.homePageUrl = homePageUrl;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IpAddr.
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * LastDirtyTimestamp.
             */
            public Builder lastDirtyTimestamp(Long lastDirtyTimestamp) {
                this.lastDirtyTimestamp = lastDirtyTimestamp;
                return this;
            }

            /**
             * LastUpdatedTimestamp.
             */
            public Builder lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
                this.lastUpdatedTimestamp = lastUpdatedTimestamp;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * RenewalIntervalInSecs.
             */
            public Builder renewalIntervalInSecs(Integer renewalIntervalInSecs) {
                this.renewalIntervalInSecs = renewalIntervalInSecs;
                return this;
            }

            /**
             * SecurePort.
             */
            public Builder securePort(Integer securePort) {
                this.securePort = securePort;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VipAddress.
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
