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
 * {@link ListPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginsResponseBody</p>
 */
public class ListPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPluginsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginsResponseBody create() {
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

        private Builder(ListPluginsResponseBody model) {
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

        public ListPluginsResponseBody build() {
            return new ListPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
     */
    public static class AttachmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
        private String pluginAttachmentId;

        private AttachmentInfo(Builder builder) {
            this.enable = builder.enable;
            this.pluginAttachmentId = builder.pluginAttachmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachmentInfo create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return pluginAttachmentId
         */
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

        public static final class Builder {
            private String enable; 
            private String pluginAttachmentId; 

            private Builder() {
            } 

            private Builder(AttachmentInfo model) {
                this.enable = model.enable;
                this.pluginAttachmentId = model.pluginAttachmentId;
            } 

            /**
             * enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * pluginAttachmentId.
             */
            public Builder pluginAttachmentId(String pluginAttachmentId) {
                this.pluginAttachmentId = pluginAttachmentId;
                return this;
            }

            public AttachmentInfo build() {
                return new AttachmentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
     */
    public static class GatewayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private GatewayInfo(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfo create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String gatewayId; 
            private String name; 

            private Builder() {
            } 

            private Builder(GatewayInfo model) {
                this.gatewayId = model.gatewayId;
                this.name = model.name;
            } 

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GatewayInfo build() {
                return new GatewayInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
     */
    public static class PluginClassInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("executePriority")
        private String executePriority;

        @com.aliyun.core.annotation.NameInMap("executeStage")
        private String executeStage;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pluginClassId")
        private String pluginClassId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionDescription")
        private String versionDescription;

        private PluginClassInfo(Builder builder) {
            this.alias = builder.alias;
            this.executePriority = builder.executePriority;
            this.executeStage = builder.executeStage;
            this.name = builder.name;
            this.pluginClassId = builder.pluginClassId;
            this.source = builder.source;
            this.version = builder.version;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginClassInfo create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return executePriority
         */
        public String getExecutePriority() {
            return this.executePriority;
        }

        /**
         * @return executeStage
         */
        public String getExecuteStage() {
            return this.executeStage;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public static final class Builder {
            private String alias; 
            private String executePriority; 
            private String executeStage; 
            private String name; 
            private String pluginClassId; 
            private String source; 
            private String version; 
            private String versionDescription; 

            private Builder() {
            } 

            private Builder(PluginClassInfo model) {
                this.alias = model.alias;
                this.executePriority = model.executePriority;
                this.executeStage = model.executeStage;
                this.name = model.name;
                this.pluginClassId = model.pluginClassId;
                this.source = model.source;
                this.version = model.version;
                this.versionDescription = model.versionDescription;
            } 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * executePriority.
             */
            public Builder executePriority(String executePriority) {
                this.executePriority = executePriority;
                return this;
            }

            /**
             * executeStage.
             */
            public Builder executeStage(String executeStage) {
                this.executeStage = executeStage;
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * versionDescription.
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            public PluginClassInfo build() {
                return new PluginClassInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachmentInfo")
        private AttachmentInfo attachmentInfo;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("pluginClassInfo")
        private PluginClassInfo pluginClassInfo;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        private Items(Builder builder) {
            this.attachmentInfo = builder.attachmentInfo;
            this.gatewayInfo = builder.gatewayInfo;
            this.pluginClassInfo = builder.pluginClassInfo;
            this.pluginId = builder.pluginId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return attachmentInfo
         */
        public AttachmentInfo getAttachmentInfo() {
            return this.attachmentInfo;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return pluginClassInfo
         */
        public PluginClassInfo getPluginClassInfo() {
            return this.pluginClassInfo;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        public static final class Builder {
            private AttachmentInfo attachmentInfo; 
            private GatewayInfo gatewayInfo; 
            private PluginClassInfo pluginClassInfo; 
            private String pluginId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attachmentInfo = model.attachmentInfo;
                this.gatewayInfo = model.gatewayInfo;
                this.pluginClassInfo = model.pluginClassInfo;
                this.pluginId = model.pluginId;
            } 

            /**
             * attachmentInfo.
             */
            public Builder attachmentInfo(AttachmentInfo attachmentInfo) {
                this.attachmentInfo = attachmentInfo;
                return this;
            }

            /**
             * gatewayInfo.
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * pluginClassInfo.
             */
            public Builder pluginClassInfo(PluginClassInfo pluginClassInfo) {
                this.pluginClassInfo = pluginClassInfo;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginsResponseBody</p>
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
