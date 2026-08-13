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
 * {@link ListUserVisibleKnowledgeBasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserVisibleKnowledgeBasesResponseBody</p>
 */
public class ListUserVisibleKnowledgeBasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListUserVisibleKnowledgeBasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserVisibleKnowledgeBasesResponseBody create() {
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
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListUserVisibleKnowledgeBasesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
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
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>知识库总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserVisibleKnowledgeBasesResponseBody build() {
            return new ListUserVisibleKnowledgeBasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserVisibleKnowledgeBasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserVisibleKnowledgeBasesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("directoryKind")
        private String directoryKind;

        @com.aliyun.core.annotation.NameInMap("directoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Items(Builder builder) {
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.directoryId = builder.directoryId;
            this.directoryKind = builder.directoryKind;
            this.directoryType = builder.directoryType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
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
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long creatorId; 
            private String creatorName; 
            private String description; 
            private String directoryId; 
            private String directoryKind; 
            private String directoryType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String name; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.directoryId = model.directoryId;
                this.directoryKind = model.directoryKind;
                this.directoryType = model.directoryType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.name = model.name;
            } 

            /**
             * <p>知识库创建人用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>知识库创建人名称</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>知识库描述</p>
             * 
             * <strong>example:</strong>
             * <p>产品资料与使用说明</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>知识库根目录唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>dir_example</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>目录归属类型</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder directoryKind(String directoryKind) {
                this.directoryKind = directoryKind;
                return this;
            }

            /**
             * <p>目录类型</p>
             * 
             * <strong>example:</strong>
             * <p>TENANT</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
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
             * <p>知识库名称</p>
             * 
             * <strong>example:</strong>
             * <p>产品知识库</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
