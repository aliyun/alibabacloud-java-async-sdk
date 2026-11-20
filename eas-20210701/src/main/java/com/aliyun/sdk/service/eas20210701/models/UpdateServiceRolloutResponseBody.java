// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateServiceRolloutResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServiceRolloutResponseBody</p>
 */
public class UpdateServiceRolloutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateServiceRolloutResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRolloutResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateServiceRolloutResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response message. Describes the request processing result. Valid values:</p>
         * <ul>
         * <li>&quot;Rollout updated successfully&quot;: The policy is updated successfully.</li>
         * <li>&quot;Rollout paused successfully&quot;: The rollout is paused successfully.</li>
         * <li>&quot;Rollout resumed successfully&quot;: The rollout is resumed successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rollout updated successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. The unique identifier returned for each request, used for troubleshooting and tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateServiceRolloutResponseBody build() {
            return new UpdateServiceRolloutResponseBody(this);
        } 

    } 

}
