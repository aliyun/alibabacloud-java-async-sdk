// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConversationListResponseBody} extends {@link TeaModel}
 *
 * <p>GetConversationListResponseBody</p>
 */
public class GetConversationListResponseBody extends TeaModel {
    @NameInMap("Messages")
    private java.util.List < java.util.Map<String, String>> messages;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Long totalCounts;

    private GetConversationListResponseBody(Builder builder) {
        this.messages = builder.messages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConversationListResponseBody create() {
        return builder().build();
    }

    /**
     * @return messages
     */
    public java.util.List < java.util.Map<String, String>> getMessages() {
        return this.messages;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCounts
     */
    public Long getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, String>> messages; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCounts; 

        /**
         * Messages.
         */
        public Builder messages(java.util.List < java.util.Map<String, String>> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * TotalCounts.
         */
        public Builder totalCounts(Long totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public GetConversationListResponseBody build() {
            return new GetConversationListResponseBody(this);
        } 

    } 

}
