// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuickQueryRequest} extends {@link RequestModel}
 *
 * <p>GetQuickQueryRequest</p>
 */
public class GetQuickQueryRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SearchName")
    @Validation(required = true)
    private String searchName;

    private GetQuickQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.searchName = builder.searchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuickQueryRequest create() {
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
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    public static final class Builder extends Request.Builder<GetQuickQueryRequest, Builder> {
        private String regionId; 
        private String searchName; 

        private Builder() {
            super();
        } 

        private Builder(GetQuickQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.searchName = request.searchName;
        } 

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the saved search.
         */
        public Builder searchName(String searchName) {
            this.putBodyParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        @Override
        public GetQuickQueryRequest build() {
            return new GetQuickQueryRequest(this);
        } 

    } 

}
