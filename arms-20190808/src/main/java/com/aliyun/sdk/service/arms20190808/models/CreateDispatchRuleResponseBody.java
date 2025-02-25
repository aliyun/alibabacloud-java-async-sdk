// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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

        /**
         * <p>The ID of the dispatch policy.</p>
         * 
         * <strong>example:</strong>
         * <p>10413</p>
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
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
