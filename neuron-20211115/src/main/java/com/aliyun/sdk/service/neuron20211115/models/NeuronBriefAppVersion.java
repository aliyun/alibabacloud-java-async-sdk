// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronBriefAppVersion} extends {@link TeaModel}
 *
 * <p>NeuronBriefAppVersion</p>
 */
public class NeuronBriefAppVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("manageType")
    private String manageType;

    @com.aliyun.core.annotation.NameInMap("mobiCommitId")
    private String mobiCommitId;

    @com.aliyun.core.annotation.NameInMap("mobiId")
    private Long mobiId;

    @com.aliyun.core.annotation.NameInMap("mobiModuleId")
    private String mobiModuleId;

    @com.aliyun.core.annotation.NameInMap("mobiUrl")
    private String mobiUrl;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private NeuronBriefAppVersion(Builder builder) {
        this.accountId = builder.accountId;
        this.appId = builder.appId;
        this.enterpriseId = builder.enterpriseId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.manageType = builder.manageType;
        this.mobiCommitId = builder.mobiCommitId;
        this.mobiId = builder.mobiId;
        this.mobiModuleId = builder.mobiModuleId;
        this.mobiUrl = builder.mobiUrl;
        this.productId = builder.productId;
        this.status = builder.status;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronBriefAppVersion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return manageType
     */
    public String getManageType() {
        return this.manageType;
    }

    /**
     * @return mobiCommitId
     */
    public String getMobiCommitId() {
        return this.mobiCommitId;
    }

    /**
     * @return mobiId
     */
    public Long getMobiId() {
        return this.mobiId;
    }

    /**
     * @return mobiModuleId
     */
    public String getMobiModuleId() {
        return this.mobiModuleId;
    }

    /**
     * @return mobiUrl
     */
    public String getMobiUrl() {
        return this.mobiUrl;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String accountId; 
        private Long appId; 
        private Long enterpriseId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String manageType; 
        private String mobiCommitId; 
        private Long mobiId; 
        private String mobiModuleId; 
        private String mobiUrl; 
        private Long productId; 
        private String status; 
        private String version; 

        private Builder() {
        } 

        private Builder(NeuronBriefAppVersion model) {
            this.accountId = model.accountId;
            this.appId = model.appId;
            this.enterpriseId = model.enterpriseId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.manageType = model.manageType;
            this.mobiCommitId = model.mobiCommitId;
            this.mobiId = model.mobiId;
            this.mobiModuleId = model.mobiModuleId;
            this.mobiUrl = model.mobiUrl;
            this.productId = model.productId;
            this.status = model.status;
            this.version = model.version;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * manageType.
         */
        public Builder manageType(String manageType) {
            this.manageType = manageType;
            return this;
        }

        /**
         * mobiCommitId.
         */
        public Builder mobiCommitId(String mobiCommitId) {
            this.mobiCommitId = mobiCommitId;
            return this;
        }

        /**
         * mobiId.
         */
        public Builder mobiId(Long mobiId) {
            this.mobiId = mobiId;
            return this;
        }

        /**
         * mobiModuleId.
         */
        public Builder mobiModuleId(String mobiModuleId) {
            this.mobiModuleId = mobiModuleId;
            return this;
        }

        /**
         * mobiUrl.
         */
        public Builder mobiUrl(String mobiUrl) {
            this.mobiUrl = mobiUrl;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public NeuronBriefAppVersion build() {
            return new NeuronBriefAppVersion(this);
        } 

    } 

}
