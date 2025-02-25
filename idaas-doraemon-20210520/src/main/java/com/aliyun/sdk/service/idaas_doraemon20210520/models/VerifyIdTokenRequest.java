// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyIdTokenRequest} extends {@link RequestModel}
 *
 * <p>VerifyIdTokenRequest</p>
 */
public class VerifyIdTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
    private String applicationExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtIdToken")
    private String jwtIdToken;

    private VerifyIdTokenRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.jwtIdToken = builder.jwtIdToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyIdTokenRequest create() {
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
     * @return jwtIdToken
     */
    public String getJwtIdToken() {
        return this.jwtIdToken;
    }

    public static final class Builder extends Request.Builder<VerifyIdTokenRequest, Builder> {
        private String applicationExternalId; 
        private String jwtIdToken; 

        private Builder() {
            super();
        } 

        private Builder(VerifyIdTokenRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.jwtIdToken = request.jwtIdToken;
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
         * jwtIdToken
         */
        public Builder jwtIdToken(String jwtIdToken) {
            this.putQueryParameter("JwtIdToken", jwtIdToken);
            this.jwtIdToken = jwtIdToken;
            return this;
        }

        @Override
        public VerifyIdTokenRequest build() {
            return new VerifyIdTokenRequest(this);
        } 

    } 

}
