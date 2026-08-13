// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListTenantDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantDirectoryResponseBody</p>
 */
public class ListTenantDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListTenantDirectoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantDirectoryResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTenantDirectoryResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>内容总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTenantDirectoryResponseBody build() {
            return new ListTenantDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantDirectoryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectBindings")
        private java.util.List<java.util.Map<String, ?>> objectBindings;

        @com.aliyun.core.annotation.NameInMap("sourceFailedCount")
        private Long sourceFailedCount;

        @com.aliyun.core.annotation.NameInMap("sourceReadyCount")
        private Long sourceReadyCount;

        @com.aliyun.core.annotation.NameInMap("sourceStatus")
        private String sourceStatus;

        @com.aliyun.core.annotation.NameInMap("sourceTotalCount")
        private Long sourceTotalCount;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private Items(Builder builder) {
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.name = builder.name;
            this.objectBindings = builder.objectBindings;
            this.sourceFailedCount = builder.sourceFailedCount;
            this.sourceReadyCount = builder.sourceReadyCount;
            this.sourceStatus = builder.sourceStatus;
            this.sourceTotalCount = builder.sourceTotalCount;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectBindings
         */
        public java.util.List<java.util.Map<String, ?>> getObjectBindings() {
            return this.objectBindings;
        }

        /**
         * @return sourceFailedCount
         */
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        /**
         * @return sourceReadyCount
         */
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        /**
         * @return sourceStatus
         */
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        /**
         * @return sourceTotalCount
         */
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String creatorName; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String itemId; 
            private String itemType; 
            private String name; 
            private java.util.List<java.util.Map<String, ?>> objectBindings; 
            private Long sourceFailedCount; 
            private Long sourceReadyCount; 
            private String sourceStatus; 
            private Long sourceTotalCount; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemId = model.itemId;
                this.itemType = model.itemType;
                this.name = model.name;
                this.objectBindings = model.objectBindings;
                this.sourceFailedCount = model.sourceFailedCount;
                this.sourceReadyCount = model.sourceReadyCount;
                this.sourceStatus = model.sourceStatus;
                this.sourceTotalCount = model.sourceTotalCount;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>创建人名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>目录描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>创建时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>修改时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>目录 ID 或资源 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleItemId</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>内容类型：directory 或 resource</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * objectBindings.
             */
            public Builder objectBindings(java.util.List<java.util.Map<String, ?>> objectBindings) {
                this.objectBindings = objectBindings;
                return this;
            }

            /**
             * <p>根知识库下失败资源数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceFailedCount(Long sourceFailedCount) {
                this.sourceFailedCount = sourceFailedCount;
                return this;
            }

            /**
             * <p>根知识库下成功资源数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceReadyCount(Long sourceReadyCount) {
                this.sourceReadyCount = sourceReadyCount;
                return this;
            }

            /**
             * <p>资源解析状态</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder sourceStatus(String sourceStatus) {
                this.sourceStatus = sourceStatus;
                return this;
            }

            /**
             * <p>根知识库下资源总数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceTotalCount(Long sourceTotalCount) {
                this.sourceTotalCount = sourceTotalCount;
                return this;
            }

            /**
             * <p>资源类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
