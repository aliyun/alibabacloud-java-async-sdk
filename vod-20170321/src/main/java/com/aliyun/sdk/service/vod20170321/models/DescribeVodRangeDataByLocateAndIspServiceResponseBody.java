// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodRangeDataByLocateAndIspServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodRangeDataByLocateAndIspServiceResponseBody</p>
 */
public class DescribeVodRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonResult")
    private String jsonResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodRangeDataByLocateAndIspServiceResponseBody(Builder builder) {
        this.jsonResult = builder.jsonResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodRangeDataByLocateAndIspServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonResult
     */
    public String getJsonResult() {
        return this.jsonResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jsonResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodRangeDataByLocateAndIspServiceResponseBody model) {
            this.jsonResult = model.jsonResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned result. The value is in the JSON format. These parameters indicate the following information in sequence: UNIX time, region, ISP, distribution of HTTP status codes, response time, bandwidth (bit/s), average response rate, page views, cache hit ratio, and request hit ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;1472659200&quot;:{&quot;tianjin&quot;:{&quot;unicom&quot;:{&quot;http_codes&quot;:{&quot;000&quot;:0,&quot;200&quot;:6,&quot;400&quot;:0},&quot;rt&quot;:4183,&quot;bandwidth&quot;:46639,&quot;avg_speed&quot;:7773,&quot;pv&quot;:6,&quot;hit_rate&quot;:0.93,&quot;request_hit_rate&quot;:0.66}}}}</p>
         */
        public Builder jsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C74802AA-C277-5A80-BDF2-072B05F119C7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodRangeDataByLocateAndIspServiceResponseBody build() {
            return new DescribeVodRangeDataByLocateAndIspServiceResponseBody(this);
        } 

    } 

}
