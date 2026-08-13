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
 * {@link ListPersonalDirectoryContentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersonalDirectoryContentsResponseBody</p>
 */
public class ListPersonalDirectoryContentsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListPersonalDirectoryContentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonalDirectoryContentsResponseBody create() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListPersonalDirectoryContentsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
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
         * <p>The current zone list is illegal.</p>
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
         * <p>总数（不分页前的命中行数）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListPersonalDirectoryContentsResponseBody build() {
            return new ListPersonalDirectoryContentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPersonalDirectoryContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPersonalDirectoryContentsResponseBody</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("objectTypeName")
        private String objectTypeName;

        private ObjectBindings(Builder builder) {
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.objectTypeName = builder.objectTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectBindings create() {
            return builder().build();
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectTypeName
         */
        public String getObjectTypeName() {
            return this.objectTypeName;
        }

        public static final class Builder {
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String objectTypeName; 

            private Builder() {
            } 

            private Builder(ObjectBindings model) {
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.objectTypeName = model.objectTypeName;
            } 

            /**
             * <p>对象唯一 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>对象显示名（如客户名称），由图谱 schema 解析；缓存缺失时为 null</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>对象类型（如 customer / opportunity），对应图谱 schema 中的 object_type</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>对象类型显示名（如&quot;客户&quot;），由图谱 schema 解析；缓存缺失时为 null</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectTypeName(String objectTypeName) {
                this.objectTypeName = objectTypeName;
                return this;
            }

            public ObjectBindings build() {
                return new ObjectBindings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPersonalDirectoryContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPersonalDirectoryContentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("directoryKind")
        private String directoryKind;

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
        private java.util.List<ObjectBindings> objectBindings;

        @com.aliyun.core.annotation.NameInMap("sourceFailedCount")
        private Long sourceFailedCount;

        @com.aliyun.core.annotation.NameInMap("sourceKind")
        private String sourceKind;

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
            this.directoryKind = builder.directoryKind;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.name = builder.name;
            this.objectBindings = builder.objectBindings;
            this.sourceFailedCount = builder.sourceFailedCount;
            this.sourceKind = builder.sourceKind;
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
         * @return directoryKind
         */
        public String getDirectoryKind() {
            return this.directoryKind;
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
        public java.util.List<ObjectBindings> getObjectBindings() {
            return this.objectBindings;
        }

        /**
         * @return sourceFailedCount
         */
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        /**
         * @return sourceKind
         */
        public String getSourceKind() {
            return this.sourceKind;
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
            private String directoryKind; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String itemId; 
            private String itemType; 
            private String name; 
            private java.util.List<ObjectBindings> objectBindings; 
            private Long sourceFailedCount; 
            private String sourceKind; 
            private Long sourceReadyCount; 
            private String sourceStatus; 
            private Long sourceTotalCount; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.directoryKind = model.directoryKind;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemId = model.itemId;
                this.itemType = model.itemType;
                this.name = model.name;
                this.objectBindings = model.objectBindings;
                this.sourceFailedCount = model.sourceFailedCount;
                this.sourceKind = model.sourceKind;
                this.sourceReadyCount = model.sourceReadyCount;
                this.sourceStatus = model.sourceStatus;
                this.sourceTotalCount = model.sourceTotalCount;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>目录创建者姓名（仅 directoryId=&quot;root&quot; 列表时返回）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>知识库描述（仅 directoryId=&quot;root&quot; 列表时返回）</p>
             * 
             * <strong>example:</strong>
             * <p>示例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>目录 KB 归属类型（itemType=directory 时有值）：aliding_kb_root / aliding_kb_internal / normal</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder directoryKind(String directoryKind) {
                this.directoryKind = directoryKind;
                return this;
            }

            /**
             * <p>创建时间戳（毫秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>修改时间戳（毫秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>唯一标识（目录为 directoryId，资源为 sourceId）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleItemId</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>类型: directory 或 resource</p>
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
            public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
                this.objectBindings = objectBindings;
                return this;
            }

            /**
             * <p>目录下失败资源数（含子目录，仅 directoryId=&quot;root&quot; 列表时返回）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceFailedCount(Long sourceFailedCount) {
                this.sourceFailedCount = sourceFailedCount;
                return this;
            }

            /**
             * <p>Source KB 归属类型（itemType=resource 时有值）：aliding_kb_doc / normal</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder sourceKind(String sourceKind) {
                this.sourceKind = sourceKind;
                return this;
            }

            /**
             * <p>目录下成功资源数（含子目录，仅 directoryId=&quot;root&quot; 列表时返回）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceReadyCount(Long sourceReadyCount) {
                this.sourceReadyCount = sourceReadyCount;
                return this;
            }

            /**
             * <p>资源状态（itemType=resource 时有值）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder sourceStatus(String sourceStatus) {
                this.sourceStatus = sourceStatus;
                return this;
            }

            /**
             * <p>目录下资源总数（含子目录，仅 directoryId=&quot;root&quot; 列表时返回）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceTotalCount(Long sourceTotalCount) {
                this.sourceTotalCount = sourceTotalCount;
                return this;
            }

            /**
             * <p>资源类型（itemType=resource 时有值；产出保存类资源会被反刷为 OUTPUT）</p>
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
