// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemV2Request} extends {@link RequestModel}
 *
 * <p>CreateWorkitemV2Request</p>
 */
public class CreateWorkitemV2Request extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assignedTo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assignedTo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fieldValueList")
    private java.util.List < FieldValueList> fieldValueList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentIdentifier")
    private String parentIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("participants")
    private java.util.List < String > participants;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sprintIdentifier")
    private String sprintIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < String > tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trackers")
    private java.util.List < String > trackers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("verifier")
    private String verifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versions")
    private java.util.List < String > versions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workitemTypeIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemTypeIdentifier;

    private CreateWorkitemV2Request(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.assignedTo = builder.assignedTo;
        this.category = builder.category;
        this.description = builder.description;
        this.fieldValueList = builder.fieldValueList;
        this.parentIdentifier = builder.parentIdentifier;
        this.participants = builder.participants;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.sprintIdentifier = builder.sprintIdentifier;
        this.subject = builder.subject;
        this.tags = builder.tags;
        this.trackers = builder.trackers;
        this.verifier = builder.verifier;
        this.versions = builder.versions;
        this.workitemTypeIdentifier = builder.workitemTypeIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return assignedTo
     */
    public String getAssignedTo() {
        return this.assignedTo;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fieldValueList
     */
    public java.util.List < FieldValueList> getFieldValueList() {
        return this.fieldValueList;
    }

    /**
     * @return parentIdentifier
     */
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    /**
     * @return participants
     */
    public java.util.List < String > getParticipants() {
        return this.participants;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return sprintIdentifier
     */
    public String getSprintIdentifier() {
        return this.sprintIdentifier;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return trackers
     */
    public java.util.List < String > getTrackers() {
        return this.trackers;
    }

    /**
     * @return verifier
     */
    public String getVerifier() {
        return this.verifier;
    }

    /**
     * @return versions
     */
    public java.util.List < String > getVersions() {
        return this.versions;
    }

    /**
     * @return workitemTypeIdentifier
     */
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

    public static final class Builder extends Request.Builder<CreateWorkitemV2Request, Builder> {
        private String organizationId; 
        private String assignedTo; 
        private String category; 
        private String description; 
        private java.util.List < FieldValueList> fieldValueList; 
        private String parentIdentifier; 
        private java.util.List < String > participants; 
        private String spaceIdentifier; 
        private String sprintIdentifier; 
        private String subject; 
        private java.util.List < String > tags; 
        private java.util.List < String > trackers; 
        private String verifier; 
        private java.util.List < String > versions; 
        private String workitemTypeIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkitemV2Request request) {
            super(request);
            this.organizationId = request.organizationId;
            this.assignedTo = request.assignedTo;
            this.category = request.category;
            this.description = request.description;
            this.fieldValueList = request.fieldValueList;
            this.parentIdentifier = request.parentIdentifier;
            this.participants = request.participants;
            this.spaceIdentifier = request.spaceIdentifier;
            this.sprintIdentifier = request.sprintIdentifier;
            this.subject = request.subject;
            this.tags = request.tags;
            this.trackers = request.trackers;
            this.verifier = request.verifier;
            this.versions = request.versions;
            this.workitemTypeIdentifier = request.workitemTypeIdentifier;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * assignedTo.
         */
        public Builder assignedTo(String assignedTo) {
            this.putBodyParameter("assignedTo", assignedTo);
            this.assignedTo = assignedTo;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * fieldValueList.
         */
        public Builder fieldValueList(java.util.List < FieldValueList> fieldValueList) {
            this.putBodyParameter("fieldValueList", fieldValueList);
            this.fieldValueList = fieldValueList;
            return this;
        }

        /**
         * parentIdentifier.
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putBodyParameter("parentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * participants.
         */
        public Builder participants(java.util.List < String > participants) {
            this.putBodyParameter("participants", participants);
            this.participants = participants;
            return this;
        }

        /**
         * spaceIdentifier.
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putBodyParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * sprintIdentifier.
         */
        public Builder sprintIdentifier(String sprintIdentifier) {
            this.putBodyParameter("sprintIdentifier", sprintIdentifier);
            this.sprintIdentifier = sprintIdentifier;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * trackers.
         */
        public Builder trackers(java.util.List < String > trackers) {
            this.putBodyParameter("trackers", trackers);
            this.trackers = trackers;
            return this;
        }

        /**
         * verifier.
         */
        public Builder verifier(String verifier) {
            this.putBodyParameter("verifier", verifier);
            this.verifier = verifier;
            return this;
        }

        /**
         * versions.
         */
        public Builder versions(java.util.List < String > versions) {
            this.putBodyParameter("versions", versions);
            this.versions = versions;
            return this;
        }

        /**
         * workitemTypeIdentifier.
         */
        public Builder workitemTypeIdentifier(String workitemTypeIdentifier) {
            this.putBodyParameter("workitemTypeIdentifier", workitemTypeIdentifier);
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }

        @Override
        public CreateWorkitemV2Request build() {
            return new CreateWorkitemV2Request(this);
        } 

    } 

    public static class FieldValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private FieldValueList(Builder builder) {
            this.fieldIdentifier = builder.fieldIdentifier;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldValueList create() {
            return builder().build();
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String fieldIdentifier; 
            private String value; 

            /**
             * fieldIdentifier.
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FieldValueList build() {
                return new FieldValueList(this);
            } 

        } 

    }
}
