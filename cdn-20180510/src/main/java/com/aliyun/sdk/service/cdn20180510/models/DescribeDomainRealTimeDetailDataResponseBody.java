// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRealTimeDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeDetailDataResponseBody</p>
 */
public class DescribeDomainRealTimeDetailDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainRealTimeDetailDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRealTimeDetailDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * The monitoring data of each ISP in each region.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainRealTimeDetailDataResponseBody build() {
            return new DescribeDomainRealTimeDetailDataResponseBody(this);
        } 

    } 

}
