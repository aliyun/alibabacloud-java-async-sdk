// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderBaseInfoResponseBody</p>
 */
public class GetOrderBaseInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OrderBaseInfo")
    private OrderBaseInfo orderBaseInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetOrderBaseInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.orderBaseInfo = builder.orderBaseInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderBaseInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return orderBaseInfo
     */
    public OrderBaseInfo getOrderBaseInfo() {
        return this.orderBaseInfo;
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

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private OrderBaseInfo orderBaseInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The basic information about the ticket.
         */
        public Builder orderBaseInfo(OrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOrderBaseInfoResponseBody build() {
            return new GetOrderBaseInfoResponseBody(this);
        } 

    } 

    public static class RelatedUserList extends TeaModel {
        @NameInMap("UserIds")
        private java.util.List < String > userIds;

        private RelatedUserList(Builder builder) {
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedUserList create() {
            return builder().build();
        }

        /**
         * @return userIds
         */
        public java.util.List < String > getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List < String > userIds; 

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List < String > userIds) {
                this.userIds = userIds;
                return this;
            }

            public RelatedUserList build() {
                return new RelatedUserList(this);
            } 

        } 

    }
    public static class RelatedUserNickList extends TeaModel {
        @NameInMap("UserNicks")
        private java.util.List < String > userNicks;

        private RelatedUserNickList(Builder builder) {
            this.userNicks = builder.userNicks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedUserNickList create() {
            return builder().build();
        }

        /**
         * @return userNicks
         */
        public java.util.List < String > getUserNicks() {
            return this.userNicks;
        }

        public static final class Builder {
            private java.util.List < String > userNicks; 

            /**
             * UserNicks.
             */
            public Builder userNicks(java.util.List < String > userNicks) {
                this.userNicks = userNicks;
                return this;
            }

            public RelatedUserNickList build() {
                return new RelatedUserNickList(this);
            } 

        } 

    }
    public static class OrderBaseInfo extends TeaModel {
        @NameInMap("AttachmentKey")
        private String attachmentKey;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("Committer")
        private String committer;

        @NameInMap("CommitterId")
        private Long committerId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("LastModifyTime")
        private String lastModifyTime;

        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("OriginAttachmentName")
        private String originAttachmentName;

        @NameInMap("PluginType")
        private String pluginType;

        @NameInMap("RelatedUserList")
        private RelatedUserList relatedUserList;

        @NameInMap("RelatedUserNickList")
        private RelatedUserNickList relatedUserNickList;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @NameInMap("WorkflowStatusDesc")
        private String workflowStatusDesc;

        private OrderBaseInfo(Builder builder) {
            this.attachmentKey = builder.attachmentKey;
            this.comment = builder.comment;
            this.committer = builder.committer;
            this.committerId = builder.committerId;
            this.createTime = builder.createTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.orderId = builder.orderId;
            this.originAttachmentName = builder.originAttachmentName;
            this.pluginType = builder.pluginType;
            this.relatedUserList = builder.relatedUserList;
            this.relatedUserNickList = builder.relatedUserNickList;
            this.statusCode = builder.statusCode;
            this.statusDesc = builder.statusDesc;
            this.workflowInstanceId = builder.workflowInstanceId;
            this.workflowStatusDesc = builder.workflowStatusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderBaseInfo create() {
            return builder().build();
        }

        /**
         * @return attachmentKey
         */
        public String getAttachmentKey() {
            return this.attachmentKey;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return committer
         */
        public String getCommitter() {
            return this.committer;
        }

        /**
         * @return committerId
         */
        public Long getCommitterId() {
            return this.committerId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return originAttachmentName
         */
        public String getOriginAttachmentName() {
            return this.originAttachmentName;
        }

        /**
         * @return pluginType
         */
        public String getPluginType() {
            return this.pluginType;
        }

        /**
         * @return relatedUserList
         */
        public RelatedUserList getRelatedUserList() {
            return this.relatedUserList;
        }

        /**
         * @return relatedUserNickList
         */
        public RelatedUserNickList getRelatedUserNickList() {
            return this.relatedUserNickList;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return workflowInstanceId
         */
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        /**
         * @return workflowStatusDesc
         */
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

        public static final class Builder {
            private String attachmentKey; 
            private String comment; 
            private String committer; 
            private Long committerId; 
            private String createTime; 
            private String lastModifyTime; 
            private Long orderId; 
            private String originAttachmentName; 
            private String pluginType; 
            private RelatedUserList relatedUserList; 
            private RelatedUserNickList relatedUserNickList; 
            private String statusCode; 
            private String statusDesc; 
            private Long workflowInstanceId; 
            private String workflowStatusDesc; 

            /**
             * AttachmentKey.
             */
            public Builder attachmentKey(String attachmentKey) {
                this.attachmentKey = attachmentKey;
                return this;
            }

            /**
             * The remarks of the ticket.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The applicant.
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * The ID of the applicant. Note: The ID is different from the Alibaba Cloud account ID of the applicant.
             */
            public Builder committerId(Long committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * The time when the ticket was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the ticket was last modified.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The ID of the ticket.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OriginAttachmentName.
             */
            public Builder originAttachmentName(String originAttachmentName) {
                this.originAttachmentName = originAttachmentName;
                return this;
            }

            /**
             * The type of the ticket. For more information about the value of this parameter, see the request parameters of the [CreateOrder](~~465865~~) operation.
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * The IDs of the operators that are related to the ticket.
             */
            public Builder relatedUserList(RelatedUserList relatedUserList) {
                this.relatedUserList = relatedUserList;
                return this;
            }

            /**
             * The nicknames of the operators that are related to the ticket.
             */
            public Builder relatedUserNickList(RelatedUserNickList relatedUserNickList) {
                this.relatedUserNickList = relatedUserNickList;
                return this;
            }

            /**
             * The status code of the ticket. Valid values:
             * <p>
             * 
             * *   **new**: The ticket is created.
             * *   **toaudit**: The ticket is being reviewed.
             * *   **Approved**: The ticket is approved.
             * *   **reject**: The ticket is rejected.
             * *   **processing**: The ticket is being executed.
             * *   **success**: The ticket is executed.
             * *   **closed**: The ticket is closed.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The description of the status.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The ID of the approval process.
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * The description of the approval process.
             */
            public Builder workflowStatusDesc(String workflowStatusDesc) {
                this.workflowStatusDesc = workflowStatusDesc;
                return this;
            }

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
}
