// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>FetchAccessTokenRequest</p>
 */
public class FetchAccessTokenRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true)
    private String applicationExternalId;

    @Query
    @NameInMap("MobileExtendParamsJson")
    @Validation(required = true)
    private String mobileExtendParamsJson;

    @Query
    @NameInMap("MobileExtendParamsJsonSign")
    @Validation(required = true)
    private String mobileExtendParamsJsonSign;

    @Query
    @NameInMap("ServerExtendParamsJson")
    private String serverExtendParamsJson;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("XClientIp")
    private String xClientIp;

    private FetchAccessTokenRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.mobileExtendParamsJson = builder.mobileExtendParamsJson;
        this.mobileExtendParamsJsonSign = builder.mobileExtendParamsJsonSign;
        this.serverExtendParamsJson = builder.serverExtendParamsJson;
        this.userId = builder.userId;
        this.xClientIp = builder.xClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchAccessTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationExternalId
     */
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    /**
     * @return mobileExtendParamsJson
     */
    public String getMobileExtendParamsJson() {
        return this.mobileExtendParamsJson;
    }

    /**
     * @return mobileExtendParamsJsonSign
     */
    public String getMobileExtendParamsJsonSign() {
        return this.mobileExtendParamsJsonSign;
    }

    /**
     * @return serverExtendParamsJson
     */
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xClientIp
     */
    public String getXClientIp() {
        return this.xClientIp;
    }

    public static final class Builder extends Request.Builder<FetchAccessTokenRequest, Builder> {
        private String applicationExternalId; 
        private String mobileExtendParamsJson; 
        private String mobileExtendParamsJsonSign; 
        private String serverExtendParamsJson; 
        private String userId; 
        private String xClientIp; 

        private Builder() {
            super();
        } 

        private Builder(FetchAccessTokenRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.mobileExtendParamsJson = request.mobileExtendParamsJson;
            this.mobileExtendParamsJsonSign = request.mobileExtendParamsJsonSign;
            this.serverExtendParamsJson = request.serverExtendParamsJson;
            this.userId = request.userId;
            this.xClientIp = request.xClientIp;
        } 

        /**
         * ApplicationExternalId.
         */
        public Builder applicationExternalId(String applicationExternalId) {
            this.putQueryParameter("ApplicationExternalId", applicationExternalId);
            this.applicationExternalId = applicationExternalId;
            return this;
        }

        /**
         * MobileExtendParamsJson.
         */
        public Builder mobileExtendParamsJson(String mobileExtendParamsJson) {
            this.putQueryParameter("MobileExtendParamsJson", mobileExtendParamsJson);
            this.mobileExtendParamsJson = mobileExtendParamsJson;
            return this;
        }

        /**
         * MobileExtendParamsJsonSign.
         */
        public Builder mobileExtendParamsJsonSign(String mobileExtendParamsJsonSign) {
            this.putQueryParameter("MobileExtendParamsJsonSign", mobileExtendParamsJsonSign);
            this.mobileExtendParamsJsonSign = mobileExtendParamsJsonSign;
            return this;
        }

        /**
         * ServerExtendParamsJson.
         */
        public Builder serverExtendParamsJson(String serverExtendParamsJson) {
            this.putQueryParameter("ServerExtendParamsJson", serverExtendParamsJson);
            this.serverExtendParamsJson = serverExtendParamsJson;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * XClientIp.
         */
        public Builder xClientIp(String xClientIp) {
            this.putQueryParameter("XClientIp", xClientIp);
            this.xClientIp = xClientIp;
            return this;
        }

        @Override
        public FetchAccessTokenRequest build() {
            return new FetchAccessTokenRequest(this);
        } 

    } 

}
