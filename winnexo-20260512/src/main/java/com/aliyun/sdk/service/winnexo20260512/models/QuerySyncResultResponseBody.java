// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link QuerySyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySyncResultResponseBody</p>
 */
public class QuerySyncResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("completedAt")
    private String completedAt;

    @com.aliyun.core.annotation.NameInMap("corpId")
    private String corpId;

    @com.aliyun.core.annotation.NameInMap("deptStats")
    private DeptStats deptStats;

    @com.aliyun.core.annotation.NameInMap("durationSeconds")
    private Long durationSeconds;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("memberStats")
    private MemberStats memberStats;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("platformType")
    private String platformType;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("submittedAt")
    private String submittedAt;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private QuerySyncResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.completedAt = builder.completedAt;
        this.corpId = builder.corpId;
        this.deptStats = builder.deptStats;
        this.durationSeconds = builder.durationSeconds;
        this.errorMessage = builder.errorMessage;
        this.memberStats = builder.memberStats;
        this.message = builder.message;
        this.platformType = builder.platformType;
        this.requestId = builder.requestId;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.submittedAt = builder.submittedAt;
        this.summary = builder.summary;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySyncResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return completedAt
     */
    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deptStats
     */
    public DeptStats getDeptStats() {
        return this.deptStats;
    }

    /**
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return memberStats
     */
    public MemberStats getMemberStats() {
        return this.memberStats;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return submittedAt
     */
    public String getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private String completedAt; 
        private String corpId; 
        private DeptStats deptStats; 
        private Long durationSeconds; 
        private String errorMessage; 
        private MemberStats memberStats; 
        private String message; 
        private String platformType; 
        private String requestId; 
        private String startedAt; 
        private String status; 
        private String submittedAt; 
        private String summary; 
        private Long taskId; 

        private Builder() {
        } 

        private Builder(QuerySyncResultResponseBody model) {
            this.code = model.code;
            this.completedAt = model.completedAt;
            this.corpId = model.corpId;
            this.deptStats = model.deptStats;
            this.durationSeconds = model.durationSeconds;
            this.errorMessage = model.errorMessage;
            this.memberStats = model.memberStats;
            this.message = model.message;
            this.platformType = model.platformType;
            this.requestId = model.requestId;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.submittedAt = model.submittedAt;
            this.summary = model.summary;
            this.taskId = model.taskId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>任务完成时间（ISO 8601）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>企业标识</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCorpId</p>
         */
        public Builder corpId(String corpId) {
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>部门同步统计（完成时有值）</p>
         */
        public Builder deptStats(DeptStats deptStats) {
            this.deptStats = deptStats;
            return this;
        }

        /**
         * <p>执行时长（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * <p>错误信息（失败时有值）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>成员同步统计（syncMembers=true 且完成时有值）</p>
         */
        public Builder memberStats(MemberStats memberStats) {
            this.memberStats = memberStats;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>平台类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder platformType(String platformType) {
            this.platformType = platformType;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>任务开始执行时间（ISO 8601）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>任务状态: PENDING / RUNNING / COMPLETED / FAILED / TIMEOUT / CANCELED</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>任务提交时间（ISO 8601）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder submittedAt(String submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }

        /**
         * <p>执行摘要（人可读）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>任务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public QuerySyncResultResponseBody build() {
            return new QuerySyncResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySyncResultResponseBody</p>
     */
    public static class DeptStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("deleted")
        private Long deleted;

        @com.aliyun.core.annotation.NameInMap("moved")
        private Long moved;

        @com.aliyun.core.annotation.NameInMap("renamed")
        private Long renamed;

        @com.aliyun.core.annotation.NameInMap("skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("totalExternal")
        private Long totalExternal;

        private DeptStats(Builder builder) {
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.moved = builder.moved;
            this.renamed = builder.renamed;
            this.skipped = builder.skipped;
            this.totalExternal = builder.totalExternal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeptStats create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public Long getDeleted() {
            return this.deleted;
        }

        /**
         * @return moved
         */
        public Long getMoved() {
            return this.moved;
        }

        /**
         * @return renamed
         */
        public Long getRenamed() {
            return this.renamed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return totalExternal
         */
        public Long getTotalExternal() {
            return this.totalExternal;
        }

        public static final class Builder {
            private Long created; 
            private Long deleted; 
            private Long moved; 
            private Long renamed; 
            private Long skipped; 
            private Long totalExternal; 

            private Builder() {
            } 

            private Builder(DeptStats model) {
                this.created = model.created;
                this.deleted = model.deleted;
                this.moved = model.moved;
                this.renamed = model.renamed;
                this.skipped = model.skipped;
                this.totalExternal = model.totalExternal;
            } 

            /**
             * <p>新增的用户组数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>标记删除的用户组数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deleted(Long deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>移动的用户组数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder moved(Long moved) {
                this.moved = moved;
                return this;
            }

            /**
             * <p>更名的用户组数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renamed(Long renamed) {
                this.renamed = renamed;
                return this;
            }

            /**
             * <p>跳过的用户组数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>外部部门总数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalExternal(Long totalExternal) {
                this.totalExternal = totalExternal;
                return this;
            }

            public DeptStats build() {
                return new DeptStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySyncResultResponseBody</p>
     */
    public static class MemberStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("relationshipAdded")
        private Long relationshipAdded;

        @com.aliyun.core.annotation.NameInMap("relationshipRemoved")
        private Long relationshipRemoved;

        @com.aliyun.core.annotation.NameInMap("totalExternal")
        private Long totalExternal;

        @com.aliyun.core.annotation.NameInMap("unchanged")
        private Long unchanged;

        private MemberStats(Builder builder) {
            this.failed = builder.failed;
            this.relationshipAdded = builder.relationshipAdded;
            this.relationshipRemoved = builder.relationshipRemoved;
            this.totalExternal = builder.totalExternal;
            this.unchanged = builder.unchanged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberStats create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return relationshipAdded
         */
        public Long getRelationshipAdded() {
            return this.relationshipAdded;
        }

        /**
         * @return relationshipRemoved
         */
        public Long getRelationshipRemoved() {
            return this.relationshipRemoved;
        }

        /**
         * @return totalExternal
         */
        public Long getTotalExternal() {
            return this.totalExternal;
        }

        /**
         * @return unchanged
         */
        public Long getUnchanged() {
            return this.unchanged;
        }

        public static final class Builder {
            private Long failed; 
            private Long relationshipAdded; 
            private Long relationshipRemoved; 
            private Long totalExternal; 
            private Long unchanged; 

            private Builder() {
            } 

            private Builder(MemberStats model) {
                this.failed = model.failed;
                this.relationshipAdded = model.relationshipAdded;
                this.relationshipRemoved = model.relationshipRemoved;
                this.totalExternal = model.totalExternal;
                this.unchanged = model.unchanged;
            } 

            /**
             * <p>失败的成员数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>新增的成员关系数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder relationshipAdded(Long relationshipAdded) {
                this.relationshipAdded = relationshipAdded;
                return this;
            }

            /**
             * <p>移除的成员关系数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder relationshipRemoved(Long relationshipRemoved) {
                this.relationshipRemoved = relationshipRemoved;
                return this;
            }

            /**
             * <p>外部成员总数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalExternal(Long totalExternal) {
                this.totalExternal = totalExternal;
                return this;
            }

            /**
             * <p>未变更的成员关系数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unchanged(Long unchanged) {
                this.unchanged = unchanged;
                return this;
            }

            public MemberStats build() {
                return new MemberStats(this);
            } 

        } 

    }
}
