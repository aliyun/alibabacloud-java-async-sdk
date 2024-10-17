// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UsersDetailsVO} extends {@link TeaModel}
 *
 * <p>UsersDetailsVO</p>
 */
public class UsersDetailsVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApprovalSignatureBase64")
    private String approvalSignatureBase64;

    @com.aliyun.core.annotation.NameInMap("ApprovalSqlTemplate")
    private String approvalSqlTemplate;

    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private Integer creator;

    @com.aliyun.core.annotation.NameInMap("DataReady")
    private Integer dataReady;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Mekid")
    private Long mekid;

    @com.aliyun.core.annotation.NameInMap("PathPrefix")
    private String pathPrefix;

    @com.aliyun.core.annotation.NameInMap("ResultParty")
    private Integer resultParty;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    @com.aliyun.core.annotation.NameInMap("UserConfirmed")
    private Integer userConfirmed;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("UserPublicKeyPem")
    private String userPublicKeyPem;

    private UsersDetailsVO(Builder builder) {
        this.approvalSignatureBase64 = builder.approvalSignatureBase64;
        this.approvalSqlTemplate = builder.approvalSqlTemplate;
        this.approvalStatus = builder.approvalStatus;
        this.creator = builder.creator;
        this.dataReady = builder.dataReady;
        this.id = builder.id;
        this.mekid = builder.mekid;
        this.pathPrefix = builder.pathPrefix;
        this.resultParty = builder.resultParty;
        this.uid = builder.uid;
        this.userConfirmed = builder.userConfirmed;
        this.userName = builder.userName;
        this.userPublicKeyPem = builder.userPublicKeyPem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UsersDetailsVO create() {
        return builder().build();
    }

    /**
     * @return approvalSignatureBase64
     */
    public String getApprovalSignatureBase64() {
        return this.approvalSignatureBase64;
    }

    /**
     * @return approvalSqlTemplate
     */
    public String getApprovalSqlTemplate() {
        return this.approvalSqlTemplate;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return creator
     */
    public Integer getCreator() {
        return this.creator;
    }

    /**
     * @return dataReady
     */
    public Integer getDataReady() {
        return this.dataReady;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mekid
     */
    public Long getMekid() {
        return this.mekid;
    }

    /**
     * @return pathPrefix
     */
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * @return resultParty
     */
    public Integer getResultParty() {
        return this.resultParty;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userConfirmed
     */
    public Integer getUserConfirmed() {
        return this.userConfirmed;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPublicKeyPem
     */
    public String getUserPublicKeyPem() {
        return this.userPublicKeyPem;
    }

    public static final class Builder {
        private String approvalSignatureBase64; 
        private String approvalSqlTemplate; 
        private String approvalStatus; 
        private Integer creator; 
        private Integer dataReady; 
        private Long id; 
        private Long mekid; 
        private String pathPrefix; 
        private Integer resultParty; 
        private String uid; 
        private Integer userConfirmed; 
        private String userName; 
        private String userPublicKeyPem; 

        /**
         * ApprovalSignatureBase64.
         */
        public Builder approvalSignatureBase64(String approvalSignatureBase64) {
            this.approvalSignatureBase64 = approvalSignatureBase64;
            return this;
        }

        /**
         * ApprovalSqlTemplate.
         */
        public Builder approvalSqlTemplate(String approvalSqlTemplate) {
            this.approvalSqlTemplate = approvalSqlTemplate;
            return this;
        }

        /**
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(Integer creator) {
            this.creator = creator;
            return this;
        }

        /**
         * DataReady.
         */
        public Builder dataReady(Integer dataReady) {
            this.dataReady = dataReady;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Mekid.
         */
        public Builder mekid(Long mekid) {
            this.mekid = mekid;
            return this;
        }

        /**
         * PathPrefix.
         */
        public Builder pathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * ResultParty.
         */
        public Builder resultParty(Integer resultParty) {
            this.resultParty = resultParty;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * UserConfirmed.
         */
        public Builder userConfirmed(Integer userConfirmed) {
            this.userConfirmed = userConfirmed;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * UserPublicKeyPem.
         */
        public Builder userPublicKeyPem(String userPublicKeyPem) {
            this.userPublicKeyPem = userPublicKeyPem;
            return this;
        }

        public UsersDetailsVO build() {
            return new UsersDetailsVO(this);
        } 

    } 

}
