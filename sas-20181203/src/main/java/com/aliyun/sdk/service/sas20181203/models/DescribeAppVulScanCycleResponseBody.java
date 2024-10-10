// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The scan cycle for application vulnerabilities.</p>
         * <ul>
         * <li>1week</li>
         * <li>2weeks</li>
         * <li>3days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1week</p>
         */
        public Builder cycle(String cycle) {
            this.cycle = cycle;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>934E6D2A-0123-5A99-88BA-80DC27634E22</p>
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
