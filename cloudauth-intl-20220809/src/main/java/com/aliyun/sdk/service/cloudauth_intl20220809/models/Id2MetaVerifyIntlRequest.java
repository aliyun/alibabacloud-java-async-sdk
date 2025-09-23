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
 * {@link Id2MetaVerifyIntlRequest} extends {@link RequestModel}
 *
 * <p>Id2MetaVerifyIntlRequest</p>
 */
public class Id2MetaVerifyIntlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private Id2MetaVerifyIntlRequest(Builder builder) {
        super(builder);
        this.identifyNum = builder.identifyNum;
        this.paramType = builder.paramType;
        this.productCode = builder.productCode;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Id2MetaVerifyIntlRequest create() {
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

    public static final class Builder extends Request.Builder<Id2MetaVerifyIntlRequest, Builder> {
        private String identifyNum; 
        private String paramType; 
        private String productCode; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Id2MetaVerifyIntlRequest request) {
            super(request);
            this.identifyNum = request.identifyNum;
            this.paramType = request.paramType;
            this.productCode = request.productCode;
            this.userName = request.userName;
        } 

        /**
         * <p>The ID card number.</p>
         * <blockquote>
         * <p>Only ID cards of residents in the Chinese mainland are supported.</p>
         * </blockquote>
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
         * <p>The parameter type.</p>
         * <p><strong>normal</strong>: The original value in plaintext.</p>
         * <blockquote>
         * <p>Due to limitations of the authoritative data source, two-factor ID verification does not support MD5 encryption.</p>
         * </blockquote>
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
         * <p>The product plan. This is a static field. Set the value to <strong>ID_2META</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_2META</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang*</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Id2MetaVerifyIntlRequest build() {
            return new Id2MetaVerifyIntlRequest(this);
        } 

    } 

}
