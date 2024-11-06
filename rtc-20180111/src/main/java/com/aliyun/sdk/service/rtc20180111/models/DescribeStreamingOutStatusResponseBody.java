// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeStreamingOutStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamingOutStatusResponseBody</p>
 */
public class DescribeStreamingOutStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeStreamingOutStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamingOutStatusResponseBody create() {
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
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Integer status; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeStreamingOutStatusResponseBody build() {
            return new DescribeStreamingOutStatusResponseBody(this);
        } 

    } 

}
