// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseAccountChangeSecurityEmailRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseAccountChangeSecurityEmailRequest</p>
 */
public class EnterpriseAccountChangeSecurityEmailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyCode;

    private EnterpriseAccountChangeSecurityEmailRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pk = builder.pk;
        this.requestId = builder.requestId;
        this.securityEmail = builder.securityEmail;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountChangeSecurityEmailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEmail
     */
    public String getSecurityEmail() {
        return this.securityEmail;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<EnterpriseAccountChangeSecurityEmailRequest, Builder> {
        private String appName; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String pk; 
        private String requestId; 
        private String securityEmail; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseAccountChangeSecurityEmailRequest request) {
            super(request);
            this.appName = request.appName;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pk = request.pk;
            this.requestId = request.requestId;
            this.securityEmail = request.securityEmail;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putQueryParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityEmail(String securityEmail) {
            this.putQueryParameter("SecurityEmail", securityEmail);
            this.securityEmail = securityEmail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public EnterpriseAccountChangeSecurityEmailRequest build() {
            return new EnterpriseAccountChangeSecurityEmailRequest(this);
        } 

    } 

}
