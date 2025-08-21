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
 * {@link CreateConnQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConnQuestionResponseBody</p>
 */
public class CreateConnQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OutlineId")
    private Long outlineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateConnQuestionResponseBody model) {
            this.outlineId = model.outlineId;
            this.requestId = model.requestId;
        } 

        /**
         * OutlineId.
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
