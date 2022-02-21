// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableNacosInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableNacosInstancesResponseBody</p>
 */
public class DescribeAvailableNacosInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < String > data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableNacosInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableNacosInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < String > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < String > data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableNacosInstancesResponseBody build() {
            return new DescribeAvailableNacosInstancesResponseBody(this);
        } 

    } 

}
