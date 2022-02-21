// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageCapacityUnitDeductFactorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageCapacityUnitDeductFactorResponseBody</p>
 */
public class DescribeStorageCapacityUnitDeductFactorResponseBody extends TeaModel {
    @NameInMap("DeductFactor")
    private String deductFactor;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeStorageCapacityUnitDeductFactorResponseBody(Builder builder) {
        this.deductFactor = builder.deductFactor;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageCapacityUnitDeductFactorResponseBody create() {
        return builder().build();
    }

    /**
     * @return deductFactor
     */
    public String getDeductFactor() {
        return this.deductFactor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deductFactor; 
        private String requestId; 

        /**
         * DeductFactor.
         */
        public Builder deductFactor(String deductFactor) {
            this.deductFactor = deductFactor;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeStorageCapacityUnitDeductFactorResponseBody build() {
            return new DescribeStorageCapacityUnitDeductFactorResponseBody(this);
        } 

    } 

}
