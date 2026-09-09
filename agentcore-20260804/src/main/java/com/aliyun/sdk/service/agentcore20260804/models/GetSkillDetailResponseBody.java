// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetSkillDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillDetailResponseBody</p>
 */
public class GetSkillDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetSkillDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSkillDetailResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSkillDetailResponseBody build() {
            return new GetSkillDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillDetailResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("commitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloadCount")
        private Long downloadCount;

        @com.aliyun.core.annotation.NameInMap("publishPipelineInfo")
        private String publishPipelineInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Versions(Builder builder) {
            this.author = builder.author;
            this.commitMsg = builder.commitMsg;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.downloadCount = builder.downloadCount;
            this.publishPipelineInfo = builder.publishPipelineInfo;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return commitMsg
         */
        public String getCommitMsg() {
            return this.commitMsg;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadCount
         */
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        /**
         * @return publishPipelineInfo
         */
        public String getPublishPipelineInfo() {
            return this.publishPipelineInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String author; 
            private String commitMsg; 
            private Long createTime; 
            private String description; 
            private Long downloadCount; 
            private String publishPipelineInfo; 
            private String status; 
            private Long updateTime; 
            private String version; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.author = model.author;
                this.commitMsg = model.commitMsg;
                this.createTime = model.createTime;
                this.description = model.description;
                this.downloadCount = model.downloadCount;
                this.publishPipelineInfo = model.publishPipelineInfo;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>The version author.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * <p>The commit message.</p>
             * 
             * <strong>example:</strong>
             * <p>Update documentation</p>
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
                return this;
            }

            /**
             * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1787671022000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>A sample description that explains the purpose of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The download count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * <p>The publish pipeline information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;status&quot;:&quot;SUCCESS&quot;}</p>
             */
            public Builder publishPipelineInfo(String publishPipelineInfo) {
                this.publishPipelineInfo = publishPipelineInfo;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1787671022000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSkillDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizTags")
        private String bizTags;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloadCount")
        private Long downloadCount;

        @com.aliyun.core.annotation.NameInMap("editingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("from")
        private String from;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("onlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("reviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<Versions> versions;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("writeable")
        private Boolean writeable;

        private Data(Builder builder) {
            this.bizTags = builder.bizTags;
            this.description = builder.description;
            this.downloadCount = builder.downloadCount;
            this.editingVersion = builder.editingVersion;
            this.enable = builder.enable;
            this.from = builder.from;
            this.labels = builder.labels;
            this.name = builder.name;
            this.onlineCnt = builder.onlineCnt;
            this.owner = builder.owner;
            this.reviewingVersion = builder.reviewingVersion;
            this.scope = builder.scope;
            this.updateTime = builder.updateTime;
            this.versions = builder.versions;
            this.workspaceId = builder.workspaceId;
            this.writeable = builder.writeable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizTags
         */
        public String getBizTags() {
            return this.bizTags;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadCount
         */
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        /**
         * @return editingVersion
         */
        public String getEditingVersion() {
            return this.editingVersion;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlineCnt
         */
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return reviewingVersion
         */
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return writeable
         */
        public Boolean getWriteable() {
            return this.writeable;
        }

        public static final class Builder {
            private String bizTags; 
            private String description; 
            private Long downloadCount; 
            private String editingVersion; 
            private Boolean enable; 
            private String from; 
            private java.util.Map<String, String> labels; 
            private String name; 
            private Integer onlineCnt; 
            private String owner; 
            private String reviewingVersion; 
            private String scope; 
            private Long updateTime; 
            private java.util.List<Versions> versions; 
            private String workspaceId; 
            private Boolean writeable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizTags = model.bizTags;
                this.description = model.description;
                this.downloadCount = model.downloadCount;
                this.editingVersion = model.editingVersion;
                this.enable = model.enable;
                this.from = model.from;
                this.labels = model.labels;
                this.name = model.name;
                this.onlineCnt = model.onlineCnt;
                this.owner = model.owner;
                this.reviewingVersion = model.reviewingVersion;
                this.scope = model.scope;
                this.updateTime = model.updateTime;
                this.versions = model.versions;
                this.workspaceId = model.workspaceId;
                this.writeable = model.writeable;
            } 

            /**
             * <p>The business tag JSON array string.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample property value</p>
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>A sample description that explains the purpose of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The total number of downloads.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * <p>The version currently being edited.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * <p>Indicates whether the Skill is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The source tag.</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOAD</p>
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The label mapping.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of online versions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder onlineCnt(Integer onlineCnt) {
                this.onlineCnt = onlineCnt;
                return this;
            }

            /**
             * <p>The resource owner.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The version currently under review.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder reviewingVersion(String reviewingVersion) {
                this.reviewingVersion = reviewingVersion;
                return this;
            }

            /**
             * <p>The visibility scope.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1787671022000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The list of all version summaries.</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1234567890abcdef</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>Indicates whether the current user has write permissions.</p>
             */
            public Builder writeable(Boolean writeable) {
                this.writeable = writeable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
