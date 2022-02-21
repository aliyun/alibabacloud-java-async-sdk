// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEtlResourceUsagesRequest} extends {@link RequestModel}
 *
 * <p>GetEtlResourceUsagesRequest</p>
 */
public class GetEtlResourceUsagesRequest extends Request {
    @Query
    @NameInMap("Months")
    @Validation(required = true)
    private String months;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetEtlResourceUsagesRequest(Builder builder) {
        super(builder);
        this.months = builder.months;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEtlResourceUsagesRequest create() {
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

    public static final class Builder extends Request.Builder<GetEtlResourceUsagesRequest, Builder> {
        private String months; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetEtlResourceUsagesRequest response) {
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
        public GetEtlResourceUsagesRequest build() {
            return new GetEtlResourceUsagesRequest(this);
        } 

    } 

}
