// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link CreatePhoneNoAReportRequest} extends {@link RequestModel}
 *
 * <p>CreatePhoneNoAReportRequest</p>
 */
public class CreatePhoneNoAReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ANoWhiteGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aNoWhiteGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long documentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardAlivePhoto")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idCardAlivePhoto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardBackPhoto")
    private String idCardBackPhoto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardFrontPhoto")
    private String idCardFrontPhoto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreatePhoneNoAReportRequest(Builder builder) {
        super(builder);
        this.aNoWhiteGroupId = builder.aNoWhiteGroupId;
        this.custName = builder.custName;
        this.documentNumber = builder.documentNumber;
        this.documentType = builder.documentType;
        this.idCardAlivePhoto = builder.idCardAlivePhoto;
        this.idCardBackPhoto = builder.idCardBackPhoto;
        this.idCardFrontPhoto = builder.idCardFrontPhoto;
        this.ownerId = builder.ownerId;
        this.phoneNoA = builder.phoneNoA;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhoneNoAReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aNoWhiteGroupId
     */
    public Long getANoWhiteGroupId() {
        return this.aNoWhiteGroupId;
    }

    /**
     * @return custName
     */
    public String getCustName() {
        return this.custName;
    }

    /**
     * @return documentNumber
     */
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    /**
     * @return documentType
     */
    public Long getDocumentType() {
        return this.documentType;
    }

    /**
     * @return idCardAlivePhoto
     */
    public String getIdCardAlivePhoto() {
        return this.idCardAlivePhoto;
    }

    /**
     * @return idCardBackPhoto
     */
    public String getIdCardBackPhoto() {
        return this.idCardBackPhoto;
    }

    /**
     * @return idCardFrontPhoto
     */
    public String getIdCardFrontPhoto() {
        return this.idCardFrontPhoto;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoA
     */
    public String getPhoneNoA() {
        return this.phoneNoA;
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

    public static final class Builder extends Request.Builder<CreatePhoneNoAReportRequest, Builder> {
        private Long aNoWhiteGroupId; 
        private String custName; 
        private String documentNumber; 
        private Long documentType; 
        private String idCardAlivePhoto; 
        private String idCardBackPhoto; 
        private String idCardFrontPhoto; 
        private Long ownerId; 
        private String phoneNoA; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePhoneNoAReportRequest request) {
            super(request);
            this.aNoWhiteGroupId = request.aNoWhiteGroupId;
            this.custName = request.custName;
            this.documentNumber = request.documentNumber;
            this.documentType = request.documentType;
            this.idCardAlivePhoto = request.idCardAlivePhoto;
            this.idCardBackPhoto = request.idCardBackPhoto;
            this.idCardFrontPhoto = request.idCardFrontPhoto;
            this.ownerId = request.ownerId;
            this.phoneNoA = request.phoneNoA;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>所属a号码组id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder aNoWhiteGroupId(Long aNoWhiteGroupId) {
            this.putQueryParameter("ANoWhiteGroupId", aNoWhiteGroupId);
            this.aNoWhiteGroupId = aNoWhiteGroupId;
            return this;
        }

        /**
         * <p>姓名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>赵**</p>
         */
        public Builder custName(String custName) {
            this.putQueryParameter("CustName", custName);
            this.custName = custName;
            return this;
        }

        /**
         * <p>证件号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>370*********</p>
         */
        public Builder documentNumber(String documentNumber) {
            this.putQueryParameter("DocumentNumber", documentNumber);
            this.documentNumber = documentNumber;
            return this;
        }

        /**
         * <p>证件类型 填写1表示身份证</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder documentType(Long documentType) {
            this.putQueryParameter("DocumentType", documentType);
            this.documentType = documentType;
            return this;
        }

        /**
         * <p>半身照oss路径地址</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456/test1719383196033.jpg示例值</p>
         */
        public Builder idCardAlivePhoto(String idCardAlivePhoto) {
            this.putQueryParameter("IdCardAlivePhoto", idCardAlivePhoto);
            this.idCardAlivePhoto = idCardAlivePhoto;
            return this;
        }

        /**
         * <p>身份证反面照片oss路径地址</p>
         * 
         * <strong>example:</strong>
         * <p>123456/test1719383196032.jpg</p>
         */
        public Builder idCardBackPhoto(String idCardBackPhoto) {
            this.putQueryParameter("IdCardBackPhoto", idCardBackPhoto);
            this.idCardBackPhoto = idCardBackPhoto;
            return this;
        }

        /**
         * <p>身份证正面照片oss路径地址</p>
         * 
         * <strong>example:</strong>
         * <p>123456/test1719383196031.jpg</p>
         */
        public Builder idCardFrontPhoto(String idCardFrontPhoto) {
            this.putQueryParameter("IdCardFrontPhoto", idCardFrontPhoto);
            this.idCardFrontPhoto = idCardFrontPhoto;
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
         * <p>手机号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130*****1234</p>
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
            return this;
        }

        /**
         * <p>备注（客户自己的业务备注，可编辑）</p>
         * 
         * <strong>example:</strong>
         * <p>***报备</p>
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

        @Override
        public CreatePhoneNoAReportRequest build() {
            return new CreatePhoneNoAReportRequest(this);
        } 

    } 

}
