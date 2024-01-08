// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearPairDrillResponseBody} extends {@link TeaModel}
 *
 * <p>ClearPairDrillResponseBody</p>
 */
public class ClearPairDrillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ClearPairDrillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearPairDrillResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClearPairDrillResponseBody build() {
            return new ClearPairDrillResponseBody(this);
        } 

    } 

}
