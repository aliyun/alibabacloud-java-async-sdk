// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link QueryMetricResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMetricResponseBody</p>
 */
public class QueryMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryMetricResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMetricResponseBody create() {
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
         * <p>The returned statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;RequestId&quot;: &quot;E2373982-D8CD-413D-B991-8EB678******&quot;,   &quot;Data&quot;: &quot;{&quot;data&quot;:[{&quot;date&quot;:1583686800000,&quot;count&quot;:0,&quot;rt&quot;:0,&quot;rpc&quot;:&quot;childSpan3&quot;}}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMetricResponseBody build() {
            return new QueryMetricResponseBody(this);
        } 

    } 

}
