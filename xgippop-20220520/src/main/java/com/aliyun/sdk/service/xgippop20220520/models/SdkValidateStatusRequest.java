// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkValidateStatusRequest} extends {@link RequestModel}
 *
 * <p>SdkValidateStatusRequest</p>
 */
public class SdkValidateStatusRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CredentialType")
    @Validation(required = true)
    private String credentialType;

    @Query
    @NameInMap("CredentialValue")
    @Validation(required = true)
    private String credentialValue;

    @Query
    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    @Query
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    private SdkValidateStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.credentialType = builder.credentialType;
        this.credentialValue = builder.credentialValue;
        this.operator = builder.operator;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkValidateStatusRequest create() {
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
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * @return credentialValue
     */
    public String getCredentialValue() {
        return this.credentialValue;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<SdkValidateStatusRequest, Builder> {
        private String appId; 
        private String credentialType; 
        private String credentialValue; 
        private String operator; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(SdkValidateStatusRequest request) {
            super(request);
            this.appId = request.appId;
            this.credentialType = request.credentialType;
            this.credentialValue = request.credentialValue;
            this.operator = request.operator;
            this.token = request.token;
        } 

        /**
         * 应用名称
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 凭证类型
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * mobile=150xxxx4661
         */
        public Builder credentialValue(String credentialValue) {
            this.putQueryParameter("CredentialValue", credentialValue);
            this.credentialValue = credentialValue;
            return this;
        }

        /**
         * 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public SdkValidateStatusRequest build() {
            return new SdkValidateStatusRequest(this);
        } 

    } 

}
