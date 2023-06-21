// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSendMessageToGlobeResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSendMessageToGlobeResponseBody</p>
 */
public class BatchSendMessageToGlobeResponseBody extends TeaModel {
    @NameInMap("FailedList")
    private String failedList;

    @NameInMap("From")
    private String from;

    @NameInMap("MessageIdList")
    private String messageIdList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResponseCode")
    private String responseCode;

    @NameInMap("ResponseDescription")
    private String responseDescription;

    @NameInMap("SuccessCount")
    private String successCount;

    private BatchSendMessageToGlobeResponseBody(Builder builder) {
        this.failedList = builder.failedList;
        this.from = builder.from;
        this.messageIdList = builder.messageIdList;
        this.requestId = builder.requestId;
        this.responseCode = builder.responseCode;
        this.responseDescription = builder.responseDescription;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMessageToGlobeResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedList
     */
    public String getFailedList() {
        return this.failedList;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return messageIdList
     */
    public String getMessageIdList() {
        return this.messageIdList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return responseDescription
     */
    public String getResponseDescription() {
        return this.responseDescription;
    }

    /**
     * @return successCount
     */
    public String getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String failedList; 
        private String from; 
        private String messageIdList; 
        private String requestId; 
        private String responseCode; 
        private String responseDescription; 
        private String successCount; 

        /**
         * The list of mobile phone numbers that failed to receive the message.
         */
        public Builder failedList(String failedList) {
            this.failedList = failedList;
            return this;
        }

        /**
         * The sender ID returned.
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * The ID of the message.
         */
        public Builder messageIdList(String messageIdList) {
            this.messageIdList = messageIdList;
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
         * The status code. If OK is returned, the request is successful. For more information, see [Error codes](https://www.alibabacloud.com/help/zh/short-message-service/latest/error-codes).
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * The description of the status code.
         */
        public Builder responseDescription(String responseDescription) {
            this.responseDescription = responseDescription;
            return this;
        }

        /**
         * The number of mobile phone numbers that received the message.
         */
        public Builder successCount(String successCount) {
            this.successCount = successCount;
            return this;
        }

        public BatchSendMessageToGlobeResponseBody build() {
            return new BatchSendMessageToGlobeResponseBody(this);
        } 

    } 

}
