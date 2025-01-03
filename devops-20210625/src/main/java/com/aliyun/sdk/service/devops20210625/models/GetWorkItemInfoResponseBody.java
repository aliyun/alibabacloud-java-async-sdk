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
 * {@link GetWorkItemInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemInfoResponseBody</p>
 */
public class GetWorkItemInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("workitem")
    private Workitem workitem;

    private GetWorkItemInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitem = builder.workitem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemInfoResponseBody create() {
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

        public GetWorkItemInfoResponseBody build() {
            return new GetWorkItemInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkItemInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemInfoResponseBody</p>
     */
    public static class ValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayValue")
        private String displayValue;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("valueEn")
        private String valueEn;

        private ValueList(Builder builder) {
            this.displayValue = builder.displayValue;
            this.identifier = builder.identifier;
            this.level = builder.level;
            this.value = builder.value;
            this.valueEn = builder.valueEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueList create() {
            return builder().build();
        }

        /**
         * @return displayValue
         */
        public String getDisplayValue() {
            return this.displayValue;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueEn
         */
        public String getValueEn() {
            return this.valueEn;
        }

        public static final class Builder {
            private String displayValue; 
            private String identifier; 
            private Long level; 
            private String value; 
            private String valueEn; 

            /**
             * displayValue.
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
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
             * level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * valueEn.
             */
            public Builder valueEn(String valueEn) {
                this.valueEn = valueEn;
                return this;
            }

            public ValueList build() {
                return new ValueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkItemInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemInfoResponseBody</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldClassName")
        private String fieldClassName;

        @com.aliyun.core.annotation.NameInMap("fieldFormat")
        private String fieldFormat;

        @com.aliyun.core.annotation.NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @com.aliyun.core.annotation.NameInMap("level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("objectValue")
        private String objectValue;

        @com.aliyun.core.annotation.NameInMap("position")
        private Long position;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("valueList")
        private java.util.List<ValueList> valueList;

        @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
        private String workitemIdentifier;

        private CustomFields(Builder builder) {
            this.fieldClassName = builder.fieldClassName;
            this.fieldFormat = builder.fieldFormat;
            this.fieldIdentifier = builder.fieldIdentifier;
            this.level = builder.level;
            this.objectValue = builder.objectValue;
            this.position = builder.position;
            this.value = builder.value;
            this.valueList = builder.valueList;
            this.workitemIdentifier = builder.workitemIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomFields create() {
            return builder().build();
        }

        /**
         * @return fieldClassName
         */
        public String getFieldClassName() {
            return this.fieldClassName;
        }

        /**
         * @return fieldFormat
         */
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return objectValue
         */
        public String getObjectValue() {
            return this.objectValue;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueList
         */
        public java.util.List<ValueList> getValueList() {
            return this.valueList;
        }

        /**
         * @return workitemIdentifier
         */
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

        public static final class Builder {
            private String fieldClassName; 
            private String fieldFormat; 
            private String fieldIdentifier; 
            private Long level; 
            private String objectValue; 
            private Long position; 
            private String value; 
            private java.util.List<ValueList> valueList; 
            private String workitemIdentifier; 

            /**
             * fieldClassName.
             */
            public Builder fieldClassName(String fieldClassName) {
                this.fieldClassName = fieldClassName;
                return this;
            }

            /**
             * fieldFormat.
             */
            public Builder fieldFormat(String fieldFormat) {
                this.fieldFormat = fieldFormat;
                return this;
            }

            /**
             * fieldIdentifier.
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * objectValue.
             */
            public Builder objectValue(String objectValue) {
                this.objectValue = objectValue;
                return this;
            }

            /**
             * position.
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * valueList.
             */
            public Builder valueList(java.util.List<ValueList> valueList) {
                this.valueList = valueList;
                return this;
            }

            /**
             * workitemIdentifier.
             */
            public Builder workitemIdentifier(String workitemIdentifier) {
                this.workitemIdentifier = workitemIdentifier;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkItemInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemInfoResponseBody</p>
     */
    public static class TagDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private TagDetails(Builder builder) {
            this.color = builder.color;
            this.identifier = builder.identifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagDetails create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String color; 
            private String identifier; 
            private String name; 

            /**
             * color.
             */
            public Builder color(String color) {
                this.color = color;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TagDetails build() {
                return new TagDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkItemInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemInfoResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Versions(Builder builder) {
            this.identifier = builder.identifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String identifier; 
            private String name; 

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkItemInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemInfoResponseBody</p>
     */
    public static class Workitem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedTo")
        private String assignedTo;

        @com.aliyun.core.annotation.NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("customFields")
        private java.util.List<CustomFields> customFields;

        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("documentFormat")
        private String documentFormat;

        @com.aliyun.core.annotation.NameInMap("finishTime")
        private Long finishTime;

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

        @com.aliyun.core.annotation.NameInMap("participant")
        private java.util.List<String> participant;

        @com.aliyun.core.annotation.NameInMap("serialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("spaceName")
        private String spaceName;

        @com.aliyun.core.annotation.NameInMap("spaceType")
        private String spaceType;

        @com.aliyun.core.annotation.NameInMap("sprint")
        private java.util.List<String> sprint;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusIdentifier")
        private String statusIdentifier;

        @com.aliyun.core.annotation.NameInMap("statusStageIdentifier")
        private String statusStageIdentifier;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("tag")
        private java.util.List<String> tag;

        @com.aliyun.core.annotation.NameInMap("tagDetails")
        private java.util.List<TagDetails> tagDetails;

        @com.aliyun.core.annotation.NameInMap("tracker")
        private java.util.List<String> tracker;

        @com.aliyun.core.annotation.NameInMap("updateStatusAt")
        private Long updateStatusAt;

        @com.aliyun.core.annotation.NameInMap("verifier")
        private java.util.List<String> verifier;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<Versions> versions;

        @com.aliyun.core.annotation.NameInMap("workitemTypeIdentifier")
        private String workitemTypeIdentifier;

        private Workitem(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.customFields = builder.customFields;
            this.document = builder.document;
            this.documentFormat = builder.documentFormat;
            this.finishTime = builder.finishTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.logicalStatus = builder.logicalStatus;
            this.modifier = builder.modifier;
            this.parentIdentifier = builder.parentIdentifier;
            this.participant = builder.participant;
            this.serialNumber = builder.serialNumber;
            this.spaceIdentifier = builder.spaceIdentifier;
            this.spaceName = builder.spaceName;
            this.spaceType = builder.spaceType;
            this.sprint = builder.sprint;
            this.status = builder.status;
            this.statusIdentifier = builder.statusIdentifier;
            this.statusStageIdentifier = builder.statusStageIdentifier;
            this.subject = builder.subject;
            this.tag = builder.tag;
            this.tagDetails = builder.tagDetails;
            this.tracker = builder.tracker;
            this.updateStatusAt = builder.updateStatusAt;
            this.verifier = builder.verifier;
            this.versions = builder.versions;
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
         * @return customFields
         */
        public java.util.List<CustomFields> getCustomFields() {
            return this.customFields;
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
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
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
         * @return participant
         */
        public java.util.List<String> getParticipant() {
            return this.participant;
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
         * @return sprint
         */
        public java.util.List<String> getSprint() {
            return this.sprint;
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
         * @return tag
         */
        public java.util.List<String> getTag() {
            return this.tag;
        }

        /**
         * @return tagDetails
         */
        public java.util.List<TagDetails> getTagDetails() {
            return this.tagDetails;
        }

        /**
         * @return tracker
         */
        public java.util.List<String> getTracker() {
            return this.tracker;
        }

        /**
         * @return updateStatusAt
         */
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        /**
         * @return verifier
         */
        public java.util.List<String> getVerifier() {
            return this.verifier;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
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
            private java.util.List<CustomFields> customFields; 
            private String document; 
            private String documentFormat; 
            private Long finishTime; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private String logicalStatus; 
            private String modifier; 
            private String parentIdentifier; 
            private java.util.List<String> participant; 
            private String serialNumber; 
            private String spaceIdentifier; 
            private String spaceName; 
            private String spaceType; 
            private java.util.List<String> sprint; 
            private String status; 
            private String statusIdentifier; 
            private String statusStageIdentifier; 
            private String subject; 
            private java.util.List<String> tag; 
            private java.util.List<TagDetails> tagDetails; 
            private java.util.List<String> tracker; 
            private Long updateStatusAt; 
            private java.util.List<String> verifier; 
            private java.util.List<Versions> versions; 
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
             * customFields.
             */
            public Builder customFields(java.util.List<CustomFields> customFields) {
                this.customFields = customFields;
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
             * finishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
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
             * participant.
             */
            public Builder participant(java.util.List<String> participant) {
                this.participant = participant;
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
             * sprint.
             */
            public Builder sprint(java.util.List<String> sprint) {
                this.sprint = sprint;
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
             * tag.
             */
            public Builder tag(java.util.List<String> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * tagDetails.
             */
            public Builder tagDetails(java.util.List<TagDetails> tagDetails) {
                this.tagDetails = tagDetails;
                return this;
            }

            /**
             * tracker.
             */
            public Builder tracker(java.util.List<String> tracker) {
                this.tracker = tracker;
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
             * verifier.
             */
            public Builder verifier(java.util.List<String> verifier) {
                this.verifier = verifier;
                return this;
            }

            /**
             * versions.
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
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
