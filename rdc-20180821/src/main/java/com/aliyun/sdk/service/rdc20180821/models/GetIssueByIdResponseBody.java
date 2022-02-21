// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIssueByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetIssueByIdResponseBody</p>
 */
public class GetIssueByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetIssueByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIssueByIdResponseBody create() {
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
    public Data getData() {
        return this.data;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String requestId; 
        private String success; 

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
        public Builder data(Data data) {
            this.data = data;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetIssueByIdResponseBody build() {
            return new GetIssueByIdResponseBody(this);
        } 

    } 

    public static class CfsList extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private CfsList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CfsList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 
            private String value; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CfsList build() {
                return new CfsList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AkProjectId")
        private Integer akProjectId;

        @NameInMap("AssignedTo")
        private String assignedTo;

        @NameInMap("AssignedToId")
        private Integer assignedToId;

        @NameInMap("AssignedToIdList")
        private String assignedToIdList;

        @NameInMap("AssignedToIds")
        private String assignedToIds;

        @NameInMap("AssignedToMaps")
        private String assignedToMaps;

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

        @NameInMap("CfsList")
        private java.util.List < CfsList> cfsList;

        @NameInMap("ChangeLogList")
        private String changeLogList;

        @NameInMap("CommentList")
        private String commentList;

        @NameInMap("CommitDate")
        private Long commitDate;

        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("Description")
        private String description;

        @NameInMap("Guid")
        private String guid;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IdPath")
        private String idPath;

        @NameInMap("IgnoreCheck")
        private Boolean ignoreCheck;

        @NameInMap("IgnoreIntegrate")
        private Boolean ignoreIntegrate;

        @NameInMap("IssueTypeId")
        private Integer issueTypeId;

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

        @NameInMap("ProjectIds")
        private String projectIds;

        @NameInMap("RecordChangeLog")
        private Boolean recordChangeLog;

        @NameInMap("RegionId")
        private Integer regionId;

        @NameInMap("RelatedAKProjectGuids")
        private String relatedAKProjectGuids;

        @NameInMap("RelatedAKProjectIds")
        private String relatedAKProjectIds;

        @NameInMap("RelatedUserIds")
        private String relatedUserIds;

        @NameInMap("SendWangwang")
        private Boolean sendWangwang;

        @NameInMap("SeriousLevel")
        private String seriousLevel;

        @NameInMap("SeriousLevelId")
        private Integer seriousLevelId;

        @NameInMap("SkipCollab")
        private Boolean skipCollab;

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

        @NameInMap("TrackerIds")
        private String trackerIds;

        @NameInMap("Trackers")
        private String trackers;

        @NameInMap("UpdateStatusAt")
        private Long updateStatusAt;

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

        @NameInMap("VersionIds")
        private String versionIds;

        @NameInMap("VersionList")
        private String versionList;

        @NameInMap("Watched")
        private Boolean watched;

        private Data(Builder builder) {
            this.akProjectId = builder.akProjectId;
            this.assignedTo = builder.assignedTo;
            this.assignedToId = builder.assignedToId;
            this.assignedToIdList = builder.assignedToIdList;
            this.assignedToIds = builder.assignedToIds;
            this.assignedToMaps = builder.assignedToMaps;
            this.assignedToStaffId = builder.assignedToStaffId;
            this.attachmentIds = builder.attachmentIds;
            this.attachmentList = builder.attachmentList;
            this.attachmented = builder.attachmented;
            this.blackListNotice = builder.blackListNotice;
            this.cfsList = builder.cfsList;
            this.changeLogList = builder.changeLogList;
            this.commentList = builder.commentList;
            this.commitDate = builder.commitDate;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.guid = builder.guid;
            this.id = builder.id;
            this.idPath = builder.idPath;
            this.ignoreCheck = builder.ignoreCheck;
            this.ignoreIntegrate = builder.ignoreIntegrate;
            this.issueTypeId = builder.issueTypeId;
            this.logicalStatus = builder.logicalStatus;
            this.moduleIds = builder.moduleIds;
            this.moduleList = builder.moduleList;
            this.moduleUpdated = builder.moduleUpdated;
            this.parentId = builder.parentId;
            this.priority = builder.priority;
            this.priorityId = builder.priorityId;
            this.projectIds = builder.projectIds;
            this.recordChangeLog = builder.recordChangeLog;
            this.regionId = builder.regionId;
            this.relatedAKProjectGuids = builder.relatedAKProjectGuids;
            this.relatedAKProjectIds = builder.relatedAKProjectIds;
            this.relatedUserIds = builder.relatedUserIds;
            this.sendWangwang = builder.sendWangwang;
            this.seriousLevel = builder.seriousLevel;
            this.seriousLevelId = builder.seriousLevelId;
            this.skipCollab = builder.skipCollab;
            this.stamp = builder.stamp;
            this.status = builder.status;
            this.statusId = builder.statusId;
            this.statusStage = builder.statusStage;
            this.subject = builder.subject;
            this.tagIdList = builder.tagIdList;
            this.templateId = builder.templateId;
            this.trackerIds = builder.trackerIds;
            this.trackers = builder.trackers;
            this.updateStatusAt = builder.updateStatusAt;
            this.updatedAt = builder.updatedAt;
            this.user = builder.user;
            this.userId = builder.userId;
            this.userStaffId = builder.userStaffId;
            this.verifier = builder.verifier;
            this.verifierId = builder.verifierId;
            this.verifierStaffId = builder.verifierStaffId;
            this.versionIds = builder.versionIds;
            this.versionList = builder.versionList;
            this.watched = builder.watched;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return akProjectId
         */
        public Integer getAkProjectId() {
            return this.akProjectId;
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
         * @return assignedToMaps
         */
        public String getAssignedToMaps() {
            return this.assignedToMaps;
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
         * @return cfsList
         */
        public java.util.List < CfsList> getCfsList() {
            return this.cfsList;
        }

        /**
         * @return changeLogList
         */
        public String getChangeLogList() {
            return this.changeLogList;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
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
         * @return issueTypeId
         */
        public Integer getIssueTypeId() {
            return this.issueTypeId;
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
         * @return regionId
         */
        public Integer getRegionId() {
            return this.regionId;
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
         * @return updateStatusAt
         */
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
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

        public static final class Builder {
            private Integer akProjectId; 
            private String assignedTo; 
            private Integer assignedToId; 
            private String assignedToIdList; 
            private String assignedToIds; 
            private String assignedToMaps; 
            private String assignedToStaffId; 
            private String attachmentIds; 
            private String attachmentList; 
            private Boolean attachmented; 
            private String blackListNotice; 
            private java.util.List < CfsList> cfsList; 
            private String changeLogList; 
            private String commentList; 
            private Long commitDate; 
            private Long createdAt; 
            private String description; 
            private String guid; 
            private Integer id; 
            private String idPath; 
            private Boolean ignoreCheck; 
            private Boolean ignoreIntegrate; 
            private Integer issueTypeId; 
            private String logicalStatus; 
            private String moduleIds; 
            private String moduleList; 
            private Boolean moduleUpdated; 
            private Integer parentId; 
            private String priority; 
            private Integer priorityId; 
            private String projectIds; 
            private Boolean recordChangeLog; 
            private Integer regionId; 
            private String relatedAKProjectGuids; 
            private String relatedAKProjectIds; 
            private String relatedUserIds; 
            private Boolean sendWangwang; 
            private String seriousLevel; 
            private Integer seriousLevelId; 
            private Boolean skipCollab; 
            private String stamp; 
            private String status; 
            private Integer statusId; 
            private Integer statusStage; 
            private String subject; 
            private String tagIdList; 
            private Integer templateId; 
            private String trackerIds; 
            private String trackers; 
            private Long updateStatusAt; 
            private Long updatedAt; 
            private String user; 
            private Integer userId; 
            private String userStaffId; 
            private String verifier; 
            private Integer verifierId; 
            private String verifierStaffId; 
            private String versionIds; 
            private String versionList; 
            private Boolean watched; 

            /**
             * AkProjectId.
             */
            public Builder akProjectId(Integer akProjectId) {
                this.akProjectId = akProjectId;
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
             * AssignedToMaps.
             */
            public Builder assignedToMaps(String assignedToMaps) {
                this.assignedToMaps = assignedToMaps;
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
             * CfsList.
             */
            public Builder cfsList(java.util.List < CfsList> cfsList) {
                this.cfsList = cfsList;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
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
             * IssueTypeId.
             */
            public Builder issueTypeId(Integer issueTypeId) {
                this.issueTypeId = issueTypeId;
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
             * RegionId.
             */
            public Builder regionId(Integer regionId) {
                this.regionId = regionId;
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
             * UpdateStatusAt.
             */
            public Builder updateStatusAt(Long updateStatusAt) {
                this.updateStatusAt = updateStatusAt;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
