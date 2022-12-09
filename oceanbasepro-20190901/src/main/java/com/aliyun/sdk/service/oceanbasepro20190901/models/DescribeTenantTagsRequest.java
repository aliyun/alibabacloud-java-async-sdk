// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTenantTagsRequest</p>
 */
public class DescribeTenantTagsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Tags")
    private String tags;

    @Body
    @NameInMap("TenantIds")
    private String tenantIds;

    private DescribeTenantTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.tags = builder.tags;
        this.tenantIds = builder.tenantIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantTagsRequest create() {
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
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return tenantIds
     */
    public String getTenantIds() {
        return this.tenantIds;
    }

    public static final class Builder extends Request.Builder<DescribeTenantTagsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String tags; 
        private String tenantIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.tags = request.tags;
            this.tenantIds = request.tenantIds;
        } 

        /**
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Oceanbase集群ID
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 标签值
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 租户id的json串
         */
        public Builder tenantIds(String tenantIds) {
            this.putBodyParameter("TenantIds", tenantIds);
            this.tenantIds = tenantIds;
            return this;
        }

        @Override
        public DescribeTenantTagsRequest build() {
            return new DescribeTenantTagsRequest(this);
        } 

    } 

}
