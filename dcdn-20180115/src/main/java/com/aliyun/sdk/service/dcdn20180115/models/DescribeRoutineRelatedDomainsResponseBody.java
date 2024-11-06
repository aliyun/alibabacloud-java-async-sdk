// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRoutineRelatedDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoutineRelatedDomainsResponseBody</p>
 */
public class DescribeRoutineRelatedDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map < String, ? > content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRoutineRelatedDomainsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineRelatedDomainsResponseBody create() {
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
         * <p>The domain names associated with a routine.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Domains&quot;: [
         *             &quot;xxx.com&quot;,
         *             &quot;yyy.com&quot;,
         *             ...
         *         ]</p>
         */
        public Builder content(java.util.Map < String, ? > content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC0E34AC-0239-44A7-AB0E-800DE522C8DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRoutineRelatedDomainsResponseBody build() {
            return new DescribeRoutineRelatedDomainsResponseBody(this);
        } 

    } 

}
