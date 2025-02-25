// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetOrderBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderBaseInfoResponseBody</p>
 */
public class GetOrderBaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OrderBaseInfo")
    private OrderBaseInfo orderBaseInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The basic information about the ticket.</p>
         */
        public Builder orderBaseInfo(OrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7133DF67-5B25-460F-8285-C4CC93472C2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOrderBaseInfoResponseBody build() {
            return new GetOrderBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOrderBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderBaseInfoResponseBody</p>
     */
    public static class RelatedUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

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
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> userIds; 

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public RelatedUserList build() {
                return new RelatedUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderBaseInfoResponseBody</p>
     */
    public static class RelatedUserNickList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserNicks")
        private java.util.List<String> userNicks;

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
        public java.util.List<String> getUserNicks() {
            return this.userNicks;
        }

        public static final class Builder {
            private java.util.List<String> userNicks; 

            /**
             * UserNicks.
             */
            public Builder userNicks(java.util.List<String> userNicks) {
                this.userNicks = userNicks;
                return this;
            }

            public RelatedUserNickList build() {
                return new RelatedUserNickList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOrderBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOrderBaseInfoResponseBody</p>
     */
    public static class OrderBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentKey")
        private String attachmentKey;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Committer")
        private String committer;

        @com.aliyun.core.annotation.NameInMap("CommitterId")
        private Long committerId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OriginAttachmentName")
        private String originAttachmentName;

        @com.aliyun.core.annotation.NameInMap("PluginType")
        private String pluginType;

        @com.aliyun.core.annotation.NameInMap("RelatedUserList")
        private RelatedUserList relatedUserList;

        @com.aliyun.core.annotation.NameInMap("RelatedUserNickList")
        private RelatedUserNickList relatedUserNickList;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("WorkflowInstanceId")
        private Long workflowInstanceId;

        @com.aliyun.core.annotation.NameInMap("WorkflowStatusDesc")
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
             * <p>The Key of the ticket attachment. This information is returned only when an attachment is uploaded when a ticket is created.</p>
             * 
             * <strong>example:</strong>
             * <p>upload_order_info_856887_f356366f-f0f8-42fc-ba57-4a509303e814_18072d8a9bce876e3073bc655c2865f.png</p>
             */
            public Builder attachmentKey(String attachmentKey) {
                this.attachmentKey = attachmentKey;
                return this;
            }

            /**
             * <p>The remarks of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * <p>The ID of the applicant. Note: The ID is different from the Alibaba Cloud account ID of the applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder committerId(Long committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * <p>The time when the ticket was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-10 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the ticket was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-10 00:00:00</p>
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The ID of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The original file name of the ticket attachment. This information is returned only when an attachment is uploaded when a ticket is created.</p>
             * 
             * <strong>example:</strong>
             * <p>18072d8a9bce876e3073bc655c2865f.png</p>
             */
            public Builder originAttachmentName(String originAttachmentName) {
                this.originAttachmentName = originAttachmentName;
                return this;
            }

            /**
             * <p>The type of the ticket. For more information about the value of this parameter, see the request parameters of the <a href="https://help.aliyun.com/document_detail/465865.html">CreateOrder</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>DC_COMMON</p>
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * <p>The IDs of the operators that are related to the ticket.</p>
             */
            public Builder relatedUserList(RelatedUserList relatedUserList) {
                this.relatedUserList = relatedUserList;
                return this;
            }

            /**
             * <p>The nicknames of the operators that are related to the ticket.</p>
             */
            public Builder relatedUserNickList(RelatedUserNickList relatedUserNickList) {
                this.relatedUserNickList = relatedUserNickList;
                return this;
            }

            /**
             * <p>The status code of the ticket. Valid values:</p>
             * <ul>
             * <li><strong>new</strong>: The ticket is created.</li>
             * <li><strong>toaudit</strong>: The ticket is being reviewed.</li>
             * <li><strong>Approved</strong>: The ticket is approved.</li>
             * <li><strong>reject</strong>: The ticket is rejected.</li>
             * <li><strong>processing</strong>: The ticket is being executed.</li>
             * <li><strong>success</strong>: The ticket is executed.</li>
             * <li><strong>closed</strong>: The ticket is closed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The description of the status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The ID of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder workflowInstanceId(Long workflowInstanceId) {
                this.workflowInstanceId = workflowInstanceId;
                return this;
            }

            /**
             * <p>The description of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>approved</p>
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
