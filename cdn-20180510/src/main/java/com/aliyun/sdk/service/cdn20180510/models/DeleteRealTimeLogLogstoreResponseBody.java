// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRealTimeLogLogstoreResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRealTimeLogLogstoreResponseBody</p>
 */
public class DeleteRealTimeLogLogstoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteRealTimeLogLogstoreResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRealTimeLogLogstoreResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteRealTimeLogLogstoreResponseBody build() {
            return new DeleteRealTimeLogLogstoreResponseBody(this);
        } 

    } 

}
