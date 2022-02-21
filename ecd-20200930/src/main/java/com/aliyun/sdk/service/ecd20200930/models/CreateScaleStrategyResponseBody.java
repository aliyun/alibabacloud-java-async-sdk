// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScaleStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScaleStrategyResponseBody</p>
 */
public class CreateScaleStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScaleStrategyId")
    private String scaleStrategyId;

    private CreateScaleStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scaleStrategyId = builder.scaleStrategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScaleStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scaleStrategyId
     */
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public static final class Builder {
        private String requestId; 
        private String scaleStrategyId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScaleStrategyId.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        public CreateScaleStrategyResponseBody build() {
            return new CreateScaleStrategyResponseBody(this);
        } 

    } 

}
