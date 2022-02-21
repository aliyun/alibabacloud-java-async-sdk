// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTaskFlowStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectTaskFlowStatusResponseBody</p>
 */
public class ListDevopsProjectTaskFlowStatusResponseBody extends TeaModel {
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

    private ListDevopsProjectTaskFlowStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectTaskFlowStatusResponseBody create() {
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

        public ListDevopsProjectTaskFlowStatusResponseBody build() {
            return new ListDevopsProjectTaskFlowStatusResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Created")
        private String created;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("Kind")
        private String kind;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pos")
        private Integer pos;

        @NameInMap("RejectStatusIds")
        private String rejectStatusIds;

        @NameInMap("TaskflowId")
        private String taskflowId;

        @NameInMap("Updated")
        private String updated;

        private Object(Builder builder) {
            this.created = builder.created;
            this.creatorId = builder.creatorId;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.kind = builder.kind;
            this.name = builder.name;
            this.pos = builder.pos;
            this.rejectStatusIds = builder.rejectStatusIds;
            this.taskflowId = builder.taskflowId;
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
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
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
         * @return rejectStatusIds
         */
        public String getRejectStatusIds() {
            return this.rejectStatusIds;
        }

        /**
         * @return taskflowId
         */
        public String getTaskflowId() {
            return this.taskflowId;
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
            private Boolean isDeleted; 
            private String kind; 
            private String name; 
            private Integer pos; 
            private String rejectStatusIds; 
            private String taskflowId; 
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
             * IsDeleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
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
             * RejectStatusIds.
             */
            public Builder rejectStatusIds(String rejectStatusIds) {
                this.rejectStatusIds = rejectStatusIds;
                return this;
            }

            /**
             * TaskflowId.
             */
            public Builder taskflowId(String taskflowId) {
                this.taskflowId = taskflowId;
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
