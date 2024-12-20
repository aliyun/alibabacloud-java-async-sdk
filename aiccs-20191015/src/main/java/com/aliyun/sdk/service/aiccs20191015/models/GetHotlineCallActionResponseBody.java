// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetHotlineCallActionResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotlineCallActionResponseBody</p>
 */
public class GetHotlineCallActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetHotlineCallActionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineCallActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHotlineCallActionResponseBody build() {
            return new GetHotlineCallActionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotlineCallActionResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotlineCallActionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionId")
        private Long actionId;

        @com.aliyun.core.annotation.NameInMap("BuId")
        private Long buId;

        @com.aliyun.core.annotation.NameInMap("CalloutId")
        private Long calloutId;

        @com.aliyun.core.annotation.NameInMap("CalloutName")
        private String calloutName;

        @com.aliyun.core.annotation.NameInMap("CaseId")
        private Long caseId;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private Long channelType;

        @com.aliyun.core.annotation.NameInMap("DepId")
        private Long depId;

        @com.aliyun.core.annotation.NameInMap("IsTransfer")
        private String isTransfer;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private Long memberId;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        private String memberList;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("ServicerId")
        private Long servicerId;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("SubTouchId")
        private Long subTouchId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TouchId")
        private Long touchId;

        private Data(Builder builder) {
            this.actionId = builder.actionId;
            this.buId = builder.buId;
            this.calloutId = builder.calloutId;
            this.calloutName = builder.calloutName;
            this.caseId = builder.caseId;
            this.channelId = builder.channelId;
            this.channelType = builder.channelType;
            this.depId = builder.depId;
            this.isTransfer = builder.isTransfer;
            this.memberId = builder.memberId;
            this.memberList = builder.memberList;
            this.memberName = builder.memberName;
            this.servicerId = builder.servicerId;
            this.servicerName = builder.servicerName;
            this.subTouchId = builder.subTouchId;
            this.taskId = builder.taskId;
            this.touchId = builder.touchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actionId
         */
        public Long getActionId() {
            return this.actionId;
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return calloutId
         */
        public Long getCalloutId() {
            return this.calloutId;
        }

        /**
         * @return calloutName
         */
        public String getCalloutName() {
            return this.calloutName;
        }

        /**
         * @return caseId
         */
        public Long getCaseId() {
            return this.caseId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelType
         */
        public Long getChannelType() {
            return this.channelType;
        }

        /**
         * @return depId
         */
        public Long getDepId() {
            return this.depId;
        }

        /**
         * @return isTransfer
         */
        public String getIsTransfer() {
            return this.isTransfer;
        }

        /**
         * @return memberId
         */
        public Long getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberList
         */
        public String getMemberList() {
            return this.memberList;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return servicerId
         */
        public Long getServicerId() {
            return this.servicerId;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return subTouchId
         */
        public Long getSubTouchId() {
            return this.subTouchId;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return touchId
         */
        public Long getTouchId() {
            return this.touchId;
        }

        public static final class Builder {
            private Long actionId; 
            private Long buId; 
            private Long calloutId; 
            private String calloutName; 
            private Long caseId; 
            private String channelId; 
            private Long channelType; 
            private Long depId; 
            private String isTransfer; 
            private Long memberId; 
            private String memberList; 
            private String memberName; 
            private Long servicerId; 
            private String servicerName; 
            private Long subTouchId; 
            private Long taskId; 
            private Long touchId; 

            /**
             * ActionId.
             */
            public Builder actionId(Long actionId) {
                this.actionId = actionId;
                return this;
            }

            /**
             * BuId.
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * CalloutId.
             */
            public Builder calloutId(Long calloutId) {
                this.calloutId = calloutId;
                return this;
            }

            /**
             * CalloutName.
             */
            public Builder calloutName(String calloutName) {
                this.calloutName = calloutName;
                return this;
            }

            /**
             * CaseId.
             */
            public Builder caseId(Long caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelType.
             */
            public Builder channelType(Long channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * DepId.
             */
            public Builder depId(Long depId) {
                this.depId = depId;
                return this;
            }

            /**
             * IsTransfer.
             */
            public Builder isTransfer(String isTransfer) {
                this.isTransfer = isTransfer;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberList.
             */
            public Builder memberList(String memberList) {
                this.memberList = memberList;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * ServicerId.
             */
            public Builder servicerId(Long servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * ServicerName.
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * SubTouchId.
             */
            public Builder subTouchId(Long subTouchId) {
                this.subTouchId = subTouchId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TouchId.
             */
            public Builder touchId(Long touchId) {
                this.touchId = touchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
