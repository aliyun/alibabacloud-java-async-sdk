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
    @NameInMap("TenantMode")
    @Validation(required = true)
    private String tenantMode;

    private DescribeCharsetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return tenantMode
     */
    public String getTenantMode() {
        return this.tenantMode;
    }

    public static final class Builder extends Request.Builder<DescribeCharsetRequest, Builder> {
        private String regionId; 
        private String tenantMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCharsetRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.tenantMode = response.tenantMode;
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
         * 租户模式。 当前支持Oracle模式（Oracle）、MySQL模式（MySQL） 详细参见：DescribeInstanceTenantModes。
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
