// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseEipSegmentAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseEipSegmentAddressResponseBody</p>
 */
public class ReleaseEipSegmentAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReleaseEipSegmentAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseEipSegmentAddressResponseBody create() {
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

        public ReleaseEipSegmentAddressResponseBody build() {
            return new ReleaseEipSegmentAddressResponseBody(this);
        } 

    } 

}
