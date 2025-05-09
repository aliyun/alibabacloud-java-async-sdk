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
 * {@link AddSmsSignRequest} extends {@link RequestModel}
 *
 * <p>AddSmsSignRequest</p>
 */
public class AddSmsSignRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SignFileList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SignFileList> signFileList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer signSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignType")
    private Integer signType;

    private AddSmsSignRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signFileList = builder.signFileList;
        this.signName = builder.signName;
        this.signSource = builder.signSource;
        this.signType = builder.signType;
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
    public java.util.List<SignFileList> getSignFileList() {
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

    /**
     * @return signType
     */
    public Integer getSignType() {
        return this.signType;
    }

    public static final class Builder extends Request.Builder<AddSmsSignRequest, Builder> {
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<SignFileList> signFileList; 
        private String signName; 
        private Integer signSource; 
        private Integer signType; 

        private Builder() {
            super();
        } 

        private Builder(AddSmsSignRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signFileList = request.signFileList;
            this.signName = request.signName;
            this.signSource = request.signSource;
            this.signType = request.signType;
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
         * <p>The description of the signature application. The description cannot exceed 200 characters in length. The description is one of the reference information for signature review. We recommend that you describe the use scenarios of your services in detail, and provide information that can verify the services, such as a website URL, a domain name with an ICP filing, an app download URL, an official account name, or a mini program name. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>This is the abbreviation of our company.</p>
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
         * <p>The signature files.</p>
         * <p>This parameter is required.</p>
         */
        public Builder signFileList(java.util.List<SignFileList> signFileList) {
            this.putBodyParameter("SignFileList", signFileList);
            this.signFileList = signFileList;
            return this;
        }

        /**
         * <p>The name of the signature.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The signature name is not case-sensitive. For example, [Alibaba Cloud Communication] and [alibaba cloud communication] are considered as the same name.</p>
         * </li>
         * <li><p>If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send messages by default.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>The source of the signature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the full name or abbreviation of an enterprise or institution</li>
         * <li><strong>1</strong>: the full name or abbreviation of a website that has obtained an ICP filing from the Ministry of Industry and Information Technology (MIIT) of China</li>
         * <li><strong>2</strong>: the full name or abbreviation of an app</li>
         * <li><strong>3</strong>: the full name or abbreviation of an official account or mini-program</li>
         * <li><strong>4</strong>: the full name or abbreviation of an e-commerce store</li>
         * <li><strong>5</strong>: the full name or abbreviation of a trademark</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder signSource(Integer signSource) {
            this.putQueryParameter("SignSource", signSource);
            this.signSource = signSource;
            return this;
        }

        /**
         * <p>The type of the signature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: verification code</li>
         * <li><strong>1</strong>: general-purpose</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder signType(Integer signType) {
            this.putQueryParameter("SignType", signType);
            this.signType = signType;
            return this;
        }

        @Override
        public AddSmsSignRequest build() {
            return new AddSmsSignRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddSmsSignRequest} extends {@link TeaModel}
     *
     * <p>AddSmsSignRequest</p>
     */
    public static class SignFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileContents;

        @com.aliyun.core.annotation.NameInMap("FileSuffix")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(SignFileList model) {
                this.fileContents = model.fileContents;
                this.fileSuffix = model.fileSuffix;
            } 

            /**
             * <p>The Base64-encoded string of the qualification document. An image cannot exceed 2 MB in size. In some scenarios, you must upload supporting documents to apply for signatures. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>R0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uL****</p>
             */
            public Builder fileContents(String fileContents) {
                this.fileContents = fileContents;
                return this;
            }

            /**
             * <p>The format of the qualification document. You can upload multiple images. Images in JPG, PNG, GIF, or JPEG format are supported.</p>
             * <p>In some scenarios, you must upload supporting documents to apply for signatures. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>.</p>
             * <blockquote>
             * <p>If you apply for a signature for other users or if the signature source is the name of an enterprise or public institution, you must upload a certificate and a letter of authorization. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Certificate</a> and <a href="https://help.aliyun.com/document_detail/56741.html">Letter of authorization</a>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>jpg</p>
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
