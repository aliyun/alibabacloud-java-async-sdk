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
 * {@link EnterpriseRoleCreateBizRoleRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseRoleCreateBizRoleRequest</p>
 */
public class EnterpriseRoleCreateBizRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizPermissionCodeListJson")
    private String bizPermissionCodeListJson;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private EnterpriseRoleCreateBizRoleRequest(Builder builder) {
        super(builder);
        this.bizPermissionCodeListJson = builder.bizPermissionCodeListJson;
        this.bizRoleDesc = builder.bizRoleDesc;
        this.bizRoleName = builder.bizRoleName;
        this.encryptTicket = builder.encryptTicket;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleCreateBizRoleRequest create() {
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

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<EnterpriseRoleCreateBizRoleRequest, Builder> {
        private String bizPermissionCodeListJson; 
        private String bizRoleDesc; 
        private String bizRoleName; 
        private String encryptTicket; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseRoleCreateBizRoleRequest request) {
            super(request);
            this.bizPermissionCodeListJson = request.bizPermissionCodeListJson;
            this.bizRoleDesc = request.bizRoleDesc;
            this.bizRoleName = request.bizRoleName;
            this.encryptTicket = request.encryptTicket;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.resourceType = request.resourceType;
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

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public EnterpriseRoleCreateBizRoleRequest build() {
            return new EnterpriseRoleCreateBizRoleRequest(this);
        } 

    } 

}
