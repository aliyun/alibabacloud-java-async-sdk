// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainRealTimeDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainRealTimeDetailDataResponseBody</p>
 */
public class DescribeDcdnDomainRealTimeDetailDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainRealTimeDetailDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainRealTimeDetailDataResponseBody create() {
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
         * The information returned.
         * <p>
         * 
         * > The value of this parameter is a JSON string. The following table describes the fields in Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainRealTimeDetailDataResponseBody build() {
            return new DescribeDcdnDomainRealTimeDetailDataResponseBody(this);
        } 

    } 

}
