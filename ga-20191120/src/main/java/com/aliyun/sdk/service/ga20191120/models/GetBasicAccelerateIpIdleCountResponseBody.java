// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicAccelerateIpIdleCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicAccelerateIpIdleCountResponseBody</p>
 */
public class GetBasicAccelerateIpIdleCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetBasicAccelerateIpIdleCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicAccelerateIpIdleCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned, which indicates the number of idle accelerated IP addresses.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetBasicAccelerateIpIdleCountResponseBody build() {
            return new GetBasicAccelerateIpIdleCountResponseBody(this);
        } 

    } 

}
