// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>FindVersionMessagesResponseBody</p>
 */
public class FindVersionMessagesResponseBody extends TeaModel {
    @NameInMap("MessageList")
    private MessageList messageList;

    @NameInMap("RequestId")
    private String requestId;

    private FindVersionMessagesResponseBody(Builder builder) {
        this.messageList = builder.messageList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindVersionMessagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageList
     */
    public MessageList getMessageList() {
        return this.messageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MessageList messageList; 
        private String requestId; 

        /**
         * MessageList.
         */
        public Builder messageList(MessageList messageList) {
            this.messageList = messageList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindVersionMessagesResponseBody build() {
            return new FindVersionMessagesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtModifyTimestamp")
        private Long gmtModifyTimestamp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MessageId")
        private String messageId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("TestId")
        private String testId;

        @NameInMap("VersionId")
        private String versionId;

        private Items(Builder builder) {
            this.deviceId = builder.deviceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.messageId = builder.messageId;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.testId = builder.testId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return gmtModifyTimestamp
         */
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return testId
         */
        public String getTestId() {
            return this.testId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String deviceId; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String messageId; 
            private String status; 
            private String statusDesc; 
            private String testId; 
            private String versionId; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * GmtModifyTimestamp.
             */
            public Builder gmtModifyTimestamp(Long gmtModifyTimestamp) {
                this.gmtModifyTimestamp = gmtModifyTimestamp;
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
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * TestId.
             */
            public Builder testId(String testId) {
                this.testId = testId;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class MessageList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private MessageList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public MessageList build() {
                return new MessageList(this);
            } 

        } 

    }
}
