// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsCommodityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsCommodityResponseBody</p>
 */
public class DescribeRdsCommodityResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeRdsCommodityResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsCommodityResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates the returned result.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRdsCommodityResponseBody build() {
            return new DescribeRdsCommodityResponseBody(this);
        } 

    } 

}
