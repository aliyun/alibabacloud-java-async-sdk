// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ExecStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ExecStrategyResponseBody</p>
 */
public class ExecStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ExecStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecStrategyResponseBody build() {
            return new ExecStrategyResponseBody(this);
        } 

    } 

}
