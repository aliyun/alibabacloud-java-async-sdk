// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchWorkitemResponseBody} extends {@link TeaModel}
 *
 * <p>SearchWorkitemResponseBody</p>
 */
public class SearchWorkitemResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("ToPage")
    private Integer toPage;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private SearchWorkitemResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.toPage = builder.toPage;
        this.totalCount = builder.totalCount;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchWorkitemResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return toPage
     */
    public Integer getToPage() {
        return this.toPage;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer toPage; 
        private Integer totalCount; 
        private Integer totalPages; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
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

        /**
         * ToPage.
         */
        public Builder toPage(Integer toPage) {
            this.toPage = toPage;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public SearchWorkitemResponseBody build() {
            return new SearchWorkitemResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AkPaths")
        private String akPaths;

        @NameInMap("AkProjectId")
        private Integer akProjectId;

        @NameInMap("AkVersionIds")
        private String akVersionIds;

        @NameInMap("AssignedTo")
        private String assignedTo;

        @NameInMap("AssignedToId")
        private Integer assignedToId;

        @NameInMap("AssignedToIdList")
        private String assignedToIdList;

        @NameInMap("AssignedToIds")
        private String assignedToIds;

        @NameInMap("AssignedToStaffId")
        private String assignedToStaffId;

        @NameInMap("AttachmentIds")
        private String attachmentIds;

        @NameInMap("AttachmentList")
        private String attachmentList;

        @NameInMap("Attachmented")
        private Boolean attachmented;

        @NameInMap("BlackListNotice")
        private String blackListNotice;

        @NameInMap("ChangeLogList")
        private String changeLogList;

        @NameInMap("ClosedDuration")
        private Integer closedDuration;

        @NameInMap("CommentList")
        private String commentList;

        @NameInMap("CommitDate")
        private Long commitDate;

        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("DevDuration")
        private Integer devDuration;

        @NameInMap("FixedDuration")
        private Integer fixedDuration;

        @NameInMap("FixedUserId")
        private Integer fixedUserId;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IdPath")
        private String idPath;

        @NameInMap("IgnoreCheck")
        private Boolean ignoreCheck;

        @NameInMap("IgnoreIntegrate")
        private Boolean ignoreIntegrate;

        @NameInMap("IssueRelations")
        private String issueRelations;

        @NameInMap("IssueTypeId")
        private Integer issueTypeId;

        @NameInMap("LinePath")
        private String linePath;

        @NameInMap("LogicalStatus")
        private String logicalStatus;

        @NameInMap("ModuleIds")
        private String moduleIds;

        @NameInMap("ModuleList")
        private String moduleList;

        @NameInMap("ModuleUpdated")
        private Boolean moduleUpdated;

        @NameInMap("ParentId")
        private Integer parentId;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("PriorityId")
        private Integer priorityId;

        @NameInMap("ProjectId")
        private Integer projectId;

        @NameInMap("ProjectIds")
        private String projectIds;

        @NameInMap("RecordChangeLog")
        private Boolean recordChangeLog;

        @NameInMap("Region")
        private String region;

        @NameInMap("RelatedAKProjectGuids")
        private String relatedAKProjectGuids;

        @NameInMap("RelatedAKProjectIds")
        private String relatedAKProjectIds;

        @NameInMap("RelatedUserIds")
        private String relatedUserIds;

        @NameInMap("RespondDuration")
        private Integer respondDuration;

        @NameInMap("Scope")
        private Integer scope;

        @NameInMap("ScopeUserIds")
        private String scopeUserIds;

        @NameInMap("SendWangwang")
        private Boolean sendWangwang;

        @NameInMap("SeriousLevel")
        private String seriousLevel;

        @NameInMap("SeriousLevelId")
        private Integer seriousLevelId;

        @NameInMap("SkipCollab")
        private Boolean skipCollab;

        @NameInMap("Solution")
        private Integer solution;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceId")
        private Integer sourceId;

        @NameInMap("SprintId")
        private Integer sprintId;

        @NameInMap("Stamp")
        private String stamp;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusId")
        private Integer statusId;

        @NameInMap("StatusStage")
        private Integer statusStage;

        @NameInMap("Subject")
        private String subject;

        @NameInMap("TagIdList")
        private String tagIdList;

        @NameInMap("TemplateId")
        private Integer templateId;

        @NameInMap("TestsuiteId")
        private Integer testsuiteId;

        @NameInMap("TrackerIds")
        private String trackerIds;

        @NameInMap("Trackers")
        private String trackers;

        @NameInMap("UpdatedAt")
        private Long updatedAt;

        @NameInMap("User")
        private String user;

        @NameInMap("UserId")
        private Integer userId;

        @NameInMap("UserStaffId")
        private String userStaffId;

        @NameInMap("Verifier")
        private String verifier;

        @NameInMap("VerifierId")
        private Integer verifierId;

        @NameInMap("VerifierStaffId")
        private String verifierStaffId;

        @NameInMap("VersionId")
        private Integer versionId;

        @NameInMap("VersionIds")
        private String versionIds;

        @NameInMap("VersionList")
        private String versionList;

        @NameInMap("Watched")
        private Boolean watched;

        @NameInMap("WatcherIdList")
        private String watcherIdList;

        private Data(Builder builder) {
            this.akPaths = builder.akPaths;
            this.akProjectId = builder.akProjectId;
            this.akVersionIds = builder.akVersionIds;
            this.assignedTo = builder.assignedTo;
            this.assignedToId = builder.assignedToId;
            this.assignedToIdList = builder.assignedToIdList;
            this.assignedToIds = builder.assignedToIds;
            this.assignedToStaffId = builder.assignedToStaffId;
            this.attachmentIds = builder.attachmentIds;
            this.attachmentList = builder.attachmentList;
            this.attachmented = builder.attachmented;
            this.blackListNotice = builder.blackListNotice;
            this.changeLogList = builder.changeLogList;
            this.closedDuration = builder.closedDuration;
            this.commentList = builder.commentList;
            this.commitDate = builder.commitDate;
            this.createdAt = builder.createdAt;
            this.devDuration = builder.devDuration;
            this.fixedDuration = builder.fixedDuration;
            this.fixedUserId = builder.fixedUserId;
            this.id = builder.id;
            this.idPath = builder.idPath;
            this.ignoreCheck = builder.ignoreCheck;
            this.ignoreIntegrate = builder.ignoreIntegrate;
            this.issueRelations = builder.issueRelations;
            this.issueTypeId = builder.issueTypeId;
            this.linePath = builder.linePath;
            this.logicalStatus = builder.logicalStatus;
            this.moduleIds = builder.moduleIds;
            this.moduleList = builder.moduleList;
            this.moduleUpdated = builder.moduleUpdated;
            this.parentId = builder.parentId;
            this.priority = builder.priority;
            this.priorityId = builder.priorityId;
            this.projectId = builder.projectId;
            this.projectIds = builder.projectIds;
            this.recordChangeLog = builder.recordChangeLog;
            this.region = builder.region;
            this.relatedAKProjectGuids = builder.relatedAKProjectGuids;
            this.relatedAKProjectIds = builder.relatedAKProjectIds;
            this.relatedUserIds = builder.relatedUserIds;
            this.respondDuration = builder.respondDuration;
            this.scope = builder.scope;
            this.scopeUserIds = builder.scopeUserIds;
            this.sendWangwang = builder.sendWangwang;
            this.seriousLevel = builder.seriousLevel;
            this.seriousLevelId = builder.seriousLevelId;
            this.skipCollab = builder.skipCollab;
            this.solution = builder.solution;
            this.source = builder.source;
            this.sourceId = builder.sourceId;
            this.sprintId = builder.sprintId;
            this.stamp = builder.stamp;
            this.status = builder.status;
            this.statusId = builder.statusId;
            this.statusStage = builder.statusStage;
            this.subject = builder.subject;
            this.tagIdList = builder.tagIdList;
            this.templateId = builder.templateId;
            this.testsuiteId = builder.testsuiteId;
            this.trackerIds = builder.trackerIds;
            this.trackers = builder.trackers;
            this.updatedAt = builder.updatedAt;
            this.user = builder.user;
            this.userId = builder.userId;
            this.userStaffId = builder.userStaffId;
            this.verifier = builder.verifier;
            this.verifierId = builder.verifierId;
            this.verifierStaffId = builder.verifierStaffId;
            this.versionId = builder.versionId;
            this.versionIds = builder.versionIds;
            this.versionList = builder.versionList;
            this.watched = builder.watched;
            this.watcherIdList = builder.watcherIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return akPaths
         */
        public String getAkPaths() {
            return this.akPaths;
        }

        /**
         * @return akProjectId
         */
        public Integer getAkProjectId() {
            return this.akProjectId;
        }

        /**
         * @return akVersionIds
         */
        public String getAkVersionIds() {
            return this.akVersionIds;
        }

        /**
         * @return assignedTo
         */
        public String getAssignedTo() {
            return this.assignedTo;
        }

        /**
         * @return assignedToId
         */
        public Integer getAssignedToId() {
            return this.assignedToId;
        }

        /**
         * @return assignedToIdList
         */
        public String getAssignedToIdList() {
            return this.assignedToIdList;
        }

        /**
         * @return assignedToIds
         */
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        /**
         * @return assignedToStaffId
         */
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        /**
         * @return attachmentIds
         */
        public String getAttachmentIds() {
            return this.attachmentIds;
        }

        /**
         * @return attachmentList
         */
        public String getAttachmentList() {
            return this.attachmentList;
        }

        /**
         * @return attachmented
         */
        public Boolean getAttachmented() {
            return this.attachmented;
        }

        /**
         * @return blackListNotice
         */
        public String getBlackListNotice() {
            return this.blackListNotice;
        }

        /**
         * @return changeLogList
         */
        public String getChangeLogList() {
            return this.changeLogList;
        }

        /**
         * @return closedDuration
         */
        public Integer getClosedDuration() {
            return this.closedDuration;
        }

        /**
         * @return commentList
         */
        public String getCommentList() {
            return this.commentList;
        }

        /**
         * @return commitDate
         */
        public Long getCommitDate() {
            return this.commitDate;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return devDuration
         */
        public Integer getDevDuration() {
            return this.devDuration;
        }

        /**
         * @return fixedDuration
         */
        public Integer getFixedDuration() {
            return this.fixedDuration;
        }

        /**
         * @return fixedUserId
         */
        public Integer getFixedUserId() {
            return this.fixedUserId;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return idPath
         */
        public String getIdPath() {
            return this.idPath;
        }

        /**
         * @return ignoreCheck
         */
        public Boolean getIgnoreCheck() {
            return this.ignoreCheck;
        }

        /**
         * @return ignoreIntegrate
         */
        public Boolean getIgnoreIntegrate() {
            return this.ignoreIntegrate;
        }

        /**
         * @return issueRelations
         */
        public String getIssueRelations() {
            return this.issueRelations;
        }

        /**
         * @return issueTypeId
         */
        public Integer getIssueTypeId() {
            return this.issueTypeId;
        }

        /**
         * @return linePath
         */
        public String getLinePath() {
            return this.linePath;
        }

        /**
         * @return logicalStatus
         */
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        /**
         * @return moduleIds
         */
        public String getModuleIds() {
            return this.moduleIds;
        }

        /**
         * @return moduleList
         */
        public String getModuleList() {
            return this.moduleList;
        }

        /**
         * @return moduleUpdated
         */
        public Boolean getModuleUpdated() {
            return this.moduleUpdated;
        }

        /**
         * @return parentId
         */
        public Integer getParentId() {
            return this.parentId;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return priorityId
         */
        public Integer getPriorityId() {
            return this.priorityId;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectIds
         */
        public String getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return recordChangeLog
         */
        public Boolean getRecordChangeLog() {
            return this.recordChangeLog;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return relatedAKProjectGuids
         */
        public String getRelatedAKProjectGuids() {
            return this.relatedAKProjectGuids;
        }

        /**
         * @return relatedAKProjectIds
         */
        public String getRelatedAKProjectIds() {
            return this.relatedAKProjectIds;
        }

        /**
         * @return relatedUserIds
         */
        public String getRelatedUserIds() {
            return this.relatedUserIds;
        }

        /**
         * @return respondDuration
         */
        public Integer getRespondDuration() {
            return this.respondDuration;
        }

        /**
         * @return scope
         */
        public Integer getScope() {
            return this.scope;
        }

        /**
         * @return scopeUserIds
         */
        public String getScopeUserIds() {
            return this.scopeUserIds;
        }

        /**
         * @return sendWangwang
         */
        public Boolean getSendWangwang() {
            return this.sendWangwang;
        }

        /**
         * @return seriousLevel
         */
        public String getSeriousLevel() {
            return this.seriousLevel;
        }

        /**
         * @return seriousLevelId
         */
        public Integer getSeriousLevelId() {
            return this.seriousLevelId;
        }

        /**
         * @return skipCollab
         */
        public Boolean getSkipCollab() {
            return this.skipCollab;
        }

        /**
         * @return solution
         */
        public Integer getSolution() {
            return this.solution;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceId
         */
        public Integer getSourceId() {
            return this.sourceId;
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
         * @return statusId
         */
        public Integer getStatusId() {
            return this.statusId;
        }

        /**
         * @return statusStage
         */
        public Integer getStatusStage() {
            return this.statusStage;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return tagIdList
         */
        public String getTagIdList() {
            return this.tagIdList;
        }

        /**
         * @return templateId
         */
        public Integer getTemplateId() {
            return this.templateId;
        }

        /**
         * @return testsuiteId
         */
        public Integer getTestsuiteId() {
            return this.testsuiteId;
        }

        /**
         * @return trackerIds
         */
        public String getTrackerIds() {
            return this.trackerIds;
        }

        /**
         * @return trackers
         */
        public String getTrackers() {
            return this.trackers;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        /**
         * @return userStaffId
         */
        public String getUserStaffId() {
            return this.userStaffId;
        }

        /**
         * @return verifier
         */
        public String getVerifier() {
            return this.verifier;
        }

        /**
         * @return verifierId
         */
        public Integer getVerifierId() {
            return this.verifierId;
        }

        /**
         * @return verifierStaffId
         */
        public String getVerifierStaffId() {
            return this.verifierStaffId;
        }

        /**
         * @return versionId
         */
        public Integer getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionIds
         */
        public String getVersionIds() {
            return this.versionIds;
        }

        /**
         * @return versionList
         */
        public String getVersionList() {
            return this.versionList;
        }

        /**
         * @return watched
         */
        public Boolean getWatched() {
            return this.watched;
        }

        /**
         * @return watcherIdList
         */
        public String getWatcherIdList() {
            return this.watcherIdList;
        }

        public static final class Builder {
            private String akPaths; 
            private Integer akProjectId; 
            private String akVersionIds; 
            private String assignedTo; 
            private Integer assignedToId; 
            private String assignedToIdList; 
            private String assignedToIds; 
            private String assignedToStaffId; 
            private String attachmentIds; 
            private String attachmentList; 
            private Boolean attachmented; 
            private String blackListNotice; 
            private String changeLogList; 
            private Integer closedDuration; 
            private String commentList; 
            private Long commitDate; 
            private Long createdAt; 
            private Integer devDuration; 
            private Integer fixedDuration; 
            private Integer fixedUserId; 
            private Integer id; 
            private String idPath; 
            private Boolean ignoreCheck; 
            private Boolean ignoreIntegrate; 
            private String issueRelations; 
            private Integer issueTypeId; 
            private String linePath; 
            private String logicalStatus; 
            private String moduleIds; 
            private String moduleList; 
            private Boolean moduleUpdated; 
            private Integer parentId; 
            private String priority; 
            private Integer priorityId; 
            private Integer projectId; 
            private String projectIds; 
            private Boolean recordChangeLog; 
            private String region; 
            private String relatedAKProjectGuids; 
            private String relatedAKProjectIds; 
            private String relatedUserIds; 
            private Integer respondDuration; 
            private Integer scope; 
            private String scopeUserIds; 
            private Boolean sendWangwang; 
            private String seriousLevel; 
            private Integer seriousLevelId; 
            private Boolean skipCollab; 
            private Integer solution; 
            private String source; 
            private Integer sourceId; 
            private Integer sprintId; 
            private String stamp; 
            private String status; 
            private Integer statusId; 
            private Integer statusStage; 
            private String subject; 
            private String tagIdList; 
            private Integer templateId; 
            private Integer testsuiteId; 
            private String trackerIds; 
            private String trackers; 
            private Long updatedAt; 
            private String user; 
            private Integer userId; 
            private String userStaffId; 
            private String verifier; 
            private Integer verifierId; 
            private String verifierStaffId; 
            private Integer versionId; 
            private String versionIds; 
            private String versionList; 
            private Boolean watched; 
            private String watcherIdList; 

            /**
             * AkPaths.
             */
            public Builder akPaths(String akPaths) {
                this.akPaths = akPaths;
                return this;
            }

            /**
             * AkProjectId.
             */
            public Builder akProjectId(Integer akProjectId) {
                this.akProjectId = akProjectId;
                return this;
            }

            /**
             * AkVersionIds.
             */
            public Builder akVersionIds(String akVersionIds) {
                this.akVersionIds = akVersionIds;
                return this;
            }

            /**
             * AssignedTo.
             */
            public Builder assignedTo(String assignedTo) {
                this.assignedTo = assignedTo;
                return this;
            }

            /**
             * AssignedToId.
             */
            public Builder assignedToId(Integer assignedToId) {
                this.assignedToId = assignedToId;
                return this;
            }

            /**
             * AssignedToIdList.
             */
            public Builder assignedToIdList(String assignedToIdList) {
                this.assignedToIdList = assignedToIdList;
                return this;
            }

            /**
             * AssignedToIds.
             */
            public Builder assignedToIds(String assignedToIds) {
                this.assignedToIds = assignedToIds;
                return this;
            }

            /**
             * AssignedToStaffId.
             */
            public Builder assignedToStaffId(String assignedToStaffId) {
                this.assignedToStaffId = assignedToStaffId;
                return this;
            }

            /**
             * AttachmentIds.
             */
            public Builder attachmentIds(String attachmentIds) {
                this.attachmentIds = attachmentIds;
                return this;
            }

            /**
             * AttachmentList.
             */
            public Builder attachmentList(String attachmentList) {
                this.attachmentList = attachmentList;
                return this;
            }

            /**
             * Attachmented.
             */
            public Builder attachmented(Boolean attachmented) {
                this.attachmented = attachmented;
                return this;
            }

            /**
             * BlackListNotice.
             */
            public Builder blackListNotice(String blackListNotice) {
                this.blackListNotice = blackListNotice;
                return this;
            }

            /**
             * ChangeLogList.
             */
            public Builder changeLogList(String changeLogList) {
                this.changeLogList = changeLogList;
                return this;
            }

            /**
             * ClosedDuration.
             */
            public Builder closedDuration(Integer closedDuration) {
                this.closedDuration = closedDuration;
                return this;
            }

            /**
             * CommentList.
             */
            public Builder commentList(String commentList) {
                this.commentList = commentList;
                return this;
            }

            /**
             * CommitDate.
             */
            public Builder commitDate(Long commitDate) {
                this.commitDate = commitDate;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DevDuration.
             */
            public Builder devDuration(Integer devDuration) {
                this.devDuration = devDuration;
                return this;
            }

            /**
             * FixedDuration.
             */
            public Builder fixedDuration(Integer fixedDuration) {
                this.fixedDuration = fixedDuration;
                return this;
            }

            /**
             * FixedUserId.
             */
            public Builder fixedUserId(Integer fixedUserId) {
                this.fixedUserId = fixedUserId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IdPath.
             */
            public Builder idPath(String idPath) {
                this.idPath = idPath;
                return this;
            }

            /**
             * IgnoreCheck.
             */
            public Builder ignoreCheck(Boolean ignoreCheck) {
                this.ignoreCheck = ignoreCheck;
                return this;
            }

            /**
             * IgnoreIntegrate.
             */
            public Builder ignoreIntegrate(Boolean ignoreIntegrate) {
                this.ignoreIntegrate = ignoreIntegrate;
                return this;
            }

            /**
             * IssueRelations.
             */
            public Builder issueRelations(String issueRelations) {
                this.issueRelations = issueRelations;
                return this;
            }

            /**
             * IssueTypeId.
             */
            public Builder issueTypeId(Integer issueTypeId) {
                this.issueTypeId = issueTypeId;
                return this;
            }

            /**
             * LinePath.
             */
            public Builder linePath(String linePath) {
                this.linePath = linePath;
                return this;
            }

            /**
             * LogicalStatus.
             */
            public Builder logicalStatus(String logicalStatus) {
                this.logicalStatus = logicalStatus;
                return this;
            }

            /**
             * ModuleIds.
             */
            public Builder moduleIds(String moduleIds) {
                this.moduleIds = moduleIds;
                return this;
            }

            /**
             * ModuleList.
             */
            public Builder moduleList(String moduleList) {
                this.moduleList = moduleList;
                return this;
            }

            /**
             * ModuleUpdated.
             */
            public Builder moduleUpdated(Boolean moduleUpdated) {
                this.moduleUpdated = moduleUpdated;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Integer parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * PriorityId.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectIds.
             */
            public Builder projectIds(String projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * RecordChangeLog.
             */
            public Builder recordChangeLog(Boolean recordChangeLog) {
                this.recordChangeLog = recordChangeLog;
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
             * RelatedAKProjectGuids.
             */
            public Builder relatedAKProjectGuids(String relatedAKProjectGuids) {
                this.relatedAKProjectGuids = relatedAKProjectGuids;
                return this;
            }

            /**
             * RelatedAKProjectIds.
             */
            public Builder relatedAKProjectIds(String relatedAKProjectIds) {
                this.relatedAKProjectIds = relatedAKProjectIds;
                return this;
            }

            /**
             * RelatedUserIds.
             */
            public Builder relatedUserIds(String relatedUserIds) {
                this.relatedUserIds = relatedUserIds;
                return this;
            }

            /**
             * RespondDuration.
             */
            public Builder respondDuration(Integer respondDuration) {
                this.respondDuration = respondDuration;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(Integer scope) {
                this.scope = scope;
                return this;
            }

            /**
             * ScopeUserIds.
             */
            public Builder scopeUserIds(String scopeUserIds) {
                this.scopeUserIds = scopeUserIds;
                return this;
            }

            /**
             * SendWangwang.
             */
            public Builder sendWangwang(Boolean sendWangwang) {
                this.sendWangwang = sendWangwang;
                return this;
            }

            /**
             * SeriousLevel.
             */
            public Builder seriousLevel(String seriousLevel) {
                this.seriousLevel = seriousLevel;
                return this;
            }

            /**
             * SeriousLevelId.
             */
            public Builder seriousLevelId(Integer seriousLevelId) {
                this.seriousLevelId = seriousLevelId;
                return this;
            }

            /**
             * SkipCollab.
             */
            public Builder skipCollab(Boolean skipCollab) {
                this.skipCollab = skipCollab;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(Integer solution) {
                this.solution = solution;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(Integer sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SprintId.
             */
            public Builder sprintId(Integer sprintId) {
                this.sprintId = sprintId;
                return this;
            }

            /**
             * Stamp.
             */
            public Builder stamp(String stamp) {
                this.stamp = stamp;
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
             * StatusId.
             */
            public Builder statusId(Integer statusId) {
                this.statusId = statusId;
                return this;
            }

            /**
             * StatusStage.
             */
            public Builder statusStage(Integer statusStage) {
                this.statusStage = statusStage;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * TagIdList.
             */
            public Builder tagIdList(String tagIdList) {
                this.tagIdList = tagIdList;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TestsuiteId.
             */
            public Builder testsuiteId(Integer testsuiteId) {
                this.testsuiteId = testsuiteId;
                return this;
            }

            /**
             * TrackerIds.
             */
            public Builder trackerIds(String trackerIds) {
                this.trackerIds = trackerIds;
                return this;
            }

            /**
             * Trackers.
             */
            public Builder trackers(String trackers) {
                this.trackers = trackers;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserStaffId.
             */
            public Builder userStaffId(String userStaffId) {
                this.userStaffId = userStaffId;
                return this;
            }

            /**
             * Verifier.
             */
            public Builder verifier(String verifier) {
                this.verifier = verifier;
                return this;
            }

            /**
             * VerifierId.
             */
            public Builder verifierId(Integer verifierId) {
                this.verifierId = verifierId;
                return this;
            }

            /**
             * VerifierStaffId.
             */
            public Builder verifierStaffId(String verifierStaffId) {
                this.verifierStaffId = verifierStaffId;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Integer versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionIds.
             */
            public Builder versionIds(String versionIds) {
                this.versionIds = versionIds;
                return this;
            }

            /**
             * VersionList.
             */
            public Builder versionList(String versionList) {
                this.versionList = versionList;
                return this;
            }

            /**
             * Watched.
             */
            public Builder watched(Boolean watched) {
                this.watched = watched;
                return this;
            }

            /**
             * WatcherIdList.
             */
            public Builder watcherIdList(String watcherIdList) {
                this.watcherIdList = watcherIdList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
