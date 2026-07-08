// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link VirtualThreeElementsVerificationRequest} extends {@link RequestModel}
 *
 * <p>VirtualThreeElementsVerificationRequest</p>
 */
public class VirtualThreeElementsVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mask;

    private VirtualThreeElementsVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.certCode = builder.certCode;
        this.certName = builder.certName;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VirtualThreeElementsVerificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return certCode
     */
    public String getCertCode() {
        return this.certCode;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return inputNumber
     */
    public String getInputNumber() {
        return this.inputNumber;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    public static final class Builder extends Request.Builder<VirtualThreeElementsVerificationRequest, Builder> {
        private String authCode; 
        private String certCode; 
        private String certName; 
        private String inputNumber; 
        private String mask; 

        private Builder() {
            super();
        } 

        private Builder(VirtualThreeElementsVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.certCode = request.certCode;
            this.certName = request.certName;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder certCode(String certCode) {
            this.putQueryParameter("CertCode", certCode);
            this.certCode = certCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        @Override
        public VirtualThreeElementsVerificationRequest build() {
            return new VirtualThreeElementsVerificationRequest(this);
        } 

    } 

}
