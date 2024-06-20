// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChaincodePackage} extends {@link TeaModel}
 *
 * <p>ChaincodePackage</p>
 */
public class ChaincodePackage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChaincodePackageId")
    private String chaincodePackageId;

    @com.aliyun.core.annotation.NameInMap("Checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("DeleteTime")
    private String deleteTime;

    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("InstallTime")
    private String installTime;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Md5sum")
    private String md5sum;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    private String organizationId;

    @com.aliyun.core.annotation.NameInMap("OssURL")
    private String ossURL;

    @com.aliyun.core.annotation.NameInMap("ProviderBid")
    private String providerBid;

    @com.aliyun.core.annotation.NameInMap("ProviderUid")
    private String providerUid;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    @com.aliyun.core.annotation.NameInMap("UploadTime")
    private String uploadTime;

    private ChaincodePackage(Builder builder) {
        this.chaincodePackageId = builder.chaincodePackageId;
        this.checksum = builder.checksum;
        this.deleteTime = builder.deleteTime;
        this.deleted = builder.deleted;
        this.installTime = builder.installTime;
        this.label = builder.label;
        this.md5sum = builder.md5sum;
        this.message = builder.message;
        this.organizationId = builder.organizationId;
        this.ossURL = builder.ossURL;
        this.providerBid = builder.providerBid;
        this.providerUid = builder.providerUid;
        this.state = builder.state;
        this.type = builder.type;
        this.typeName = builder.typeName;
        this.uploadTime = builder.uploadTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChaincodePackage create() {
        return builder().build();
    }

    /**
     * @return chaincodePackageId
     */
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return deleteTime
     */
    public String getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return installTime
     */
    public String getInstallTime() {
        return this.installTime;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return md5sum
     */
    public String getMd5sum() {
        return this.md5sum;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return ossURL
     */
    public String getOssURL() {
        return this.ossURL;
    }

    /**
     * @return providerBid
     */
    public String getProviderBid() {
        return this.providerBid;
    }

    /**
     * @return providerUid
     */
    public String getProviderUid() {
        return this.providerUid;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @return uploadTime
     */
    public String getUploadTime() {
        return this.uploadTime;
    }

    public static final class Builder {
        private String chaincodePackageId; 
        private String checksum; 
        private String deleteTime; 
        private Boolean deleted; 
        private String installTime; 
        private String label; 
        private String md5sum; 
        private String message; 
        private String organizationId; 
        private String ossURL; 
        private String providerBid; 
        private String providerUid; 
        private String state; 
        private Integer type; 
        private String typeName; 
        private String uploadTime; 

        /**
         * ChaincodePackageId.
         */
        public Builder chaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }

        /**
         * Checksum.
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * DeleteTime.
         */
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }

        /**
         * Deleted.
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * InstallTime.
         */
        public Builder installTime(String installTime) {
            this.installTime = installTime;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Md5sum.
         */
        public Builder md5sum(String md5sum) {
            this.md5sum = md5sum;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        /**
         * OssURL.
         */
        public Builder ossURL(String ossURL) {
            this.ossURL = ossURL;
            return this;
        }

        /**
         * ProviderBid.
         */
        public Builder providerBid(String providerBid) {
            this.providerBid = providerBid;
            return this;
        }

        /**
         * ProviderUid.
         */
        public Builder providerUid(String providerUid) {
            this.providerUid = providerUid;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * TypeName.
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * UploadTime.
         */
        public Builder uploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        public ChaincodePackage build() {
            return new ChaincodePackage(this);
        } 

    } 

}
