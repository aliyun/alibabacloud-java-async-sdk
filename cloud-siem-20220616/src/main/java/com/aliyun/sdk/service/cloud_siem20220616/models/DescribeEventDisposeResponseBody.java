// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventDisposeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventDisposeResponseBody</p>
 */
public class DescribeEventDisposeResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
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

        public DescribeEventDisposeResponseBody build() {
            return new DescribeEventDisposeResponseBody(this);
        } 

    } 

    public static class ReceiverInfo extends TeaModel {
        @NameInMap("Channel")
        private String channel;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IncidentUuid")
        private String incidentUuid;

        @NameInMap("MessageTitle")
        private String messageTitle;

        @NameInMap("Receiver")
        private String receiver;

        @NameInMap("Status")
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
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IncidentUuid.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * MessageTitle.
             */
            public Builder messageTitle(String messageTitle) {
                this.messageTitle = messageTitle;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("EventDispose")
        private java.util.List < ? > eventDispose;

        @NameInMap("ReceiverInfo")
        private ReceiverInfo receiverInfo;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
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
             * EventDispose.
             */
            public Builder eventDispose(java.util.List < ? > eventDispose) {
                this.eventDispose = eventDispose;
                return this;
            }

            /**
             * ReceiverInfo.
             */
            public Builder receiverInfo(ReceiverInfo receiverInfo) {
                this.receiverInfo = receiverInfo;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
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
