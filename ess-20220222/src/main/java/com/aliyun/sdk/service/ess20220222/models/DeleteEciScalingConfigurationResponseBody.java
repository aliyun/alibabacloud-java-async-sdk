// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DeleteEciScalingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEciScalingConfigurationResponseBody</p>
 */
public class DeleteEciScalingConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * <p>The request ID is consistently returned in the response, irrespective of whether the request is executed successfully or encounters an error.</p>
         * 
         * <strong>example:</strong>
         * <p>45D5B0AD-3B00-4A9B-9911-6D5303B06712</p>
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
