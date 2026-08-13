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
 * {@link ListVisibleKnowledgeBasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVisibleKnowledgeBasesResponseBody</p>
 */
public class ListVisibleKnowledgeBasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListVisibleKnowledgeBasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVisibleKnowledgeBasesResponseBody create() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListVisibleKnowledgeBasesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
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
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>190F5425-A145-5BBA-980F-082ADB0CA6AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>返回条数（不分页，等于 len(items)）</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListVisibleKnowledgeBasesResponseBody build() {
            return new ListVisibleKnowledgeBasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVisibleKnowledgeBasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVisibleKnowledgeBasesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("sourceFailedCount")
        private Long sourceFailedCount;

        @com.aliyun.core.annotation.NameInMap("sourceReadyCount")
        private Long sourceReadyCount;

        @com.aliyun.core.annotation.NameInMap("sourceTotalCount")
        private Long sourceTotalCount;

        private Items(Builder builder) {
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.directoryId = builder.directoryId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.path = builder.path;
            this.sourceFailedCount = builder.sourceFailedCount;
            this.sourceReadyCount = builder.sourceReadyCount;
            this.sourceTotalCount = builder.sourceTotalCount;
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
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
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

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
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
         * @return sourceTotalCount
         */
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

        public static final class Builder {
            private String creatorName; 
            private String description; 
            private String directoryId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String name; 
            private String path; 
            private Long sourceFailedCount; 
            private Long sourceReadyCount; 
            private Long sourceTotalCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.directoryId = model.directoryId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.name = model.name;
                this.path = model.path;
                this.sourceFailedCount = model.sourceFailedCount;
                this.sourceReadyCount = model.sourceReadyCount;
                this.sourceTotalCount = model.sourceTotalCount;
            } 

            /**
             * <p>目录创建者姓名（来自 rbj_user_tenant_mapping.user_display_name）</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>目录描述</p>
             * 
             * <strong>example:</strong>
             * <p>{{7*7}}</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>目录唯一标识（租户内唯一）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleDirectoryId</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>创建时间戳（毫秒）</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-14T02:18:27Z</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>修改时间戳（毫秒）</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-26T13:57:42Z</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>cs-default-umodel-1785637207863_k8s.metric.k8s_csi_node_pv_node_cn-heyuan-acdr-1/c80cf3a4f9d6c496781591bd17d006c6f</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>文件 OSS URL</p>
             * 
             * <strong>example:</strong>
             * <p>/test-folder-path1_1773194924773</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>目录及子目录下状态为 FAILED 的资源数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceFailedCount(Long sourceFailedCount) {
                this.sourceFailedCount = sourceFailedCount;
                return this;
            }

            /**
             * <p>目录及子目录下状态为 READY 的资源数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceReadyCount(Long sourceReadyCount) {
                this.sourceReadyCount = sourceReadyCount;
                return this;
            }

            /**
             * <p>目录及子目录下的资源总数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceTotalCount(Long sourceTotalCount) {
                this.sourceTotalCount = sourceTotalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
