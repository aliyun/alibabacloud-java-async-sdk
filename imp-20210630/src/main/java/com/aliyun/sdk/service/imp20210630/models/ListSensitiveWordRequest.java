// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveWordRequest} extends {@link RequestModel}
 *
 * <p>ListSensitiveWordRequest</p>
 */
public class ListSensitiveWordRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListSensitiveWordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSensitiveWordRequest, Builder> {
        private String appId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSensitiveWordRequest request) {
            super(request);
            this.appId = request.appId;
            this.regionId = request.regionId;
        } 

        /**
         * 弹幕发送者的用户ID，最大长度不超过32个字节。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
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
        public ListSensitiveWordRequest build() {
            return new ListSensitiveWordRequest(this);
        } 

    } 

}
