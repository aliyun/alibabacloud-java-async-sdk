// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDDosEventMaxResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventMaxResponseBody</p>
 */
public class DescribeDDosEventMaxResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cps")
    private Long cps;

    @com.aliyun.core.annotation.NameInMap("Mbps")
    private Long mbps;

    @com.aliyun.core.annotation.NameInMap("Qps")
    private Long qps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The peak of connection flood attacks. Unit: connections per seconds (CPS).</p>
         * 
         * <strong>example:</strong>
         * <p>1302</p>
         */
        public Builder cps(Long cps) {
            this.cps = cps;
            return this;
        }

        /**
         * <p>The peak of volumetric attacks. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>6809</p>
         */
        public Builder mbps(Long mbps) {
            this.mbps = mbps;
            return this;
        }

        /**
         * <p>The peak of resource exhaustion attacks. Unit: queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>26314</p>
         */
        public Builder qps(Long qps) {
            this.qps = qps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5AE2FC86-C840-41AE-9F1A-3A2747C7C1DF</p>
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
