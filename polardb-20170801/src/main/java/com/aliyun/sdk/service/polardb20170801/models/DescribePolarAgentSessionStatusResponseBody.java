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
 * {@link DescribePolarAgentSessionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarAgentSessionStatusResponseBody</p>
 */
public class DescribePolarAgentSessionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private DescribePolarAgentSessionStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarAgentSessionStatusResponseBody create() {
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
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Long status; 

        private Builder() {
        } 

        private Builder(DescribePolarAgentSessionStatusResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public DescribePolarAgentSessionStatusResponseBody build() {
            return new DescribePolarAgentSessionStatusResponseBody(this);
        } 

    } 

}
