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
 * {@link EnterpriseAccountSeparateEaRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseAccountSeparateEaRequest</p>
 */
public class EnterpriseAccountSeparateEaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    private String pk;

    private EnterpriseAccountSeparateEaRequest(Builder builder) {
        super(builder);
        this.encryptTicket = builder.encryptTicket;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountSeparateEaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<EnterpriseAccountSeparateEaRequest, Builder> {
        private String encryptTicket; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseAccountSeparateEaRequest request) {
            super(request);
            this.encryptTicket = request.encryptTicket;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pk = request.pk;
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
            this.putBodyParameter("OrientedLeId", orientedLeId);
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

        @Override
        public EnterpriseAccountSeparateEaRequest build() {
            return new EnterpriseAccountSeparateEaRequest(this);
        } 

    } 

}
