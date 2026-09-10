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
 * {@link ModifyApplicationPromptResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApplicationPromptResponseBody</p>
 */
public class ModifyApplicationPromptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PromptId")
    private String promptId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyApplicationPromptResponseBody(Builder builder) {
        this.promptId = builder.promptId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationPromptResponseBody create() {
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

        private Builder(ModifyApplicationPromptResponseBody model) {
            this.promptId = model.promptId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the modified prompt.</p>
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
         * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyApplicationPromptResponseBody build() {
            return new ModifyApplicationPromptResponseBody(this);
        } 

    } 

}
