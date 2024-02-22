// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllProdsRequest} extends {@link RequestModel}
 *
 * <p>ListAllProdsRequest</p>
 */
public class ListAllProdsRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListAllProdsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllProdsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAllProdsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAllProdsRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAllProdsRequest build() {
            return new ListAllProdsRequest(this);
        } 

    } 

}
