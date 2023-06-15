// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySQLCollectorRetentionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySQLCollectorRetentionResponseBody</p>
 */
public class ModifySQLCollectorRetentionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifySQLCollectorRetentionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySQLCollectorRetentionResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifySQLCollectorRetentionResponseBody build() {
            return new ModifySQLCollectorRetentionResponseBody(this);
        } 

    } 

}
