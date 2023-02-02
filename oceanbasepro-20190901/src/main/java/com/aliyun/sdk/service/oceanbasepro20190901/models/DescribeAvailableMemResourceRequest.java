// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableMemResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableMemResourceRequest</p>
 */
public class DescribeAvailableMemResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("CpuNum")
    @Validation(required = true)
    private Long cpuNum;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("UnitNum")
    @Validation(required = true)
    private Long unitNum;

    private DescribeAvailableMemResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cpuNum = builder.cpuNum;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
        this.unitNum = builder.unitNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableMemResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return cpuNum
     */
    public Long getCpuNum() {
        return this.cpuNum;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return unitNum
     */
    public Long getUnitNum() {
        return this.unitNum;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableMemResourceRequest, Builder> {
        private String regionId; 
        private Long cpuNum; 
        private String instanceId; 
        private String tenantId; 
        private Long unitNum; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableMemResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cpuNum = request.cpuNum;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
            this.unitNum = request.unitNum;
        } 

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of CPU cores.
         */
        public Builder cpuNum(Long cpuNum) {
            this.putBodyParameter("CpuNum", cpuNum);
            this.cpuNum = cpuNum;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The number of resource distribution nodes in the tenant.   
         * <p>
         * The number is determined by the deployment mode of the cluster. If the cluster is deployed in 2-2-2 mode, the maximum number of resource distribution nodes is 2.
         */
        public Builder unitNum(Long unitNum) {
            this.putBodyParameter("UnitNum", unitNum);
            this.unitNum = unitNum;
            return this;
        }

        @Override
        public DescribeAvailableMemResourceRequest build() {
            return new DescribeAvailableMemResourceRequest(this);
        } 

    } 

}
