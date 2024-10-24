// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySmsSignRequest} extends {@link RequestModel}
 *
 * <p>ModifySmsSignRequest</p>
 */
public class ModifySmsSignRequest extends Request {
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
    private java.util.List < SignFileList> signFileList;

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

    private ModifySmsSignRequest(Builder builder) {
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

    public static ModifySmsSignRequest create() {
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

    /**
     * @return signType
     */
    public Integer getSignType() {
        return this.signType;
    }

    public static final class Builder extends Request.Builder<ModifySmsSignRequest, Builder> {
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < SignFileList> signFileList; 
        private String signName; 
        private Integer signSource; 
        private Integer signType; 

        private Builder() {
            super();
        } 

        private Builder(ModifySmsSignRequest request) {
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
         * <p>The scenario description of your released services. Provide the information of your services, such as a website URL, a domain name with an ICP filing, an app download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</p>
         * <blockquote>
         * <p>The description can be up to 200 characters in length.</p>
         * </blockquote>
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
         * <p>The list of signature files.</p>
         * <p>This parameter is required.</p>
         */
        public Builder signFileList(java.util.List < SignFileList> signFileList) {
            this.putBodyParameter("SignFileList", signFileList);
            this.signFileList = signFileList;
            return this;
        }

        /**
         * <p>The signature.</p>
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
         * <li><strong>0</strong>: full name or abbreviation of an enterprise or institution.</li>
         * <li><strong>1</strong>: full name or abbreviation of a website with Ministry of Industry and Information Technology (MIIT) filing.</li>
         * <li><strong>2</strong>: full name or abbreviation of an app.</li>
         * <li><strong>3</strong>: full name or abbreviation of a WeChat official account or applet.</li>
         * <li><strong>4</strong>: full name or abbreviation of an e-commerce store.</li>
         * <li><strong>5</strong>: full name or abbreviation of a trademark.</li>
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
         * <li><strong>0</strong>: verification-code signature</li>
         * <li><strong>1</strong>: general-purpose signature</li>
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
        public ModifySmsSignRequest build() {
            return new ModifySmsSignRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifySmsSignRequest} extends {@link TeaModel}
     *
     * <p>ModifySmsSignRequest</p>
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

            /**
             * <p>The base64-encoded string of the signed files. The size of the image cannot exceed 2 MB.</p>
             * <p>In some scenarios, documents are required to prove your identity. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Signature specifications</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>R0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uLiwAA</p>
             */
            public Builder fileContents(String fileContents) {
                this.fileContents = fileContents;
                return this;
            }

            /**
             * <p>The format of the documents. You can upload multiple images. JPG, PNG, GIF, and JPEG are supported.</p>
             * <p>In some scenarios, documents are required to prove your identity. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Signature specifications</a>.</p>
             * <blockquote>
             * <p>If the signature is used for other purposes or the signature source is an enterprise or public institution, you must upload some documents and an authorization letter. For more information, see <a href="https://help.aliyun.com/document_detail/108076.html">Documents</a> and <a href="https://help.aliyun.com/document_detail/56741.html">Letter of authorization</a>.</p>
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
