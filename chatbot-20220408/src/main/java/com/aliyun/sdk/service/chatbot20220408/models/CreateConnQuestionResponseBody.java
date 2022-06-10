// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConnQuestionResponseBody</p>
 */
public class CreateConnQuestionResponseBody extends TeaModel {
    @NameInMap("OutlineId")
    private Long outlineId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateConnQuestionResponseBody(Builder builder) {
        this.outlineId = builder.outlineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnQuestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return outlineId
     */
    public Long getOutlineId() {
        return this.outlineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long outlineId; 
        private String requestId; 

        /**
         * 关联关系ID
         */
        public Builder outlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConnQuestionResponseBody build() {
            return new CreateConnQuestionResponseBody(this);
        } 

    } 

}
