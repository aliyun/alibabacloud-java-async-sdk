// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

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
 * {@link BatchSendMessageToGlobeResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSendMessageToGlobeResponseBody</p>
 */
public class BatchSendMessageToGlobeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedList")
    private String failedList;

    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.NameInMap("MessageIdList")
    private String messageIdList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseCode")
    private String responseCode;

    @com.aliyun.core.annotation.NameInMap("ResponseDescription")
    private String responseDescription;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BatchSendMessageToGlobeResponseBody model) {
            this.failedList = model.failedList;
            this.from = model.from;
            this.messageIdList = model.messageIdList;
            this.requestId = model.requestId;
            this.responseCode = model.responseCode;
            this.responseDescription = model.responseDescription;
            this.successCount = model.successCount;
        } 

        /**
         * <p>The list of the mobile phone numbers that failed to receive the messages.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;931520581****&quot;,&quot;931530581****&quot;]</p>
         */
        public Builder failedList(String failedList) {
            this.failedList = failedList;
            return this;
        }

        /**
         * <p>The sender ID that was returned. The API operation returns the sender ID that you have specified in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicloud321</p>
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the sent message.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;123****&quot;,&quot;124****&quot;]</p>
         */
        public Builder messageIdList(String messageIdList) {
            this.messageIdList = messageIdList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8D28D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The HTTP status code. If OK is returned, the request is successful. For more information, see <a href="https://help.aliyun.com/document_detail/180674.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>The SMS Send Request was accepted</p>
         */
        public Builder responseDescription(String responseDescription) {
            this.responseDescription = responseDescription;
            return this;
        }

        /**
         * <p>The number of sent messages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
