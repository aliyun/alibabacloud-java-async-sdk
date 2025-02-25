// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeComponentsJsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentsJsResponseBody</p>
 */
public class DescribeComponentsJsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentsJs")
    private String componentsJs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComponentsJsResponseBody(Builder builder) {
        this.componentsJs = builder.componentsJs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentsJsResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentsJs
     */
    public String getComponentsJs() {
        return this.componentsJs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String componentsJs; 
        private String requestId; 

        /**
         * <p>The configuration of the JavaScript file for the component.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;js&quot;: &quot;<a href="https://xxxxx.oss-cn-zhangjiakou.aliyuncs.com/componentUpload/xxxxx">https://xxxxx.oss-cn-zhangjiakou.aliyuncs.com/componentUpload/xxxxx</a>&quot;,
         *         &quot;name&quot;: &quot;python3&quot;,
         *         &quot;ownType&quot;: &quot;sys&quot;
         *     }
         * ]</p>
         */
        public Builder componentsJs(String componentsJs) {
            this.componentsJs = componentsJs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58A518BC-E4A8-5BD7-AFEA-366046ED9073</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentsJsResponseBody build() {
            return new DescribeComponentsJsResponseBody(this);
        } 

    } 

}
