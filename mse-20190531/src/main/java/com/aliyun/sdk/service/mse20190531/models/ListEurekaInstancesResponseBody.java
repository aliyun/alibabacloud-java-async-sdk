// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned instances.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEurekaInstancesResponseBody build() {
            return new ListEurekaInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEurekaInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEurekaInstancesResponseBody</p>
     */
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTACTINFO</p>
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * <p>The timeout period of the instance.<br>After the specified timeout period expires, the service is unavailable by default and is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder durationInSecs(Integer durationInSecs) {
                this.durationInSecs = durationInSecs;
                return this;
            }

            /**
             * <p>The URL of the homepage.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://30.5.XX.XX:8091/">http://30.5.XX.XX:8091/</a></p>
             */
            public Builder homePageUrl(String homePageUrl) {
                this.homePageUrl = homePageUrl;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.XX.XX</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>L-PC1A6A28-****.hz.ali.com:contactinfo:8091</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.XX.XX</p>
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * <p>The time when the instance was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>20201009115543</p>
             */
            public Builder lastDirtyTimestamp(Long lastDirtyTimestamp) {
                this.lastDirtyTimestamp = lastDirtyTimestamp;
                return this;
            }

            /**
             * <p>The time when the instance heartbeat was last checked.</p>
             * 
             * <strong>example:</strong>
             * <p>20201010071203</p>
             */
            public Builder lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
                this.lastUpdatedTimestamp = lastUpdatedTimestamp;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>[string]</p>
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8091</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The maximum interval between two heartbeat checks after a heartbeat check times out.<br>Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder renewalIntervalInSecs(Integer renewalIntervalInSecs) {
                this.renewalIntervalInSecs = renewalIntervalInSecs;
                return this;
            }

            /**
             * <p>The security port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder securePort(Integer securePort) {
                this.securePort = securePort;
                return this;
            }

            /**
             * <p>The number of service providers. The value is in the following format: Number of healthy instances/Total number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1/1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The virtual IP address (VIP).</p>
             * 
             * <strong>example:</strong>
             * <p>contactinfo</p>
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
