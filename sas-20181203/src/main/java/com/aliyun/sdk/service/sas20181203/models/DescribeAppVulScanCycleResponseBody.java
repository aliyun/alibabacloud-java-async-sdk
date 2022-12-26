// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppVulScanCycleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppVulScanCycleResponseBody</p>
 */
public class DescribeAppVulScanCycleResponseBody extends TeaModel {
    @NameInMap("Cycle")
    private String cycle;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppVulScanCycleResponseBody(Builder builder) {
        this.cycle = builder.cycle;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppVulScanCycleResponseBody create() {
        return builder().build();
    }

    /**
     * @return cycle
     */
    public String getCycle() {
        return this.cycle;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cycle; 
        private String requestId; 

        /**
         * Cycle.
         */
        public Builder cycle(String cycle) {
            this.cycle = cycle;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppVulScanCycleResponseBody build() {
            return new DescribeAppVulScanCycleResponseBody(this);
        } 

    } 

}
