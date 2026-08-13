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
 * {@link ListUserVisibleKnowledgeBaseContentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserVisibleKnowledgeBaseContentsResponseBody</p>
 */
public class ListUserVisibleKnowledgeBaseContentsResponseBody extends TeaModel {
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

    private ListUserVisibleKnowledgeBaseContentsResponseBody(Builder builder) {
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

    public static ListUserVisibleKnowledgeBaseContentsResponseBody create() {
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

        private Builder(ListUserVisibleKnowledgeBaseContentsResponseBody model) {
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
         * <p>命中总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserVisibleKnowledgeBaseContentsResponseBody build() {
            return new ListUserVisibleKnowledgeBaseContentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserVisibleKnowledgeBaseContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserVisibleKnowledgeBaseContentsResponseBody</p>
     */
    public static class ShareInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("submissionId")
        private String submissionId;

        @com.aliyun.core.annotation.NameInMap("submitterId")
        private Long submitterId;

        @com.aliyun.core.annotation.NameInMap("submitterName")
        private String submitterName;

        @com.aliyun.core.annotation.NameInMap("targetDirectoryId")
        private String targetDirectoryId;

        @com.aliyun.core.annotation.NameInMap("targetDirectoryName")
        private String targetDirectoryName;

        @com.aliyun.core.annotation.NameInMap("targetKbRootDirectoryId")
        private String targetKbRootDirectoryId;

        @com.aliyun.core.annotation.NameInMap("targetKbRootDirectoryName")
        private String targetKbRootDirectoryName;

        private ShareInfos(Builder builder) {
            this.submissionId = builder.submissionId;
            this.submitterId = builder.submitterId;
            this.submitterName = builder.submitterName;
            this.targetDirectoryId = builder.targetDirectoryId;
            this.targetDirectoryName = builder.targetDirectoryName;
            this.targetKbRootDirectoryId = builder.targetKbRootDirectoryId;
            this.targetKbRootDirectoryName = builder.targetKbRootDirectoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShareInfos create() {
            return builder().build();
        }

        /**
         * @return submissionId
         */
        public String getSubmissionId() {
            return this.submissionId;
        }

        /**
         * @return submitterId
         */
        public Long getSubmitterId() {
            return this.submitterId;
        }

        /**
         * @return submitterName
         */
        public String getSubmitterName() {
            return this.submitterName;
        }

        /**
         * @return targetDirectoryId
         */
        public String getTargetDirectoryId() {
            return this.targetDirectoryId;
        }

        /**
         * @return targetDirectoryName
         */
        public String getTargetDirectoryName() {
            return this.targetDirectoryName;
        }

        /**
         * @return targetKbRootDirectoryId
         */
        public String getTargetKbRootDirectoryId() {
            return this.targetKbRootDirectoryId;
        }

        /**
         * @return targetKbRootDirectoryName
         */
        public String getTargetKbRootDirectoryName() {
            return this.targetKbRootDirectoryName;
        }

        public static final class Builder {
            private String submissionId; 
            private Long submitterId; 
            private String submitterName; 
            private String targetDirectoryId; 
            private String targetDirectoryName; 
            private String targetKbRootDirectoryId; 
            private String targetKbRootDirectoryName; 

            private Builder() {
            } 

            private Builder(ShareInfos model) {
                this.submissionId = model.submissionId;
                this.submitterId = model.submitterId;
                this.submitterName = model.submitterName;
                this.targetDirectoryId = model.targetDirectoryId;
                this.targetDirectoryName = model.targetDirectoryName;
                this.targetKbRootDirectoryId = model.targetKbRootDirectoryId;
                this.targetKbRootDirectoryName = model.targetKbRootDirectoryName;
            } 

            /**
             * <p>知识库提交审批单 ID</p>
             * 
             * <strong>example:</strong>
             * <p>submission_example</p>
             */
            public Builder submissionId(String submissionId) {
                this.submissionId = submissionId;
                return this;
            }

            /**
             * <p>提交人用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder submitterId(Long submitterId) {
                this.submitterId = submitterId;
                return this;
            }

            /**
             * <p>提交人名称</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder submitterName(String submitterName) {
                this.submitterName = submitterName;
                return this;
            }

            /**
             * <p>目标目录 ID</p>
             * 
             * <strong>example:</strong>
             * <p>dir_target</p>
             */
            public Builder targetDirectoryId(String targetDirectoryId) {
                this.targetDirectoryId = targetDirectoryId;
                return this;
            }

            /**
             * <p>目标目录名称</p>
             * 
             * <strong>example:</strong>
             * <p>共享目录</p>
             */
            public Builder targetDirectoryName(String targetDirectoryName) {
                this.targetDirectoryName = targetDirectoryName;
                return this;
            }

            /**
             * <p>目标企业知识库根目录 ID</p>
             * 
             * <strong>example:</strong>
             * <p>dir_kb_root</p>
             */
            public Builder targetKbRootDirectoryId(String targetKbRootDirectoryId) {
                this.targetKbRootDirectoryId = targetKbRootDirectoryId;
                return this;
            }

            /**
             * <p>目标企业知识库名称</p>
             * 
             * <strong>example:</strong>
             * <p>产品知识库</p>
             */
            public Builder targetKbRootDirectoryName(String targetKbRootDirectoryName) {
                this.targetKbRootDirectoryName = targetKbRootDirectoryName;
                return this;
            }

            public ShareInfos build() {
                return new ShareInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserVisibleKnowledgeBaseContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserVisibleKnowledgeBaseContentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

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

        @com.aliyun.core.annotation.NameInMap("kbSubmissionPending")
        private Boolean kbSubmissionPending;

        @com.aliyun.core.annotation.NameInMap("modifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectBindings")
        private java.util.List<java.util.Map<String, ?>> objectBindings;

        @com.aliyun.core.annotation.NameInMap("ooVisibilityMode")
        private String ooVisibilityMode;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("shareInfos")
        private java.util.List<ShareInfos> shareInfos;

        @com.aliyun.core.annotation.NameInMap("shared")
        private Boolean shared;

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
            this.directoryType = builder.directoryType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.kbSubmissionPending = builder.kbSubmissionPending;
            this.modifierName = builder.modifierName;
            this.name = builder.name;
            this.objectBindings = builder.objectBindings;
            this.ooVisibilityMode = builder.ooVisibilityMode;
            this.readOnly = builder.readOnly;
            this.shareInfos = builder.shareInfos;
            this.shared = builder.shared;
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
         * @return kbSubmissionPending
         */
        public Boolean getKbSubmissionPending() {
            return this.kbSubmissionPending;
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
        public java.util.List<java.util.Map<String, ?>> getObjectBindings() {
            return this.objectBindings;
        }

        /**
         * @return ooVisibilityMode
         */
        public String getOoVisibilityMode() {
            return this.ooVisibilityMode;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return shareInfos
         */
        public java.util.List<ShareInfos> getShareInfos() {
            return this.shareInfos;
        }

        /**
         * @return shared
         */
        public Boolean getShared() {
            return this.shared;
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
            private String directoryType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String itemId; 
            private String itemType; 
            private Boolean kbSubmissionPending; 
            private String modifierName; 
            private String name; 
            private java.util.List<java.util.Map<String, ?>> objectBindings; 
            private String ooVisibilityMode; 
            private Boolean readOnly; 
            private java.util.List<ShareInfos> shareInfos; 
            private Boolean shared; 
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
                this.directoryType = model.directoryType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemId = model.itemId;
                this.itemType = model.itemType;
                this.kbSubmissionPending = model.kbSubmissionPending;
                this.modifierName = model.modifierName;
                this.name = model.name;
                this.objectBindings = model.objectBindings;
                this.ooVisibilityMode = model.ooVisibilityMode;
                this.readOnly = model.readOnly;
                this.shareInfos = model.shareInfos;
                this.shared = model.shared;
                this.sourceFailedCount = model.sourceFailedCount;
                this.sourceKind = model.sourceKind;
                this.sourceReadyCount = model.sourceReadyCount;
                this.sourceStatus = model.sourceStatus;
                this.sourceTotalCount = model.sourceTotalCount;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>创建人名称</p>
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
             * <p>目录 ID 或资源 ID</p>
             * 
             * <strong>example:</strong>
             * <p>source_example</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>内容类型：directory 或 resource</p>
             * 
             * <strong>example:</strong>
             * <p>resource</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>资源是否存在待审批的知识库提交记录</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder kbSubmissionPending(Boolean kbSubmissionPending) {
                this.kbSubmissionPending = kbSubmissionPending;
                return this;
            }

            /**
             * <p>更新人名称</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>目录或资源名称</p>
             * 
             * <strong>example:</strong>
             * <p>产品说明.pdf</p>
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
             * <p>知识库对数字员工的可见模式</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder ooVisibilityMode(String ooVisibilityMode) {
                this.ooVisibilityMode = ooVisibilityMode;
                return this;
            }

            /**
             * <p>是否为只读关联内容</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * shareInfos.
             */
            public Builder shareInfos(java.util.List<ShareInfos> shareInfos) {
                this.shareInfos = shareInfos;
                return this;
            }

            /**
             * <p>是否已直接共享到企业知识库</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder shared(Boolean shared) {
                this.shared = shared;
                return this;
            }

            /**
             * <p>目录 FAILED 资源数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sourceFailedCount(Long sourceFailedCount) {
                this.sourceFailedCount = sourceFailedCount;
                return this;
            }

            /**
             * <p>资源归属类型</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder sourceKind(String sourceKind) {
                this.sourceKind = sourceKind;
                return this;
            }

            /**
             * <p>目录 READY 资源数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceReadyCount(Long sourceReadyCount) {
                this.sourceReadyCount = sourceReadyCount;
                return this;
            }

            /**
             * <p>资源状态；本接口只返回 READY 资源</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder sourceStatus(String sourceStatus) {
                this.sourceStatus = sourceStatus;
                return this;
            }

            /**
             * <p>目录资源总数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceTotalCount(Long sourceTotalCount) {
                this.sourceTotalCount = sourceTotalCount;
                return this;
            }

            /**
             * <p>资源类型，目录项为空</p>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
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
