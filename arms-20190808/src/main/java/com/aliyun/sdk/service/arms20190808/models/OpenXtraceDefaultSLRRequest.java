// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenXtraceDefaultSLRRequest} extends {@link RequestModel}
 *
 * <p>OpenXtraceDefaultSLRRequest</p>
 */
public class OpenXtraceDefaultSLRRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private OpenXtraceDefaultSLRRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenXtraceDefaultSLRRequest create() {
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

    public static final class Builder extends Request.Builder<OpenXtraceDefaultSLRRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(OpenXtraceDefaultSLRRequest response) {
            super(response);
            this.regionId = response.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public OpenXtraceDefaultSLRRequest build() {
            return new OpenXtraceDefaultSLRRequest(this);
        } 

    } 

}
