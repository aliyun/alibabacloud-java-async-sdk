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
 * {@link PrecheckSkillUploadViaOssResponseBody} extends {@link TeaModel}
 *
 * <p>PrecheckSkillUploadViaOssResponseBody</p>
 */
public class PrecheckSkillUploadViaOssResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PrecheckSkillUploadViaOssResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckSkillUploadViaOssResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PrecheckSkillUploadViaOssResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
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

        public PrecheckSkillUploadViaOssResponseBody build() {
            return new PrecheckSkillUploadViaOssResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckSkillUploadViaOssResponseBody} extends {@link TeaModel}
     *
     * <p>PrecheckSkillUploadViaOssResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("draftMode")
        private String draftMode;

        @com.aliyun.core.annotation.NameInMap("editingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("entryPath")
        private String entryPath;

        @com.aliyun.core.annotation.NameInMap("exists")
        private Boolean exists;

        @com.aliyun.core.annotation.NameInMap("headRevision")
        private String headRevision;

        @com.aliyun.core.annotation.NameInMap("headStatus")
        private String headStatus;

        @com.aliyun.core.annotation.NameInMap("maxPublishedVersion")
        private String maxPublishedVersion;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("parsedVersion")
        private String parsedVersion;

        @com.aliyun.core.annotation.NameInMap("precheckCode")
        private String precheckCode;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("reviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("targetVersion")
        private String targetVersion;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.draftMode = builder.draftMode;
            this.editingVersion = builder.editingVersion;
            this.entryPath = builder.entryPath;
            this.exists = builder.exists;
            this.headRevision = builder.headRevision;
            this.headStatus = builder.headStatus;
            this.maxPublishedVersion = builder.maxPublishedVersion;
            this.owner = builder.owner;
            this.parsedVersion = builder.parsedVersion;
            this.precheckCode = builder.precheckCode;
            this.reason = builder.reason;
            this.reviewingVersion = builder.reviewingVersion;
            this.skillName = builder.skillName;
            this.targetVersion = builder.targetVersion;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return draftMode
         */
        public String getDraftMode() {
            return this.draftMode;
        }

        /**
         * @return editingVersion
         */
        public String getEditingVersion() {
            return this.editingVersion;
        }

        /**
         * @return entryPath
         */
        public String getEntryPath() {
            return this.entryPath;
        }

        /**
         * @return exists
         */
        public Boolean getExists() {
            return this.exists;
        }

        /**
         * @return headRevision
         */
        public String getHeadRevision() {
            return this.headRevision;
        }

        /**
         * @return headStatus
         */
        public String getHeadStatus() {
            return this.headStatus;
        }

        /**
         * @return maxPublishedVersion
         */
        public String getMaxPublishedVersion() {
            return this.maxPublishedVersion;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parsedVersion
         */
        public String getParsedVersion() {
            return this.parsedVersion;
        }

        /**
         * @return precheckCode
         */
        public String getPrecheckCode() {
            return this.precheckCode;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reviewingVersion
         */
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String draftMode; 
            private String editingVersion; 
            private String entryPath; 
            private Boolean exists; 
            private String headRevision; 
            private String headStatus; 
            private String maxPublishedVersion; 
            private String owner; 
            private String parsedVersion; 
            private String precheckCode; 
            private String reason; 
            private String reviewingVersion; 
            private String skillName; 
            private String targetVersion; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.draftMode = model.draftMode;
                this.editingVersion = model.editingVersion;
                this.entryPath = model.entryPath;
                this.exists = model.exists;
                this.headRevision = model.headRevision;
                this.headStatus = model.headStatus;
                this.maxPublishedVersion = model.maxPublishedVersion;
                this.owner = model.owner;
                this.parsedVersion = model.parsedVersion;
                this.precheckCode = model.precheckCode;
                this.reason = model.reason;
                this.reviewingVersion = model.reviewingVersion;
                this.skillName = model.skillName;
                this.targetVersion = model.targetVersion;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The draft mode: HEAD or VERSIONED, determined by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder draftMode(String draftMode) {
                this.draftMode = draftMode;
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
             * <p>The entry path of the Skill package.</p>
             * 
             * <strong>example:</strong>
             * <p>SKILL.md</p>
             */
            public Builder entryPath(String entryPath) {
                this.entryPath = entryPath;
                return this;
            }

            /**
             * <p>Indicates whether the Skill already exists.</p>
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * <p>The content revision identifier of the persistent draft, used to determine whether the local cache has expired. Returned only in HEAD draft mode.</p>
             * 
             * <strong>example:</strong>
             * <p>rev-1a2b3c4d</p>
             */
            public Builder headRevision(String headRevision) {
                this.headRevision = headRevision;
                return this;
            }

            /**
             * <p>The status of the persistent draft: draft, reviewing, or reviewed. Returned only in HEAD draft mode.</p>
             * 
             * <strong>example:</strong>
             * <p>draft</p>
             */
            public Builder headStatus(String headStatus) {
                this.headStatus = headStatus;
                return this;
            }

            /**
             * <p>The highest published version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder maxPublishedVersion(String maxPublishedVersion) {
                this.maxPublishedVersion = maxPublishedVersion;
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
             * <p>The version parsed from the uploaded content.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder parsedVersion(String parsedVersion) {
                this.parsedVersion = parsedVersion;
                return this;
            }

            /**
             * <p>The dry run result code.</p>
             * 
             * <strong>example:</strong>
             * <p>VALIDATION_FAILED</p>
             */
            public Builder precheckCode(String precheckCode) {
                this.precheckCode = precheckCode;
                return this;
            }

            /**
             * <p>The reason description.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource processing completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * <p>The Skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-example</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The target version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
