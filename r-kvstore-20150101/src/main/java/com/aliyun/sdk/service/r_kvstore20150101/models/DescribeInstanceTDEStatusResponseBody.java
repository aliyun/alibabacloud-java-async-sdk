// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTDEStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTDEStatusResponseBody</p>
 */
public class DescribeInstanceTDEStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeInstanceTDEStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTDEStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String TDEStatus; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether TDE is enabled. Valid values:
         * <p>
         * 
         * *   **Enabled**: TDE is enabled.
         * *   **Disable**: TDE is disabled.
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeInstanceTDEStatusResponseBody build() {
            return new DescribeInstanceTDEStatusResponseBody(this);
        } 

    } 

}
