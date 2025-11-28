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
 * {@link AuthorizeDeviceGroupBizChainRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeDeviceGroupBizChainRequest</p>
 */
public class AuthorizeDeviceGroupBizChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainIdList")
    private String bizChainIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AuthorizeDeviceGroupBizChainRequest(Builder builder) {
        super(builder);
        this.bizChainIdList = builder.bizChainIdList;
        this.deviceGroupId = builder.deviceGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeDeviceGroupBizChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizChainIdList
     */
    public String getBizChainIdList() {
        return this.bizChainIdList;
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

    public static final class Builder extends Request.Builder<AuthorizeDeviceGroupBizChainRequest, Builder> {
        private String bizChainIdList; 
        private String deviceGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeDeviceGroupBizChainRequest request) {
            super(request);
            this.bizChainIdList = request.bizChainIdList;
            this.deviceGroupId = request.deviceGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * BizChainIdList.
         */
        public Builder bizChainIdList(String bizChainIdList) {
            this.putQueryParameter("BizChainIdList", bizChainIdList);
            this.bizChainIdList = bizChainIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public AuthorizeDeviceGroupBizChainRequest build() {
            return new AuthorizeDeviceGroupBizChainRequest(this);
        } 

    } 

}
