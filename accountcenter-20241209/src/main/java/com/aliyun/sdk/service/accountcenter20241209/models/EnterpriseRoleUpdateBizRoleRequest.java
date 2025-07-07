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
 * {@link EnterpriseRoleUpdateBizRoleRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseRoleUpdateBizRoleRequest</p>
 */
public class EnterpriseRoleUpdateBizRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizPermissionCodeListJson")
    private String bizPermissionCodeListJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRoleCode")
    private String bizRoleCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRoleDesc")
    private String bizRoleDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRoleName")
    private String bizRoleName;

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

    private EnterpriseRoleUpdateBizRoleRequest(Builder builder) {
        super(builder);
        this.bizPermissionCodeListJson = builder.bizPermissionCodeListJson;
        this.bizRoleCode = builder.bizRoleCode;
        this.bizRoleDesc = builder.bizRoleDesc;
        this.bizRoleName = builder.bizRoleName;
        this.encryptTicket = builder.encryptTicket;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleUpdateBizRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizPermissionCodeListJson
     */
    public String getBizPermissionCodeListJson() {
        return this.bizPermissionCodeListJson;
    }

    /**
     * @return bizRoleCode
     */
    public String getBizRoleCode() {
        return this.bizRoleCode;
    }

    /**
     * @return bizRoleDesc
     */
    public String getBizRoleDesc() {
        return this.bizRoleDesc;
    }

    /**
     * @return bizRoleName
     */
    public String getBizRoleName() {
        return this.bizRoleName;
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

    public static final class Builder extends Request.Builder<EnterpriseRoleUpdateBizRoleRequest, Builder> {
        private String bizPermissionCodeListJson; 
        private String bizRoleCode; 
        private String bizRoleDesc; 
        private String bizRoleName; 
        private String encryptTicket; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseRoleUpdateBizRoleRequest request) {
            super(request);
            this.bizPermissionCodeListJson = request.bizPermissionCodeListJson;
            this.bizRoleCode = request.bizRoleCode;
            this.bizRoleDesc = request.bizRoleDesc;
            this.bizRoleName = request.bizRoleName;
            this.encryptTicket = request.encryptTicket;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
        } 

        /**
         * BizPermissionCodeListJson.
         */
        public Builder bizPermissionCodeListJson(String bizPermissionCodeListJson) {
            this.putQueryParameter("BizPermissionCodeListJson", bizPermissionCodeListJson);
            this.bizPermissionCodeListJson = bizPermissionCodeListJson;
            return this;
        }

        /**
         * BizRoleCode.
         */
        public Builder bizRoleCode(String bizRoleCode) {
            this.putQueryParameter("BizRoleCode", bizRoleCode);
            this.bizRoleCode = bizRoleCode;
            return this;
        }

        /**
         * BizRoleDesc.
         */
        public Builder bizRoleDesc(String bizRoleDesc) {
            this.putQueryParameter("BizRoleDesc", bizRoleDesc);
            this.bizRoleDesc = bizRoleDesc;
            return this;
        }

        /**
         * BizRoleName.
         */
        public Builder bizRoleName(String bizRoleName) {
            this.putQueryParameter("BizRoleName", bizRoleName);
            this.bizRoleName = bizRoleName;
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

        @Override
        public EnterpriseRoleUpdateBizRoleRequest build() {
            return new EnterpriseRoleUpdateBizRoleRequest(this);
        } 

    } 

}
