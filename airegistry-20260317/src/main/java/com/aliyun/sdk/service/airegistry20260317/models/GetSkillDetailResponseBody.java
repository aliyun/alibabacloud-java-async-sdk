// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("CommitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadCount")
        private Long downloadCount;

        @com.aliyun.core.annotation.NameInMap("PublishPipelineInfo")
        private String publishPipelineInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * CommitMsg.
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DownloadCount.
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * PublishPipelineInfo.
             */
            public Builder publishPipelineInfo(String publishPipelineInfo) {
                this.publishPipelineInfo = publishPipelineInfo;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Version.
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
        @com.aliyun.core.annotation.NameInMap("BizTags")
        private String bizTags;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadCount")
        private Long downloadCount;

        @com.aliyun.core.annotation.NameInMap("EditingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("OnlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ReviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<Versions> versions;

        @com.aliyun.core.annotation.NameInMap("Writeable")
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
            this.namespaceId = builder.namespaceId;
            this.onlineCnt = builder.onlineCnt;
            this.owner = builder.owner;
            this.reviewingVersion = builder.reviewingVersion;
            this.scope = builder.scope;
            this.updateTime = builder.updateTime;
            this.versions = builder.versions;
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
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
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
            private String namespaceId; 
            private Integer onlineCnt; 
            private String owner; 
            private String reviewingVersion; 
            private String scope; 
            private Long updateTime; 
            private java.util.List<Versions> versions; 
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
                this.namespaceId = model.namespaceId;
                this.onlineCnt = model.onlineCnt;
                this.owner = model.owner;
                this.reviewingVersion = model.reviewingVersion;
                this.scope = model.scope;
                this.updateTime = model.updateTime;
                this.versions = model.versions;
                this.writeable = model.writeable;
            } 

            /**
             * BizTags.
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DownloadCount.
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * EditingVersion.
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * From.
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * OnlineCnt.
             */
            public Builder onlineCnt(Integer onlineCnt) {
                this.onlineCnt = onlineCnt;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ReviewingVersion.
             */
            public Builder reviewingVersion(String reviewingVersion) {
                this.reviewingVersion = reviewingVersion;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            /**
             * Writeable.
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
