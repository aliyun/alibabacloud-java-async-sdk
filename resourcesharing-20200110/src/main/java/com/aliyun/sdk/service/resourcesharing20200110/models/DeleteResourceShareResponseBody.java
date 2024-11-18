// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteResourceShareResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteResourceShareResponseBody</p>
 */
public class DeleteResourceShareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteResourceShareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceShareResponseBody create() {
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
         * <p>A627EE2A-223D-4E1F-A954-394686AEA916</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteResourceShareResponseBody build() {
            return new DeleteResourceShareResponseBody(this);
        } 

    } 

}
