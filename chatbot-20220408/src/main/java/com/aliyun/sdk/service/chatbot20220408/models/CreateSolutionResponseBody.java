// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSolutionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSolutionResponseBody</p>
 */
public class CreateSolutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SolutionId")
    private Long solutionId;

    private CreateSolutionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSolutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solutionId
     */
    public Long getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder {
        private String requestId; 
        private Long solutionId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SolutionId.
         */
        public Builder solutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }

        public CreateSolutionResponseBody build() {
            return new CreateSolutionResponseBody(this);
        } 

    } 

}
