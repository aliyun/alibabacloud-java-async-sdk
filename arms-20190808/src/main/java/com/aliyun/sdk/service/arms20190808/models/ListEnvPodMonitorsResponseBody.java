// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEnvPodMonitorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvPodMonitorsResponseBody</p>
 */
public class ListEnvPodMonitorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEnvPodMonitorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvPodMonitorsResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C518054-852F-4023-ABC1-4AF95FF7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnvPodMonitorsResponseBody build() {
            return new ListEnvPodMonitorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvPodMonitorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvPodMonitorsResponseBody</p>
     */
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
             * <p>The collection interval.</p>
             * 
             * <strong>example:</strong>
             * <p>30s</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The number of pods that match the PodMonitor endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchedTargetCount(Integer matchedTargetCount) {
                this.matchedTargetCount = matchedTargetCount;
                return this;
            }

            /**
             * <p>The collection path.</p>
             * 
             * <strong>example:</strong>
             * <p>/metrics</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The external port.</p>
             * 
             * <strong>example:</strong>
             * <p>9182</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
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
    /**
     * 
     * {@link ListEnvPodMonitorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvPodMonitorsResponseBody</p>
     */
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
        private java.util.List<Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PodMonitorName")
        private String podMonitorName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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
            this.namespace = builder.namespace;
            this.podMonitorName = builder.podMonitorName;
            this.regionId = builder.regionId;
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
        public java.util.List<Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return podMonitorName
         */
        public String getPodMonitorName() {
            return this.podMonitorName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private java.util.List<Endpoints> endpoints; 
            private String environmentId; 
            private String namespace; 
            private String podMonitorName; 
            private String regionId; 
            private String status; 

            /**
             * <p>The name of the add-on to which the PodMonitor belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder addonName(String addonName) {
                this.addonName = addonName;
                return this;
            }

            /**
             * <p>The instance name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql1</p>
             */
            public Builder addonReleaseName(String addonReleaseName) {
                this.addonReleaseName = addonReleaseName;
                return this;
            }

            /**
             * <p>The version of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.5</p>
             */
            public Builder addonVersion(String addonVersion) {
                this.addonVersion = addonVersion;
                return this;
            }

            /**
             * <p>The YAML configuration string.</p>
             * 
             * <strong>example:</strong>
             * <p>Refer to supplementary instructions.</p>
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * <p>The time when the PodMonitor was created. The value of this parameter is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-01-02T11:34:22Z</p>
             */
            public Builder creationTimestamp(String creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * <p>The endpoints of the PodMonitor.</p>
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxxxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the PodMonitor.</p>
             * 
             * <strong>example:</strong>
             * <p>pm1</p>
             */
            public Builder podMonitorName(String podMonitorName) {
                this.podMonitorName = podMonitorName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the PodMonitor.</p>
             * 
             * <strong>example:</strong>
             * <p>run</p>
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
