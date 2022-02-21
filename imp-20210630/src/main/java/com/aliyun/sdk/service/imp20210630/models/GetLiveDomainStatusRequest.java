// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveDomainStatusRequest} extends {@link RequestModel}
 *
 * <p>GetLiveDomainStatusRequest</p>
 */
public class GetLiveDomainStatusRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("LiveDomainList")
    private java.util.List < String > liveDomainList;

    @Body
    @NameInMap("LiveDomainType")
    private String liveDomainType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetLiveDomainStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.liveDomainList = builder.liveDomainList;
        this.liveDomainType = builder.liveDomainType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveDomainStatusRequest create() {
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
     * @return liveDomainList
     */
    public java.util.List < String > getLiveDomainList() {
        return this.liveDomainList;
    }

    /**
     * @return liveDomainType
     */
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetLiveDomainStatusRequest, Builder> {
        private String appId; 
        private java.util.List < String > liveDomainList; 
        private String liveDomainType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveDomainStatusRequest response) {
            super(response);
            this.appId = response.appId;
            this.liveDomainList = response.liveDomainList;
            this.liveDomainType = response.liveDomainType;
            this.regionId = response.regionId;
        } 

        /**
         * 应用唯一标识
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 直播域名列表
         */
        public Builder liveDomainList(java.util.List < String > liveDomainList) {
            this.putBodyParameter("LiveDomainList", liveDomainList);
            this.liveDomainList = liveDomainList;
            return this;
        }

        /**
         * 直播域名类型，推流域名: push, 拉流域名: pull, 回放域名: palyback
         */
        public Builder liveDomainType(String liveDomainType) {
            this.putBodyParameter("LiveDomainType", liveDomainType);
            this.liveDomainType = liveDomainType;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetLiveDomainStatusRequest build() {
            return new GetLiveDomainStatusRequest(this);
        } 

    } 

}
