// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEciScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEciScalingConfigurationResponseBody</p>
 */
public class DeleteEciScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteEciScalingConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEciScalingConfigurationResponseBody create() {
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
         * The ID of the request. This request ID is returned regardless of whether the request is successful.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteEciScalingConfigurationResponseBody build() {
            return new DeleteEciScalingConfigurationResponseBody(this);
        } 

    } 

}
