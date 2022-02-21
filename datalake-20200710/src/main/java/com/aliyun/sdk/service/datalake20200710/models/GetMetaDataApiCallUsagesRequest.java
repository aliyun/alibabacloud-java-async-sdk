// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDataApiCallUsagesRequest} extends {@link RequestModel}
 *
 * <p>GetMetaDataApiCallUsagesRequest</p>
 */
public class GetMetaDataApiCallUsagesRequest extends Request {
    @Query
    @NameInMap("Months")
    @Validation(required = true)
    private String months;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetMetaDataApiCallUsagesRequest(Builder builder) {
        super(builder);
        this.months = builder.months;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaDataApiCallUsagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return months
     */
    public String getMonths() {
        return this.months;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMetaDataApiCallUsagesRequest, Builder> {
        private String months; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaDataApiCallUsagesRequest response) {
            super(response);
            this.months = response.months;
            this.regionId = response.regionId;
        } 

        /**
         * Months.
         */
        public Builder months(String months) {
            this.putQueryParameter("Months", months);
            this.months = months;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetMetaDataApiCallUsagesRequest build() {
            return new GetMetaDataApiCallUsagesRequest(this);
        } 

    } 

}
