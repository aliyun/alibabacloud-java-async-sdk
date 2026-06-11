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
 * {@link GetPromptResponseBody} extends {@link TeaModel}
 *
 * <p>GetPromptResponseBody</p>
 */
public class GetPromptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPromptResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptResponseBody create() {
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

        private Builder(GetPromptResponseBody model) {
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

        public GetPromptResponseBody build() {
            return new GetPromptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPromptResponseBody} extends {@link TeaModel}
     *
     * <p>GetPromptResponseBody</p>
     */
    public static class VersionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("PromptKey")
        private String promptKey;

        @com.aliyun.core.annotation.NameInMap("SrcUser")
        private String srcUser;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private VersionDetails(Builder builder) {
            this.commitMsg = builder.commitMsg;
            this.gmtModified = builder.gmtModified;
            this.promptKey = builder.promptKey;
            this.srcUser = builder.srcUser;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionDetails create() {
            return builder().build();
        }

        /**
         * @return commitMsg
         */
        public String getCommitMsg() {
            return this.commitMsg;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return promptKey
         */
        public String getPromptKey() {
            return this.promptKey;
        }

        /**
         * @return srcUser
         */
        public String getSrcUser() {
            return this.srcUser;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String commitMsg; 
            private Long gmtModified; 
            private String promptKey; 
            private String srcUser; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(VersionDetails model) {
                this.commitMsg = model.commitMsg;
                this.gmtModified = model.gmtModified;
                this.promptKey = model.promptKey;
                this.srcUser = model.srcUser;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * CommitMsg.
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * PromptKey.
             */
            public Builder promptKey(String promptKey) {
                this.promptKey = promptKey;
                return this;
            }

            /**
             * SrcUser.
             */
            public Builder srcUser(String srcUser) {
                this.srcUser = srcUser;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionDetails build() {
                return new VersionDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPromptResponseBody} extends {@link TeaModel}
     *
     * <p>GetPromptResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizTags")
        private java.util.List<String> bizTags;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EditingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("OnlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("PromptKey")
        private String promptKey;

        @com.aliyun.core.annotation.NameInMap("ReviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("SchemaVersion")
        private Integer schemaVersion;

        @com.aliyun.core.annotation.NameInMap("VersionDetails")
        private java.util.List<VersionDetails> versionDetails;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<String> versions;

        private Data(Builder builder) {
            this.bizTags = builder.bizTags;
            this.description = builder.description;
            this.editingVersion = builder.editingVersion;
            this.gmtModified = builder.gmtModified;
            this.labels = builder.labels;
            this.latestVersion = builder.latestVersion;
            this.onlineCnt = builder.onlineCnt;
            this.promptKey = builder.promptKey;
            this.reviewingVersion = builder.reviewingVersion;
            this.schemaVersion = builder.schemaVersion;
            this.versionDetails = builder.versionDetails;
            this.versions = builder.versions;
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
        public java.util.List<String> getBizTags() {
            return this.bizTags;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return editingVersion
         */
        public String getEditingVersion() {
            return this.editingVersion;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return onlineCnt
         */
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        /**
         * @return promptKey
         */
        public String getPromptKey() {
            return this.promptKey;
        }

        /**
         * @return reviewingVersion
         */
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        /**
         * @return schemaVersion
         */
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return versionDetails
         */
        public java.util.List<VersionDetails> getVersionDetails() {
            return this.versionDetails;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private java.util.List<String> bizTags; 
            private String description; 
            private String editingVersion; 
            private Long gmtModified; 
            private java.util.Map<String, String> labels; 
            private String latestVersion; 
            private Integer onlineCnt; 
            private String promptKey; 
            private String reviewingVersion; 
            private Integer schemaVersion; 
            private java.util.List<VersionDetails> versionDetails; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizTags = model.bizTags;
                this.description = model.description;
                this.editingVersion = model.editingVersion;
                this.gmtModified = model.gmtModified;
                this.labels = model.labels;
                this.latestVersion = model.latestVersion;
                this.onlineCnt = model.onlineCnt;
                this.promptKey = model.promptKey;
                this.reviewingVersion = model.reviewingVersion;
                this.schemaVersion = model.schemaVersion;
                this.versionDetails = model.versionDetails;
                this.versions = model.versions;
            } 

            /**
             * BizTags.
             */
            public Builder bizTags(java.util.List<String> bizTags) {
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
             * EditingVersion.
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * LatestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
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
             * PromptKey.
             */
            public Builder promptKey(String promptKey) {
                this.promptKey = promptKey;
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
             * SchemaVersion.
             */
            public Builder schemaVersion(Integer schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * VersionDetails.
             */
            public Builder versionDetails(java.util.List<VersionDetails> versionDetails) {
                this.versionDetails = versionDetails;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
