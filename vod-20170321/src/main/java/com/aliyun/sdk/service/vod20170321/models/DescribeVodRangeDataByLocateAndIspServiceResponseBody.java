// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodRangeDataByLocateAndIspServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodRangeDataByLocateAndIspServiceResponseBody</p>
 */
public class DescribeVodRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    @NameInMap("JsonResult")
    private String jsonResult;

    @NameInMap("RequestId")
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
         * JsonResult.
         */
        public Builder jsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }

        /**
         * RequestId.
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
