// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskListFilterResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskListFilterResponseBody</p>
 */
public class GetTaskListFilterResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private String successful;

    private GetTaskListFilterResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskListFilterResponseBody create() {
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
     * @return object
     */
    public Object getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public String getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Object object; 
        private String requestId; 
        private String successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
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
         * Successful.
         */
        public Builder successful(String successful) {
            this.successful = successful;
            return this;
        }

        public GetTaskListFilterResponseBody build() {
            return new GetTaskListFilterResponseBody(this);
        } 

    } 

    public static class Badges extends TeaModel {
        @NameInMap("AttachmentsCount")
        private Integer attachmentsCount;

        @NameInMap("CommentsCount")
        private Integer commentsCount;

        @NameInMap("LikesCount")
        private Integer likesCount;

        @NameInMap("ObjectlinksCount")
        private Integer objectlinksCount;

        private Badges(Builder builder) {
            this.attachmentsCount = builder.attachmentsCount;
            this.commentsCount = builder.commentsCount;
            this.likesCount = builder.likesCount;
            this.objectlinksCount = builder.objectlinksCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Badges create() {
            return builder().build();
        }

        /**
         * @return attachmentsCount
         */
        public Integer getAttachmentsCount() {
            return this.attachmentsCount;
        }

        /**
         * @return commentsCount
         */
        public Integer getCommentsCount() {
            return this.commentsCount;
        }

        /**
         * @return likesCount
         */
        public Integer getLikesCount() {
            return this.likesCount;
        }

        /**
         * @return objectlinksCount
         */
        public Integer getObjectlinksCount() {
            return this.objectlinksCount;
        }

        public static final class Builder {
            private Integer attachmentsCount; 
            private Integer commentsCount; 
            private Integer likesCount; 
            private Integer objectlinksCount; 

            /**
             * AttachmentsCount.
             */
            public Builder attachmentsCount(Integer attachmentsCount) {
                this.attachmentsCount = attachmentsCount;
                return this;
            }

            /**
             * CommentsCount.
             */
            public Builder commentsCount(Integer commentsCount) {
                this.commentsCount = commentsCount;
                return this;
            }

            /**
             * LikesCount.
             */
            public Builder likesCount(Integer likesCount) {
                this.likesCount = likesCount;
                return this;
            }

            /**
             * ObjectlinksCount.
             */
            public Builder objectlinksCount(Integer objectlinksCount) {
                this.objectlinksCount = objectlinksCount;
                return this;
            }

            public Badges build() {
                return new Badges(this);
            } 

        } 

    }
    public static class Creator extends TeaModel {
        @NameInMap("AvatarUrl")
        private String avatarUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private Creator(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
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

        public static final class Builder {
            private String avatarUrl; 
            private String id; 
            private String name; 

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

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

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    public static class Value extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Title")
        private String title;

        private Value(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String id; 
            private String title; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    public static class Customfields extends TeaModel {
        @NameInMap("CustomfieldId")
        private String customfieldId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private java.util.List < Value> value;

        @NameInMap("Values")
        private String values;

        private Customfields(Builder builder) {
            this.customfieldId = builder.customfieldId;
            this.type = builder.type;
            this.value = builder.value;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customfields create() {
            return builder().build();
        }

        /**
         * @return customfieldId
         */
        public String getCustomfieldId() {
            return this.customfieldId;
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
        public java.util.List < Value> getValue() {
            return this.value;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String customfieldId; 
            private String type; 
            private java.util.List < Value> value; 
            private String values; 

            /**
             * CustomfieldId.
             */
            public Builder customfieldId(String customfieldId) {
                this.customfieldId = customfieldId;
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
            public Builder value(java.util.List < Value> value) {
                this.value = value;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public Customfields build() {
                return new Customfields(this);
            } 

        } 

    }
    public static class Executor extends TeaModel {
        @NameInMap("AvatarUrl")
        private String avatarUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private Executor(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executor create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
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

        public static final class Builder {
            private String avatarUrl; 
            private String id; 
            private String name; 

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

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

            public Executor build() {
                return new Executor(this);
            } 

        } 

    }
    public static class Reminder extends TeaModel {
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Date")
        private String date;

        @NameInMap("Members")
        private java.util.List < String > members;

        @NameInMap("Rules")
        private java.util.List < String > rules;

        @NameInMap("Type")
        private String type;

        private Reminder(Builder builder) {
            this.creatorId = builder.creatorId;
            this.date = builder.date;
            this.members = builder.members;
            this.rules = builder.rules;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reminder create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return members
         */
        public java.util.List < String > getMembers() {
            return this.members;
        }

        /**
         * @return rules
         */
        public java.util.List < String > getRules() {
            return this.rules;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String creatorId; 
            private String date; 
            private java.util.List < String > members; 
            private java.util.List < String > rules; 
            private String type; 

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Members.
             */
            public Builder members(java.util.List < String > members) {
                this.members = members;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < String > rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Reminder build() {
                return new Reminder(this);
            } 

        } 

    }
    public static class Stage extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private Stage(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stage create() {
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

        public static final class Builder {
            private String id; 
            private String name; 

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

            public Stage build() {
                return new Stage(this);
            } 

        } 

    }
    public static class SubtaskCount extends TeaModel {
        @NameInMap("Done")
        private Integer done;

        @NameInMap("Total")
        private Integer total;

        private SubtaskCount(Builder builder) {
            this.done = builder.done;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtaskCount create() {
            return builder().build();
        }

        /**
         * @return done
         */
        public Integer getDone() {
            return this.done;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer done; 
            private Integer total; 

            /**
             * Done.
             */
            public Builder done(Integer done) {
                this.done = done;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public SubtaskCount build() {
                return new SubtaskCount(this);
            } 

        } 

    }
    public static class TaskFlowStatus extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Kind")
        private String kind;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pos")
        private Integer pos;

        @NameInMap("TaskFlowId")
        private String taskFlowId;

        private TaskFlowStatus(Builder builder) {
            this.id = builder.id;
            this.kind = builder.kind;
            this.name = builder.name;
            this.pos = builder.pos;
            this.taskFlowId = builder.taskFlowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlowStatus create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pos
         */
        public Integer getPos() {
            return this.pos;
        }

        /**
         * @return taskFlowId
         */
        public String getTaskFlowId() {
            return this.taskFlowId;
        }

        public static final class Builder {
            private String id; 
            private String kind; 
            private String name; 
            private Integer pos; 
            private String taskFlowId; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
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
             * Pos.
             */
            public Builder pos(Integer pos) {
                this.pos = pos;
                return this;
            }

            /**
             * TaskFlowId.
             */
            public Builder taskFlowId(String taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            public TaskFlowStatus build() {
                return new TaskFlowStatus(this);
            } 

        } 

    }
    public static class WorkTime extends TeaModel {
        @NameInMap("TotalTime")
        private Integer totalTime;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("UsedTime")
        private Integer usedTime;

        private WorkTime(Builder builder) {
            this.totalTime = builder.totalTime;
            this.unit = builder.unit;
            this.usedTime = builder.usedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkTime create() {
            return builder().build();
        }

        /**
         * @return totalTime
         */
        public Integer getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return usedTime
         */
        public Integer getUsedTime() {
            return this.usedTime;
        }

        public static final class Builder {
            private Integer totalTime; 
            private String unit; 
            private Integer usedTime; 

            /**
             * TotalTime.
             */
            public Builder totalTime(Integer totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * UsedTime.
             */
            public Builder usedTime(Integer usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            public WorkTime build() {
                return new WorkTime(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Accomplished")
        private String accomplished;

        @NameInMap("AncestorIds")
        private java.util.List < String > ancestorIds;

        @NameInMap("AttachmentsCount")
        private Integer attachmentsCount;

        @NameInMap("Badges")
        private Badges badges;

        @NameInMap("CommentsCount")
        private Integer commentsCount;

        @NameInMap("Content")
        private String content;

        @NameInMap("Created")
        private String created;

        @NameInMap("Creator")
        private Creator creator;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Customfields")
        private java.util.List < Customfields> customfields;

        @NameInMap("Divisions")
        private java.util.List < String > divisions;

        @NameInMap("DueDate")
        private String dueDate;

        @NameInMap("Executor")
        private Executor executor;

        @NameInMap("ExecutorId")
        private String executorId;

        @NameInMap("Id")
        private String id;

        @NameInMap("InvolveMembers")
        private java.util.List < String > involveMembers;

        @NameInMap("IsArchived")
        private Boolean isArchived;

        @NameInMap("IsDone")
        private Boolean isDone;

        @NameInMap("IsFavorite")
        private Boolean isFavorite;

        @NameInMap("IsTopInProject")
        private Boolean isTopInProject;

        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("LikesCount")
        private Integer likesCount;

        @NameInMap("Note")
        private String note;

        @NameInMap("ObjectType")
        private String objectType;

        @NameInMap("ObjectlinksCount")
        private Integer objectlinksCount;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("Parent")
        private String parent;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Rating")
        private Integer rating;

        @NameInMap("Recurrence")
        private String recurrence;

        @NameInMap("Reminder")
        private Reminder reminder;

        @NameInMap("ScenariofFeldConfigId")
        private String scenariofFeldConfigId;

        @NameInMap("ShareStatus")
        private Integer shareStatus;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceDate")
        private String sourceDate;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("Sprint")
        private String sprint;

        @NameInMap("SprintId")
        private String sprintId;

        @NameInMap("Stage")
        private Stage stage;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("StoryPoint")
        private String storyPoint;

        @NameInMap("SubtaskCount")
        private SubtaskCount subtaskCount;

        @NameInMap("TagIds")
        private java.util.List < String > tagIds;

        @NameInMap("TaskFlowStatus")
        private TaskFlowStatus taskFlowStatus;

        @NameInMap("TaskFlowStatusId")
        private String taskFlowStatusId;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskListId")
        private String taskListId;

        @NameInMap("TaskUniqueId")
        private String taskUniqueId;

        @NameInMap("UniqueId")
        private Integer uniqueId;

        @NameInMap("UntilDate")
        private String untilDate;

        @NameInMap("Updated")
        private String updated;

        @NameInMap("Visible")
        private String visible;

        @NameInMap("WorkTime")
        private WorkTime workTime;

        private Result(Builder builder) {
            this.accomplished = builder.accomplished;
            this.ancestorIds = builder.ancestorIds;
            this.attachmentsCount = builder.attachmentsCount;
            this.badges = builder.badges;
            this.commentsCount = builder.commentsCount;
            this.content = builder.content;
            this.created = builder.created;
            this.creator = builder.creator;
            this.creatorId = builder.creatorId;
            this.customfields = builder.customfields;
            this.divisions = builder.divisions;
            this.dueDate = builder.dueDate;
            this.executor = builder.executor;
            this.executorId = builder.executorId;
            this.id = builder.id;
            this.involveMembers = builder.involveMembers;
            this.isArchived = builder.isArchived;
            this.isDone = builder.isDone;
            this.isFavorite = builder.isFavorite;
            this.isTopInProject = builder.isTopInProject;
            this.labels = builder.labels;
            this.likesCount = builder.likesCount;
            this.note = builder.note;
            this.objectType = builder.objectType;
            this.objectlinksCount = builder.objectlinksCount;
            this.organizationId = builder.organizationId;
            this.parent = builder.parent;
            this.priority = builder.priority;
            this.progress = builder.progress;
            this.projectId = builder.projectId;
            this.rating = builder.rating;
            this.recurrence = builder.recurrence;
            this.reminder = builder.reminder;
            this.scenariofFeldConfigId = builder.scenariofFeldConfigId;
            this.shareStatus = builder.shareStatus;
            this.source = builder.source;
            this.sourceDate = builder.sourceDate;
            this.sourceId = builder.sourceId;
            this.sprint = builder.sprint;
            this.sprintId = builder.sprintId;
            this.stage = builder.stage;
            this.stageId = builder.stageId;
            this.startDate = builder.startDate;
            this.storyPoint = builder.storyPoint;
            this.subtaskCount = builder.subtaskCount;
            this.tagIds = builder.tagIds;
            this.taskFlowStatus = builder.taskFlowStatus;
            this.taskFlowStatusId = builder.taskFlowStatusId;
            this.taskId = builder.taskId;
            this.taskListId = builder.taskListId;
            this.taskUniqueId = builder.taskUniqueId;
            this.uniqueId = builder.uniqueId;
            this.untilDate = builder.untilDate;
            this.updated = builder.updated;
            this.visible = builder.visible;
            this.workTime = builder.workTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accomplished
         */
        public String getAccomplished() {
            return this.accomplished;
        }

        /**
         * @return ancestorIds
         */
        public java.util.List < String > getAncestorIds() {
            return this.ancestorIds;
        }

        /**
         * @return attachmentsCount
         */
        public Integer getAttachmentsCount() {
            return this.attachmentsCount;
        }

        /**
         * @return badges
         */
        public Badges getBadges() {
            return this.badges;
        }

        /**
         * @return commentsCount
         */
        public Integer getCommentsCount() {
            return this.commentsCount;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return customfields
         */
        public java.util.List < Customfields> getCustomfields() {
            return this.customfields;
        }

        /**
         * @return divisions
         */
        public java.util.List < String > getDivisions() {
            return this.divisions;
        }

        /**
         * @return dueDate
         */
        public String getDueDate() {
            return this.dueDate;
        }

        /**
         * @return executor
         */
        public Executor getExecutor() {
            return this.executor;
        }

        /**
         * @return executorId
         */
        public String getExecutorId() {
            return this.executorId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return involveMembers
         */
        public java.util.List < String > getInvolveMembers() {
            return this.involveMembers;
        }

        /**
         * @return isArchived
         */
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        /**
         * @return isDone
         */
        public Boolean getIsDone() {
            return this.isDone;
        }

        /**
         * @return isFavorite
         */
        public Boolean getIsFavorite() {
            return this.isFavorite;
        }

        /**
         * @return isTopInProject
         */
        public Boolean getIsTopInProject() {
            return this.isTopInProject;
        }

        /**
         * @return labels
         */
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return likesCount
         */
        public Integer getLikesCount() {
            return this.likesCount;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectlinksCount
         */
        public Integer getObjectlinksCount() {
            return this.objectlinksCount;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return parent
         */
        public String getParent() {
            return this.parent;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return rating
         */
        public Integer getRating() {
            return this.rating;
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return reminder
         */
        public Reminder getReminder() {
            return this.reminder;
        }

        /**
         * @return scenariofFeldConfigId
         */
        public String getScenariofFeldConfigId() {
            return this.scenariofFeldConfigId;
        }

        /**
         * @return shareStatus
         */
        public Integer getShareStatus() {
            return this.shareStatus;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceDate
         */
        public String getSourceDate() {
            return this.sourceDate;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sprint
         */
        public String getSprint() {
            return this.sprint;
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
        public Stage getStage() {
            return this.stage;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return storyPoint
         */
        public String getStoryPoint() {
            return this.storyPoint;
        }

        /**
         * @return subtaskCount
         */
        public SubtaskCount getSubtaskCount() {
            return this.subtaskCount;
        }

        /**
         * @return tagIds
         */
        public java.util.List < String > getTagIds() {
            return this.tagIds;
        }

        /**
         * @return taskFlowStatus
         */
        public TaskFlowStatus getTaskFlowStatus() {
            return this.taskFlowStatus;
        }

        /**
         * @return taskFlowStatusId
         */
        public String getTaskFlowStatusId() {
            return this.taskFlowStatusId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskListId
         */
        public String getTaskListId() {
            return this.taskListId;
        }

        /**
         * @return taskUniqueId
         */
        public String getTaskUniqueId() {
            return this.taskUniqueId;
        }

        /**
         * @return uniqueId
         */
        public Integer getUniqueId() {
            return this.uniqueId;
        }

        /**
         * @return untilDate
         */
        public String getUntilDate() {
            return this.untilDate;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return visible
         */
        public String getVisible() {
            return this.visible;
        }

        /**
         * @return workTime
         */
        public WorkTime getWorkTime() {
            return this.workTime;
        }

        public static final class Builder {
            private String accomplished; 
            private java.util.List < String > ancestorIds; 
            private Integer attachmentsCount; 
            private Badges badges; 
            private Integer commentsCount; 
            private String content; 
            private String created; 
            private Creator creator; 
            private String creatorId; 
            private java.util.List < Customfields> customfields; 
            private java.util.List < String > divisions; 
            private String dueDate; 
            private Executor executor; 
            private String executorId; 
            private String id; 
            private java.util.List < String > involveMembers; 
            private Boolean isArchived; 
            private Boolean isDone; 
            private Boolean isFavorite; 
            private Boolean isTopInProject; 
            private java.util.List < String > labels; 
            private Integer likesCount; 
            private String note; 
            private String objectType; 
            private Integer objectlinksCount; 
            private String organizationId; 
            private String parent; 
            private Integer priority; 
            private Integer progress; 
            private String projectId; 
            private Integer rating; 
            private String recurrence; 
            private Reminder reminder; 
            private String scenariofFeldConfigId; 
            private Integer shareStatus; 
            private String source; 
            private String sourceDate; 
            private String sourceId; 
            private String sprint; 
            private String sprintId; 
            private Stage stage; 
            private String stageId; 
            private String startDate; 
            private String storyPoint; 
            private SubtaskCount subtaskCount; 
            private java.util.List < String > tagIds; 
            private TaskFlowStatus taskFlowStatus; 
            private String taskFlowStatusId; 
            private String taskId; 
            private String taskListId; 
            private String taskUniqueId; 
            private Integer uniqueId; 
            private String untilDate; 
            private String updated; 
            private String visible; 
            private WorkTime workTime; 

            /**
             * Accomplished.
             */
            public Builder accomplished(String accomplished) {
                this.accomplished = accomplished;
                return this;
            }

            /**
             * AncestorIds.
             */
            public Builder ancestorIds(java.util.List < String > ancestorIds) {
                this.ancestorIds = ancestorIds;
                return this;
            }

            /**
             * AttachmentsCount.
             */
            public Builder attachmentsCount(Integer attachmentsCount) {
                this.attachmentsCount = attachmentsCount;
                return this;
            }

            /**
             * Badges.
             */
            public Builder badges(Badges badges) {
                this.badges = badges;
                return this;
            }

            /**
             * CommentsCount.
             */
            public Builder commentsCount(Integer commentsCount) {
                this.commentsCount = commentsCount;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Customfields.
             */
            public Builder customfields(java.util.List < Customfields> customfields) {
                this.customfields = customfields;
                return this;
            }

            /**
             * Divisions.
             */
            public Builder divisions(java.util.List < String > divisions) {
                this.divisions = divisions;
                return this;
            }

            /**
             * DueDate.
             */
            public Builder dueDate(String dueDate) {
                this.dueDate = dueDate;
                return this;
            }

            /**
             * Executor.
             */
            public Builder executor(Executor executor) {
                this.executor = executor;
                return this;
            }

            /**
             * ExecutorId.
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InvolveMembers.
             */
            public Builder involveMembers(java.util.List < String > involveMembers) {
                this.involveMembers = involveMembers;
                return this;
            }

            /**
             * IsArchived.
             */
            public Builder isArchived(Boolean isArchived) {
                this.isArchived = isArchived;
                return this;
            }

            /**
             * IsDone.
             */
            public Builder isDone(Boolean isDone) {
                this.isDone = isDone;
                return this;
            }

            /**
             * IsFavorite.
             */
            public Builder isFavorite(Boolean isFavorite) {
                this.isFavorite = isFavorite;
                return this;
            }

            /**
             * IsTopInProject.
             */
            public Builder isTopInProject(Boolean isTopInProject) {
                this.isTopInProject = isTopInProject;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * LikesCount.
             */
            public Builder likesCount(Integer likesCount) {
                this.likesCount = likesCount;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * ObjectlinksCount.
             */
            public Builder objectlinksCount(Integer objectlinksCount) {
                this.objectlinksCount = objectlinksCount;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * Parent.
             */
            public Builder parent(String parent) {
                this.parent = parent;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Rating.
             */
            public Builder rating(Integer rating) {
                this.rating = rating;
                return this;
            }

            /**
             * Recurrence.
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * Reminder.
             */
            public Builder reminder(Reminder reminder) {
                this.reminder = reminder;
                return this;
            }

            /**
             * ScenariofFeldConfigId.
             */
            public Builder scenariofFeldConfigId(String scenariofFeldConfigId) {
                this.scenariofFeldConfigId = scenariofFeldConfigId;
                return this;
            }

            /**
             * ShareStatus.
             */
            public Builder shareStatus(Integer shareStatus) {
                this.shareStatus = shareStatus;
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
             * SourceDate.
             */
            public Builder sourceDate(String sourceDate) {
                this.sourceDate = sourceDate;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * Sprint.
             */
            public Builder sprint(String sprint) {
                this.sprint = sprint;
                return this;
            }

            /**
             * SprintId.
             */
            public Builder sprintId(String sprintId) {
                this.sprintId = sprintId;
                return this;
            }

            /**
             * Stage.
             */
            public Builder stage(Stage stage) {
                this.stage = stage;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * StoryPoint.
             */
            public Builder storyPoint(String storyPoint) {
                this.storyPoint = storyPoint;
                return this;
            }

            /**
             * SubtaskCount.
             */
            public Builder subtaskCount(SubtaskCount subtaskCount) {
                this.subtaskCount = subtaskCount;
                return this;
            }

            /**
             * TagIds.
             */
            public Builder tagIds(java.util.List < String > tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * TaskFlowStatus.
             */
            public Builder taskFlowStatus(TaskFlowStatus taskFlowStatus) {
                this.taskFlowStatus = taskFlowStatus;
                return this;
            }

            /**
             * TaskFlowStatusId.
             */
            public Builder taskFlowStatusId(String taskFlowStatusId) {
                this.taskFlowStatusId = taskFlowStatusId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskListId.
             */
            public Builder taskListId(String taskListId) {
                this.taskListId = taskListId;
                return this;
            }

            /**
             * TaskUniqueId.
             */
            public Builder taskUniqueId(String taskUniqueId) {
                this.taskUniqueId = taskUniqueId;
                return this;
            }

            /**
             * UniqueId.
             */
            public Builder uniqueId(Integer uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * UntilDate.
             */
            public Builder untilDate(String untilDate) {
                this.untilDate = untilDate;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(String visible) {
                this.visible = visible;
                return this;
            }

            /**
             * WorkTime.
             */
            public Builder workTime(WorkTime workTime) {
                this.workTime = workTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Object extends TeaModel {
        @NameInMap("NextPageToken")
        private String nextPageToken;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private Integer totalSize;

        private Object(Builder builder) {
            this.nextPageToken = builder.nextPageToken;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String nextPageToken; 
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * NextPageToken.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
