// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenCdnServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenCdnServiceRequest</p>
 */
public class OpenCdnServiceRequest extends Request {
    @Query
    @NameInMap("InternetChargeType")
    @Validation(required = true)
    private String internetChargeType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private OpenCdnServiceRequest(Builder builder) {
        super(builder);
        this.internetChargeType = builder.internetChargeType;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenCdnServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<OpenCdnServiceRequest, Builder> {
        private String internetChargeType; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(OpenCdnServiceRequest request) {
            super(request);
            this.internetChargeType = request.internetChargeType;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The metering method of Alibaba Cloud CDN. A value of **PayByTraffic** indicates that the metering method is pay-by-data-transfer.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public OpenCdnServiceRequest build() {
            return new OpenCdnServiceRequest(this);
        } 

    } 

}
