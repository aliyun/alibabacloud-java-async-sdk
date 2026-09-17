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
 * {@link Mobile3MetaVerifyIntlRequest} extends {@link RequestModel}
 *
 * <p>Mobile3MetaVerifyIntlRequest</p>
 */
public class Mobile3MetaVerifyIntlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private Mobile3MetaVerifyIntlRequest(Builder builder) {
        super(builder);
        this.identifyNum = builder.identifyNum;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.productCode = builder.productCode;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Mobile3MetaVerifyIntlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifyNum
     */
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<Mobile3MetaVerifyIntlRequest, Builder> {
        private String identifyNum; 
        private String mobile; 
        private String paramType; 
        private String productCode; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Mobile3MetaVerifyIntlRequest request) {
            super(request);
            this.identifyNum = request.identifyNum;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
            this.productCode = request.productCode;
            this.userName = request.userName;
        } 

        /**
         * <p>The ID card number.</p>
         * <ul>
         * <li>If ParamType is set to normal, enter the plaintext value.</li>
         * <li>If ParamType is set to md5, enter a 32-character lowercase MD5 string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>429001********8211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The phone number.</p>
         * <ul>
         * <li>If ParamType is set to normal, enter the plaintext value.</li>
         * <li>If ParamType is set to md5, enter a 32-character lowercase MD5 string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>186****1234</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li>normal: not encrypted</li>
         * <li>md5: MD5-encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>The product solution code. Fixed value: MOBILE_3META.</p>
         * 
         * <strong>example:</strong>
         * <p>MOBILE_3META</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The name.</p>
         * <ul>
         * <li>If ParamType is set to normal, enter the plaintext value.</li>
         * <li>If ParamType is set to md5, enter a 32-character lowercase MD5 string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>张*</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Mobile3MetaVerifyIntlRequest build() {
            return new Mobile3MetaVerifyIntlRequest(this);
        } 

    } 

}
