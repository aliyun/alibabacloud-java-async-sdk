// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DescribeIntegratedServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntegratedServiceStatusResponseBody</p>
 */
public class DescribeIntegratedServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregatorDeliveryDataType")
    private String aggregatorDeliveryDataType;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIntegratedServiceStatusResponseBody(Builder builder) {
        this.aggregatorDeliveryDataType = builder.aggregatorDeliveryDataType;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntegratedServiceStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorDeliveryDataType
     */
    public String getAggregatorDeliveryDataType() {
        return this.aggregatorDeliveryDataType;
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aggregatorDeliveryDataType; 
        private Boolean data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIntegratedServiceStatusResponseBody model) {
            this.aggregatorDeliveryDataType = model.aggregatorDeliveryDataType;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * AggregatorDeliveryDataType.
         */
        public Builder aggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
            this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Boolean data) {
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

        public DescribeIntegratedServiceStatusResponseBody build() {
            return new DescribeIntegratedServiceStatusResponseBody(this);
        } 

    } 

}
