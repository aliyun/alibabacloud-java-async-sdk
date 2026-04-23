// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetAIAgentConcurrencyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIAgentConcurrencyResponseBody</p>
 */
public class GetAIAgentConcurrencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveCount")
    private Integer activeCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAIAgentConcurrencyResponseBody(Builder builder) {
        this.activeCount = builder.activeCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIAgentConcurrencyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeCount
     */
    public Integer getActiveCount() {
        return this.activeCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer activeCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAIAgentConcurrencyResponseBody model) {
            this.activeCount = model.activeCount;
            this.requestId = model.requestId;
        } 

        /**
         * ActiveCount.
         */
        public Builder activeCount(Integer activeCount) {
            this.activeCount = activeCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIAgentConcurrencyResponseBody build() {
            return new GetAIAgentConcurrencyResponseBody(this);
        } 

    } 

}
