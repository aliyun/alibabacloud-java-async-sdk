// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAnsServiceClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnsServiceClustersResponseBody</p>
 */
public class ListAnsServiceClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAnsServiceClustersResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnsServiceClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>52BA6DA6-A702-4362-A32F-DFF79655****</p>
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

        public ListAnsServiceClustersResponseBody build() {
            return new ListAnsServiceClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnsServiceClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnsServiceClustersResponseBody</p>
     */
    public static class AppDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CheckInternal")
        private Integer checkInternal;

        @com.aliyun.core.annotation.NameInMap("CheckPath")
        private String checkPath;

        @com.aliyun.core.annotation.NameInMap("CheckTimeout")
        private Integer checkTimeout;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

        @com.aliyun.core.annotation.NameInMap("HealthyCheckTimes")
        private Integer healthyCheckTimes;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("UnhealthyCheckTimes")
        private Integer unhealthyCheckTimes;

        private AppDetail(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.checkInternal = builder.checkInternal;
            this.checkPath = builder.checkPath;
            this.checkTimeout = builder.checkTimeout;
            this.checkType = builder.checkType;
            this.healthyCheckTimes = builder.healthyCheckTimes;
            this.port = builder.port;
            this.unhealthyCheckTimes = builder.unhealthyCheckTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppDetail create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return checkInternal
         */
        public Integer getCheckInternal() {
            return this.checkInternal;
        }

        /**
         * @return checkPath
         */
        public String getCheckPath() {
            return this.checkPath;
        }

        /**
         * @return checkTimeout
         */
        public Integer getCheckTimeout() {
            return this.checkTimeout;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return healthyCheckTimes
         */
        public Integer getHealthyCheckTimes() {
            return this.healthyCheckTimes;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return unhealthyCheckTimes
         */
        public Integer getUnhealthyCheckTimes() {
            return this.unhealthyCheckTimes;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Integer checkInternal; 
            private String checkPath; 
            private Integer checkTimeout; 
            private String checkType; 
            private Integer healthyCheckTimes; 
            private Integer port; 
            private Integer unhealthyCheckTimes; 

            /**
             * <p>The ID of the application for which Microservices Governance is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1po62@904cba2c0xxxxxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application for which Microservices Governance is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-cloud-b</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The health check interval. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder checkInternal(Integer checkInternal) {
                this.checkInternal = checkInternal;
                return this;
            }

            /**
             * <p>The path of the health check. This parameter is required only when the CheckType parameter is set to http.</p>
             * 
             * <strong>example:</strong>
             * <p>/health</p>
             */
            public Builder checkPath(String checkPath) {
                this.checkPath = checkPath;
                return this;
            }

            /**
             * <p>The timeout period of the health check response. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder checkTimeout(Integer checkTimeout) {
                this.checkTimeout = checkTimeout;
                return this;
            }

            /**
             * <p>The type of the health check. Valid values:</p>
             * <ul>
             * <li>connection: connection status check</li>
             * <li>tcp: TCP connection check</li>
             * <li>http: HTTP connection check</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>connection</p>
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The maximum number of health check retries when the instance state changes from unhealthy to healthy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthyCheckTimes(Integer healthyCheckTimes) {
                this.healthyCheckTimes = healthyCheckTimes;
                return this;
            }

            /**
             * <p>The port number of the application for which Microservices Governance is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>6001</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The maximum number of health check retries when the instance state changes from healthy to unhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unhealthyCheckTimes(Integer unhealthyCheckTimes) {
                this.unhealthyCheckTimes = unhealthyCheckTimes;
                return this;
            }

            public AppDetail build() {
                return new AppDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnsServiceClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnsServiceClustersResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultCheckPort")
        private Integer defaultCheckPort;

        @com.aliyun.core.annotation.NameInMap("DefaultPort")
        private Integer defaultPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckerType")
        private String healthCheckerType;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("UseIPPort4Check")
        private Boolean useIPPort4Check;

        private Clusters(Builder builder) {
            this.defaultCheckPort = builder.defaultCheckPort;
            this.defaultPort = builder.defaultPort;
            this.healthCheckerType = builder.healthCheckerType;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.serviceName = builder.serviceName;
            this.useIPPort4Check = builder.useIPPort4Check;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return defaultCheckPort
         */
        public Integer getDefaultCheckPort() {
            return this.defaultCheckPort;
        }

        /**
         * @return defaultPort
         */
        public Integer getDefaultPort() {
            return this.defaultPort;
        }

        /**
         * @return healthCheckerType
         */
        public String getHealthCheckerType() {
            return this.healthCheckerType;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return useIPPort4Check
         */
        public Boolean getUseIPPort4Check() {
            return this.useIPPort4Check;
        }

        public static final class Builder {
            private Integer defaultCheckPort; 
            private Integer defaultPort; 
            private String healthCheckerType; 
            private java.util.Map < String, ? > metadata; 
            private String name; 
            private String serviceName; 
            private Boolean useIPPort4Check; 

            /**
             * <p>The default port used for a health check.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder defaultCheckPort(Integer defaultCheckPort) {
                this.defaultCheckPort = defaultCheckPort;
                return this;
            }

            /**
             * <p>The default port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder defaultPort(Integer defaultPort) {
                this.defaultPort = defaultPort;
                return this;
            }

            /**
             * <p>The type of the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>Heartbeat Reporting</p>
             */
            public Builder healthCheckerType(String healthCheckerType) {
                this.healthCheckerType = healthCheckerType;
                return this;
            }

            /**
             * <p>The metadata of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The full name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP@@nacos.test.3</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Indicates whether an end-to-end health check was initiated by the server. This parameter is valid only if the service is not a temporary service.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useIPPort4Check(Boolean useIPPort4Check) {
                this.useIPPort4Check = useIPPort4Check;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnsServiceClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnsServiceClustersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDetail")
        private AppDetail appDetail;

        @com.aliyun.core.annotation.NameInMap("Clusters")
        private java.util.List < Clusters> clusters;

        @com.aliyun.core.annotation.NameInMap("Ephemeral")
        private Boolean ephemeral;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProtectThreshold")
        private Float protectThreshold;

        @com.aliyun.core.annotation.NameInMap("SelectorType")
        private String selectorType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private Data(Builder builder) {
            this.appDetail = builder.appDetail;
            this.clusters = builder.clusters;
            this.ephemeral = builder.ephemeral;
            this.groupName = builder.groupName;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.protectThreshold = builder.protectThreshold;
            this.selectorType = builder.selectorType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appDetail
         */
        public AppDetail getAppDetail() {
            return this.appDetail;
        }

        /**
         * @return clusters
         */
        public java.util.List < Clusters> getClusters() {
            return this.clusters;
        }

        /**
         * @return ephemeral
         */
        public Boolean getEphemeral() {
            return this.ephemeral;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protectThreshold
         */
        public Float getProtectThreshold() {
            return this.protectThreshold;
        }

        /**
         * @return selectorType
         */
        public String getSelectorType() {
            return this.selectorType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private AppDetail appDetail; 
            private java.util.List < Clusters> clusters; 
            private Boolean ephemeral; 
            private String groupName; 
            private java.util.Map < String, ? > metadata; 
            private String name; 
            private Float protectThreshold; 
            private String selectorType; 
            private String source; 

            /**
             * <p>The information about the associated application for which Microservices Governance is enabled when the Source parameter is set to governance.</p>
             */
            public Builder appDetail(AppDetail appDetail) {
                this.appDetail = appDetail;
                return this;
            }

            /**
             * <p>The cluster information.</p>
             */
            public Builder clusters(java.util.List < Clusters> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * <p>Indicates whether the service is a temporary service. Valid values:</p>
             * <ul>
             * <li><code>true</code>: yes</li>
             * <li><code>false</code>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ephemeral(Boolean ephemeral) {
                this.ephemeral = ephemeral;
                return this;
            }

            /**
             * <p>The service group to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The metadata of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>nacos.test.3</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The protection threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder protectThreshold(Float protectThreshold) {
                this.protectThreshold = protectThreshold;
                return this;
            }

            /**
             * <p>The election mode.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder selectorType(String selectorType) {
                this.selectorType = selectorType;
                return this;
            }

            /**
             * <p>The source type of the service. Valid values:</p>
             * <ul>
             * <li>console: The service was registered in the console.</li>
             * <li>sdk: The service was registered by using the SDK.</li>
             * <li>governance: The service was registered on Microservices Governance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
