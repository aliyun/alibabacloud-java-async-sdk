// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScopeUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeScopeUsersRequest</p>
 */
public class DescribeScopeUsersRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeScopeUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScopeUsersRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeScopeUsersRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScopeUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeScopeUsersRequest build() {
            return new DescribeScopeUsersRequest(this);
        } 

    } 

}
