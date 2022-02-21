// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>StopPipelineResponseBody</p>
 */
public class StopPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopPipelineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPipelineResponseBody create() {
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

        public StopPipelineResponseBody build() {
            return new StopPipelineResponseBody(this);
        } 

    } 

}
