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
 * {@link CreateFixedNoAReportRequest} extends {@link RequestModel}
 *
 * <p>CreateFixedNoAReportRequest</p>
 */
public class CreateFixedNoAReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ANoWhiteGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aNoWhiteGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustPhoneNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custPhoneNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long custType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long documentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixedLineWorkId")
    private String fixedLineWorkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixedNoA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fixedNoA;

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
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateFixedNoAReportRequest(Builder builder) {
        super(builder);
        this.aNoWhiteGroupId = builder.aNoWhiteGroupId;
        this.custName = builder.custName;
        this.custPhoneNo = builder.custPhoneNo;
        this.custType = builder.custType;
        this.documentNumber = builder.documentNumber;
        this.documentType = builder.documentType;
        this.fixedLineWorkId = builder.fixedLineWorkId;
        this.fixedNoA = builder.fixedNoA;
        this.idCardAlivePhoto = builder.idCardAlivePhoto;
        this.idCardBackPhoto = builder.idCardBackPhoto;
        this.idCardFrontPhoto = builder.idCardFrontPhoto;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFixedNoAReportRequest create() {
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
     * @return custPhoneNo
     */
    public String getCustPhoneNo() {
        return this.custPhoneNo;
    }

    /**
     * @return custType
     */
    public Long getCustType() {
        return this.custType;
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
     * @return fixedLineWorkId
     */
    public String getFixedLineWorkId() {
        return this.fixedLineWorkId;
    }

    /**
     * @return fixedNoA
     */
    public String getFixedNoA() {
        return this.fixedNoA;
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

    public static final class Builder extends Request.Builder<CreateFixedNoAReportRequest, Builder> {
        private Long aNoWhiteGroupId; 
        private String custName; 
        private String custPhoneNo; 
        private Long custType; 
        private String documentNumber; 
        private Long documentType; 
        private String fixedLineWorkId; 
        private String fixedNoA; 
        private String idCardAlivePhoto; 
        private String idCardBackPhoto; 
        private String idCardFrontPhoto; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFixedNoAReportRequest request) {
            super(request);
            this.aNoWhiteGroupId = request.aNoWhiteGroupId;
            this.custName = request.custName;
            this.custPhoneNo = request.custPhoneNo;
            this.custType = request.custType;
            this.documentNumber = request.documentNumber;
            this.documentType = request.documentType;
            this.fixedLineWorkId = request.fixedLineWorkId;
            this.fixedNoA = request.fixedNoA;
            this.idCardAlivePhoto = request.idCardAlivePhoto;
            this.idCardBackPhoto = request.idCardBackPhoto;
            this.idCardFrontPhoto = request.idCardFrontPhoto;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>所属a号码组id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
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
         * <p>法人/经办人手机号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130*****8888</p>
         */
        public Builder custPhoneNo(String custPhoneNo) {
            this.putQueryParameter("CustPhoneNo", custPhoneNo);
            this.custPhoneNo = custPhoneNo;
            return this;
        }

        /**
         * <p>固话客户类型 1:法人,2:经办人</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder custType(Long custType) {
            this.putQueryParameter("CustType", custType);
            this.custType = custType;
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
         * <p>固话申请时服务大厅工单号</p>
         * 
         * <strong>example:</strong>
         * <p>45***12</p>
         */
        public Builder fixedLineWorkId(String fixedLineWorkId) {
            this.putQueryParameter("FixedLineWorkId", fixedLineWorkId);
            this.fixedLineWorkId = fixedLineWorkId;
            return this;
        }

        /**
         * <p>a号码(固话)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>89*****1234</p>
         */
        public Builder fixedNoA(String fixedNoA) {
            this.putQueryParameter("FixedNoA", fixedNoA);
            this.fixedNoA = fixedNoA;
            return this;
        }

        /**
         * <p>正面人像照片 OSS 路径地址</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456/test1719383196033.jpg</p>
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
        public CreateFixedNoAReportRequest build() {
            return new CreateFixedNoAReportRequest(this);
        } 

    } 

}
