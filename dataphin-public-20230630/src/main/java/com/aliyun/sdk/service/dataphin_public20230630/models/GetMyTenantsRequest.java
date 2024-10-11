// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMyTenantsRequest} extends {@link RequestModel}
 *
 * <p>GetMyTenantsRequest</p>
 */
public class GetMyTenantsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureCodeList")
    private java.util.List < String > featureCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetMyTenantsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.featureCodeList = builder.featureCodeList;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMyTenantsRequest create() {
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
     * @return featureCodeList
     */
    public java.util.List < String > getFeatureCodeList() {
        return this.featureCodeList;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetMyTenantsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > featureCodeList; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetMyTenantsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.featureCodeList = request.featureCodeList;
            this.opTenantId = request.opTenantId;
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
         * FeatureCodeList.
         */
        public Builder featureCodeList(java.util.List < String > featureCodeList) {
            String featureCodeListShrink = shrink(featureCodeList, "FeatureCodeList", "json");
            this.putBodyParameter("FeatureCodeList", featureCodeListShrink);
            this.featureCodeList = featureCodeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public GetMyTenantsRequest build() {
            return new GetMyTenantsRequest(this);
        } 

    } 

}
