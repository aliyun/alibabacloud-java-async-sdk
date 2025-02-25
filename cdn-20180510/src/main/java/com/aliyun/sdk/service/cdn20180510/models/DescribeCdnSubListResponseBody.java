// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnSubListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnSubListResponseBody</p>
 */
public class DescribeCdnSubListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnSubListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSubListResponseBody create() {
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
         * <p>The information about the custom report task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;3250A51D-C11D-46BA-B6B3-95348EEDE652&quot;,&quot;Description&quot;:&quot;Successful&quot;,&quot;Content&quot;:{&quot;data&quot;:[{&quot;subId&quot;:5,&quot;reportId&quot;:[1,2,3],&quot;createTime&quot;:&quot;2020-09-25T09:39:33Z&quot;,&quot;domains&quot;[&quot;<a href="http://www.example.com%22,%22www.example.com%22%5D,%22effectiveFrom%22:%222020-09-17T00:00:00Z%22,%22effectiveEnd%22:%222020-11-17T00:00:00Z%22,%22status%22:%22enable%22%7D%5D%7D%7D">www.example.com&quot;,&quot;www.example.com&quot;],&quot;effectiveFrom&quot;:&quot;2020-09-17T00:00:00Z&quot;,&quot;effectiveEnd&quot;:&quot;2020-11-17T00:00:00Z&quot;,&quot;status&quot;:&quot;enable&quot;}]}}</a></p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3250A51D-C11D-46BA-B6B3-95348EEDE652</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnSubListResponseBody build() {
            return new DescribeCdnSubListResponseBody(this);
        } 

    } 

}
