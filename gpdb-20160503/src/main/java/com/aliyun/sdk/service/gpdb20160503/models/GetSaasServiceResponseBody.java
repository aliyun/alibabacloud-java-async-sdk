// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSaasServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSaasServiceResponseBody</p>
 */
public class GetSaasServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cu")
    private String cu;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetSaasServiceResponseBody(Builder builder) {
        this.cu = builder.cu;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSaasServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public String getCu() {
        return this.cu;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String cu; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String serviceId; 
        private String serviceName; 
        private String serviceType; 
        private String status; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetSaasServiceResponseBody model) {
            this.cu = model.cu;
            this.payType = model.payType;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.serviceType = model.serviceType;
            this.status = model.status;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The compute resource of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cu(String cu) {
            this.cu = cu;
            return this;
        }

        /**
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
         * <li><strong>PREPAY</strong>: subscription</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If this parameter is not specified, the default value is pay-as-you-go.</li>
         * <li>In subscription billing mode, a discount is available when you purchase a duration of one year or longer. Select a billing type as needed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID where the service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxxxx</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>drama</strong></li>
         * <li><strong>memroy</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>drama</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li><strong>creating</strong>: Being created.</li>
         * <li><strong>active</strong>: Running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>creating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The workspace ID where the service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetSaasServiceResponseBody build() {
            return new GetSaasServiceResponseBody(this);
        } 

    } 

}
