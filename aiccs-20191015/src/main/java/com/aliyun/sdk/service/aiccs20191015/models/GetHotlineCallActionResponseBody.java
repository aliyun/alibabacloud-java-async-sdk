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

        private Builder() {
        } 

        private Builder(GetHotlineCallActionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE339D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.actionId = model.actionId;
                this.buId = model.buId;
                this.calloutId = model.calloutId;
                this.calloutName = model.calloutName;
                this.caseId = model.caseId;
                this.channelId = model.channelId;
                this.channelType = model.channelType;
                this.depId = model.depId;
                this.isTransfer = model.isTransfer;
                this.memberId = model.memberId;
                this.memberList = model.memberList;
                this.memberName = model.memberName;
                this.servicerId = model.servicerId;
                this.servicerName = model.servicerName;
                this.subTouchId = model.subTouchId;
                this.taskId = model.taskId;
                this.touchId = model.touchId;
            } 

            /**
             * <p>Customer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8999****</p>
             */
            public Builder actionId(Long actionId) {
                this.actionId = actionId;
                return this;
            }

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2367****</p>
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * <p>Callout ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1122****</p>
             */
            public Builder calloutId(Long calloutId) {
                this.calloutId = calloutId;
                return this;
            }

            /**
             * <p>Call name.</p>
             * 
             * <strong>example:</strong>
             * <p>王XX</p>
             */
            public Builder calloutName(String calloutName) {
                this.calloutName = calloutName;
                return this;
            }

            /**
             * <p>Ticket ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1138902****</p>
             */
            public Builder caseId(Long caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * <p>Channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2377****</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>Channel Type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Hotline.</li>
             * <li><strong>2</strong>: Online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channelType(Long channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1223****</p>
             */
            public Builder depId(Long depId) {
                this.depId = depId;
                return this;
            }

            /**
             * <p>Indicates whether the call is transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTransfer(String isTransfer) {
                this.isTransfer = isTransfer;
                return this;
            }

            /**
             * <p>Membership ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7856876****</p>
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>Membership List.</p>
             * 
             * <strong>example:</strong>
             * <p>8900****</p>
             */
            public Builder memberList(String memberList) {
                this.memberList = memberList;
                return this;
            }

            /**
             * <p>Membership name.</p>
             * 
             * <strong>example:</strong>
             * <p>匿名会员</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1332****</p>
             */
            public Builder servicerId(Long servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * <p>Agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>XX测试</p>
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * <p>Sub-touch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3423****</p>
             */
            public Builder subTouchId(Long subTouchId) {
                this.subTouchId = subTouchId;
                return this;
            }

            /**
             * <p>Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345****</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Touch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2235****</p>
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
