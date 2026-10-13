// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateSimQuestionResponseBody model) {
            this.requestId = model.requestId;
            this.simQuestionId = model.simQuestionId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16AC1B3C-66E0-438B-BB7C-71B692407B67</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The similar question ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000002788</p>
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
