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
 * {@link GetIntegratedServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegratedServiceStatusResponseBody</p>
 */
public class GetIntegratedServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregatorDeliveryDataType")
    private String aggregatorDeliveryDataType;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("IntegratedTypes")
    private String integratedTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIntegratedServiceStatusResponseBody(Builder builder) {
        this.aggregatorDeliveryDataType = builder.aggregatorDeliveryDataType;
        this.data = builder.data;
        this.integratedTypes = builder.integratedTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegratedServiceStatusResponseBody create() {
        return builder().build();
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
     * @return integratedTypes
     */
    public String getIntegratedTypes() {
        return this.integratedTypes;
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
        private String integratedTypes; 
        private String requestId; 

        /**
         * AggregatorDeliveryDataType.
         */
        public Builder aggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
            this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
            return this;
        }

        /**
         * <p>Indicates whether the product has been integrated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The types of the integrated events. Separate multiple event types with commas (,). Valid values:</p>
         * <ul>
         * <li>ConfigurationItemChangeNotification: resource change event</li>
         * <li>NonCompliantNotification: non-compliance event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NonCompliantNotification</p>
         */
        public Builder integratedTypes(String integratedTypes) {
            this.integratedTypes = integratedTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2E396C84-8D50-5F95-97FA-C0367181BA8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIntegratedServiceStatusResponseBody build() {
            return new GetIntegratedServiceStatusResponseBody(this);
        } 

    } 

}
