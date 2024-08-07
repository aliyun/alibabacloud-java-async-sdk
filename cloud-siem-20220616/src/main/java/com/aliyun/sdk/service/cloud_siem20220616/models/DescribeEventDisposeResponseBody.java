// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventDisposeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventDisposeResponseBody</p>
 */
public class DescribeEventDisposeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEventDisposeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventDisposeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEventDisposeResponseBody build() {
            return new DescribeEventDisposeResponseBody(this);
        } 

    } 

    public static class ReceiverInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("MessageTitle")
        private String messageTitle;

        @com.aliyun.core.annotation.NameInMap("Receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private ReceiverInfo(Builder builder) {
            this.channel = builder.channel;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentUuid = builder.incidentUuid;
            this.messageTitle = builder.messageTitle;
            this.receiver = builder.receiver;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiverInfo create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return messageTitle
         */
        public String getMessageTitle() {
            return this.messageTitle;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String channel; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentUuid; 
            private String messageTitle; 
            private String receiver; 
            private Integer status; 

            /**
             * The channel of the contact information. Valid values:
             * <p>
             * 
             * *   message
             * *   mail
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the recipient who receives the event handling result.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The UUID of the event.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * The message title.
             */
            public Builder messageTitle(String messageTitle) {
                this.messageTitle = messageTitle;
                return this;
            }

            /**
             * The contact information of the recipient.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * Indicates whether the message is sent. Valid values:
             * <p>
             * 
             * *   0: not sent
             * *   1: sent
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ReceiverInfo build() {
                return new ReceiverInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDispose")
        private java.util.List < ? > eventDispose;

        @com.aliyun.core.annotation.NameInMap("ReceiverInfo")
        private ReceiverInfo receiverInfo;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.eventDispose = builder.eventDispose;
            this.receiverInfo = builder.receiverInfo;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventDispose
         */
        public java.util.List < ? > getEventDispose() {
            return this.eventDispose;
        }

        /**
         * @return receiverInfo
         */
        public ReceiverInfo getReceiverInfo() {
            return this.receiverInfo;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < ? > eventDispose; 
            private ReceiverInfo receiverInfo; 
            private String remark; 
            private Integer status; 

            /**
             * An array consisting of JSON objects that are configured for event handling.
             */
            public Builder eventDispose(java.util.List < ? > eventDispose) {
                this.eventDispose = eventDispose;
                return this;
            }

            /**
             * The JSON object that is configured for an alert recipient.
             */
            public Builder receiverInfo(ReceiverInfo receiverInfo) {
                this.receiverInfo = receiverInfo;
                return this;
            }

            /**
             * The description of the event.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the event. Valid values:
             * <p>
             * 
             * *   0: not handled
             * *   1: handing
             * *   5: handling failed
             * *   10: handled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
