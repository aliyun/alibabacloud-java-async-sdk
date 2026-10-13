// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListContextDatabaseSyncPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseSyncPluginsResponseBody</p>
 */
public class ListContextDatabaseSyncPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContextDatabaseSyncPluginsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextDatabaseSyncPluginsResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private java.util.List<Data> data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseSyncPluginsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContextDatabaseSyncPluginsResponseBody build() {
            return new ListContextDatabaseSyncPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseSyncPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncPluginsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorization")
        private String authorization;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("SourceConfig")
        private String sourceConfig;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.authorization = builder.authorization;
            this.displayName = builder.displayName;
            this.icon = builder.icon;
            this.id = builder.id;
            this.kind = builder.kind;
            this.sourceConfig = builder.sourceConfig;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorization
         */
        public String getAuthorization() {
            return this.authorization;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return sourceConfig
         */
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String authorization; 
            private String displayName; 
            private String icon; 
            private String id; 
            private String kind; 
            private String sourceConfig; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorization = model.authorization;
                this.displayName = model.displayName;
                this.icon = model.icon;
                this.id = model.id;
                this.kind = model.kind;
                this.sourceConfig = model.sourceConfig;
                this.version = model.version;
            } 

            /**
             * <p>The authorization method.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;kind&quot;:&quot;oauth&quot;,&quot;phases&quot;:[&quot;discovery&quot;]}</p>
             */
            public Builder authorization(String authorization) {
                this.authorization = authorization;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D team DingTalk data source</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The icon.</p>
             * 
             * <strong>example:</strong>
             * <p>/icons/dingtalk.svg</p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The plugin ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The plugin type. This operation returns only plugins of the source type.</p>
             * 
             * <strong>example:</strong>
             * <p>source</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The datasource config template (JSON character string, structure varies depending on the plugin).</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;hint&quot;:&quot;Select import scope&quot;,&quot;fields&quot;:[{&quot;key&quot;:&quot;folderIds&quot;,&quot;type&quot;:&quot;string-list&quot;,&quot;label&quot;:&quot;Folder / document scope&quot;}]}</p>
             */
            public Builder sourceConfig(String sourceConfig) {
                this.sourceConfig = sourceConfig;
                return this;
            }

            /**
             * <p>The version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
