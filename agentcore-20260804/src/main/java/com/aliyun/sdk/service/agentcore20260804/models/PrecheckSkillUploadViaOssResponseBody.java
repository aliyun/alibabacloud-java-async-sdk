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
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
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
        @com.aliyun.core.annotation.NameInMap("editingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("entryPath")
        private String entryPath;

        @com.aliyun.core.annotation.NameInMap("exists")
        private Boolean exists;

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
            this.editingVersion = builder.editingVersion;
            this.entryPath = builder.entryPath;
            this.exists = builder.exists;
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
            private String editingVersion; 
            private String entryPath; 
            private Boolean exists; 
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
                this.editingVersion = model.editingVersion;
                this.entryPath = model.entryPath;
                this.exists = model.exists;
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
             * editingVersion.
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * entryPath.
             */
            public Builder entryPath(String entryPath) {
                this.entryPath = entryPath;
                return this;
            }

            /**
             * exists.
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * maxPublishedVersion.
             */
            public Builder maxPublishedVersion(String maxPublishedVersion) {
                this.maxPublishedVersion = maxPublishedVersion;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * parsedVersion.
             */
            public Builder parsedVersion(String parsedVersion) {
                this.parsedVersion = parsedVersion;
                return this;
            }

            /**
             * precheckCode.
             */
            public Builder precheckCode(String precheckCode) {
                this.precheckCode = precheckCode;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * reviewingVersion.
             */
            public Builder reviewingVersion(String reviewingVersion) {
                this.reviewingVersion = reviewingVersion;
                return this;
            }

            /**
             * skillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * targetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * workspaceId.
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
