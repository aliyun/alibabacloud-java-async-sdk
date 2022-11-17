// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableCpuResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableCpuResourceRequest</p>
 */
public class DescribeAvailableCpuResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ModifyType")
    private String modifyType;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private DescribeAvailableCpuResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.modifyType = builder.modifyType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableCpuResourceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableCpuResourceRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String modifyType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableCpuResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.modifyType = request.modifyType;
            this.tenantId = request.tenantId;
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
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 用户权限修改类型。 可支持以下几种方式： update：全量更新权限，默认值； add：新增权限； delete：删除权限。 默认值：update。
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
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

        @Override
        public DescribeAvailableCpuResourceRequest build() {
            return new DescribeAvailableCpuResourceRequest(this);
        } 

    } 

}
