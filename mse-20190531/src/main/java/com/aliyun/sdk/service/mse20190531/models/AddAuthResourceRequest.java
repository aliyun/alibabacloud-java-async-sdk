// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAuthResourceRequest} extends {@link RequestModel}
 *
 * <p>AddAuthResourceRequest</p>
 */
public class AddAuthResourceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AuthId")
    private Long authId;

    @Query
    @NameInMap("DomainId")
    private Long domainId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("MatchType")
    private String matchType;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    @Query
    @NameInMap("Path")
    private String path;

    private AddAuthResourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authId = builder.authId;
        this.domainId = builder.domainId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.matchType = builder.matchType;
        this.mseSessionId = builder.mseSessionId;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuthResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return authId
     */
    public Long getAuthId() {
        return this.authId;
    }

    /**
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<AddAuthResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long authId; 
        private Long domainId; 
        private String gatewayUniqueId; 
        private String matchType; 
        private String mseSessionId; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(AddAuthResourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authId = request.authId;
            this.domainId = request.domainId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.matchType = request.matchType;
            this.mseSessionId = request.mseSessionId;
            this.path = request.path;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AuthId.
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * MatchType.
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public AddAuthResourceRequest build() {
            return new AddAuthResourceRequest(this);
        } 

    } 

}
