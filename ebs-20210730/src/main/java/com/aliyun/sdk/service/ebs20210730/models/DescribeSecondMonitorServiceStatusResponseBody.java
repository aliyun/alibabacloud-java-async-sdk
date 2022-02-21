// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecondMonitorServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecondMonitorServiceStatusResponseBody</p>
 */
public class DescribeSecondMonitorServiceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeSecondMonitorServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecondMonitorServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status of service
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeSecondMonitorServiceStatusResponseBody build() {
            return new DescribeSecondMonitorServiceStatusResponseBody(this);
        } 

    } 

}
