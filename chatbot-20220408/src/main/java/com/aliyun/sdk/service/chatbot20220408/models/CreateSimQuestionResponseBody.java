// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSimQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimQuestionResponseBody</p>
 */
public class CreateSimQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimQuestionId")
    private Long simQuestionId;

    private CreateSimQuestionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.simQuestionId = builder.simQuestionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimQuestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simQuestionId
     */
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

    public static final class Builder {
        private String requestId; 
        private Long simQuestionId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SimQuestionId.
         */
        public Builder simQuestionId(Long simQuestionId) {
            this.simQuestionId = simQuestionId;
            return this;
        }

        public CreateSimQuestionResponseBody build() {
            return new CreateSimQuestionResponseBody(this);
        } 

    } 

}
