// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSyncRefreshRegionRequest} extends {@link RequestModel}
 *
 * <p>SetSyncRefreshRegionRequest</p>
 */
public class SetSyncRefreshRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRegion")
    private Integer defaultRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List < String > regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private SetSyncRefreshRegionRequest(Builder builder) {
        super(builder);
        this.defaultRegion = builder.defaultRegion;
        this.regionIds = builder.regionIds;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSyncRefreshRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRegion
     */
    public Integer getDefaultRegion() {
        return this.defaultRegion;
    }

    /**
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<SetSyncRefreshRegionRequest, Builder> {
        private Integer defaultRegion; 
        private java.util.List < String > regionIds; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(SetSyncRefreshRegionRequest request) {
            super(request);
            this.defaultRegion = request.defaultRegion;
            this.regionIds = request.regionIds;
            this.vendor = request.vendor;
        } 

        /**
         * The access type of the multi-cloud site. Valid values:
         * <p>
         * 
         * *   **0**: The current site is not the default site of multi-cloud site. You can specify the current site as the default site of the multi-cloud site.
         * *   **1**: The current site is the default site of multi-cloud site.
         */
        public Builder defaultRegion(Integer defaultRegion) {
            this.putQueryParameter("DefaultRegion", defaultRegion);
            this.defaultRegion = defaultRegion;
            return this;
        }

        /**
         * The regions from which you want to synchronize assets at the current site.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            this.putQueryParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * The cloud service provider. Valid values:
         * <p>
         * 
         * *   **Tencent**: Tencent Cloud
         * *   **HUAWEICLOUD**: Huawei Cloud
         * *   **Azure**: Microsoft Azure
         * *   **AWS**: Amazon Web Services (AWS)
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public SetSyncRefreshRegionRequest build() {
            return new SetSyncRefreshRegionRequest(this);
        } 

    } 

}
