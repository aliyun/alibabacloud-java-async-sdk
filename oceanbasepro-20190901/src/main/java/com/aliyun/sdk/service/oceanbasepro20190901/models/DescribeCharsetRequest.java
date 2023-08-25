// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCharsetRequest} extends {@link RequestModel}
 *
 * <p>DescribeCharsetRequest</p>
 */
public class DescribeCharsetRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Series")
    private String series;

    @Body
    @NameInMap("TenantMode")
    @Validation(required = true)
    private String tenantMode;

    private DescribeCharsetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.series = builder.series;
        this.tenantMode = builder.tenantMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCharsetRequest create() {
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
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return tenantMode
     */
    public String getTenantMode() {
        return this.tenantMode;
    }

    public static final class Builder extends Request.Builder<DescribeCharsetRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String series; 
        private String tenantMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCharsetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.series = request.series;
            this.tenantMode = request.tenantMode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 实例的系列  - normal（默认）：标准集群版（云盘）  - normal_ssd：标准集群版（本地盘） - history：历史库集群版。
         */
        public Builder series(String series) {
            this.putBodyParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * The return result of the request.
         */
        public Builder tenantMode(String tenantMode) {
            this.putBodyParameter("TenantMode", tenantMode);
            this.tenantMode = tenantMode;
            return this;
        }

        @Override
        public DescribeCharsetRequest build() {
            return new DescribeCharsetRequest(this);
        } 

    } 

}
