// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnReportResponseBody</p>
 */
public class DescribeDcdnReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map < String, ? > content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnReportResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > content; 
        private String requestId; 

        /**
         * <p>The content of the operations report.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;data&quot;:[{&quot;deliver&quot;:{ &quot;report&quot;:{&quot;title&quot;:&quot;TopUrlByAcc&quot;,&quot;format&quot;:&quot;table&quot;,&quot;sape&quot;:&quot;&quot;,&quot;header&quot;:[&quot;url&quot;,&quot;traf&quot;,&quot;traf_rate&quot;,&quot;acc&quot;,&quot;acc_rate&quot;]}}, &quot;data&quot;:[{&quot;acc&quot;:440,&quot;acc_rate&quot;:&quot;0.200%&quot;,&quot;traf&quot;:22,&quot;url&quot;:&quot;<a href="http://example.com%22,%22traf_rate%22:%220.100%%22%7D,%7B%22acc%22:440,%22acc_rate%22:%220.200%%22,%22traf%22:22,%22url%22:%22http://example.org%22,%22traf_rate%22:%220.100%%22%7D%5D%7D%5D">http://example.com&quot;,&quot;traf_rate&quot;:&quot;0.100%&quot;},{&quot;acc&quot;:440,&quot;acc_rate&quot;:&quot;0.200%&quot;,&quot;traf&quot;:22,&quot;url&quot;:&quot;http://example.org&quot;,&quot;traf_rate&quot;:&quot;0.100%&quot;}]}]</a></p>
         */
        public Builder content(java.util.Map < String, ? > content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnReportResponseBody build() {
            return new DescribeDcdnReportResponseBody(this);
        } 

    } 

}
