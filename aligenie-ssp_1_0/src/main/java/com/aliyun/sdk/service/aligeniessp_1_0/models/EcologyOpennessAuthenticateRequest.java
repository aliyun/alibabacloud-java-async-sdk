// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link EcologyOpennessAuthenticateRequest} extends {@link RequestModel}
 *
 * <p>EcologyOpennessAuthenticateRequest</p>
 */
public class EcologyOpennessAuthenticateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncodeKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginStateAccessToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginStateAccessToken;

    private EcologyOpennessAuthenticateRequest(Builder builder) {
        super(builder);
        this.encodeKey = builder.encodeKey;
        this.encodeType = builder.encodeType;
        this.loginStateAccessToken = builder.loginStateAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EcologyOpennessAuthenticateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encodeKey
     */
    public String getEncodeKey() {
        return this.encodeKey;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return loginStateAccessToken
     */
    public String getLoginStateAccessToken() {
        return this.loginStateAccessToken;
    }

    public static final class Builder extends Request.Builder<EcologyOpennessAuthenticateRequest, Builder> {
        private String encodeKey; 
        private String encodeType; 
        private String loginStateAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(EcologyOpennessAuthenticateRequest request) {
            super(request);
            this.encodeKey = request.encodeKey;
            this.encodeType = request.encodeType;
            this.loginStateAccessToken = request.loginStateAccessToken;
        } 

        /**
         * <p>entity key</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12*****</p>
         */
        public Builder encodeKey(String encodeKey) {
            this.putBodyParameter("EncodeKey", encodeKey);
            this.encodeKey = encodeKey;
            return this;
        }

        /**
         * <p>entity Type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        public Builder encodeType(String encodeType) {
            this.putBodyParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * <p>logon state access token</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d15aa*****ee</p>
         */
        public Builder loginStateAccessToken(String loginStateAccessToken) {
            this.putBodyParameter("LoginStateAccessToken", loginStateAccessToken);
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }

        @Override
        public EcologyOpennessAuthenticateRequest build() {
            return new EcologyOpennessAuthenticateRequest(this);
        } 

    } 

}
