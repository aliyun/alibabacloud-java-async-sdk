// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchIgraphDemoResponseBody} extends {@link TeaModel}
 *
 * <p>SearchIgraphDemoResponseBody</p>
 */
public class SearchIgraphDemoResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.Map < String, ? > result;

    @NameInMap("returnTimeMs")
    private Long returnTimeMs;

    private SearchIgraphDemoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.returnTimeMs = builder.returnTimeMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchIgraphDemoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public java.util.Map < String, ? > getResult() {
        return this.result;
    }

    /**
     * @return returnTimeMs
     */
    public Long getReturnTimeMs() {
        return this.returnTimeMs;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.Map < String, ? > result; 
        private Long returnTimeMs; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.Map < String, ? > result) {
            this.result = result;
            return this;
        }

        /**
         * returnTimeMs.
         */
        public Builder returnTimeMs(Long returnTimeMs) {
            this.returnTimeMs = returnTimeMs;
            return this;
        }

        public SearchIgraphDemoResponseBody build() {
            return new SearchIgraphDemoResponseBody(this);
        } 

    } 

}
