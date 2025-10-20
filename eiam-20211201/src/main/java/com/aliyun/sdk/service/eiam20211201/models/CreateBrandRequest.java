// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateBrandRequest} extends {@link RequestModel}
 *
 * <p>CreateBrandRequest</p>
 */
public class CreateBrandRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String brandName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateBrandRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.brandName = builder.brandName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBrandRequest create() {
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
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateBrandRequest, Builder> {
        private String regionId; 
        private String brandName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBrandRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.brandName = request.brandName;
            this.instanceId = request.instanceId;
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
         * <p>品牌化名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Brand</p>
         */
        public Builder brandName(String brandName) {
            this.putQueryParameter("BrandName", brandName);
            this.brandName = brandName;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateBrandRequest build() {
            return new CreateBrandRequest(this);
        } 

    } 

}
