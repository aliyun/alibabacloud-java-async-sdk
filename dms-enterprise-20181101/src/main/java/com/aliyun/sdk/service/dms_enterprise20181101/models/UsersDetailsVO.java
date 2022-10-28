// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UsersDetailsVO} extends {@link TeaModel}
 *
 * <p>UsersDetailsVO</p>
 */
public class UsersDetailsVO extends TeaModel {
    @NameInMap("ApprovalSignatureBase64")
    private String approvalSignatureBase64;

    @NameInMap("ApprovalSqlTemplate")
    private String approvalSqlTemplate;

    @NameInMap("ApprovalStatus")
    private String approvalStatus;

    @NameInMap("Creator")
    private Integer creator;

    @NameInMap("DataReady")
    private Integer dataReady;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Mekid")
    private Long mekid;

    @NameInMap("PathPrefix")
    private String pathPrefix;

    @NameInMap("ResultParty")
    private Integer resultParty;

    @NameInMap("Uid")
    private String uid;

    @NameInMap("UserConfirmed")
    private Integer userConfirmed;

    @NameInMap("UserName")
    private String userName;

    @NameInMap("UserPublicKeyPem")
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
         * 审批签名信息
         */
        public Builder approvalSignatureBase64(String approvalSignatureBase64) {
            this.approvalSignatureBase64 = approvalSignatureBase64;
            return this;
        }

        /**
         * 审批过的sql模板
         */
        public Builder approvalSqlTemplate(String approvalSqlTemplate) {
            this.approvalSqlTemplate = approvalSqlTemplate;
            return this;
        }

        /**
         * 是否完成了审批
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * 是否为项目创建者
         */
        public Builder creator(Integer creator) {
            this.creator = creator;
            return this;
        }

        /**
         * 是否绑定完数据
         */
        public Builder dataReady(Integer dataReady) {
            this.dataReady = dataReady;
            return this;
        }

        /**
         * 用户id
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * mekid
         */
        public Builder mekid(Long mekid) {
            this.mekid = mekid;
            return this;
        }

        /**
         * 存储空间路径
         */
        public Builder pathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * 是否为结果方
         */
        public Builder resultParty(Integer resultParty) {
            this.resultParty = resultParty;
            return this;
        }

        /**
         * uid
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * 是否验证过项目同意加入
         */
        public Builder userConfirmed(Integer userConfirmed) {
            this.userConfirmed = userConfirmed;
            return this;
        }

        /**
         * 用户名
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * 公钥
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
