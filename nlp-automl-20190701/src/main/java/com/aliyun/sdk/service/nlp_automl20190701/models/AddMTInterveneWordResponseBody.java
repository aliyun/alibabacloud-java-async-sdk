// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMTInterveneWordResponseBody} extends {@link TeaModel}
 *
 * <p>AddMTInterveneWordResponseBody</p>
 */
public class AddMTInterveneWordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WordId")
    private Long wordId;

    private AddMTInterveneWordResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.wordId = builder.wordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMTInterveneWordResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return wordId
     */
    public Long getWordId() {
        return this.wordId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Long wordId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * WordId.
         */
        public Builder wordId(Long wordId) {
            this.wordId = wordId;
            return this;
        }

        public AddMTInterveneWordResponseBody build() {
            return new AddMTInterveneWordResponseBody(this);
        } 

    } 

}
