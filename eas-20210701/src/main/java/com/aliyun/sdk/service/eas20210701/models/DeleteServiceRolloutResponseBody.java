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
 * {@link DeleteServiceRolloutResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteServiceRolloutResponseBody</p>
 */
public class DeleteServiceRolloutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteServiceRolloutResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceRolloutResponseBody create() {
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

        private Builder(DeleteServiceRolloutResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p><strong>Message</strong>  </p>
         * <ul>
         * <li>Type: <code>string</code>  </li>
         * <li>Description: The returned message. Describes the request processing result.  </li>
         * <li>Example: <code>Rollout deleted successfully</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rollout deleted successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p><strong>RequestId</strong>  </p>
         * <ul>
         * <li>Type: <code>string</code>  </li>
         * <li>Description: The request ID. The unique identifier returned for each request, used for troubleshooting and tracking.  </li>
         * <li>Example: <code>40325405-579C-4D82-9B4F-8A7C6D5E4F3A</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteServiceRolloutResponseBody build() {
            return new DeleteServiceRolloutResponseBody(this);
        } 

    } 

}
