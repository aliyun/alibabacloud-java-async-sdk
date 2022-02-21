// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBackupPlanResponseBody</p>
 */
public class DeleteBackupPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteBackupPlanResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPlanResponseBody create() {
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

        public DeleteBackupPlanResponseBody build() {
            return new DeleteBackupPlanResponseBody(this);
        } 

    } 

}
