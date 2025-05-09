// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link UpdateWorkitemFieldResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkitemFieldResponseBody</p>
 */
public class UpdateWorkitemFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("workitem")
    private Workitem workitem;

    private UpdateWorkitemFieldResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitem = builder.workitem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkitemFieldResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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

    /**
     * @return workitem
     */
    public Workitem getWorkitem() {
        return this.workitem;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private Workitem workitem; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * workitem.
         */
        public Builder workitem(Workitem workitem) {
            this.workitem = workitem;
            return this;
        }

        public UpdateWorkitemFieldResponseBody build() {
            return new UpdateWorkitemFieldResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkitemFieldResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWorkitemFieldResponseBody</p>
     */
    public static class Workitem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedTo")
        private String assignedTo;

        @com.aliyun.core.annotation.NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("logicalStatus")
        private String logicalStatus;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("parentIdentifier")
        private String parentIdentifier;

        @com.aliyun.core.annotation.NameInMap("serialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("spaceName")
        private String spaceName;

        @com.aliyun.core.annotation.NameInMap("spaceType")
        private String spaceType;

        @com.aliyun.core.annotation.NameInMap("sprintIdentifier")
        private String sprintIdentifier;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusIdentifier")
        private String statusIdentifier;

        @com.aliyun.core.annotation.NameInMap("statusStageIdentifier")
        private String statusStageIdentifier;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("updateStatusAt")
        private Long updateStatusAt;

        @com.aliyun.core.annotation.NameInMap("workitemTypeIdentifier")
        private String workitemTypeIdentifier;

        private Workitem(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.document = builder.document;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.logicalStatus = builder.logicalStatus;
            this.modifier = builder.modifier;
            this.parentIdentifier = builder.parentIdentifier;
            this.serialNumber = builder.serialNumber;
            this.spaceIdentifier = builder.spaceIdentifier;
            this.spaceName = builder.spaceName;
            this.spaceType = builder.spaceType;
            this.sprintIdentifier = builder.sprintIdentifier;
            this.status = builder.status;
            this.statusIdentifier = builder.statusIdentifier;
            this.statusStageIdentifier = builder.statusStageIdentifier;
            this.subject = builder.subject;
            this.updateStatusAt = builder.updateStatusAt;
            this.workitemTypeIdentifier = builder.workitemTypeIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workitem create() {
            return builder().build();
        }

        /**
         * @return assignedTo
         */
        public String getAssignedTo() {
            return this.assignedTo;
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
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
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return logicalStatus
         */
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return parentIdentifier
         */
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return spaceIdentifier
         */
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        /**
         * @return spaceName
         */
        public String getSpaceName() {
            return this.spaceName;
        }

        /**
         * @return spaceType
         */
        public String getSpaceType() {
            return this.spaceType;
        }

        /**
         * @return sprintIdentifier
         */
        public String getSprintIdentifier() {
            return this.sprintIdentifier;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusIdentifier
         */
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        /**
         * @return statusStageIdentifier
         */
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return updateStatusAt
         */
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        /**
         * @return workitemTypeIdentifier
         */
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

        public static final class Builder {
            private String assignedTo; 
            private String categoryIdentifier; 
            private String creator; 
            private String document; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private String logicalStatus; 
            private String modifier; 
            private String parentIdentifier; 
            private String serialNumber; 
            private String spaceIdentifier; 
            private String spaceName; 
            private String spaceType; 
            private String sprintIdentifier; 
            private String status; 
            private String statusIdentifier; 
            private String statusStageIdentifier; 
            private String subject; 
            private Long updateStatusAt; 
            private String workitemTypeIdentifier; 

            /**
             * assignedTo.
             */
            public Builder assignedTo(String assignedTo) {
                this.assignedTo = assignedTo;
                return this;
            }

            /**
             * categoryIdentifier.
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * logicalStatus.
             */
            public Builder logicalStatus(String logicalStatus) {
                this.logicalStatus = logicalStatus;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * parentIdentifier.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * serialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * spaceIdentifier.
             */
            public Builder spaceIdentifier(String spaceIdentifier) {
                this.spaceIdentifier = spaceIdentifier;
                return this;
            }

            /**
             * spaceName.
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            /**
             * spaceType.
             */
            public Builder spaceType(String spaceType) {
                this.spaceType = spaceType;
                return this;
            }

            /**
             * sprintIdentifier.
             */
            public Builder sprintIdentifier(String sprintIdentifier) {
                this.sprintIdentifier = sprintIdentifier;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusIdentifier.
             */
            public Builder statusIdentifier(String statusIdentifier) {
                this.statusIdentifier = statusIdentifier;
                return this;
            }

            /**
             * statusStageIdentifier.
             */
            public Builder statusStageIdentifier(String statusStageIdentifier) {
                this.statusStageIdentifier = statusStageIdentifier;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * updateStatusAt.
             */
            public Builder updateStatusAt(Long updateStatusAt) {
                this.updateStatusAt = updateStatusAt;
                return this;
            }

            /**
             * workitemTypeIdentifier.
             */
            public Builder workitemTypeIdentifier(String workitemTypeIdentifier) {
                this.workitemTypeIdentifier = workitemTypeIdentifier;
                return this;
            }

            public Workitem build() {
                return new Workitem(this);
            } 

        } 

    }
}
