// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetDestinationCidrBlockResponseBody} extends {@link TeaModel}
 *
 * <p>GetDestinationCidrBlockResponseBody</p>
 */
public class GetDestinationCidrBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDestinationCidrBlockResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDestinationCidrBlockResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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

    public static final class Builder {
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response status code</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response content</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Error message. (Indicates the reason for the anomaly when the instance status is abnormal.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of this request</p>
         * 
         * <strong>example:</strong>
         * <p>D349EE86-AF3F-5F6C-87E2-2A08D3618350</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDestinationCidrBlockResponseBody build() {
            return new GetDestinationCidrBlockResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDestinationCidrBlockResponseBody} extends {@link TeaModel}
     *
     * <p>GetDestinationCidrBlockResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private java.util.List<String> destinationCidrBlock;

        private Content(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public java.util.List<String> getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public static final class Builder {
            private java.util.List<String> destinationCidrBlock; 

            /**
             * <p>List of destination CIDR block information for the current network instance</p>
             */
            public Builder destinationCidrBlock(java.util.List<String> destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
