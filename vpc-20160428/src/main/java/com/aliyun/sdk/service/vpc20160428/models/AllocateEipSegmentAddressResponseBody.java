// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateEipSegmentAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateEipSegmentAddressResponseBody</p>
 */
public class AllocateEipSegmentAddressResponseBody extends TeaModel {
    @NameInMap("EipSegmentInstanceId")
    private String eipSegmentInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    private AllocateEipSegmentAddressResponseBody(Builder builder) {
        this.eipSegmentInstanceId = builder.eipSegmentInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipSegmentAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipSegmentInstanceId
     */
    public String getEipSegmentInstanceId() {
        return this.eipSegmentInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eipSegmentInstanceId; 
        private String requestId; 

        /**
         * EipSegmentInstanceId.
         */
        public Builder eipSegmentInstanceId(String eipSegmentInstanceId) {
            this.eipSegmentInstanceId = eipSegmentInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateEipSegmentAddressResponseBody build() {
            return new AllocateEipSegmentAddressResponseBody(this);
        } 

    } 

}
