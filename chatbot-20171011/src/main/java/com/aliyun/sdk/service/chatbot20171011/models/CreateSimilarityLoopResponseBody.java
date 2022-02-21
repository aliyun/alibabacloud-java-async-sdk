// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimilarityLoopResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimilarityLoopResponseBody</p>
 */
public class CreateSimilarityLoopResponseBody extends TeaModel {
    @NameInMap("Data")
    private Long data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Success")
    private Boolean success;

    private CreateSimilarityLoopResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarityLoopResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long data; 
        private String message; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Long data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSimilarityLoopResponseBody build() {
            return new CreateSimilarityLoopResponseBody(this);
        } 

    } 

}
