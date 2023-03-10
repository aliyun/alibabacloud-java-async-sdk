// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFingerPrintTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteFingerPrintTemplateRequest</p>
 */
public class DeleteFingerPrintTemplateRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Index")
    @Validation(required = true, maximum = 4, minimum = 1)
    private Integer index;

    @Query
    @NameInMap("LoginToken")
    @Validation(required = true)
    private String loginToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    private DeleteFingerPrintTemplateRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientToken = builder.clientToken;
        this.index = builder.index;
        this.loginToken = builder.loginToken;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFingerPrintTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DeleteFingerPrintTemplateRequest, Builder> {
        private String clientId; 
        private String clientToken; 
        private Integer index; 
        private String loginToken; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFingerPrintTemplateRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientToken = request.clientToken;
            this.index = request.index;
            this.loginToken = request.loginToken;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(Integer index) {
            this.putQueryParameter("Index", index);
            this.index = index;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
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

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DeleteFingerPrintTemplateRequest build() {
            return new DeleteFingerPrintTemplateRequest(this);
        } 

    } 

}
