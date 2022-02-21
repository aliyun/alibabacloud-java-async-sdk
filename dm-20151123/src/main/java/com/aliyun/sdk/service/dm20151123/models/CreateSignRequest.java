// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignRequest} extends {@link RequestModel}
 *
 * <p>CreateSignRequest</p>
 */
public class CreateSignRequest extends Request {
    @Query
    @NameInMap("FileNames")
    private String fileNames;

    @Query
    @NameInMap("FromType")
    @Validation(maximum = 2, minimum = 1)
    private Integer fromType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SignName")
    @Validation(required = true)
    private String signName;

    @Query
    @NameInMap("SignType")
    @Validation(maximum = 3, minimum = 1)
    private Integer signType;

    private CreateSignRequest(Builder builder) {
        super(builder);
        this.fileNames = builder.fileNames;
        this.fromType = builder.fromType;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.signType = builder.signType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileNames
     */
    public String getFileNames() {
        return this.fileNames;
    }

    /**
     * @return fromType
     */
    public Integer getFromType() {
        return this.fromType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signType
     */
    public Integer getSignType() {
        return this.signType;
    }

    public static final class Builder extends Request.Builder<CreateSignRequest, Builder> {
        private String fileNames; 
        private Integer fromType; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private Integer signType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSignRequest response) {
            super(response);
            this.fileNames = response.fileNames;
            this.fromType = response.fromType;
            this.ownerId = response.ownerId;
            this.remark = response.remark;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.signName = response.signName;
            this.signType = response.signType;
        } 

        /**
         * FileNames.
         */
        public Builder fileNames(String fileNames) {
            this.putQueryParameter("FileNames", fileNames);
            this.fileNames = fileNames;
            return this;
        }

        /**
         * FromType.
         */
        public Builder fromType(Integer fromType) {
            this.putQueryParameter("FromType", fromType);
            this.fromType = fromType;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * SignType.
         */
        public Builder signType(Integer signType) {
            this.putQueryParameter("SignType", signType);
            this.signType = signType;
            return this;
        }

        @Override
        public CreateSignRequest build() {
            return new CreateSignRequest(this);
        } 

    } 

}
