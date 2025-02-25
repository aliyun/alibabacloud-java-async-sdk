// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScenarioStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetScenarioStatusResponseBody</p>
 */
public class SetScenarioStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetScenarioStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetScenarioStatusResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetScenarioStatusResponseBody build() {
            return new SetScenarioStatusResponseBody(this);
        } 

    } 

}
