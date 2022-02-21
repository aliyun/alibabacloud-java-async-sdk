// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteReplicationJobResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteReplicationJobResponseBody</p>
 */
public class DeleteReplicationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteReplicationJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteReplicationJobResponseBody create() {
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

        public DeleteReplicationJobResponseBody build() {
            return new DeleteReplicationJobResponseBody(this);
        } 

    } 

}
