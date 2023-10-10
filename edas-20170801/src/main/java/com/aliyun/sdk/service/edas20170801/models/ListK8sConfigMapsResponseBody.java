// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sConfigMapsResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sConfigMapsResponseBody</p>
 */
public class ListK8sConfigMapsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListK8sConfigMapsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sConfigMapsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The query results that are returned.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListK8sConfigMapsResponseBody build() {
            return new ListK8sConfigMapsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The user-defined key that is stored in the ConfigMap.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The user-defined value that is stored in the ConfigMap.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class RelatedApps extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        private RelatedApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedApps create() {
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

        public static final class Builder {
            private String appId; 
            private String appName; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public RelatedApps build() {
                return new RelatedApps(this);
            } 

        } 

    }
    public static class ConfigMaps extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RelatedApps")
        private java.util.List < RelatedApps> relatedApps;

        private ConfigMaps(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.creationTime = builder.creationTime;
            this.data = builder.data;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.relatedApps = builder.relatedApps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigMaps create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return relatedApps
         */
        public java.util.List < RelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String creationTime; 
            private java.util.List < Data> data; 
            private String name; 
            private String namespace; 
            private java.util.List < RelatedApps> relatedApps; 

            /**
             * The ID of the Kubernetes cluster. You can obtain the cluster ID by calling the GetK8sCluster operation. For more information, see [GetK8sCluster](~~181437~~).
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The time when the ConfigMaps were created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The information about ConfigMaps.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * The name of the ConfigMap.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace of the Kubernetes cluster.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The related applications.
             */
            public Builder relatedApps(java.util.List < RelatedApps> relatedApps) {
                this.relatedApps = relatedApps;
                return this;
            }

            public ConfigMaps build() {
                return new ConfigMaps(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ConfigMaps")
        private java.util.List < ConfigMaps> configMaps;

        @NameInMap("Total")
        private Integer total;

        private Result(Builder builder) {
            this.configMaps = builder.configMaps;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return configMaps
         */
        public java.util.List < ConfigMaps> getConfigMaps() {
            return this.configMaps;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < ConfigMaps> configMaps; 
            private Integer total; 

            /**
             * The information about ConfigMaps.
             */
            public Builder configMaps(java.util.List < ConfigMaps> configMaps) {
                this.configMaps = configMaps;
                return this;
            }

            /**
             * The total number of entries that are returned.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
