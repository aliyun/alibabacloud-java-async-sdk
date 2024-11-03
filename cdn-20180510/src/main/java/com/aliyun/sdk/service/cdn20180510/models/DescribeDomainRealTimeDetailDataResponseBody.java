// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainRealTimeDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainRealTimeDetailDataResponseBody</p>
 */
public class DescribeDomainRealTimeDetailDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The monitoring data of each ISP in each region.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
         *             &quot;domain_name&quot;: &quot;example.com&quot;,
         *             &quot;location&quot;: &quot;Guangdong&quot;,
         *             &quot;isp&quot;: &quot;telecom&quot;,
         *             &quot;qps&quot;: 10
         *       },
         *       {
         *             &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
         *             &quot;domain_name&quot;: &quot;example.com&quot;,
         *             &quot;location&quot;: &quot;Jiangsu&quot;,
         *             &quot;isp&quot;: &quot;unicom&quot;,
         *             &quot;qps&quot;: 11.1
         *       }
         * ]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
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
