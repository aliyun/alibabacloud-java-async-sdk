// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableSharingWithResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>EnableSharingWithResourceDirectoryRequest</p>
 */
public class EnableSharingWithResourceDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private EnableSharingWithResourceDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSharingWithResourceDirectoryRequest create() {
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

    public static final class Builder extends Request.Builder<EnableSharingWithResourceDirectoryRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableSharingWithResourceDirectoryRequest request) {
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
        public EnableSharingWithResourceDirectoryRequest build() {
            return new EnableSharingWithResourceDirectoryRequest(this);
        } 

    } 

}
