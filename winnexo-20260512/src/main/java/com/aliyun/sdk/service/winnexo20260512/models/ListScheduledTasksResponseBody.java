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
 * {@link ListScheduledTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduledTasksResponseBody</p>
 */
public class ListScheduledTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListScheduledTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledTasksResponseBody create() {
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
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListScheduledTasksResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether more data is available. Valid values:</p>
         * <ul>
         * <li>true: More data is available.</li>
         * <li>false: No more data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The list of skill cards.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>1763604514518000_531300</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListScheduledTasksResponseBody build() {
            return new ListScheduledTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduledTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduledTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("abnormalReason")
        private String abnormalReason;

        @com.aliyun.core.annotation.NameInMap("canDelete")
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("canEdit")
        private Boolean canEdit;

        @com.aliyun.core.annotation.NameInMap("canExecute")
        private Boolean canExecute;

        @com.aliyun.core.annotation.NameInMap("canToggle")
        private Boolean canToggle;

        @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
        private String collaborationGroupId;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
        private java.util.List<String> digitalEmployeeName;

        @com.aliyun.core.annotation.NameInMap("executionCount")
        private Long executionCount;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("isOpen")
        private Boolean isOpen;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("visibility")
        private String visibility;

        @com.aliyun.core.annotation.NameInMap("visibleMemberUserIds")
        private java.util.List<String> visibleMemberUserIds;

        private Items(Builder builder) {
            this.abnormalReason = builder.abnormalReason;
            this.canDelete = builder.canDelete;
            this.canEdit = builder.canEdit;
            this.canExecute = builder.canExecute;
            this.canToggle = builder.canToggle;
            this.collaborationGroupId = builder.collaborationGroupId;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.executionCount = builder.executionCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isOpen = builder.isOpen;
            this.model = builder.model;
            this.name = builder.name;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.triggerType = builder.triggerType;
            this.visibility = builder.visibility;
            this.visibleMemberUserIds = builder.visibleMemberUserIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return abnormalReason
         */
        public String getAbnormalReason() {
            return this.abnormalReason;
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return canEdit
         */
        public Boolean getCanEdit() {
            return this.canEdit;
        }

        /**
         * @return canExecute
         */
        public Boolean getCanExecute() {
            return this.canExecute;
        }

        /**
         * @return canToggle
         */
        public Boolean getCanToggle() {
            return this.canToggle;
        }

        /**
         * @return collaborationGroupId
         */
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return digitalEmployeeName
         */
        public java.util.List<String> getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        /**
         * @return executionCount
         */
        public Long getExecutionCount() {
            return this.executionCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isOpen
         */
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        /**
         * @return visibleMemberUserIds
         */
        public java.util.List<String> getVisibleMemberUserIds() {
            return this.visibleMemberUserIds;
        }

        public static final class Builder {
            private String abnormalReason; 
            private Boolean canDelete; 
            private Boolean canEdit; 
            private Boolean canExecute; 
            private Boolean canToggle; 
            private String collaborationGroupId; 
            private String creator; 
            private String creatorName; 
            private String cronExpression; 
            private String description; 
            private java.util.List<String> digitalEmployeeName; 
            private Long executionCount; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean isOpen; 
            private String model; 
            private String name; 
            private String status; 
            private String taskId; 
            private String triggerType; 
            private String visibility; 
            private java.util.List<String> visibleMemberUserIds; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.abnormalReason = model.abnormalReason;
                this.canDelete = model.canDelete;
                this.canEdit = model.canEdit;
                this.canExecute = model.canExecute;
                this.canToggle = model.canToggle;
                this.collaborationGroupId = model.collaborationGroupId;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.cronExpression = model.cronExpression;
                this.description = model.description;
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.executionCount = model.executionCount;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.isOpen = model.isOpen;
                this.model = model.model;
                this.name = model.name;
                this.status = model.status;
                this.taskId = model.taskId;
                this.triggerType = model.triggerType;
                this.visibility = model.visibility;
                this.visibleMemberUserIds = model.visibleMemberUserIds;
            } 

            /**
             * <p>The reason for the exception. This field has a value only when status is abnormal.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder abnormalReason(String abnormalReason) {
                this.abnormalReason = abnormalReason;
                return this;
            }

            /**
             * <p>Indicates whether the current caller can delete the task (only the task creator and group owner can do so). Always returns true for personal tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * <p>Indicates whether the task can be edited or deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canEdit(Boolean canEdit) {
                this.canEdit = canEdit;
                return this;
            }

            /**
             * <p>Indicates whether the current caller can immediately execute the task (anyone with visibility can operate. Returns false for abnormal tasks). Always returns true for personal tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canExecute(Boolean canExecute) {
                this.canExecute = canExecute;
                return this;
            }

            /**
             * <p>Indicates whether the current caller can start or stop the task (only the task creator and group owner can do so. Returns false for abnormal tasks). Always returns true for personal tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canToggle(Boolean canToggle) {
                this.canToggle = canToggle;
                return this;
            }

            /**
             * <p>The ID of the collaboration group (such as cg_101). If specified, a group task is created (the caller must be a valid group member). If left empty, a personal task is created.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleCollaborationGroupId</p>
             */
            public Builder collaborationGroupId(String collaborationGroupId) {
                this.collaborationGroupId = collaborationGroupId;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The description of the to-do card type.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of digital employee names.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder digitalEmployeeName(java.util.List<String> digitalEmployeeName) {
                this.digitalEmployeeName = digitalEmployeeName;
                return this;
            }

            /**
             * <p>The total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executionCount(Long executionCount) {
                this.executionCount = executionCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether public access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOpen(Boolean isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * <p>The execution model tier. If not specified, the value is not updated.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleName.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The task status. Running is returned upon submission.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The trigger type.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The visibility scope of the group task. Valid values:</p>
             * <ul>
             * <li>PRIVATE: visible only to the creator and group owner.</li>
             * <li>COLLABORATIVE: visible to specified collaborators.</li>
             * <li>PUBLIC: visible to all group members.</li>
             * </ul>
             * <p>For group tasks, the default value is PRIVATE if not specified. This field is ignored for personal tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * <p>The list of collaborators (excluding the task creator and group creator, who are covered by the authentication layer). This field is returned only for group tasks. An empty list is returned for PRIVATE or PUBLIC visibility.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder visibleMemberUserIds(java.util.List<String> visibleMemberUserIds) {
                this.visibleMemberUserIds = visibleMemberUserIds;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
