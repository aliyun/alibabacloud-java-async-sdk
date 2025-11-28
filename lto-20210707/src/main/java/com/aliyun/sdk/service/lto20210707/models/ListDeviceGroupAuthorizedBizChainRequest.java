// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListDeviceGroupAuthorizedBizChainRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceGroupAuthorizedBizChainRequest</p>
 */
public class ListDeviceGroupAuthorizedBizChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListDeviceGroupAuthorizedBizChainRequest(Builder builder) {
        super(builder);
        this.deviceGroupId = builder.deviceGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupAuthorizedBizChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDeviceGroupAuthorizedBizChainRequest, Builder> {
        private String deviceGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceGroupAuthorizedBizChainRequest request) {
            super(request);
            this.deviceGroupId = request.deviceGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
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
        public ListDeviceGroupAuthorizedBizChainRequest build() {
            return new ListDeviceGroupAuthorizedBizChainRequest(this);
        } 

    } 

}
