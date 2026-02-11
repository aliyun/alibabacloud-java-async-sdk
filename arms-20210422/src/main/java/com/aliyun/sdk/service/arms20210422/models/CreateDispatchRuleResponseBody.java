// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link CreateDispatchRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDispatchRuleResponseBody</p>
 */
public class CreateDispatchRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DispatchRuleId")
    private Long dispatchRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDispatchRuleResponseBody(Builder builder) {
        this.dispatchRuleId = builder.dispatchRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDispatchRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dispatchRuleId
     */
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long dispatchRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDispatchRuleResponseBody model) {
            this.dispatchRuleId = model.dispatchRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * DispatchRuleId.
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDispatchRuleResponseBody build() {
            return new CreateDispatchRuleResponseBody(this);
        } 

    } 

}
