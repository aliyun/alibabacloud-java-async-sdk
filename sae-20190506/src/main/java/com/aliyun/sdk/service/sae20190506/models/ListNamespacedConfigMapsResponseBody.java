// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespacedConfigMapsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespacedConfigMapsResponseBody</p>
 */
public class ListNamespacedConfigMapsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private ListNamespacedConfigMapsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacedConfigMapsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the call was successful.
         * *   **3xx**: indicates that the call was redirected.
         * *   **4xx**: indicates that the call failed.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error code. Valid values:
         * <p>
         * 
         * - If the call is successful, the **ErrorCode** parameter is not returned.
         * - If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned information. Valid values:
         * <p>
         * 
         * *   If the call is successful, **success** is returned.
         * *   If the call fails, an error code is returned.
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
         * Indicates whether the ConfigMap instances were obtained. Valid values:
         * <p>
         * 
         * *   **true**: The instances were obtained.
         * *   **false**: The instances failed to be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. The ID is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListNamespacedConfigMapsResponseBody build() {
            return new ListNamespacedConfigMapsResponseBody(this);
        } 

    } 

    public static class RelateApps extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        private RelateApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelateApps create() {
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

            public RelateApps build() {
                return new RelateApps(this);
            } 

        } 

    }
    public static class ConfigMaps extends TeaModel {
        @NameInMap("ConfigMapId")
        private Long configMapId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Data")
        private java.util.Map < String, ? > data;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("RelateApps")
        private java.util.List < RelateApps> relateApps;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ConfigMaps(Builder builder) {
            this.configMapId = builder.configMapId;
            this.createTime = builder.createTime;
            this.data = builder.data;
            this.description = builder.description;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.relateApps = builder.relateApps;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigMaps create() {
            return builder().build();
        }

        /**
         * @return configMapId
         */
        public Long getConfigMapId() {
            return this.configMapId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return data
         */
        public java.util.Map < String, ? > getData() {
            return this.data;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return relateApps
         */
        public java.util.List < RelateApps> getRelateApps() {
            return this.relateApps;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long configMapId; 
            private Long createTime; 
            private java.util.Map < String, ? > data; 
            private String description; 
            private String name; 
            private String namespaceId; 
            private java.util.List < RelateApps> relateApps; 
            private Long updateTime; 

            /**
             * The ID of the ConfigMap instance.
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The data of ConfigMap key-value pairs. Format:
             * <p>
             * 
             * {"k1":"v1", "k2":"v2"}
             * 
             * k specifies a key and v specifies a value. For more information, see [Manage and use configurations](~~171326~~).
             */
            public Builder data(java.util.Map < String, ? > data) {
                this.data = data;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the ConfigMap instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The application that is associated with the instance.
             */
            public Builder relateApps(java.util.List < RelateApps> relateApps) {
                this.relateApps = relateApps;
                return this;
            }

            /**
             * The time when the instance was last modified.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ConfigMaps build() {
                return new ConfigMaps(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConfigMaps")
        private java.util.List < ConfigMaps> configMaps;

        private Data(Builder builder) {
            this.configMaps = builder.configMaps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configMaps
         */
        public java.util.List < ConfigMaps> getConfigMaps() {
            return this.configMaps;
        }

        public static final class Builder {
            private java.util.List < ConfigMaps> configMaps; 

            /**
             * The ConfigMap instances.
             */
            public Builder configMaps(java.util.List < ConfigMaps> configMaps) {
                this.configMaps = configMaps;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
