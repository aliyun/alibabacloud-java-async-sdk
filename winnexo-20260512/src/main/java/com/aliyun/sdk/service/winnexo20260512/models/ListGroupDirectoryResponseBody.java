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
 * {@link ListGroupDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupDirectoryResponseBody</p>
 */
public class ListGroupDirectoryResponseBody extends TeaModel {
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

    private ListGroupDirectoryResponseBody(Builder builder) {
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

    public static ListGroupDirectoryResponseBody create() {
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

        private Builder(ListGroupDirectoryResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The immediate subdirectories and resources on the current page. The queried directory itself is not included, and results are not recursively expanded.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries after filtering and before pagination. This includes both physical content and referenced content that match the filter criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupDirectoryResponseBody build() {
            return new ListGroupDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupDirectoryResponseBody</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("graphName")
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("objectTypeName")
        private String objectTypeName;

        private ObjectBindings(Builder builder) {
            this.graphName = builder.graphName;
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
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
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
            private String graphName; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String objectTypeName; 

            private Builder() {
            } 

            private Builder(ObjectBindings model) {
                this.graphName = model.graphName;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.objectTypeName = model.objectTypeName;
            } 

            /**
             * <p>The name of the knowledge graph to which the binding belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>The business ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The display name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The object type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The display name of the object type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
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
     * {@link ListGroupDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupDirectoryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("directoryKind")
        private String directoryKind;

        @com.aliyun.core.annotation.NameInMap("directoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("modifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectBindings")
        private java.util.List<ObjectBindings> objectBindings;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("sourceKind")
        private String sourceKind;

        @com.aliyun.core.annotation.NameInMap("sourceStatus")
        private String sourceStatus;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        private Items(Builder builder) {
            this.creatorName = builder.creatorName;
            this.directoryKind = builder.directoryKind;
            this.directoryType = builder.directoryType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.modifierName = builder.modifierName;
            this.name = builder.name;
            this.objectBindings = builder.objectBindings;
            this.readOnly = builder.readOnly;
            this.sourceKind = builder.sourceKind;
            this.sourceStatus = builder.sourceStatus;
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
         * @return directoryKind
         */
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
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
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
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
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return sourceKind
         */
        public String getSourceKind() {
            return this.sourceKind;
        }

        /**
         * @return sourceStatus
         */
        public String getSourceStatus() {
            return this.sourceStatus;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String creatorName; 
            private String directoryKind; 
            private String directoryType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String itemId; 
            private String itemType; 
            private String modifierName; 
            private String name; 
            private java.util.List<ObjectBindings> objectBindings; 
            private Boolean readOnly; 
            private String sourceKind; 
            private String sourceStatus; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creatorName = model.creatorName;
                this.directoryKind = model.directoryKind;
                this.directoryType = model.directoryType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemId = model.itemId;
                this.itemType = model.itemType;
                this.modifierName = model.modifierName;
                this.name = model.name;
                this.objectBindings = model.objectBindings;
                this.readOnly = model.readOnly;
                this.sourceKind = model.sourceKind;
                this.sourceStatus = model.sourceStatus;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The name of the directory creator or resource submitter.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The directory ownership category. This follows the service output, such as normal.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder directoryKind(String directoryKind) {
                this.directoryKind = directoryKind;
                return this;
            }

            /**
             * <p>The directory type. Physical directories within the space have a value of GROUP. Reference directories retain their original type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The creation timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The directoryId of a directory or the sourceId of a resource.</p>
             * 
             * <strong>example:</strong>
             * <p>source_example</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The content type. Valid values: directory (subdirectory) and resource.</p>
             * 
             * <strong>example:</strong>
             * <p>resource</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>The name of the last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>The content name.</p>
             * 
             * <strong>example:</strong>
             * <p>Project Resources</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of resource object bindings. This may be empty if metadata is missing or for referenced resources.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
                this.objectBindings = objectBindings;
                return this;
            }

            /**
             * <p>Indicates whether the content is a read-only reference. A value of false does not indicate write permissions. Write operations still require creator or space administrator permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The resource ownership category. This follows the service output.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder sourceKind(String sourceKind) {
                this.sourceKind = sourceKind;
                return this;
            }

            /**
             * <p>The resource parsing status. This field has a value only for resource items.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder sourceStatus(String sourceStatus) {
                this.sourceStatus = sourceStatus;
                return this;
            }

            /**
             * <p>The resource type. This field has a value only for resource items. The type display rules of the service are used.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
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
