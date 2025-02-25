// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSubListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSubListResponseBody</p>
 */
public class DescribeDcdnSubListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnSubListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSubListResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 

        /**
         * <p>The information about the custom report.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;data&quot;: [{&quot;subId&quot;: 336,&quot;reportId&quot;: [6,8],&quot;createTime&quot;: &quot;2021-07-05T06:18:46Z&quot;,&quot;domains&quot;: [&quot;example.com&quot;],&quot;effectiveFrom&quot;: &quot;2021-07-05T06:18:46Z&quot;,&quot;effectiveEnd&quot;: &quot;2021-10-05T06:18:46Z&quot;,&quot;status&quot;: &quot;enable&quot;}]</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3250A51D-C11D-46BA-B6B3-95348EEDE652</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnSubListResponseBody build() {
            return new DescribeDcdnSubListResponseBody(this);
        } 

    } 

}
