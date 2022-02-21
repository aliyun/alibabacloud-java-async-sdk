// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventMaxResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventMaxResponseBody</p>
 */
public class DescribeDDosEventMaxResponseBody extends TeaModel {
    @NameInMap("Cps")
    private Long cps;

    @NameInMap("Mbps")
    private Long mbps;

    @NameInMap("Qps")
    private Long qps;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDDosEventMaxResponseBody(Builder builder) {
        this.cps = builder.cps;
        this.mbps = builder.mbps;
        this.qps = builder.qps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosEventMaxResponseBody create() {
        return builder().build();
    }

    /**
     * @return cps
     */
    public Long getCps() {
        return this.cps;
    }

    /**
     * @return mbps
     */
    public Long getMbps() {
        return this.mbps;
    }

    /**
     * @return qps
     */
    public Long getQps() {
        return this.qps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long cps; 
        private Long mbps; 
        private Long qps; 
        private String requestId; 

        /**
         * Cps.
         */
        public Builder cps(Long cps) {
            this.cps = cps;
            return this;
        }

        /**
         * Mbps.
         */
        public Builder mbps(Long mbps) {
            this.mbps = mbps;
            return this;
        }

        /**
         * Qps.
         */
        public Builder qps(Long qps) {
            this.qps = qps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDDosEventMaxResponseBody build() {
            return new DescribeDDosEventMaxResponseBody(this);
        } 

    } 

}
