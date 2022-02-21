// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSmsSignRequest} extends {@link RequestModel}
 *
 * <p>AddSmsSignRequest</p>
 */
public class AddSmsSignRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Remark")
    @Validation(required = true)
    private String remark;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Body
    @NameInMap("SignFileList")
    @Validation(required = true)
    private java.util.List < SignFileList> signFileList;

    @Query
    @NameInMap("SignName")
    @Validation(required = true)
    private String signName;

    @Query
    @NameInMap("SignSource")
    @Validation(required = true)
    private Integer signSource;

    private AddSmsSignRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signFileList = builder.signFileList;
        this.signName = builder.signName;
        this.signSource = builder.signSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSmsSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return signFileList
     */
    public java.util.List < SignFileList> getSignFileList() {
        return this.signFileList;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signSource
     */
    public Integer getSignSource() {
        return this.signSource;
    }

    public static final class Builder extends Request.Builder<AddSmsSignRequest, Builder> {
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < SignFileList> signFileList; 
        private String signName; 
        private Integer signSource; 

        private Builder() {
            super();
        } 

        private Builder(AddSmsSignRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.remark = response.remark;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.signFileList = response.signFileList;
            this.signName = response.signName;
            this.signSource = response.signSource;
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
         * SignFileList.
         */
        public Builder signFileList(java.util.List < SignFileList> signFileList) {
            this.putBodyParameter("SignFileList", signFileList);
            this.signFileList = signFileList;
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
         * SignSource.
         */
        public Builder signSource(Integer signSource) {
            this.putQueryParameter("SignSource", signSource);
            this.signSource = signSource;
            return this;
        }

        @Override
        public AddSmsSignRequest build() {
            return new AddSmsSignRequest(this);
        } 

    } 

    public static class SignFileList extends TeaModel {
        @NameInMap("FileContents")
        @Validation(required = true)
        private String fileContents;

        @NameInMap("FileSuffix")
        @Validation(required = true)
        private String fileSuffix;

        private SignFileList(Builder builder) {
            this.fileContents = builder.fileContents;
            this.fileSuffix = builder.fileSuffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignFileList create() {
            return builder().build();
        }

        /**
         * @return fileContents
         */
        public String getFileContents() {
            return this.fileContents;
        }

        /**
         * @return fileSuffix
         */
        public String getFileSuffix() {
            return this.fileSuffix;
        }

        public static final class Builder {
            private String fileContents; 
            private String fileSuffix; 

            /**
             * FileContents.
             */
            public Builder fileContents(String fileContents) {
                this.fileContents = fileContents;
                return this;
            }

            /**
             * FileSuffix.
             */
            public Builder fileSuffix(String fileSuffix) {
                this.fileSuffix = fileSuffix;
                return this;
            }

            public SignFileList build() {
                return new SignFileList(this);
            } 

        } 

    }
}
