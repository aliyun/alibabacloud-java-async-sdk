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
 * {@link EnterpriseAccountUpdateAccountAliasRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseAccountUpdateAccountAliasRequest</p>
 */
public class EnterpriseAccountUpdateAccountAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

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
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private EnterpriseAccountUpdateAccountAliasRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.appName = builder.appName;
        this.encryptTicket = builder.encryptTicket;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pk = builder.pk;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountUpdateAccountAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
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

    public static final class Builder extends Request.Builder<EnterpriseAccountUpdateAccountAliasRequest, Builder> {
        private String alias; 
        private String appName; 
        private String encryptTicket; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String pk; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseAccountUpdateAccountAliasRequest request) {
            super(request);
            this.alias = request.alias;
            this.appName = request.appName;
            this.encryptTicket = request.encryptTicket;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pk = request.pk;
            this.requestId = request.requestId;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
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
         * Pk.
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

        @Override
        public EnterpriseAccountUpdateAccountAliasRequest build() {
            return new EnterpriseAccountUpdateAccountAliasRequest(this);
        } 

    } 

}
