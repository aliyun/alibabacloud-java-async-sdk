// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkitemRequest</p>
 */
public class CreateWorkitemRequest extends Request {
    @Body
    @NameInMap("AKProjectId")
    @Validation(required = true)
    private Integer AKProjectId;

    @Body
    @NameInMap("AssignedTo")
    @Validation(required = true)
    private String assignedTo;

    @Body
    @NameInMap("Author")
    @Validation(required = true)
    private String author;

    @Body
    @NameInMap("CfList")
    private String cfList;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("ModuleIds")
    private String moduleIds;

    @Body
    @NameInMap("PriorityId")
    private Integer priorityId;

    @Body
    @NameInMap("SeriousLevelId")
    private Integer seriousLevelId;

    @Body
    @NameInMap("Stamp")
    @Validation(required = true)
    private String stamp;

    @Body
    @NameInMap("Subject")
    @Validation(required = true)
    private String subject;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Integer templateId;

    @Body
    @NameInMap("Verifier")
    private String verifier;

    @Body
    @NameInMap("WatcherUsers")
    private String watcherUsers;

    private CreateWorkitemRequest(Builder builder) {
        super(builder);
        this.AKProjectId = builder.AKProjectId;
        this.assignedTo = builder.assignedTo;
        this.author = builder.author;
        this.cfList = builder.cfList;
        this.corpIdentifier = builder.corpIdentifier;
        this.description = builder.description;
        this.moduleIds = builder.moduleIds;
        this.priorityId = builder.priorityId;
        this.seriousLevelId = builder.seriousLevelId;
        this.stamp = builder.stamp;
        this.subject = builder.subject;
        this.templateId = builder.templateId;
        this.verifier = builder.verifier;
        this.watcherUsers = builder.watcherUsers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemRequest create() {
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
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return cfList
     */
    public String getCfList() {
        return this.cfList;
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
     * @return moduleIds
     */
    public String getModuleIds() {
        return this.moduleIds;
    }

    /**
     * @return priorityId
     */
    public Integer getPriorityId() {
        return this.priorityId;
    }

    /**
     * @return seriousLevelId
     */
    public Integer getSeriousLevelId() {
        return this.seriousLevelId;
    }

    /**
     * @return stamp
     */
    public String getStamp() {
        return this.stamp;
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

    /**
     * @return watcherUsers
     */
    public String getWatcherUsers() {
        return this.watcherUsers;
    }

    public static final class Builder extends Request.Builder<CreateWorkitemRequest, Builder> {
        private Integer AKProjectId; 
        private String assignedTo; 
        private String author; 
        private String cfList; 
        private String corpIdentifier; 
        private String description; 
        private String moduleIds; 
        private Integer priorityId; 
        private Integer seriousLevelId; 
        private String stamp; 
        private String subject; 
        private Integer templateId; 
        private String verifier; 
        private String watcherUsers; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkitemRequest response) {
            super(response);
            this.AKProjectId = response.AKProjectId;
            this.assignedTo = response.assignedTo;
            this.author = response.author;
            this.cfList = response.cfList;
            this.corpIdentifier = response.corpIdentifier;
            this.description = response.description;
            this.moduleIds = response.moduleIds;
            this.priorityId = response.priorityId;
            this.seriousLevelId = response.seriousLevelId;
            this.stamp = response.stamp;
            this.subject = response.subject;
            this.templateId = response.templateId;
            this.verifier = response.verifier;
            this.watcherUsers = response.watcherUsers;
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
         * Author.
         */
        public Builder author(String author) {
            this.putBodyParameter("Author", author);
            this.author = author;
            return this;
        }

        /**
         * CfList.
         */
        public Builder cfList(String cfList) {
            this.putBodyParameter("CfList", cfList);
            this.cfList = cfList;
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
         * ModuleIds.
         */
        public Builder moduleIds(String moduleIds) {
            this.putBodyParameter("ModuleIds", moduleIds);
            this.moduleIds = moduleIds;
            return this;
        }

        /**
         * PriorityId.
         */
        public Builder priorityId(Integer priorityId) {
            this.putBodyParameter("PriorityId", priorityId);
            this.priorityId = priorityId;
            return this;
        }

        /**
         * SeriousLevelId.
         */
        public Builder seriousLevelId(Integer seriousLevelId) {
            this.putBodyParameter("SeriousLevelId", seriousLevelId);
            this.seriousLevelId = seriousLevelId;
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

        /**
         * WatcherUsers.
         */
        public Builder watcherUsers(String watcherUsers) {
            this.putBodyParameter("WatcherUsers", watcherUsers);
            this.watcherUsers = watcherUsers;
            return this;
        }

        @Override
        public CreateWorkitemRequest build() {
            return new CreateWorkitemRequest(this);
        } 

    } 

}
