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
 * {@link ExternalUserQueryRequest} extends {@link RequestModel}
 *
 * <p>ExternalUserQueryRequest</p>
 */
public class ExternalUserQueryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("external_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalUserId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private ExternalUserQueryRequest(Builder builder) {
        super(builder);
        this.externalUserId = builder.externalUserId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExternalUserQueryRequest create() {
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

    public static final class Builder extends Request.Builder<ExternalUserQueryRequest, Builder> {
        private String externalUserId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ExternalUserQueryRequest request) {
            super(request);
            this.externalUserId = request.externalUserId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>000001</p>
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
        public ExternalUserQueryRequest build() {
            return new ExternalUserQueryRequest(this);
        } 

    } 

}
