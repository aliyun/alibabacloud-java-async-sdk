// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information returned.</p>
         * <blockquote>
         * <p>The value of this parameter is a JSON string. The following table describes the fields in Data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *       &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
         *       &quot;domain_name&quot;: &quot;example.com&quot;,
         *       &quot;location&quot;: &quot;Guangdong&quot;,
         *       &quot;isp&quot;: &quot;telecom&quot;,
         *       &quot;qps&quot;: 10.0
         *     },
         *     {
         *       &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
         *       &quot;domain_name&quot;: &quot;example.com&quot;,
         *       &quot;location&quot;: &quot;Jiangsu&quot;,
         *       &quot;isp&quot;: &quot;unicom&quot;,
         *       &quot;qps&quot;: 11.1
         *     }
         *   ]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A603F324-7A05-4FB3-ADF3-2563233D26CC</p>
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
