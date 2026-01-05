// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPluginClassesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginClassesResponseBody</p>
 */
public class ListPluginClassesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPluginClassesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginClassesResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPluginClassesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPluginClassesResponseBody build() {
            return new ListPluginClassesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginClassesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginClassesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("installed")
        private Boolean installed;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pluginClassId")
        private String pluginClassId;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("publishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("supportedMinGatewayVersion")
        private String supportedMinGatewayVersion;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Items(Builder builder) {
            this.alias = builder.alias;
            this.description = builder.description;
            this.installed = builder.installed;
            this.name = builder.name;
            this.pluginClassId = builder.pluginClassId;
            this.pluginId = builder.pluginId;
            this.publishStatus = builder.publishStatus;
            this.source = builder.source;
            this.supportedMinGatewayVersion = builder.supportedMinGatewayVersion;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return installed
         */
        public Boolean getInstalled() {
            return this.installed;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pluginClassId
         */
        public String getPluginClassId() {
            return this.pluginClassId;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return supportedMinGatewayVersion
         */
        public String getSupportedMinGatewayVersion() {
            return this.supportedMinGatewayVersion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String alias; 
            private String description; 
            private Boolean installed; 
            private String name; 
            private String pluginClassId; 
            private String pluginId; 
            private String publishStatus; 
            private String source; 
            private String supportedMinGatewayVersion; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.alias = model.alias;
                this.description = model.description;
                this.installed = model.installed;
                this.name = model.name;
                this.pluginClassId = model.pluginClassId;
                this.pluginId = model.pluginId;
                this.publishStatus = model.publishStatus;
                this.source = model.source;
                this.supportedMinGatewayVersion = model.supportedMinGatewayVersion;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * installed.
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pluginClassId.
             */
            public Builder pluginClassId(String pluginClassId) {
                this.pluginClassId = pluginClassId;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * publishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * supportedMinGatewayVersion.
             */
            public Builder supportedMinGatewayVersion(String supportedMinGatewayVersion) {
                this.supportedMinGatewayVersion = supportedMinGatewayVersion;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginClassesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginClassesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
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
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalSize.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
