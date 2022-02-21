// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionMessageSendRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>FindVersionMessageSendRecordsResponseBody</p>
 */
public class FindVersionMessageSendRecordsResponseBody extends TeaModel {
    @NameInMap("MessageSendRecordList")
    private MessageSendRecordList messageSendRecordList;

    @NameInMap("RequestId")
    private String requestId;

    private FindVersionMessageSendRecordsResponseBody(Builder builder) {
        this.messageSendRecordList = builder.messageSendRecordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindVersionMessageSendRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageSendRecordList
     */
    public MessageSendRecordList getMessageSendRecordList() {
        return this.messageSendRecordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MessageSendRecordList messageSendRecordList; 
        private String requestId; 

        /**
         * MessageSendRecordList.
         */
        public Builder messageSendRecordList(MessageSendRecordList messageSendRecordList) {
            this.messageSendRecordList = messageSendRecordList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindVersionMessageSendRecordsResponseBody build() {
            return new FindVersionMessageSendRecordsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("FailedCount")
        private String failedCount;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MessageType")
        private String messageType;

        @NameInMap("Result")
        private String result;

        @NameInMap("ResultDesc")
        private String resultDesc;

        @NameInMap("SkippedCount")
        private String skippedCount;

        @NameInMap("SucceededCount")
        private String succeededCount;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("VersionId")
        private String versionId;

        private Items(Builder builder) {
            this.failedCount = builder.failedCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.id = builder.id;
            this.messageType = builder.messageType;
            this.result = builder.result;
            this.resultDesc = builder.resultDesc;
            this.skippedCount = builder.skippedCount;
            this.succeededCount = builder.succeededCount;
            this.targetId = builder.targetId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public String getFailedCount() {
            return this.failedCount;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return resultDesc
         */
        public String getResultDesc() {
            return this.resultDesc;
        }

        /**
         * @return skippedCount
         */
        public String getSkippedCount() {
            return this.skippedCount;
        }

        /**
         * @return succeededCount
         */
        public String getSucceededCount() {
            return this.succeededCount;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String failedCount; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private Long id; 
            private String messageType; 
            private String result; 
            private String resultDesc; 
            private String skippedCount; 
            private String succeededCount; 
            private String targetId; 
            private String versionId; 

            /**
             * FailedCount.
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MessageType.
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * ResultDesc.
             */
            public Builder resultDesc(String resultDesc) {
                this.resultDesc = resultDesc;
                return this;
            }

            /**
             * SkippedCount.
             */
            public Builder skippedCount(String skippedCount) {
                this.skippedCount = skippedCount;
                return this;
            }

            /**
             * SucceededCount.
             */
            public Builder succeededCount(String succeededCount) {
                this.succeededCount = succeededCount;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
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
    public static class MessageSendRecordList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private MessageSendRecordList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageSendRecordList create() {
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

            public MessageSendRecordList build() {
                return new MessageSendRecordList(this);
            } 

        } 

    }
}
