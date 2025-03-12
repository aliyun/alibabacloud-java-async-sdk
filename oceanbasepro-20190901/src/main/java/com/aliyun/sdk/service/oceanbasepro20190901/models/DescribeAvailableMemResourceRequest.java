// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeAvailableMemResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableMemResourceRequest</p>
 */
public class DescribeAvailableMemResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CpuNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cpuNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnitNum")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of CPU cores.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder cpuNum(Long cpuNum) {
            this.putBodyParameter("CpuNum", cpuNum);
            this.cpuNum = cpuNum;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>ob2mr3oae0****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The number of resource distribution nodes in the tenant.<br>The number is determined by the deployment mode of the cluster. If the cluster is deployed in 2-2-2 mode, the maximum number of resource distribution nodes is 2.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
