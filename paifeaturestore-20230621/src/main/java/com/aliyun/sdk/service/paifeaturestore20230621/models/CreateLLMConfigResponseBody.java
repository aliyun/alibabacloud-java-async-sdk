// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link CreateLLMConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLLMConfigResponseBody</p>
 */
public class CreateLLMConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LLMConfigId")
    private String LLMConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLLMConfigResponseBody(Builder builder) {
        this.LLMConfigId = builder.LLMConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLLMConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return LLMConfigId
     */
    public String getLLMConfigId() {
        return this.LLMConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String LLMConfigId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLLMConfigResponseBody model) {
            this.LLMConfigId = model.LLMConfigId;
            this.requestId = model.requestId;
        } 

        /**
         * LLMConfigId.
         */
        public Builder LLMConfigId(String LLMConfigId) {
            this.LLMConfigId = LLMConfigId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLLMConfigResponseBody build() {
            return new CreateLLMConfigResponseBody(this);
        } 

    } 

}
