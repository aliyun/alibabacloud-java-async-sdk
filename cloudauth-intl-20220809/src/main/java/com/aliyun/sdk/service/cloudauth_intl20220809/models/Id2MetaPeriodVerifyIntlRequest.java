// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link Id2MetaPeriodVerifyIntlRequest} extends {@link RequestModel}
 *
 * <p>Id2MetaPeriodVerifyIntlRequest</p>
 */
public class Id2MetaPeriodVerifyIntlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String merchantBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityEndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validityEndDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityStartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validityStartDate;

    private Id2MetaPeriodVerifyIntlRequest(Builder builder) {
        super(builder);
        this.docName = builder.docName;
        this.docNo = builder.docNo;
        this.docType = builder.docType;
        this.merchantBizId = builder.merchantBizId;
        this.merchantUserId = builder.merchantUserId;
        this.productCode = builder.productCode;
        this.sceneCode = builder.sceneCode;
        this.validityEndDate = builder.validityEndDate;
        this.validityStartDate = builder.validityStartDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Id2MetaPeriodVerifyIntlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docNo
     */
    public String getDocNo() {
        return this.docNo;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return merchantUserId
     */
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return validityEndDate
     */
    public String getValidityEndDate() {
        return this.validityEndDate;
    }

    /**
     * @return validityStartDate
     */
    public String getValidityStartDate() {
        return this.validityStartDate;
    }

    public static final class Builder extends Request.Builder<Id2MetaPeriodVerifyIntlRequest, Builder> {
        private String docName; 
        private String docNo; 
        private String docType; 
        private String merchantBizId; 
        private String merchantUserId; 
        private String productCode; 
        private String sceneCode; 
        private String validityEndDate; 
        private String validityStartDate; 

        private Builder() {
            super();
        } 

        private Builder(Id2MetaPeriodVerifyIntlRequest request) {
            super(request);
            this.docName = request.docName;
            this.docNo = request.docNo;
            this.docType = request.docType;
            this.merchantBizId = request.merchantBizId;
            this.merchantUserId = request.merchantUserId;
            this.productCode = request.productCode;
            this.sceneCode = request.sceneCode;
            this.validityEndDate = request.validityEndDate;
            this.validityStartDate = request.validityStartDate;
        } 

        /**
         * <p>The name of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder docName(String docName) {
            this.putBodyParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * <p>The document number of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>411xxxxxxxxxxx0001</p>
         */
        public Builder docNo(String docNo) {
            this.putBodyParameter("DocNo", docNo);
            this.docNo = docNo;
            return this;
        }

        /**
         * <p>The document type, which is uniquely identified by an 8-digit number. For more information, see the document type list.</p>
         * <p>Currently, only the second-generation resident identity card of the Chinese mainland is supported. Set this parameter to 00000001.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>​00000001</p>
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * <p>The custom unique business identifier, which is used for subsequent troubleshooting. The value can be up to 32 characters in length and can contain letters and digits. Make sure the value is unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putBodyParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>The custom user ID or another identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putBodyParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>The product solution to use.</p>
         * <p>Set the value to eKYC_Date_MIN.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eKYC_Date_MIN</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The custom authentication scenario ID. You can use this scenario ID to query related records in the console. The value can be up to 10 characters in length and can contain letters, digits, and underscores.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putBodyParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>The expiration date of the ID card validity period, in the format YYYYMMDD. Example: 20301001.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20301001</p>
         */
        public Builder validityEndDate(String validityEndDate) {
            this.putBodyParameter("ValidityEndDate", validityEndDate);
            this.validityEndDate = validityEndDate;
            return this;
        }

        /**
         * <p>The start date of the validity period, in the format YYYYMMDD. Example: 20201001.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20201001</p>
         */
        public Builder validityStartDate(String validityStartDate) {
            this.putBodyParameter("ValidityStartDate", validityStartDate);
            this.validityStartDate = validityStartDate;
            return this;
        }

        @Override
        public Id2MetaPeriodVerifyIntlRequest build() {
            return new Id2MetaPeriodVerifyIntlRequest(this);
        } 

    } 

}
