// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkitemRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkitemRequest</p>
 */
public class UpdateWorkitemRequest extends Request {
    @Body
    @NameInMap("AKProjectId")
    @Validation(required = true)
    private Integer AKProjectId;

    @Body
    @NameInMap("AssignedTo")
    private String assignedTo;

    @Body
    @NameInMap("CfList")
    private java.util.Map < String, ? > cfList;

    @Body
    @NameInMap("Cfs")
    private java.util.Map < String, ? > cfs;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("IgnoreCheck")
    private Boolean ignoreCheck;

    @Body
    @NameInMap("IssueId")
    @Validation(required = true)
    private Integer issueId;

    @Body
    @NameInMap("Modifier")
    @Validation(required = true)
    private String modifier;

    @Body
    @NameInMap("Priority")
    private String priority;

    @Body
    @NameInMap("SeriousLevel")
    private String seriousLevel;

    @Body
    @NameInMap("SprintId")
    private Integer sprintId;

    @Body
    @NameInMap("Stamp")
    private String stamp;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("Subject")
    private String subject;

    @Body
    @NameInMap("TemplateId")
    private Integer templateId;

    @Body
    @NameInMap("Verifier")
    private String verifier;

    private UpdateWorkitemRequest(Builder builder) {
        super(builder);
        this.AKProjectId = builder.AKProjectId;
        this.assignedTo = builder.assignedTo;
        this.cfList = builder.cfList;
        this.cfs = builder.cfs;
        this.corpIdentifier = builder.corpIdentifier;
        this.description = builder.description;
        this.ignoreCheck = builder.ignoreCheck;
        this.issueId = builder.issueId;
        this.modifier = builder.modifier;
        this.priority = builder.priority;
        this.seriousLevel = builder.seriousLevel;
        this.sprintId = builder.sprintId;
        this.stamp = builder.stamp;
        this.status = builder.status;
        this.subject = builder.subject;
        this.templateId = builder.templateId;
        this.verifier = builder.verifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkitemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AKProjectId
     */
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    /**
     * @return assignedTo
     */
    public String getAssignedTo() {
        return this.assignedTo;
    }

    /**
     * @return cfList
     */
    public java.util.Map < String, ? > getCfList() {
        return this.cfList;
    }

    /**
     * @return cfs
     */
    public java.util.Map < String, ? > getCfs() {
        return this.cfs;
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ignoreCheck
     */
    public Boolean getIgnoreCheck() {
        return this.ignoreCheck;
    }

    /**
     * @return issueId
     */
    public Integer getIssueId() {
        return this.issueId;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return seriousLevel
     */
    public String getSeriousLevel() {
        return this.seriousLevel;
    }

    /**
     * @return sprintId
     */
    public Integer getSprintId() {
        return this.sprintId;
    }

    /**
     * @return stamp
     */
    public String getStamp() {
        return this.stamp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    /**
     * @return verifier
     */
    public String getVerifier() {
        return this.verifier;
    }

    public static final class Builder extends Request.Builder<UpdateWorkitemRequest, Builder> {
        private Integer AKProjectId; 
        private String assignedTo; 
        private java.util.Map < String, ? > cfList; 
        private java.util.Map < String, ? > cfs; 
        private String corpIdentifier; 
        private String description; 
        private Boolean ignoreCheck; 
        private Integer issueId; 
        private String modifier; 
        private String priority; 
        private String seriousLevel; 
        private Integer sprintId; 
        private String stamp; 
        private String status; 
        private String subject; 
        private Integer templateId; 
        private String verifier; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkitemRequest response) {
            super(response);
            this.AKProjectId = response.AKProjectId;
            this.assignedTo = response.assignedTo;
            this.cfList = response.cfList;
            this.cfs = response.cfs;
            this.corpIdentifier = response.corpIdentifier;
            this.description = response.description;
            this.ignoreCheck = response.ignoreCheck;
            this.issueId = response.issueId;
            this.modifier = response.modifier;
            this.priority = response.priority;
            this.seriousLevel = response.seriousLevel;
            this.sprintId = response.sprintId;
            this.stamp = response.stamp;
            this.status = response.status;
            this.subject = response.subject;
            this.templateId = response.templateId;
            this.verifier = response.verifier;
        } 

        /**
         * AKProjectId.
         */
        public Builder AKProjectId(Integer AKProjectId) {
            this.putBodyParameter("AKProjectId", AKProjectId);
            this.AKProjectId = AKProjectId;
            return this;
        }

        /**
         * AssignedTo.
         */
        public Builder assignedTo(String assignedTo) {
            this.putBodyParameter("AssignedTo", assignedTo);
            this.assignedTo = assignedTo;
            return this;
        }

        /**
         * CfList.
         */
        public Builder cfList(java.util.Map < String, ? > cfList) {
            this.putBodyParameter("CfList", cfList);
            this.cfList = cfList;
            return this;
        }

        /**
         * Cfs.
         */
        public Builder cfs(java.util.Map < String, ? > cfs) {
            this.putBodyParameter("Cfs", cfs);
            this.cfs = cfs;
            return this;
        }

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IgnoreCheck.
         */
        public Builder ignoreCheck(Boolean ignoreCheck) {
            this.putBodyParameter("IgnoreCheck", ignoreCheck);
            this.ignoreCheck = ignoreCheck;
            return this;
        }

        /**
         * IssueId.
         */
        public Builder issueId(Integer issueId) {
            this.putBodyParameter("IssueId", issueId);
            this.issueId = issueId;
            return this;
        }

        /**
         * Modifier.
         */
        public Builder modifier(String modifier) {
            this.putBodyParameter("Modifier", modifier);
            this.modifier = modifier;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * SeriousLevel.
         */
        public Builder seriousLevel(String seriousLevel) {
            this.putBodyParameter("SeriousLevel", seriousLevel);
            this.seriousLevel = seriousLevel;
            return this;
        }

        /**
         * SprintId.
         */
        public Builder sprintId(Integer sprintId) {
            this.putBodyParameter("SprintId", sprintId);
            this.sprintId = sprintId;
            return this;
        }

        /**
         * Stamp.
         */
        public Builder stamp(String stamp) {
            this.putBodyParameter("Stamp", stamp);
            this.stamp = stamp;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Verifier.
         */
        public Builder verifier(String verifier) {
            this.putBodyParameter("Verifier", verifier);
            this.verifier = verifier;
            return this;
        }

        @Override
        public UpdateWorkitemRequest build() {
            return new UpdateWorkitemRequest(this);
        } 

    } 

}
