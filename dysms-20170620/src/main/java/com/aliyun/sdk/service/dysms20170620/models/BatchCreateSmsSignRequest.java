// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link BatchCreateSmsSignRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateSmsSignRequest</p>
 */
public class BatchCreateSmsSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnIndexMappingRule")
    private ColumnIndexMappingRule columnIndexMappingRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendMessage")
    private String extendMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List<String> moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private Integer operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKeys")
    private String ossKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private Integer serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignOssKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signOssKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserViewFileName")
    private String userViewFileName;

    private BatchCreateSmsSignRequest(Builder builder) {
        super(builder);
        this.columnIndexMappingRule = builder.columnIndexMappingRule;
        this.extendMessage = builder.extendMessage;
        this.fileName = builder.fileName;
        this.moreData = builder.moreData;
        this.operationType = builder.operationType;
        this.ossKeys = builder.ossKeys;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneType = builder.sceneType;
        this.serviceType = builder.serviceType;
        this.signOssKey = builder.signOssKey;
        this.userViewFileName = builder.userViewFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateSmsSignRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnIndexMappingRule
     */
    public ColumnIndexMappingRule getColumnIndexMappingRule() {
        return this.columnIndexMappingRule;
    }

    /**
     * @return extendMessage
     */
    public String getExtendMessage() {
        return this.extendMessage;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return moreData
     */
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    /**
     * @return operationType
     */
    public Integer getOperationType() {
        return this.operationType;
    }

    /**
     * @return ossKeys
     */
    public String getOssKeys() {
        return this.ossKeys;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return sceneType
     */
    public Integer getSceneType() {
        return this.sceneType;
    }

    /**
     * @return serviceType
     */
    public Integer getServiceType() {
        return this.serviceType;
    }

    /**
     * @return signOssKey
     */
    public String getSignOssKey() {
        return this.signOssKey;
    }

    /**
     * @return userViewFileName
     */
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

    public static final class Builder extends Request.Builder<BatchCreateSmsSignRequest, Builder> {
        private ColumnIndexMappingRule columnIndexMappingRule; 
        private String extendMessage; 
        private String fileName; 
        private java.util.List<String> moreData; 
        private Integer operationType; 
        private String ossKeys; 
        private Long ownerId; 
        private String prodCode; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sceneType; 
        private Integer serviceType; 
        private String signOssKey; 
        private String userViewFileName; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateSmsSignRequest request) {
            super(request);
            this.columnIndexMappingRule = request.columnIndexMappingRule;
            this.extendMessage = request.extendMessage;
            this.fileName = request.fileName;
            this.moreData = request.moreData;
            this.operationType = request.operationType;
            this.ossKeys = request.ossKeys;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneType = request.sceneType;
            this.serviceType = request.serviceType;
            this.signOssKey = request.signOssKey;
            this.userViewFileName = request.userViewFileName;
        } 

        /**
         * ColumnIndexMappingRule.
         */
        public Builder columnIndexMappingRule(ColumnIndexMappingRule columnIndexMappingRule) {
            String columnIndexMappingRuleShrink = shrink(columnIndexMappingRule, "ColumnIndexMappingRule", "json");
            this.putQueryParameter("ColumnIndexMappingRule", columnIndexMappingRuleShrink);
            this.columnIndexMappingRule = columnIndexMappingRule;
            return this;
        }

        /**
         * ExtendMessage.
         */
        public Builder extendMessage(String extendMessage) {
            this.putQueryParameter("ExtendMessage", extendMessage);
            this.extendMessage = extendMessage;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * MoreData.
         */
        public Builder moreData(java.util.List<String> moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(Integer operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * OssKeys.
         */
        public Builder ossKeys(String ossKeys) {
            this.putQueryParameter("OssKeys", ossKeys);
            this.ossKeys = ossKeys;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
         * <p>This parameter is required.</p>
         */
        public Builder sceneType(Integer sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(Integer serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder signOssKey(String signOssKey) {
            this.putQueryParameter("SignOssKey", signOssKey);
            this.signOssKey = signOssKey;
            return this;
        }

        /**
         * UserViewFileName.
         */
        public Builder userViewFileName(String userViewFileName) {
            this.putQueryParameter("UserViewFileName", userViewFileName);
            this.userViewFileName = userViewFileName;
            return this;
        }

        @Override
        public BatchCreateSmsSignRequest build() {
            return new BatchCreateSmsSignRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateSmsSignRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateSmsSignRequest</p>
     */
    public static class ColumnIndexMappingRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminIdentifiedNumber")
        private Integer adminIdentifiedNumber;

        @com.aliyun.core.annotation.NameInMap("AdminName")
        private Integer adminName;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private Integer companyName;

        @com.aliyun.core.annotation.NameInMap("LegalPersonIdentifiedNumber")
        private Integer legalPersonIdentifiedNumber;

        @com.aliyun.core.annotation.NameInMap("LegalPersonName")
        private Integer legalPersonName;

        @com.aliyun.core.annotation.NameInMap("OrganizationCode")
        private Integer organizationCode;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private Integer remark;

        @com.aliyun.core.annotation.NameInMap("SceneDescription")
        private Integer sceneDescription;

        @com.aliyun.core.annotation.NameInMap("SignatureName")
        private Integer signatureName;

        @com.aliyun.core.annotation.NameInMap("SignatureSource")
        private Integer signatureSource;

        @com.aliyun.core.annotation.NameInMap("TemplateContent")
        private Integer templateContent;

        private ColumnIndexMappingRule(Builder builder) {
            this.adminIdentifiedNumber = builder.adminIdentifiedNumber;
            this.adminName = builder.adminName;
            this.companyName = builder.companyName;
            this.legalPersonIdentifiedNumber = builder.legalPersonIdentifiedNumber;
            this.legalPersonName = builder.legalPersonName;
            this.organizationCode = builder.organizationCode;
            this.remark = builder.remark;
            this.sceneDescription = builder.sceneDescription;
            this.signatureName = builder.signatureName;
            this.signatureSource = builder.signatureSource;
            this.templateContent = builder.templateContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnIndexMappingRule create() {
            return builder().build();
        }

        /**
         * @return adminIdentifiedNumber
         */
        public Integer getAdminIdentifiedNumber() {
            return this.adminIdentifiedNumber;
        }

        /**
         * @return adminName
         */
        public Integer getAdminName() {
            return this.adminName;
        }

        /**
         * @return companyName
         */
        public Integer getCompanyName() {
            return this.companyName;
        }

        /**
         * @return legalPersonIdentifiedNumber
         */
        public Integer getLegalPersonIdentifiedNumber() {
            return this.legalPersonIdentifiedNumber;
        }

        /**
         * @return legalPersonName
         */
        public Integer getLegalPersonName() {
            return this.legalPersonName;
        }

        /**
         * @return organizationCode
         */
        public Integer getOrganizationCode() {
            return this.organizationCode;
        }

        /**
         * @return remark
         */
        public Integer getRemark() {
            return this.remark;
        }

        /**
         * @return sceneDescription
         */
        public Integer getSceneDescription() {
            return this.sceneDescription;
        }

        /**
         * @return signatureName
         */
        public Integer getSignatureName() {
            return this.signatureName;
        }

        /**
         * @return signatureSource
         */
        public Integer getSignatureSource() {
            return this.signatureSource;
        }

        /**
         * @return templateContent
         */
        public Integer getTemplateContent() {
            return this.templateContent;
        }

        public static final class Builder {
            private Integer adminIdentifiedNumber; 
            private Integer adminName; 
            private Integer companyName; 
            private Integer legalPersonIdentifiedNumber; 
            private Integer legalPersonName; 
            private Integer organizationCode; 
            private Integer remark; 
            private Integer sceneDescription; 
            private Integer signatureName; 
            private Integer signatureSource; 
            private Integer templateContent; 

            private Builder() {
            } 

            private Builder(ColumnIndexMappingRule model) {
                this.adminIdentifiedNumber = model.adminIdentifiedNumber;
                this.adminName = model.adminName;
                this.companyName = model.companyName;
                this.legalPersonIdentifiedNumber = model.legalPersonIdentifiedNumber;
                this.legalPersonName = model.legalPersonName;
                this.organizationCode = model.organizationCode;
                this.remark = model.remark;
                this.sceneDescription = model.sceneDescription;
                this.signatureName = model.signatureName;
                this.signatureSource = model.signatureSource;
                this.templateContent = model.templateContent;
            } 

            /**
             * AdminIdentifiedNumber.
             */
            public Builder adminIdentifiedNumber(Integer adminIdentifiedNumber) {
                this.adminIdentifiedNumber = adminIdentifiedNumber;
                return this;
            }

            /**
             * AdminName.
             */
            public Builder adminName(Integer adminName) {
                this.adminName = adminName;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(Integer companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * LegalPersonIdentifiedNumber.
             */
            public Builder legalPersonIdentifiedNumber(Integer legalPersonIdentifiedNumber) {
                this.legalPersonIdentifiedNumber = legalPersonIdentifiedNumber;
                return this;
            }

            /**
             * LegalPersonName.
             */
            public Builder legalPersonName(Integer legalPersonName) {
                this.legalPersonName = legalPersonName;
                return this;
            }

            /**
             * OrganizationCode.
             */
            public Builder organizationCode(Integer organizationCode) {
                this.organizationCode = organizationCode;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(Integer remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SceneDescription.
             */
            public Builder sceneDescription(Integer sceneDescription) {
                this.sceneDescription = sceneDescription;
                return this;
            }

            /**
             * SignatureName.
             */
            public Builder signatureName(Integer signatureName) {
                this.signatureName = signatureName;
                return this;
            }

            /**
             * SignatureSource.
             */
            public Builder signatureSource(Integer signatureSource) {
                this.signatureSource = signatureSource;
                return this;
            }

            /**
             * TemplateContent.
             */
            public Builder templateContent(Integer templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            public ColumnIndexMappingRule build() {
                return new ColumnIndexMappingRule(this);
            } 

        } 

    }
}
