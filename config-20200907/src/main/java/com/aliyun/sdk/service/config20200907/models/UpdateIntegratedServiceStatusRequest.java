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
 * {@link UpdateIntegratedServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntegratedServiceStatusRequest</p>
 */
public class UpdateIntegratedServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorDeliveryDataType")
    private String aggregatorDeliveryDataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegratedTypes")
    private String integratedTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    private UpdateIntegratedServiceStatusRequest(Builder builder) {
        super(builder);
        this.aggregatorDeliveryDataType = builder.aggregatorDeliveryDataType;
        this.integratedTypes = builder.integratedTypes;
        this.serviceCode = builder.serviceCode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegratedServiceStatusRequest create() {
        return builder().build();
    }

@Override
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
     * @return integratedTypes
     */
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateIntegratedServiceStatusRequest, Builder> {
        private String aggregatorDeliveryDataType; 
        private String integratedTypes; 
        private String serviceCode; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntegratedServiceStatusRequest request) {
            super(request);
            this.aggregatorDeliveryDataType = request.aggregatorDeliveryDataType;
            this.integratedTypes = request.integratedTypes;
            this.serviceCode = request.serviceCode;
            this.status = request.status;
        } 

        /**
         * <p>The type of the event that is integrated across accounts. Valid values:</p>
         * <ul>
         * <li>NonCompliantNotification: non-compliance event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NonCompliantNotification</p>
         */
        public Builder aggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
            this.putBodyParameter("AggregatorDeliveryDataType", aggregatorDeliveryDataType);
            this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
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
            this.putBodyParameter("IntegratedTypes", integratedTypes);
            this.integratedTypes = integratedTypes;
            return this;
        }

        /**
         * <p>The identity of the cloud service that is integrated with Cloud Config. Valid values:</p>
         * <ul>
         * <li>eventbridge: EventBridge</li>
         * <li>cms: CloudMonitor</li>
         * <li>bpstudio: Cloud Architect Design Tools</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cadt</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Specifies whether you want the product to be integrated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateIntegratedServiceStatusRequest build() {
            return new UpdateIntegratedServiceStatusRequest(this);
        } 

    } 

}
