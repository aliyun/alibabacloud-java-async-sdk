// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>DetachDbfsResponseBody</p>
 */
public class DetachDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachDbfsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDbfsResponseBody create() {
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

        public DetachDbfsResponseBody build() {
            return new DetachDbfsResponseBody(this);
        } 

    } 

}
