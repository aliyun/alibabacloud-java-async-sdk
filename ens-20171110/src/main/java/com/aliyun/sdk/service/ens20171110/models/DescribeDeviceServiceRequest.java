// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDeviceServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceServiceRequest</p>
 */
public class DescribeDeviceServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private DescribeDeviceServiceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ensRegionId = builder.ensRegionId;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceServiceRequest, Builder> {
        private String appId; 
        private String ensRegionId; 
        private String instanceId; 
        private String orderId; 
        private String regionId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceServiceRequest request) {
            super(request);
            this.appId = request.appId;
            this.ensRegionId = request.ensRegionId;
            this.instanceId = request.instanceId;
            this.orderId = request.orderId;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>a2bac6f4-75dc-455e-8389-2dc8e47526d3</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chongqing-10</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5sg1owx0g4ojy66ab2tez77r2</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>2661b1dd-3453-418d-8182-bb34f79e8d3c</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chongqing-11</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>s-cxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DescribeDeviceServiceRequest build() {
            return new DescribeDeviceServiceRequest(this);
        } 

    } 

}
