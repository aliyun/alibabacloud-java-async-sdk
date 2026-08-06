// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetCrawlerTypeCapabilitiesRequest} extends {@link RequestModel}
 *
 * <p>GetCrawlerTypeCapabilitiesRequest</p>
 */
public class GetCrawlerTypeCapabilitiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetCrawlerTypeCapabilitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrawlerTypeCapabilitiesRequest create() {
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

    public static final class Builder extends Request.Builder<GetCrawlerTypeCapabilitiesRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCrawlerTypeCapabilitiesRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCrawlerTypeCapabilitiesRequest build() {
            return new GetCrawlerTypeCapabilitiesRequest(this);
        } 

    } 

}
