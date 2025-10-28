// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListK8sConfigMapsResponseBody} extends {@link TeaModel}
 *
 * <p>ListK8sConfigMapsResponseBody</p>
 */
public class ListK8sConfigMapsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListK8sConfigMapsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-****************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The query results that are returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListK8sConfigMapsResponseBody build() {
            return new ListK8sConfigMapsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListK8sConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sConfigMapsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The user-defined key that is stored in the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The user-defined value that is stored in the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>william</p>
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
    /**
     * 
     * {@link ListK8sConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sConfigMapsResponseBody</p>
     */
    public static class RelatedApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
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

            private Builder() {
            } 

            private Builder(RelatedApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>728cbdf2-da10-49b8-b69c-9168a********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>my-app</p>
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
    /**
     * 
     * {@link ListK8sConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sConfigMapsResponseBody</p>
     */
    public static class ConfigMaps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RelatedApps")
        private java.util.List<RelatedApps> relatedApps;

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
        public java.util.List<Data> getData() {
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
        public java.util.List<RelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String creationTime; 
            private java.util.List<Data> data; 
            private String name; 
            private String namespace; 
            private java.util.List<RelatedApps> relatedApps; 

            private Builder() {
            } 

            private Builder(ConfigMaps model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.creationTime = model.creationTime;
                this.data = model.data;
                this.name = model.name;
                this.namespace = model.namespace;
                this.relatedApps = model.relatedApps;
            } 

            /**
             * <p>The ID of the Kubernetes cluster. You can obtain the cluster ID by calling the GetK8sCluster operation. For more information, see <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>d73918f4-3b08-4c17-bb07-eaf8********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>my-cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time when the ConfigMaps were created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-31T02:46:14Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The information about ConfigMaps.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The name of the ConfigMap.</p>
             * 
             * <strong>example:</strong>
             * <p>my-config</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The related applications.</p>
             */
            public Builder relatedApps(java.util.List<RelatedApps> relatedApps) {
                this.relatedApps = relatedApps;
                return this;
            }

            public ConfigMaps build() {
                return new ConfigMaps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListK8sConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListK8sConfigMapsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMaps")
        private java.util.List<ConfigMaps> configMaps;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<ConfigMaps> getConfigMaps() {
            return this.configMaps;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ConfigMaps> configMaps; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.configMaps = model.configMaps;
                this.total = model.total;
            } 

            /**
             * <p>The information about ConfigMaps.</p>
             */
            public Builder configMaps(java.util.List<ConfigMaps> configMaps) {
                this.configMaps = configMaps;
                return this;
            }

            /**
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
