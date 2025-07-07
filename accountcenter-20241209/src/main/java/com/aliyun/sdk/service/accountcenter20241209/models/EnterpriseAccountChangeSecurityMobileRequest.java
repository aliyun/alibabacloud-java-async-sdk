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
 * {@link EnterpriseAccountChangeSecurityMobileRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseAccountChangeSecurityMobileRequest</p>
 */
public class EnterpriseAccountChangeSecurityMobileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewMobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newMobile;

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
    @com.aliyun.core.annotation.NameInMap("VerificationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verificationCode;

    private EnterpriseAccountChangeSecurityMobileRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.encryptTicket = builder.encryptTicket;
        this.newMobile = builder.newMobile;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pk = builder.pk;
        this.requestId = builder.requestId;
        this.verificationCode = builder.verificationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountChangeSecurityMobileRequest create() {
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
     * @return encryptTicket
     */
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    /**
     * @return newMobile
     */
    public String getNewMobile() {
        return this.newMobile;
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
     * @return verificationCode
     */
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public static final class Builder extends Request.Builder<EnterpriseAccountChangeSecurityMobileRequest, Builder> {
        private String appName; 
        private String encryptTicket; 
        private String newMobile; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String pk; 
        private String requestId; 
        private String verificationCode; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseAccountChangeSecurityMobileRequest request) {
            super(request);
            this.appName = request.appName;
            this.encryptTicket = request.encryptTicket;
            this.newMobile = request.newMobile;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pk = request.pk;
            this.requestId = request.requestId;
            this.verificationCode = request.verificationCode;
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
         * EncryptTicket.
         */
        public Builder encryptTicket(String encryptTicket) {
            this.putQueryParameter("EncryptTicket", encryptTicket);
            this.encryptTicket = encryptTicket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder newMobile(String newMobile) {
            this.putQueryParameter("NewMobile", newMobile);
            this.newMobile = newMobile;
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
        public Builder verificationCode(String verificationCode) {
            this.putQueryParameter("VerificationCode", verificationCode);
            this.verificationCode = verificationCode;
            return this;
        }

        @Override
        public EnterpriseAccountChangeSecurityMobileRequest build() {
            return new EnterpriseAccountChangeSecurityMobileRequest(this);
        } 

    } 

}
