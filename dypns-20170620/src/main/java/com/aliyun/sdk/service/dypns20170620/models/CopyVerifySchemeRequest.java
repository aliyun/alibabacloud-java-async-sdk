// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link CopyVerifySchemeRequest} extends {@link RequestModel}
 *
 * <p>CopyVerifySchemeRequest</p>
 */
public class CopyVerifySchemeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmApiCode")
    private Long cmApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmNewFlag")
    private Boolean cmNewFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtApiCode")
    private Long ctApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtNewFlag")
    private Boolean ctNewFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuApiCode")
    private Long cuApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuNewFlag")
    private Boolean cuNewFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelSceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CopyVerifySchemeRequest(Builder builder) {
        super(builder);
        this.cmApiCode = builder.cmApiCode;
        this.cmNewFlag = builder.cmNewFlag;
        this.ctApiCode = builder.ctApiCode;
        this.ctNewFlag = builder.ctNewFlag;
        this.cuApiCode = builder.cuApiCode;
        this.cuNewFlag = builder.cuNewFlag;
        this.email = builder.email;
        this.modelSceneCode = builder.modelSceneCode;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyVerifySchemeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cmApiCode
     */
    public Long getCmApiCode() {
        return this.cmApiCode;
    }

    /**
     * @return cmNewFlag
     */
    public Boolean getCmNewFlag() {
        return this.cmNewFlag;
    }

    /**
     * @return ctApiCode
     */
    public Long getCtApiCode() {
        return this.ctApiCode;
    }

    /**
     * @return ctNewFlag
     */
    public Boolean getCtNewFlag() {
        return this.ctNewFlag;
    }

    /**
     * @return cuApiCode
     */
    public Long getCuApiCode() {
        return this.cuApiCode;
    }

    /**
     * @return cuNewFlag
     */
    public Boolean getCuNewFlag() {
        return this.cuNewFlag;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return modelSceneCode
     */
    public String getModelSceneCode() {
        return this.modelSceneCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CopyVerifySchemeRequest, Builder> {
        private Long cmApiCode; 
        private Boolean cmNewFlag; 
        private Long ctApiCode; 
        private Boolean ctNewFlag; 
        private Long cuApiCode; 
        private Boolean cuNewFlag; 
        private String email; 
        private String modelSceneCode; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CopyVerifySchemeRequest request) {
            super(request);
            this.cmApiCode = request.cmApiCode;
            this.cmNewFlag = request.cmNewFlag;
            this.ctApiCode = request.ctApiCode;
            this.ctNewFlag = request.ctNewFlag;
            this.cuApiCode = request.cuApiCode;
            this.cuNewFlag = request.cuNewFlag;
            this.email = request.email;
            this.modelSceneCode = request.modelSceneCode;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>native：1，web：5</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cmApiCode(Long cmApiCode) {
            this.putQueryParameter("CmApiCode", cmApiCode);
            this.cmApiCode = cmApiCode;
            return this;
        }

        /**
         * <p>true，将在移动侧创建新的AppId，false将直接从模版方案中复制已经创建的移动AppId信息</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cmNewFlag(Boolean cmNewFlag) {
            this.putQueryParameter("CmNewFlag", cmNewFlag);
            this.cmNewFlag = cmNewFlag;
            return this;
        }

        /**
         * <p>native：3，web：8</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder ctApiCode(Long ctApiCode) {
            this.putQueryParameter("CtApiCode", ctApiCode);
            this.ctApiCode = ctApiCode;
            return this;
        }

        /**
         * <p>true，将在电信侧创建新的AppId，false将直接从模版方案中复制已经创建的电信AppId信息</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ctNewFlag(Boolean ctNewFlag) {
            this.putQueryParameter("CtNewFlag", ctNewFlag);
            this.ctNewFlag = ctNewFlag;
            return this;
        }

        /**
         * <p>native：9，web：10</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder cuApiCode(Long cuApiCode) {
            this.putQueryParameter("CuApiCode", cuApiCode);
            this.cuApiCode = cuApiCode;
            return this;
        }

        /**
         * <p>true，将在联通侧创建新的AppId，false将直接从模版方案中复制已经创建的联通AppId信息</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cuNewFlag(Boolean cuNewFlag) {
            this.putQueryParameter("CuNewFlag", cuNewFlag);
            this.cuNewFlag = cuNewFlag;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC1001212***32</p>
         */
        public Builder modelSceneCode(String modelSceneCode) {
            this.putQueryParameter("ModelSceneCode", modelSceneCode);
            this.modelSceneCode = modelSceneCode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CopyVerifySchemeRequest build() {
            return new CopyVerifySchemeRequest(this);
        } 

    } 

}
