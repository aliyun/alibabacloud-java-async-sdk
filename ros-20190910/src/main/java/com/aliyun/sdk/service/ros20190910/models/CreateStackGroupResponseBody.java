// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link CreateStackGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStackGroupResponseBody</p>
 */
public class CreateStackGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackGroupId")
    private String stackGroupId;

    private CreateStackGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackGroupId = builder.stackGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackGroupResponseBody create() {
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
     * @return stackGroupId
     */
    public String getStackGroupId() {
        return this.stackGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String stackGroupId; 

        private Builder() {
        } 

        private Builder(CreateStackGroupResponseBody model) {
            this.requestId = model.requestId;
            this.stackGroupId = model.stackGroupId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>2c036e78-9e82-428e-afd6-177f5d04****</p>
         */
        public Builder stackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }

        public CreateStackGroupResponseBody build() {
            return new CreateStackGroupResponseBody(this);
        } 

    } 

}
