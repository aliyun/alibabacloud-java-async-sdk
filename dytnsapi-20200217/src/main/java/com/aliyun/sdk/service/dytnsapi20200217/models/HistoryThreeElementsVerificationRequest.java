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
 * {@link HistoryThreeElementsVerificationRequest} extends {@link RequestModel}
 *
 * <p>HistoryThreeElementsVerificationRequest</p>
 */
public class HistoryThreeElementsVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Carrier")
    private String carrier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verificationTime;

    private HistoryThreeElementsVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.carrier = builder.carrier;
        this.certCode = builder.certCode;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.name = builder.name;
        this.verificationTime = builder.verificationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HistoryThreeElementsVerificationRequest create() {
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
     * @return carrier
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @return certCode
     */
    public String getCertCode() {
        return this.certCode;
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return verificationTime
     */
    public String getVerificationTime() {
        return this.verificationTime;
    }

    public static final class Builder extends Request.Builder<HistoryThreeElementsVerificationRequest, Builder> {
        private String authCode; 
        private String carrier; 
        private String certCode; 
        private String inputNumber; 
        private String mask; 
        private String name; 
        private String verificationTime; 

        private Builder() {
            super();
        } 

        private Builder(HistoryThreeElementsVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.carrier = request.carrier;
            this.certCode = request.certCode;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.name = request.name;
            this.verificationTime = request.verificationTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * Carrier.
         */
        public Builder carrier(String carrier) {
            this.putQueryParameter("Carrier", carrier);
            this.carrier = carrier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
         * <p>示例值示例值示例值</p>
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
         * <p>示例值</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder verificationTime(String verificationTime) {
            this.putQueryParameter("VerificationTime", verificationTime);
            this.verificationTime = verificationTime;
            return this;
        }

        @Override
        public HistoryThreeElementsVerificationRequest build() {
            return new HistoryThreeElementsVerificationRequest(this);
        } 

    } 

}
