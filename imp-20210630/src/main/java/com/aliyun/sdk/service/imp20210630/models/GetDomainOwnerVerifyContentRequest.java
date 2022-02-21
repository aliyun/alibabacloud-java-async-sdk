// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainOwnerVerifyContentRequest} extends {@link RequestModel}
 *
 * <p>GetDomainOwnerVerifyContentRequest</p>
 */
public class GetDomainOwnerVerifyContentRequest extends Request {
    @Body
    @NameInMap("LiveDomainName")
    @Validation(required = true)
    private String liveDomainName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetDomainOwnerVerifyContentRequest(Builder builder) {
        super(builder);
        this.liveDomainName = builder.liveDomainName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainOwnerVerifyContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveDomainName
     */
    public String getLiveDomainName() {
        return this.liveDomainName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDomainOwnerVerifyContentRequest, Builder> {
        private String liveDomainName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainOwnerVerifyContentRequest response) {
            super(response);
            this.liveDomainName = response.liveDomainName;
            this.regionId = response.regionId;
        } 

        /**
         * 直播域名
         */
        public Builder liveDomainName(String liveDomainName) {
            this.putBodyParameter("LiveDomainName", liveDomainName);
            this.liveDomainName = liveDomainName;
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
        public GetDomainOwnerVerifyContentRequest build() {
            return new GetDomainOwnerVerifyContentRequest(this);
        } 

    } 

}
