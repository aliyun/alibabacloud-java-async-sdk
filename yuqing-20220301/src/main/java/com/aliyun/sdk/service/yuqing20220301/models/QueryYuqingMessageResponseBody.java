// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryYuqingMessageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryYuqingMessageResponseBody</p>
 */
public class QueryYuqingMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("yuqingMessages")
    private java.util.List < YuqingMessage > yuqingMessages;

    private QueryYuqingMessageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.yuqingMessages = builder.yuqingMessages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryYuqingMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return yuqingMessages
     */
    public java.util.List < YuqingMessage > getYuqingMessages() {
        return this.yuqingMessages;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < YuqingMessage > yuqingMessages; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>adacae47-6fc0-45c6-897c-26201aefbdfd</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * yuqingMessages.
         */
        public Builder yuqingMessages(java.util.List < YuqingMessage > yuqingMessages) {
            this.yuqingMessages = yuqingMessages;
            return this;
        }

        public QueryYuqingMessageResponseBody build() {
            return new QueryYuqingMessageResponseBody(this);
        } 

    } 

}
