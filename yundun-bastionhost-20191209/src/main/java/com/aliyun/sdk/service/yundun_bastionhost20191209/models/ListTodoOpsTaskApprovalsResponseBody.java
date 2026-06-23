// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListTodoOpsTaskApprovalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTodoOpsTaskApprovalsResponseBody</p>
 */
public class ListTodoOpsTaskApprovalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Approves")
    private java.util.List<Approves> approves;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTodoOpsTaskApprovalsResponseBody(Builder builder) {
        this.approves = builder.approves;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTodoOpsTaskApprovalsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approves
     */
    public java.util.List<Approves> getApproves() {
        return this.approves;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Approves> approves; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTodoOpsTaskApprovalsResponseBody model) {
            this.approves = model.approves;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Approves.
         */
        public Builder approves(java.util.List<Approves> approves) {
            this.approves = approves;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTodoOpsTaskApprovalsResponseBody build() {
            return new ListTodoOpsTaskApprovalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTodoOpsTaskApprovalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTodoOpsTaskApprovalsResponseBody</p>
     */
    public static class Approves extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyAt")
        private Long applyAt;

        @com.aliyun.core.annotation.NameInMap("ApproveId")
        private String approveId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientUid")
        private Long clientUid;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private Approves(Builder builder) {
            this.applyAt = builder.applyAt;
            this.approveId = builder.approveId;
            this.clientName = builder.clientName;
            this.clientUid = builder.clientUid;
            this.comment = builder.comment;
            this.name = builder.name;
            this.scheduleType = builder.scheduleType;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Approves create() {
            return builder().build();
        }

        /**
         * @return applyAt
         */
        public Long getApplyAt() {
            return this.applyAt;
        }

        /**
         * @return approveId
         */
        public String getApproveId() {
            return this.approveId;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return clientUid
         */
        public Long getClientUid() {
            return this.clientUid;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long applyAt; 
            private String approveId; 
            private String clientName; 
            private Long clientUid; 
            private String comment; 
            private String name; 
            private String scheduleType; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(Approves model) {
                this.applyAt = model.applyAt;
                this.approveId = model.approveId;
                this.clientName = model.clientName;
                this.clientUid = model.clientUid;
                this.comment = model.comment;
                this.name = model.name;
                this.scheduleType = model.scheduleType;
                this.taskId = model.taskId;
            } 

            /**
             * ApplyAt.
             */
            public Builder applyAt(Long applyAt) {
                this.applyAt = applyAt;
                return this;
            }

            /**
             * ApproveId.
             */
            public Builder approveId(String approveId) {
                this.approveId = approveId;
                return this;
            }

            /**
             * ClientName.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * ClientUid.
             */
            public Builder clientUid(Long clientUid) {
                this.clientUid = clientUid;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
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
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Approves build() {
                return new Approves(this);
            } 

        } 

    }
}
