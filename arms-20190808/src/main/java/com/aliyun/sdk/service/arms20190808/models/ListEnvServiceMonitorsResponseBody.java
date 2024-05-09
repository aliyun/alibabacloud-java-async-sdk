// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvServiceMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvServiceMonitorsResponseBody</p>
 */
public class ListEnvServiceMonitorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEnvServiceMonitorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvServiceMonitorsResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnvServiceMonitorsResponseBody build() {
            return new ListEnvServiceMonitorsResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("MatchedTargetCount")
        private Integer matchedTargetCount;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private Integer targetPort;

        private Endpoints(Builder builder) {
            this.interval = builder.interval;
            this.matchedTargetCount = builder.matchedTargetCount;
            this.path = builder.path;
            this.port = builder.port;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return matchedTargetCount
         */
        public Integer getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return targetPort
         */
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String interval; 
            private Integer matchedTargetCount; 
            private String path; 
            private String port; 
            private Integer targetPort; 

            /**
             * The collection interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The number of pods that match the ServiceMonitor endpoint.
             */
            public Builder matchedTargetCount(Integer matchedTargetCount) {
                this.matchedTargetCount = matchedTargetCount;
                return this;
            }

            /**
             * The collection path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The external port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The destination port.
             */
            public Builder targetPort(Integer targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddonName")
        private String addonName;

        @com.aliyun.core.annotation.NameInMap("AddonReleaseName")
        private String addonReleaseName;

        @com.aliyun.core.annotation.NameInMap("AddonVersion")
        private String addonVersion;

        @com.aliyun.core.annotation.NameInMap("ConfigYaml")
        private String configYaml;

        @com.aliyun.core.annotation.NameInMap("CreationTimestamp")
        private String creationTimestamp;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("MatchedServiceCount")
        private Integer matchedServiceCount;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceMonitorName")
        private String serviceMonitorName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.addonName = builder.addonName;
            this.addonReleaseName = builder.addonReleaseName;
            this.addonVersion = builder.addonVersion;
            this.configYaml = builder.configYaml;
            this.creationTimestamp = builder.creationTimestamp;
            this.endpoints = builder.endpoints;
            this.environmentId = builder.environmentId;
            this.matchedServiceCount = builder.matchedServiceCount;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.serviceMonitorName = builder.serviceMonitorName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return addonName
         */
        public String getAddonName() {
            return this.addonName;
        }

        /**
         * @return addonReleaseName
         */
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        /**
         * @return addonVersion
         */
        public String getAddonVersion() {
            return this.addonVersion;
        }

        /**
         * @return configYaml
         */
        public String getConfigYaml() {
            return this.configYaml;
        }

        /**
         * @return creationTimestamp
         */
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        /**
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return matchedServiceCount
         */
        public Integer getMatchedServiceCount() {
            return this.matchedServiceCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceMonitorName
         */
        public String getServiceMonitorName() {
            return this.serviceMonitorName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String addonName; 
            private String addonReleaseName; 
            private String addonVersion; 
            private String configYaml; 
            private String creationTimestamp; 
            private java.util.List < Endpoints> endpoints; 
            private String environmentId; 
            private Integer matchedServiceCount; 
            private String namespace; 
            private String regionId; 
            private String serviceMonitorName; 
            private String status; 

            /**
             * The name of the component to which the ServiceMonitor belongs.
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * The instance name of the component.
             */
            public Builder addonReleaseName(String addonReleaseName) {
                this.addonReleaseName = addonReleaseName;
                return this;
            }

            /**
             * The version of the component.
             */
            public Builder addonVersion(String addonVersion) {
                this.addonVersion = addonVersion;
                return this;
            }

            /**
             * The YAML configuration string.
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * The time when the ServiceMonitor was created. The value of this parameter is a timestamp.
             */
            public Builder creationTimestamp(String creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * The endpoints of the ServiceMonitor.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The environment ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * The number of matched services.
             */
            public Builder matchedServiceCount(Integer matchedServiceCount) {
                this.matchedServiceCount = matchedServiceCount;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the ServiceMonitor.
             */
            public Builder serviceMonitorName(String serviceMonitorName) {
                this.serviceMonitorName = serviceMonitorName;
                return this;
            }

            /**
             * The status of the ServiceMonitor.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
