// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainRealTimeDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainRealTimeDetailDataResponseBody</p>
 */
public class DescribeVodDomainRealTimeDetailDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainRealTimeDetailDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainRealTimeDetailDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVodDomainRealTimeDetailDataResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned results.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1710298E-8AFA-5F6D-A3E9-47103C52177D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainRealTimeDetailDataResponseBody build() {
            return new DescribeVodDomainRealTimeDetailDataResponseBody(this);
        } 

    } 

}
