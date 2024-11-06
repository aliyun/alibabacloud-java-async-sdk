// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnReportListResponseBody</p>
 */
public class DescribeDcdnReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnReportListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnReportListResponseBody create() {
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
         * <p>The information about the operations report.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;data&quot;: [{&quot;reportId&quot;:2,&quot;deliver&quot;:{&quot;report&quot;:{&quot;title&quot;:&quot;DomainPvUv&quot;,&quot;format&quot;:&quot;chart&quot;,&quot;shape&quot;:&quot;line&quot;,&quot;xAxis&quot;:&quot;ds&quot;,&quot;yAxis&quot;:&quot;cnt&quot;,&quot;legend&quot;:&quot;cnt_type&quot;,&quot;header&quot;:[&quot;ds&quot;,&quot;cnt_type&quot;,&quot;cnt&quot;]}}}</p>
         */
        public Builder content(String content) {
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

        public DescribeDcdnReportListResponseBody build() {
            return new DescribeDcdnReportListResponseBody(this);
        } 

    } 

}
