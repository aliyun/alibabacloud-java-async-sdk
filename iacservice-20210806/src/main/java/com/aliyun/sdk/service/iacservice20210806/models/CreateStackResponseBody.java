// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateStackResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStackResponseBody</p>
 */
public class CreateStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stackId")
    private String stackId;

    private CreateStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackResponseBody create() {
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
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder {
        private String requestId; 
        private String stackId; 

        private Builder() {
        } 

        private Builder(CreateStackResponseBody model) {
            this.requestId = model.requestId;
            this.stackId = model.stackId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79284133-D4BA-56B3-954C-D538256F7EAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stack ID. This is the unique identifier of the stack after it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqbxxxxx</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public CreateStackResponseBody build() {
            return new CreateStackResponseBody(this);
        } 

    } 

}
