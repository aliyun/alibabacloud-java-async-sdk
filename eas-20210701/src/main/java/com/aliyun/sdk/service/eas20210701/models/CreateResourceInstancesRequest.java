// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateResourceInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceInstancesRequest</p>
 */
public class CreateResourceInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsInstanceCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ecsInstanceCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecsInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 2000, minimum = 200)
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    @Deprecated
    private String userData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Zone")
    private String zone;

    private CreateResourceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.ecsInstanceCount = builder.ecsInstanceCount;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.labels = builder.labels;
        this.systemDiskSize = builder.systemDiskSize;
        this.userData = builder.userData;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return ecsInstanceCount
     */
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    /**
     * @return ecsInstanceType
     */
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<CreateResourceInstancesRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private Boolean autoRenewal; 
        private String chargeType; 
        private Integer ecsInstanceCount; 
        private String ecsInstanceType; 
        private java.util.Map<String, String> labels; 
        private Integer systemDiskSize; 
        private String userData; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.autoRenewal = request.autoRenewal;
            this.chargeType = request.chargeType;
            this.ecsInstanceCount = request.ecsInstanceCount;
            this.ecsInstanceType = request.ecsInstanceType;
            this.labels = request.labels;
            this.systemDiskSize = request.systemDiskSize;
            this.userData = request.userData;
            this.zone = request.zone;
        } 

        /**
         * <p>The ID of the region to which the resource group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the resource group. For more information about how to query the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdasdasd</p>
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putBodyParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The number of instances that you want to create. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder ecsInstanceCount(Integer ecsInstanceCount) {
            this.putBodyParameter("EcsInstanceCount", ecsInstanceCount);
            this.ecsInstanceCount = ecsInstanceCount;
            return this;
        }

        /**
         * <p>The type of the Elastic Compute Service (ECS) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.s6-c1m2.xlarge</p>
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putBodyParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }

        /**
         * <p>The custom service tag.</p>
         */
        public Builder labels(java.util.Map<String, String> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: 200 to 2000. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The user-defined information. This parameter is not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>x112223333</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The zone to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f</p>
         */
        public Builder zone(String zone) {
            this.putBodyParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public CreateResourceInstancesRequest build() {
            return new CreateResourceInstancesRequest(this);
        } 

    } 

}
