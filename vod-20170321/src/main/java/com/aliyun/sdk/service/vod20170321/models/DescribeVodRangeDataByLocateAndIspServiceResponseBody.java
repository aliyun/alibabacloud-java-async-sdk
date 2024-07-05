// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The returned result. The value is in the JSON format. These parameters indicate the following information in sequence: UNIX time, region, ISP, distribution of HTTP status codes, response time, bandwidth (bit/s), average response rate, page views, cache hit ratio, and request hit ratio.
         */
        public Builder jsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }

        /**
         * The ID of the request.
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
