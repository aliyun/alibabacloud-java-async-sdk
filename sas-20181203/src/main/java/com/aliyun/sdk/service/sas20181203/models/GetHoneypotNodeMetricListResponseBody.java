// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetHoneypotNodeMetricListResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotNodeMetricListResponseBody</p>
 */
public class GetHoneypotNodeMetricListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetHoneypotNodeMetricListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotNodeMetricListResponseBody create() {
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
         * <p>The monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;code&quot;: &quot;200&quot;,
         *     &quot;datapoints&quot;: &quot;[{&quot;timestamp&quot;:1698375060000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:67084.0,&quot;Maximum&quot;:67084.0,&quot;Average&quot;:67084.0},{&quot;timestamp&quot;:1698375120000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:63704.0,&quot;Maximum&quot;:63704.0,&quot;Average&quot;:63704.0},{&quot;timestamp&quot;:1698375180000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:67624.0,&quot;Maximum&quot;:67624.0,&quot;Average&quot;:67624.0},{&quot;timestamp&quot;:1698375240000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:68432.0,&quot;Maximum&quot;:68432.0,&quot;Average&quot;:68432.0},{&quot;timestamp&quot;:1698375300000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:70148.0,&quot;Maximum&quot;:70148.0,&quot;Average&quot;:70148.0},{&quot;timestamp&quot;:1698375360000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:63612.0,&quot;Maximum&quot;:63612.0,&quot;Average&quot;:63612.0},{&quot;timestamp&quot;:1698375420000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:68032.0,&quot;Maximum&quot;:68032.0,&quot;Average&quot;:68032.0},{&quot;timestamp&quot;:1698375480000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:67400.0,&quot;Maximum&quot;:67400.0,&quot;Average&quot;:67400.0},{&quot;timestamp&quot;:1698375540000,&quot;instanceId&quot;:&quot;i-bp18jn50nid83nsu****&quot;,&quot;ip&quot;:&quot;1.1.1.1&quot;,&quot;userId&quot;:&quot;132776878515****&quot;,&quot;Minimum&quot;:65352.0,&quot;Maximum&quot;:65352.0,&quot;Average&quot;:65352.0}]&quot;,
         *     &quot;period&quot;: &quot;60&quot;,
         *     &quot;requestId&quot;: &quot;AFE33E4E-70A3-5BAE-AEA8-4D3BF3A75067&quot;,
         *     &quot;success&quot;: true
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>48F523DA-4C7E-5417-B872-E313E5A4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHoneypotNodeMetricListResponseBody build() {
            return new GetHoneypotNodeMetricListResponseBody(this);
        } 

    } 

}
