// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstancesRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstancesRequest</p>
 */
public class ReleaseInstancesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer amount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistrictId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String districtId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private ReleaseInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.districtId = builder.districtId;
        this.instanceType = builder.instanceType;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return districtId
     */
    public String getDistrictId() {
        return this.districtId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ReleaseInstancesRequest, Builder> {
        private Integer amount; 
        private String districtId; 
        private String instanceType; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.districtId = request.districtId;
            this.instanceType = request.instanceType;
            this.projectId = request.projectId;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putBodyParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * DistrictId.
         */
        public Builder districtId(String districtId) {
            this.putBodyParameter("DistrictId", districtId);
            this.districtId = districtId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ReleaseInstancesRequest build() {
            return new ReleaseInstancesRequest(this);
        } 

    } 

}
