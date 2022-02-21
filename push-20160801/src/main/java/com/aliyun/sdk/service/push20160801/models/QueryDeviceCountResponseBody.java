// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceCountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceCountResponseBody</p>
 */
public class QueryDeviceCountResponseBody extends TeaModel {
    @NameInMap("DeviceCount")
    private Long deviceCount;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDeviceCountResponseBody(Builder builder) {
        this.deviceCount = builder.deviceCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceCount
     */
    public Long getDeviceCount() {
        return this.deviceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long deviceCount; 
        private String requestId; 

        /**
         * DeviceCount.
         */
        public Builder deviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDeviceCountResponseBody build() {
            return new QueryDeviceCountResponseBody(this);
        } 

    } 

}
