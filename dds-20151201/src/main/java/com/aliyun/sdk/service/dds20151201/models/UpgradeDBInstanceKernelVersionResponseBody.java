// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceKernelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeDBInstanceKernelVersionResponseBody</p>
 */
public class UpgradeDBInstanceKernelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpgradeDBInstanceKernelVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceKernelVersionResponseBody create() {
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

        public UpgradeDBInstanceKernelVersionResponseBody build() {
            return new UpgradeDBInstanceKernelVersionResponseBody(this);
        } 

    } 

}
