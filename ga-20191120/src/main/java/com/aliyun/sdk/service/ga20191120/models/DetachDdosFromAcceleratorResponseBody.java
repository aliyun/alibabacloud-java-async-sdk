// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDdosFromAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>DetachDdosFromAcceleratorResponseBody</p>
 */
public class DetachDdosFromAcceleratorResponseBody extends TeaModel {
    @NameInMap("DdosId")
    private String ddosId;

    @NameInMap("RequestId")
    private String requestId;

    private DetachDdosFromAcceleratorResponseBody(Builder builder) {
        this.ddosId = builder.ddosId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDdosFromAcceleratorResponseBody create() {
        return builder().build();
    }

    /**
     * @return ddosId
     */
    public String getDdosId() {
        return this.ddosId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ddosId; 
        private String requestId; 

        /**
         * DdosId.
         */
        public Builder ddosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachDdosFromAcceleratorResponseBody build() {
            return new DetachDdosFromAcceleratorResponseBody(this);
        } 

    } 

}
