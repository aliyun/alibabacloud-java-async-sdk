// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectTasksResponseBody</p>
 */
public class ListDevopsProjectTasksResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private java.util.List < Object> object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private ListDevopsProjectTasksResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectTasksResponseBody create() {
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
    public java.util.List < Object> getObject() {
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
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < Object> object; 
        private String requestId; 
        private Boolean successful; 

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
        public Builder object(java.util.List < Object> object) {
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
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public ListDevopsProjectTasksResponseBody build() {
            return new ListDevopsProjectTasksResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Created")
        private String created;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Id")
        private String id;

        @NameInMap("ModifierId")
        private String modifierId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("TaskgroupId")
        private String taskgroupId;

        @NameInMap("TasklistId")
        private String tasklistId;

        @NameInMap("Updated")
        private String updated;

        private Object(Builder builder) {
            this.created = builder.created;
            this.creatorId = builder.creatorId;
            this.id = builder.id;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.taskgroupId = builder.taskgroupId;
            this.tasklistId = builder.tasklistId;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return taskgroupId
         */
        public String getTaskgroupId() {
            return this.taskgroupId;
        }

        /**
         * @return tasklistId
         */
        public String getTasklistId() {
            return this.tasklistId;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String created; 
            private String creatorId; 
            private String id; 
            private String modifierId; 
            private String name; 
            private String projectId; 
            private String taskgroupId; 
            private String tasklistId; 
            private String updated; 

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * TaskgroupId.
             */
            public Builder taskgroupId(String taskgroupId) {
                this.taskgroupId = taskgroupId;
                return this;
            }

            /**
             * TasklistId.
             */
            public Builder tasklistId(String tasklistId) {
                this.tasklistId = tasklistId;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
