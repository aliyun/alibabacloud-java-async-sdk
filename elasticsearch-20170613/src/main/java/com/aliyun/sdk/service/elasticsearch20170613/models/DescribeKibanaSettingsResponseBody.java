// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeKibanaSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKibanaSettingsResponseBody</p>
 */
public class DescribeKibanaSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.Map<String, ?> result;

    private DescribeKibanaSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKibanaSettingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> result; 

        private Builder() {
        } 

        private Builder(DescribeKibanaSettingsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6D*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurable Kibana settings. For more information, see <a href="https://www.elastic.co/guide/cn/kibana/current/settings.html">Kibana settings</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;map.includeElasticMapsService&quot;: &quot;false&quot;, &quot;server.ssl.cert&quot;: &quot;/home/admin/packages/kibana/config/cert/client.crt&quot;, &quot;server.ssl.enabled&quot;: &quot;true&quot;, &quot;server.ssl.key&quot;: &quot;/home/admin/packages/kibana/config/cert/client.key&quot;, &quot;xpack.reporting.capture.browser.chromium.disableSandbox&quot;: &quot;true&quot;}</p>
         */
        public Builder result(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }

        public DescribeKibanaSettingsResponseBody build() {
            return new DescribeKibanaSettingsResponseBody(this);
        } 

    } 

}
