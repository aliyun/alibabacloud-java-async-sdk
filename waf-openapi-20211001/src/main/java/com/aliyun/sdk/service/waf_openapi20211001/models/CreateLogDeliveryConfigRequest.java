// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateLogDeliveryConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateLogDeliveryConfigRequest</p>
 */
public class CreateLogDeliveryConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private CreateLogDeliveryConfigRequest(Builder builder) {
        super(builder);
        this.deliveryDetail = builder.deliveryDetail;
        this.deliveryName = builder.deliveryName;
        this.deliveryType = builder.deliveryType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogDeliveryConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryDetail
     */
    public String getDeliveryDetail() {
        return this.deliveryDetail;
    }

    /**
     * @return deliveryName
     */
    public String getDeliveryName() {
        return this.deliveryName;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateLogDeliveryConfigRequest, Builder> {
        private String deliveryDetail; 
        private String deliveryName; 
        private String deliveryType; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogDeliveryConfigRequest request) {
            super(request);
            this.deliveryDetail = request.deliveryDetail;
            this.deliveryName = request.deliveryName;
            this.deliveryType = request.deliveryType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The content of the log delivery configuration. Set the value to a JSON string that contains multiple parameters.</p>
         * <blockquote>
         * <p> The parameters vary based on the type of the <strong>log delivery configuration</strong> specified by <strong>DeliveryType</strong>. For more information, see <strong>Parameter description for log delivery configuration</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder deliveryDetail(String deliveryDetail) {
            this.putQueryParameter("DeliveryDetail", deliveryDetail);
            this.deliveryDetail = deliveryDetail;
            return this;
        }

        /**
         * <p>The name of the log delivery configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder deliveryName(String deliveryName) {
            this.putQueryParameter("DeliveryName", deliveryName);
            this.deliveryName = deliveryName;
            return this;
        }

        /**
         * <p>The type of the log delivery configuration. Valid values:</p>
         * <ul>
         * <li><strong>syslog</strong>: Logs are delivered to a syslog service.</li>
         * <li><strong>kafka</strong>: Logs are delivered to a Kafka service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka</p>
         */
        public Builder deliveryType(String deliveryType) {
            this.putQueryParameter("DeliveryType", deliveryType);
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the WAF instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public CreateLogDeliveryConfigRequest build() {
            return new CreateLogDeliveryConfigRequest(this);
        } 

    } 

}
