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
 * {@link CreateApplicationPromptResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationPromptResponseBody</p>
 */
public class CreateApplicationPromptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PromptId")
    private String promptId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationPromptResponseBody(Builder builder) {
        this.promptId = builder.promptId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationPromptResponseBody create() {
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

        private Builder(CreateApplicationPromptResponseBody model) {
            this.promptId = model.promptId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the Prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>papt-f9lajgw765f4fnrzn1</p>
         */
        public Builder promptId(String promptId) {
            this.promptId = promptId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationPromptResponseBody build() {
            return new CreateApplicationPromptResponseBody(this);
        } 

    } 

}
