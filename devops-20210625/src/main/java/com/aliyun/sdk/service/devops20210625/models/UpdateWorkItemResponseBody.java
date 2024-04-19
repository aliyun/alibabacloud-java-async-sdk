// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkItemResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkItemResponseBody</p>
 */
public class UpdateWorkItemResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("workitem")
    private Workitem workitem;

    private UpdateWorkItemResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitem = builder.workitem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkItemResponseBody create() {
        return builder().build();
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

    /**
     * @return workitem
     */
    public Workitem getWorkitem() {
        return this.workitem;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
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
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public UpdateWorkItemResponseBody build() {
            return new UpdateWorkItemResponseBody(this);
        } 

    } 

    public static class Workitem extends TeaModel {
        @NameInMap("assignedTo")
        private String assignedTo;

        @NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @NameInMap("creator")
        private String creator;

        @NameInMap("document")
        private String document;

        @NameInMap("documentFormat")
        private String documentFormat;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("logicalStatus")
        private String logicalStatus;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("parentIdentifier")
        private String parentIdentifier;

        @NameInMap("serialNumber")
        private String serialNumber;

        @NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @NameInMap("spaceName")
        private String spaceName;

        @NameInMap("spaceType")
        private String spaceType;

        @NameInMap("sprintIdentifier")
        private String sprintIdentifier;

        @NameInMap("status")
        private String status;

        @NameInMap("statusIdentifier")
        private String statusIdentifier;

        @NameInMap("statusStageIdentifier")
        private String statusStageIdentifier;

        @NameInMap("subject")
        private String subject;

        @NameInMap("updateStatusAt")
        private Long updateStatusAt;

        @NameInMap("workitemTypeIdentifier")
        private String workitemTypeIdentifier;

        private Workitem(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.document = builder.document;
            this.documentFormat = builder.documentFormat;
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
         * @return documentFormat
         */
        public String getDocumentFormat() {
            return this.documentFormat;
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
            private String documentFormat; 
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
             * documentFormat.
             */
            public Builder documentFormat(String documentFormat) {
                this.documentFormat = documentFormat;
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
