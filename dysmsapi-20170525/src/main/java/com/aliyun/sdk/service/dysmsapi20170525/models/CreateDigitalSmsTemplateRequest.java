// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateDigitalSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateDigitalSmsTemplateRequest</p>
 */
public class CreateDigitalSmsTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateContents")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TemplateContents> templateContents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private CreateDigitalSmsTemplateRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.templateContents = builder.templateContents;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDigitalSmsTemplateRequest create() {
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return templateContents
     */
    public java.util.List<TemplateContents> getTemplateContents() {
        return this.templateContents;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateDigitalSmsTemplateRequest, Builder> {
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private java.util.List<TemplateContents> templateContents; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDigitalSmsTemplateRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
            this.templateContents = request.templateContents;
            this.templateName = request.templateName;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder templateContents(java.util.List<TemplateContents> templateContents) {
            this.putQueryParameter("TemplateContents", templateContents);
            this.templateContents = templateContents;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateDigitalSmsTemplateRequest build() {
            return new CreateDigitalSmsTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDigitalSmsTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateDigitalSmsTemplateRequest</p>
     */
    public static class TemplateContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileContents")
        private String fileContents;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("FileSuffix")
        private String fileSuffix;

        private TemplateContents(Builder builder) {
            this.fileContents = builder.fileContents;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileSuffix = builder.fileSuffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateContents create() {
            return builder().build();
        }

        /**
         * @return fileContents
         */
        public String getFileContents() {
            return this.fileContents;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileSuffix
         */
        public String getFileSuffix() {
            return this.fileSuffix;
        }

        public static final class Builder {
            private String fileContents; 
            private String fileName; 
            private Integer fileSize; 
            private String fileSuffix; 

            private Builder() {
            } 

            private Builder(TemplateContents model) {
                this.fileContents = model.fileContents;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileSuffix = model.fileSuffix;
            } 

            /**
             * FileContents.
             */
            public Builder fileContents(String fileContents) {
                this.fileContents = fileContents;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileSuffix.
             */
            public Builder fileSuffix(String fileSuffix) {
                this.fileSuffix = fileSuffix;
                return this;
            }

            public TemplateContents build() {
                return new TemplateContents(this);
            } 

        } 

    }
}
