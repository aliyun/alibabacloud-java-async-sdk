// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceInstancesRequest</p>
 */
public class CreateResourceInstancesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Body
    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @Body
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("EcsInstanceCount")
    @Validation(required = true)
    private Integer ecsInstanceCount;

    @Body
    @NameInMap("EcsInstanceType")
    @Validation(required = true)
    private String ecsInstanceType;

    @Body
    @NameInMap("UserData")
    private String userData;

    private CreateResourceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.ecsInstanceCount = builder.ecsInstanceCount;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.userData = builder.userData;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateResourceInstancesRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private Boolean autoRenewal; 
        private String chargeType; 
        private Integer ecsInstanceCount; 
        private String ecsInstanceType; 
        private String userData; 

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
            this.userData = request.userData;
        } 

        /**
         * 资源组所在的集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 是否自动续费
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putBodyParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * 付费类型，预付费PrePaid，后付费PostPaid
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * 新创建的实例个数，(0, 100]
         */
        public Builder ecsInstanceCount(Integer ecsInstanceCount) {
            this.putBodyParameter("EcsInstanceCount", ecsInstanceCount);
            this.ecsInstanceCount = ecsInstanceCount;
            return this;
        }

        /**
         * 实例机型，对应ecs机型
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putBodyParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }

        /**
         * 用户自这义数据，小于 16KB
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateResourceInstancesRequest build() {
            return new CreateResourceInstancesRequest(this);
        } 

    } 

}
