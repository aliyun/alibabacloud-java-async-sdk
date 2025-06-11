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
 * {@link ListPluginAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPluginAttachmentsResponseBody</p>
 */
public class ListPluginAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPluginAttachmentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginAttachmentsResponseBody create() {
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

        private Builder(ListPluginAttachmentsResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9640D776-794A-5077-9184-A247CA4B45C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPluginAttachmentsResponseBody build() {
            return new ListPluginAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPluginAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginAttachmentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachResourceType")
        private String attachResourceType;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("environmentInfo")
        private EnvironmentInfo environmentInfo;

        @com.aliyun.core.annotation.NameInMap("parentResourceInfo")
        private ParentResourceInfo parentResourceInfo;

        @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
        private String pluginAttachmentId;

        @com.aliyun.core.annotation.NameInMap("pluginClassInfo")
        private PluginClassInfo pluginClassInfo;

        @com.aliyun.core.annotation.NameInMap("pluginConfig")
        private String pluginConfig;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("resourceInfos")
        private java.util.List<ResourceInfo> resourceInfos;

        private Items(Builder builder) {
            this.attachResourceType = builder.attachResourceType;
            this.enable = builder.enable;
            this.environmentInfo = builder.environmentInfo;
            this.parentResourceInfo = builder.parentResourceInfo;
            this.pluginAttachmentId = builder.pluginAttachmentId;
            this.pluginClassInfo = builder.pluginClassInfo;
            this.pluginConfig = builder.pluginConfig;
            this.pluginId = builder.pluginId;
            this.resourceInfos = builder.resourceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return attachResourceType
         */
        public String getAttachResourceType() {
            return this.attachResourceType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return environmentInfo
         */
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        /**
         * @return parentResourceInfo
         */
        public ParentResourceInfo getParentResourceInfo() {
            return this.parentResourceInfo;
        }

        /**
         * @return pluginAttachmentId
         */
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

        /**
         * @return pluginClassInfo
         */
        public PluginClassInfo getPluginClassInfo() {
            return this.pluginClassInfo;
        }

        /**
         * @return pluginConfig
         */
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return resourceInfos
         */
        public java.util.List<ResourceInfo> getResourceInfos() {
            return this.resourceInfos;
        }

        public static final class Builder {
            private String attachResourceType; 
            private Boolean enable; 
            private EnvironmentInfo environmentInfo; 
            private ParentResourceInfo parentResourceInfo; 
            private String pluginAttachmentId; 
            private PluginClassInfo pluginClassInfo; 
            private String pluginConfig; 
            private String pluginId; 
            private java.util.List<ResourceInfo> resourceInfos; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attachResourceType = model.attachResourceType;
                this.enable = model.enable;
                this.environmentInfo = model.environmentInfo;
                this.parentResourceInfo = model.parentResourceInfo;
                this.pluginAttachmentId = model.pluginAttachmentId;
                this.pluginClassInfo = model.pluginClassInfo;
                this.pluginConfig = model.pluginConfig;
                this.pluginId = model.pluginId;
                this.resourceInfos = model.resourceInfos;
            } 

            /**
             * attachResourceType.
             */
            public Builder attachResourceType(String attachResourceType) {
                this.attachResourceType = attachResourceType;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * environmentInfo.
             */
            public Builder environmentInfo(EnvironmentInfo environmentInfo) {
                this.environmentInfo = environmentInfo;
                return this;
            }

            /**
             * parentResourceInfo.
             */
            public Builder parentResourceInfo(ParentResourceInfo parentResourceInfo) {
                this.parentResourceInfo = parentResourceInfo;
                return this;
            }

            /**
             * pluginAttachmentId.
             */
            public Builder pluginAttachmentId(String pluginAttachmentId) {
                this.pluginAttachmentId = pluginAttachmentId;
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
             * pluginConfig.
             */
            public Builder pluginConfig(String pluginConfig) {
                this.pluginConfig = pluginConfig;
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
             * resourceInfos.
             */
            public Builder resourceInfos(java.util.List<ResourceInfo> resourceInfos) {
                this.resourceInfos = resourceInfos;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPluginAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPluginAttachmentsResponseBody</p>
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
