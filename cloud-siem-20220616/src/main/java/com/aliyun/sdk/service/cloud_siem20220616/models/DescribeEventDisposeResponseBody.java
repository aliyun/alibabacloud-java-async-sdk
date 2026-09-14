// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEventDisposeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEventDisposeResponseBody build() {
            return new DescribeEventDisposeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventDisposeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDisposeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ReceiverInfo model) {
                this.channel = model.channel;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.incidentUuid = model.incidentUuid;
                this.messageTitle = model.messageTitle;
                this.receiver = model.receiver;
                this.status = model.status;
            } 

            /**
             * <p>The channel to send the notification. Valid values:</p>
             * <ul>
             * <li><p>message: text message</p>
             * </li>
             * <li><p>mail: email</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>message</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The time when the record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the record was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The record ID of the recipient for the event handling result.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The globally unique UUID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * <p>The title of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>siem event dealed message</p>
             */
            public Builder messageTitle(String messageTitle) {
                this.messageTitle = messageTitle;
                return this;
            }

            /**
             * <p>The contact information of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>138xxxxxx</p>
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * <p>The sending status of the notification. Valid values:</p>
             * <ul>
             * <li><p>0: not sent</p>
             * </li>
             * <li><p>1: sent</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeEventDisposeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventDisposeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDispose")
        private java.util.List<?> eventDispose;

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
        public java.util.List<?> getEventDispose() {
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
            private java.util.List<?> eventDispose; 
            private ReceiverInfo receiverInfo; 
            private String remark; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventDispose = model.eventDispose;
                this.receiverInfo = model.receiverInfo;
                this.remark = model.remark;
                this.status = model.status;
            } 

            /**
             * <p>The JSON object of the event handling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{ playbookName: &quot;使用安全组封禁入方向IP&quot;, sophonTaskId: &quot;400442a5-4f98-45ed-97db-5ab117eb0b8f&quot;, … }</p>
             */
            public Builder eventDispose(java.util.List<?> eventDispose) {
                this.eventDispose = eventDispose;
                return this;
            }

            /**
             * <p>The JSON object of the alert recipient configuration.</p>
             */
            public Builder receiverInfo(ReceiverInfo receiverInfo) {
                this.receiverInfo = receiverInfo;
                return this;
            }

            /**
             * <p>The remarks on the event.</p>
             * 
             * <strong>example:</strong>
             * <p>dealed</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the event. Valid values:</p>
             * <ul>
             * <li><p>0: unhandled</p>
             * </li>
             * <li><p>1: handling</p>
             * </li>
             * <li><p>5: failed</p>
             * </li>
             * <li><p>10: handled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
