// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteApplicationPromptResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteApplicationPromptResponseBody</p>
 */
public class DeleteApplicationPromptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PromptId")
    private String promptId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteApplicationPromptResponseBody(Builder builder) {
        this.promptId = builder.promptId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationPromptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String promptId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteApplicationPromptResponseBody model) {
            this.promptId = model.promptId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Prompt ID.</p>
         * 
         * <strong>example:</strong>
         * <p>papt-f9lajgw765f4fnrzn1</p>
         */
        public Builder promptId(String promptId) {
            this.promptId = promptId;
            return this;
        }

        /**
         * <p>The Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteApplicationPromptResponseBody build() {
            return new DeleteApplicationPromptResponseBody(this);
        } 

    } 

}
