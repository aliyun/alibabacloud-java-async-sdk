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
 * {@link DescribePhoneNumberOperatorAttributeAnnualRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberOperatorAttributeAnnualRequest</p>
 */
public class DescribePhoneNumberOperatorAttributeAnnualRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    private String number;

    private DescribePhoneNumberOperatorAttributeAnnualRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.mask = builder.mask;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOperatorAttributeAnnualRequest create() {
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
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<DescribePhoneNumberOperatorAttributeAnnualRequest, Builder> {
        private String authCode; 
        private String mask; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneNumberOperatorAttributeAnnualRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.mask = request.mask;
            this.number = request.number;
        } 

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public DescribePhoneNumberOperatorAttributeAnnualRequest build() {
            return new DescribePhoneNumberOperatorAttributeAnnualRequest(this);
        } 

    } 

}
