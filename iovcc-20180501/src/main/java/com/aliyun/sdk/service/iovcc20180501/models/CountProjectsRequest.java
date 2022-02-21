// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountProjectsRequest} extends {@link RequestModel}
 *
 * <p>CountProjectsRequest</p>
 */
public class CountProjectsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CountProjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountProjectsRequest create() {
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

    public static final class Builder extends Request.Builder<CountProjectsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CountProjectsRequest response) {
            super(response);
            this.regionId = response.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CountProjectsRequest build() {
            return new CountProjectsRequest(this);
        } 

    } 

}
