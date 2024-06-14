// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostISRerankResponseBody} extends {@link TeaModel}
 *
 * <p>PostISRerankResponseBody</p>
 */
public class PostISRerankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map < String, ? > data;

    @com.aliyun.core.annotation.NameInMap("DebugInfo")
    private java.util.Map < String, ? > debugInfo;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private PostISRerankResponseBody(Builder builder) {
        this.data = builder.data;
        this.debugInfo = builder.debugInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostISRerankResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.Map < String, ? > getData() {
        return this.data;
    }

    /**
     * @return debugInfo
     */
    public java.util.Map < String, ? > getDebugInfo() {
        return this.debugInfo;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.Map < String, ? > data; 
        private java.util.Map < String, ? > debugInfo; 
        private String message; 
        private String requestId; 
        private Integer status; 

        /**
         * Data.
         */
        public Builder data(java.util.Map < String, ? > data) {
            this.data = data;
            return this;
        }

        /**
         * DebugInfo.
         */
        public Builder debugInfo(java.util.Map < String, ? > debugInfo) {
            this.debugInfo = debugInfo;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public PostISRerankResponseBody build() {
            return new PostISRerankResponseBody(this);
        } 

    } 

}
