// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ExternalUserDeleteRequest} extends {@link RequestModel}
 *
 * <p>ExternalUserDeleteRequest</p>
 */
public class ExternalUserDeleteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("external_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalUserId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private ExternalUserDeleteRequest(Builder builder) {
        super(builder);
        this.externalUserId = builder.externalUserId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExternalUserDeleteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<ExternalUserDeleteRequest, Builder> {
        private String externalUserId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ExternalUserDeleteRequest request) {
            super(request);
            this.externalUserId = request.externalUserId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0012</p>
         */
        public Builder externalUserId(String externalUserId) {
            this.putPathParameter("external_user_id", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public ExternalUserDeleteRequest build() {
            return new ExternalUserDeleteRequest(this);
        } 

    } 

}
