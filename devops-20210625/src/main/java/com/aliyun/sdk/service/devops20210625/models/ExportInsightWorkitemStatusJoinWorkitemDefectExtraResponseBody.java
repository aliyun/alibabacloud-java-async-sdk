// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody} extends {@link TeaModel}
 *
 * <p>ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody</p>
 */
public class ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < Result> result; 
        private Long totalCount; 

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody build() {
            return new ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedToId")
        private String assignedToId;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("expectedWorkTime")
        private Long expectedWorkTime;

        @com.aliyun.core.annotation.NameInMap("extraId")
        private Long extraId;

        @com.aliyun.core.annotation.NameInMap("extraIsDeleted")
        private String extraIsDeleted;

        @com.aliyun.core.annotation.NameInMap("foundPhase")
        private Integer foundPhase;

        @com.aliyun.core.annotation.NameInMap("gmtClosed")
        private Long gmtClosed;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtDue")
        private Long gmtDue;

        @com.aliyun.core.annotation.NameInMap("gmtFixed")
        private String gmtFixed;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private Long gmtStart;

        @com.aliyun.core.annotation.NameInMap("gmtTodo")
        private Long gmtTodo;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isArchived")
        private String isArchived;

        @com.aliyun.core.annotation.NameInMap("isDeleted")
        private String isDeleted;

        @com.aliyun.core.annotation.NameInMap("isDone")
        private String isDone;

        @com.aliyun.core.annotation.NameInMap("isStupid")
        private String isStupid;

        @com.aliyun.core.annotation.NameInMap("organizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("parentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("participantIds")
        private String participantIds;

        @com.aliyun.core.annotation.NameInMap("phase")
        private Integer phase;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("productId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("reopenNum")
        private Integer reopenNum;

        @com.aliyun.core.annotation.NameInMap("serialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("seriousLevel")
        private Integer seriousLevel;

        @com.aliyun.core.annotation.NameInMap("solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sprintId")
        private String sprintId;

        @com.aliyun.core.annotation.NameInMap("stage")
        private Integer stage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusId")
        private String statusId;

        @com.aliyun.core.annotation.NameInMap("storyPoint")
        private Float storyPoint;

        @com.aliyun.core.annotation.NameInMap("subType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("verifierId")
        private String verifierId;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private String versionId;

        @com.aliyun.core.annotation.NameInMap("versions")
        private String versions;

        @com.aliyun.core.annotation.NameInMap("workTime")
        private Long workTime;

        @com.aliyun.core.annotation.NameInMap("workitemId")
        private String workitemId;

        private Result(Builder builder) {
            this.assignedToId = builder.assignedToId;
            this.creatorId = builder.creatorId;
            this.expectedWorkTime = builder.expectedWorkTime;
            this.extraId = builder.extraId;
            this.extraIsDeleted = builder.extraIsDeleted;
            this.foundPhase = builder.foundPhase;
            this.gmtClosed = builder.gmtClosed;
            this.gmtCreate = builder.gmtCreate;
            this.gmtDue = builder.gmtDue;
            this.gmtFixed = builder.gmtFixed;
            this.gmtModified = builder.gmtModified;
            this.gmtStart = builder.gmtStart;
            this.gmtTodo = builder.gmtTodo;
            this.id = builder.id;
            this.isArchived = builder.isArchived;
            this.isDeleted = builder.isDeleted;
            this.isDone = builder.isDone;
            this.isStupid = builder.isStupid;
            this.organizationId = builder.organizationId;
            this.parentId = builder.parentId;
            this.participantIds = builder.participantIds;
            this.phase = builder.phase;
            this.priority = builder.priority;
            this.productId = builder.productId;
            this.projectId = builder.projectId;
            this.reopenNum = builder.reopenNum;
            this.serialNumber = builder.serialNumber;
            this.seriousLevel = builder.seriousLevel;
            this.solution = builder.solution;
            this.source = builder.source;
            this.sprintId = builder.sprintId;
            this.stage = builder.stage;
            this.status = builder.status;
            this.statusId = builder.statusId;
            this.storyPoint = builder.storyPoint;
            this.subType = builder.subType;
            this.subject = builder.subject;
            this.type = builder.type;
            this.verifierId = builder.verifierId;
            this.versionId = builder.versionId;
            this.versions = builder.versions;
            this.workTime = builder.workTime;
            this.workitemId = builder.workitemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return assignedToId
         */
        public String getAssignedToId() {
            return this.assignedToId;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return expectedWorkTime
         */
        public Long getExpectedWorkTime() {
            return this.expectedWorkTime;
        }

        /**
         * @return extraId
         */
        public Long getExtraId() {
            return this.extraId;
        }

        /**
         * @return extraIsDeleted
         */
        public String getExtraIsDeleted() {
            return this.extraIsDeleted;
        }

        /**
         * @return foundPhase
         */
        public Integer getFoundPhase() {
            return this.foundPhase;
        }

        /**
         * @return gmtClosed
         */
        public Long getGmtClosed() {
            return this.gmtClosed;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtDue
         */
        public Long getGmtDue() {
            return this.gmtDue;
        }

        /**
         * @return gmtFixed
         */
        public String getGmtFixed() {
            return this.gmtFixed;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtStart
         */
        public Long getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return gmtTodo
         */
        public Long getGmtTodo() {
            return this.gmtTodo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isArchived
         */
        public String getIsArchived() {
            return this.isArchived;
        }

        /**
         * @return isDeleted
         */
        public String getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return isDone
         */
        public String getIsDone() {
            return this.isDone;
        }

        /**
         * @return isStupid
         */
        public String getIsStupid() {
            return this.isStupid;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return participantIds
         */
        public String getParticipantIds() {
            return this.participantIds;
        }

        /**
         * @return phase
         */
        public Integer getPhase() {
            return this.phase;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return reopenNum
         */
        public Integer getReopenNum() {
            return this.reopenNum;
        }

        /**
         * @return serialNumber
         */
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return seriousLevel
         */
        public Integer getSeriousLevel() {
            return this.seriousLevel;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sprintId
         */
        public String getSprintId() {
            return this.sprintId;
        }

        /**
         * @return stage
         */
        public Integer getStage() {
            return this.stage;
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
        public String getStatusId() {
            return this.statusId;
        }

        /**
         * @return storyPoint
         */
        public Float getStoryPoint() {
            return this.storyPoint;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return verifierId
         */
        public String getVerifierId() {
            return this.verifierId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        /**
         * @return versions
         */
        public String getVersions() {
            return this.versions;
        }

        /**
         * @return workTime
         */
        public Long getWorkTime() {
            return this.workTime;
        }

        /**
         * @return workitemId
         */
        public String getWorkitemId() {
            return this.workitemId;
        }

        public static final class Builder {
            private String assignedToId; 
            private String creatorId; 
            private Long expectedWorkTime; 
            private Long extraId; 
            private String extraIsDeleted; 
            private Integer foundPhase; 
            private Long gmtClosed; 
            private Long gmtCreate; 
            private Long gmtDue; 
            private String gmtFixed; 
            private Long gmtModified; 
            private Long gmtStart; 
            private Long gmtTodo; 
            private Long id; 
            private String isArchived; 
            private String isDeleted; 
            private String isDone; 
            private String isStupid; 
            private String organizationId; 
            private String parentId; 
            private String participantIds; 
            private Integer phase; 
            private Integer priority; 
            private String productId; 
            private String projectId; 
            private Integer reopenNum; 
            private Integer serialNumber; 
            private Integer seriousLevel; 
            private String solution; 
            private String source; 
            private String sprintId; 
            private Integer stage; 
            private String status; 
            private String statusId; 
            private Float storyPoint; 
            private String subType; 
            private String subject; 
            private Integer type; 
            private String verifierId; 
            private String versionId; 
            private String versions; 
            private Long workTime; 
            private String workitemId; 

            /**
             * assignedToId.
             */
            public Builder assignedToId(String assignedToId) {
                this.assignedToId = assignedToId;
                return this;
            }

            /**
             * creatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * expectedWorkTime.
             */
            public Builder expectedWorkTime(Long expectedWorkTime) {
                this.expectedWorkTime = expectedWorkTime;
                return this;
            }

            /**
             * extraId.
             */
            public Builder extraId(Long extraId) {
                this.extraId = extraId;
                return this;
            }

            /**
             * extraIsDeleted.
             */
            public Builder extraIsDeleted(String extraIsDeleted) {
                this.extraIsDeleted = extraIsDeleted;
                return this;
            }

            /**
             * foundPhase.
             */
            public Builder foundPhase(Integer foundPhase) {
                this.foundPhase = foundPhase;
                return this;
            }

            /**
             * gmtClosed.
             */
            public Builder gmtClosed(Long gmtClosed) {
                this.gmtClosed = gmtClosed;
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
             * gmtDue.
             */
            public Builder gmtDue(Long gmtDue) {
                this.gmtDue = gmtDue;
                return this;
            }

            /**
             * gmtFixed.
             */
            public Builder gmtFixed(String gmtFixed) {
                this.gmtFixed = gmtFixed;
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
             * gmtStart.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * gmtTodo.
             */
            public Builder gmtTodo(Long gmtTodo) {
                this.gmtTodo = gmtTodo;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * isArchived.
             */
            public Builder isArchived(String isArchived) {
                this.isArchived = isArchived;
                return this;
            }

            /**
             * isDeleted.
             */
            public Builder isDeleted(String isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * isDone.
             */
            public Builder isDone(String isDone) {
                this.isDone = isDone;
                return this;
            }

            /**
             * isStupid.
             */
            public Builder isStupid(String isStupid) {
                this.isStupid = isStupid;
                return this;
            }

            /**
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * parentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * participantIds.
             */
            public Builder participantIds(String participantIds) {
                this.participantIds = participantIds;
                return this;
            }

            /**
             * phase.
             */
            public Builder phase(Integer phase) {
                this.phase = phase;
                return this;
            }

            /**
             * priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * productId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * reopenNum.
             */
            public Builder reopenNum(Integer reopenNum) {
                this.reopenNum = reopenNum;
                return this;
            }

            /**
             * serialNumber.
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * seriousLevel.
             */
            public Builder seriousLevel(Integer seriousLevel) {
                this.seriousLevel = seriousLevel;
                return this;
            }

            /**
             * solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sprintId.
             */
            public Builder sprintId(String sprintId) {
                this.sprintId = sprintId;
                return this;
            }

            /**
             * stage.
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
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
             * statusId.
             */
            public Builder statusId(String statusId) {
                this.statusId = statusId;
                return this;
            }

            /**
             * storyPoint.
             */
            public Builder storyPoint(Float storyPoint) {
                this.storyPoint = storyPoint;
                return this;
            }

            /**
             * subType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
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
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * verifierId.
             */
            public Builder verifierId(String verifierId) {
                this.verifierId = verifierId;
                return this;
            }

            /**
             * versionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * versions.
             */
            public Builder versions(String versions) {
                this.versions = versions;
                return this;
            }

            /**
             * workTime.
             */
            public Builder workTime(Long workTime) {
                this.workTime = workTime;
                return this;
            }

            /**
             * workitemId.
             */
            public Builder workitemId(String workitemId) {
                this.workitemId = workitemId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
