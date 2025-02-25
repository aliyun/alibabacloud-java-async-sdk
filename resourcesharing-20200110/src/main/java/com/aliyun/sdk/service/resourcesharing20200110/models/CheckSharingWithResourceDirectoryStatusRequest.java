// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckSharingWithResourceDirectoryStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckSharingWithResourceDirectoryStatusRequest</p>
 */
public class CheckSharingWithResourceDirectoryStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CheckSharingWithResourceDirectoryStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSharingWithResourceDirectoryStatusRequest create() {
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

    public static final class Builder extends Request.Builder<CheckSharingWithResourceDirectoryStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckSharingWithResourceDirectoryStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public CheckSharingWithResourceDirectoryStatusRequest build() {
            return new CheckSharingWithResourceDirectoryStatusRequest(this);
        } 

    } 

}
