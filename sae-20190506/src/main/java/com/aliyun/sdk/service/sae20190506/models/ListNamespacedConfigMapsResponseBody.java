// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListNamespacedConfigMapsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespacedConfigMapsResponseBody</p>
 */
public class ListNamespacedConfigMapsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListNamespacedConfigMapsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the call was successful.</li>
         * <li><strong>3xx</strong>: indicates that the call was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the call failed.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned information. Valid values:</p>
         * <ul>
         * <li>If the call is successful, <strong>success</strong> is returned.</li>
         * <li>If the call fails, an error code is returned.</li>
         * </ul>
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
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the ConfigMap instances were obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instances were obtained.</li>
         * <li><strong>false</strong>: The instances failed to be obtained.</li>
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
         * <p>The ID of the trace. The ID is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListNamespacedConfigMapsResponseBody build() {
            return new ListNamespacedConfigMapsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNamespacedConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacedConfigMapsResponseBody</p>
     */
    public static class RelateApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
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

            private Builder() {
            } 

            private Builder(RelateApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>f16b4000-9058-4c22-a49d-49a28f0b****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
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
    /**
     * 
     * {@link ListNamespacedConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacedConfigMapsResponseBody</p>
     */
    public static class ConfigMaps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapId")
        private Long configMapId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.Map<String, ?> data;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("RelateApps")
        private java.util.List<RelateApps> relateApps;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
        public java.util.Map<String, ?> getData() {
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
        public java.util.List<RelateApps> getRelateApps() {
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
            private java.util.Map<String, ?> data; 
            private String description; 
            private String name; 
            private String namespaceId; 
            private java.util.List<RelateApps> relateApps; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ConfigMaps model) {
                this.configMapId = model.configMapId;
                this.createTime = model.createTime;
                this.data = model.data;
                this.description = model.description;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.relateApps = model.relateApps;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the ConfigMap instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1593760185111</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data of ConfigMap key-value pairs. Format:</p>
             * <p>{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}</p>
             * <p>k specifies a key and v specifies a value. For more information, see <a href="https://help.aliyun.com/document_detail/171326.html">Manage and use configurations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
             */
            public Builder data(java.util.Map<String, ?> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-desc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the ConfigMap instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The application that is associated with the instance.</p>
             */
            public Builder relateApps(java.util.List<RelateApps> relateApps) {
                this.relateApps = relateApps;
                return this;
            }

            /**
             * <p>The time when the instance was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1593760185111</p>
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
    /**
     * 
     * {@link ListNamespacedConfigMapsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacedConfigMapsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMaps")
        private java.util.List<ConfigMaps> configMaps;

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
        public java.util.List<ConfigMaps> getConfigMaps() {
            return this.configMaps;
        }

        public static final class Builder {
            private java.util.List<ConfigMaps> configMaps; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configMaps = model.configMaps;
            } 

            /**
             * <p>The ConfigMap instances.</p>
             */
            public Builder configMaps(java.util.List<ConfigMaps> configMaps) {
                this.configMaps = configMaps;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
