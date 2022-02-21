// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRangeDataByLocateAndIspServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRangeDataByLocateAndIspServiceResponseBody</p>
 */
public class DescribeRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    @NameInMap("JsonResult")
    private String jsonResult;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRangeDataByLocateAndIspServiceResponseBody(Builder builder) {
        this.jsonResult = builder.jsonResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRangeDataByLocateAndIspServiceResponseBody create() {
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

        public DescribeRangeDataByLocateAndIspServiceResponseBody build() {
            return new DescribeRangeDataByLocateAndIspServiceResponseBody(this);
        } 

    } 

}
