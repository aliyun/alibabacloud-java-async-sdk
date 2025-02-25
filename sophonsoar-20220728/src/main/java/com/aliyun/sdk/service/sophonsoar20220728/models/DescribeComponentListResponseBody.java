// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeComponentListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentListResponseBody</p>
 */
public class DescribeComponentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Components")
    private String components;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComponentListResponseBody(Builder builder) {
        this.components = builder.components;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentListResponseBody create() {
        return builder().build();
    }

    /**
     * @return components
     */
    public String getComponents() {
        return this.components;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String components; 
        private String requestId; 

        /**
         * <p>The information about the components. The value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;actions&quot;: [
         *             {
         *                 &quot;description&quot;: &quot;mysql component&quot;,
         *                 &quot;name&quot;: &quot;storeIdb&quot;,
         *                 &quot;parameters&quot;: [
         *                     {
         *                         &quot;description&quot;: &quot;update the mysql db&quot;,
         *                         &quot;name&quot;: &quot;updateSql&quot;,
         *                         &quot;required&quot;: false
         *                     }
         *                 ]
         *             }
         *         ],
         *         &quot;basic&quot;: {
         *             &quot;description&quot;: &quot;mysq sql component for 5.6&quot;,
         *             &quot;logo&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1H89IpH3nBKNjSZFMXXaUSFXa-200-200.svg">https://img.alicdn.com/tfs/TB1H89IpH3nBKNjSZFMXXaUSFXa-200-200.svg</a>&quot;,
         *             &quot;name&quot;: &quot;Mysql&quot;
         *         }
         *     }
         * ]</p>
         */
        public Builder components(String components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B0A255B3-495C-56FB-8B6B-DB073F80388A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentListResponseBody build() {
            return new DescribeComponentListResponseBody(this);
        } 

    } 

}
