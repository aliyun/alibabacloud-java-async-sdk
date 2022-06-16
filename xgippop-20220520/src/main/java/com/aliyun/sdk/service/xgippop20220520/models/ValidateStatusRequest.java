// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateStatusRequest} extends {@link RequestModel}
 *
 * <p>ValidateStatusRequest</p>
 */
public class ValidateStatusRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

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

    private ValidateStatusRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appId = builder.appId;
        this.credentialType = builder.credentialType;
        this.credentialValue = builder.credentialValue;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
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

    public static final class Builder extends Request.Builder<ValidateStatusRequest, Builder> {
        private Long aliUid; 
        private String appId; 
        private String credentialType; 
        private String credentialValue; 
        private String operator; 

        private Builder() {
            super();
        } 

        private Builder(ValidateStatusRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appId = request.appId;
            this.credentialType = request.credentialType;
            this.credentialValue = request.credentialValue;
            this.operator = request.operator;
        } 

        /**
         * 阿里UID
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
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

        @Override
        public ValidateStatusRequest build() {
            return new ValidateStatusRequest(this);
        } 

    } 

}
