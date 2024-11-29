// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SecondApplyPhysicalConnectionLOAResponseBody} extends {@link TeaModel}
 *
 * <p>SecondApplyPhysicalConnectionLOAResponseBody</p>
 */
public class SecondApplyPhysicalConnectionLOAResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SecondApplyPhysicalConnectionLOAResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecondApplyPhysicalConnectionLOAResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A47BD386-7FDE-42C4-8D22-C6223D18AA1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SecondApplyPhysicalConnectionLOAResponseBody build() {
            return new SecondApplyPhysicalConnectionLOAResponseBody(this);
        } 

    } 

}
