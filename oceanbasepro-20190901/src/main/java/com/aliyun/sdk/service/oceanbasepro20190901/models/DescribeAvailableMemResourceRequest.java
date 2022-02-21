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
    @Body
    @NameInMap("CpuNum")
    @Validation(required = true)
    private Long cpuNum;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("UnitNum")
    @Validation(required = true)
    private Long unitNum;

    private DescribeAvailableMemResourceRequest(Builder builder) {
        super(builder);
        this.cpuNum = builder.cpuNum;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private Long cpuNum; 
        private String instanceId; 
        private String regionId; 
        private String tenantId; 
        private Long unitNum; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableMemResourceRequest response) {
            super(response);
            this.cpuNum = response.cpuNum;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
            this.unitNum = response.unitNum;
        } 

        /**
         * CpuNum.
         */
        public Builder cpuNum(Long cpuNum) {
            this.putBodyParameter("CpuNum", cpuNum);
            this.cpuNum = cpuNum;
            return this;
        }

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * 租户的资源分布节点数。 其与集群的部署模式相耦合，如集群模式为2-2-2，则最后分布节点数最多为2个。
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
