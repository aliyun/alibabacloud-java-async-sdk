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
 * {@link DescribePhoneNumberOperatorAttributeAnnualUseRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberOperatorAttributeAnnualUseRequest</p>
 */
public class DescribePhoneNumberOperatorAttributeAnnualUseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mask;

    private DescribePhoneNumberOperatorAttributeAnnualUseRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOperatorAttributeAnnualUseRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePhoneNumberOperatorAttributeAnnualUseRequest, Builder> {
        private String authCode; 
        private String inputNumber; 
        private String mask; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneNumberOperatorAttributeAnnualUseRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        @Override
        public DescribePhoneNumberOperatorAttributeAnnualUseRequest build() {
            return new DescribePhoneNumberOperatorAttributeAnnualUseRequest(this);
        } 

    } 

}
