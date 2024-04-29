// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppVulScanCycleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppVulScanCycleResponseBody</p>
 */
public class DescribeAppVulScanCycleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cycle")
    private String cycle;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The scan cycle for application vulnerabilities.
         * <p>
         * 
         * *   1week
         * *   2weeks
         * *   3days
         */
        public Builder cycle(String cycle) {
            this.cycle = cycle;
            return this;
        }

        /**
         * The ID of the request.
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
