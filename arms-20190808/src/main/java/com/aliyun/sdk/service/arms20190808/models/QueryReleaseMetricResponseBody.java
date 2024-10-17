// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryReleaseMetricResponseBody} extends {@link TeaModel}
 *
 * <p>QueryReleaseMetricResponseBody</p>
 */
public class QueryReleaseMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryReleaseMetricResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReleaseMetricResponseBody create() {
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
         * <p>The returned metric data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;data&quot;:{&quot;SystemCpuUser&quot;:{&quot;all&quot;:[{&quot;date&quot;:1632798718000,&quot;val&quot;:4.3277,&quot;dim&quot;:&quot;SystemCpuUser&quot;},{&quot;date&quot;:1632798733000,&quot;val&quot;:8.1091,&quot;dim&quot;:&quot;SystemCpuUser&quot;}]},&quot;SystemMemUtil&quot;:{&quot;all&quot;:[{&quot;date&quot;:1632798718000,&quot;val&quot;:73.4227,&quot;dim&quot;:&quot;SystemMemUtil&quot;},{&quot;date&quot;:1632798733000,&quot;val&quot;:93.0977,&quot;dim&quot;:&quot;SystemMemUtil&quot;}]}},&quot;success&quot;:true}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46355DD8-FC56-40C5-BFC6-269DE4F9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryReleaseMetricResponseBody build() {
            return new QueryReleaseMetricResponseBody(this);
        } 

    } 

}
