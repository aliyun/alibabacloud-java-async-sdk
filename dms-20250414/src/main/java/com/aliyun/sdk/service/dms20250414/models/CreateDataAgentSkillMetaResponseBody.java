// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateDataAgentSkillMetaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataAgentSkillMetaResponseBody</p>
 */
public class CreateDataAgentSkillMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDataAgentSkillMetaResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentSkillMetaResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateDataAgentSkillMetaResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDataAgentSkillMetaResponseBody build() {
            return new CreateDataAgentSkillMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataAgentSkillMetaResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDataAgentSkillMetaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunParentUid")
        private String aliyunParentUid;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CreatorUserName")
        private String creatorUserName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ParseError")
        private String parseError;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SkillFrom")
        private String skillFrom;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillStatus")
        private String skillStatus;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.aliyunParentUid = builder.aliyunParentUid;
            this.aliyunUid = builder.aliyunUid;
            this.creatorUserName = builder.creatorUserName;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.parseError = builder.parseError;
            this.region = builder.region;
            this.skillFrom = builder.skillFrom;
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
            this.skillStatus = builder.skillStatus;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunParentUid
         */
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return creatorUserName
         */
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return parseError
         */
        public String getParseError() {
            return this.parseError;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return skillFrom
         */
        public String getSkillFrom() {
            return this.skillFrom;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return skillStatus
         */
        public String getSkillStatus() {
            return this.skillStatus;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String aliyunParentUid; 
            private String aliyunUid; 
            private String creatorUserName; 
            private String description; 
            private Integer enabled; 
            private String gmtCreated; 
            private String gmtModified; 
            private String parseError; 
            private String region; 
            private String skillFrom; 
            private String skillId; 
            private String skillName; 
            private String skillStatus; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunParentUid = model.aliyunParentUid;
                this.aliyunUid = model.aliyunUid;
                this.creatorUserName = model.creatorUserName;
                this.description = model.description;
                this.enabled = model.enabled;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.parseError = model.parseError;
                this.region = model.region;
                this.skillFrom = model.skillFrom;
                this.skillId = model.skillId;
                this.skillName = model.skillName;
                this.skillStatus = model.skillStatus;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * AliyunParentUid.
             */
            public Builder aliyunParentUid(String aliyunParentUid) {
                this.aliyunParentUid = aliyunParentUid;
                return this;
            }

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * CreatorUserName.
             */
            public Builder creatorUserName(String creatorUserName) {
                this.creatorUserName = creatorUserName;
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
             * Enabled.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ParseError.
             */
            public Builder parseError(String parseError) {
                this.parseError = parseError;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SkillFrom.
             */
            public Builder skillFrom(String skillFrom) {
                this.skillFrom = skillFrom;
                return this;
            }

            /**
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * SkillStatus.
             */
            public Builder skillStatus(String skillStatus) {
                this.skillStatus = skillStatus;
                return this;
            }

            /**
             * WorkspaceId.
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
