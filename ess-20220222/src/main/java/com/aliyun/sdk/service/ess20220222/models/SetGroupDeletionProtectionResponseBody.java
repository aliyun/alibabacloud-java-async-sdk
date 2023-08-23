// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGroupDeletionProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>SetGroupDeletionProtectionResponseBody</p>
 */
public class SetGroupDeletionProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetGroupDeletionProtectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGroupDeletionProtectionResponseBody create() {
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

        public SetGroupDeletionProtectionResponseBody build() {
            return new SetGroupDeletionProtectionResponseBody(this);
        } 

    } 

}
