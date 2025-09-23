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
 * {@link Mobile2MetaVerifyIntlRequest} extends {@link RequestModel}
 *
 * <p>Mobile2MetaVerifyIntlRequest</p>
 */
public class Mobile2MetaVerifyIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private Mobile2MetaVerifyIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.productCode = builder.productCode;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Mobile2MetaVerifyIntlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<Mobile2MetaVerifyIntlRequest, Builder> {
        private String regionId; 
        private String mobile; 
        private String paramType; 
        private String productCode; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Mobile2MetaVerifyIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
            this.productCode = request.productCode;
            this.userName = request.userName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The mobile number.</p>
         * <blockquote>
         * <ul>
         * <li>If <strong>paramType</strong> is set to <strong>normal</strong>, enter the plaintext value.</li>
         * <li>If <strong>paramType</strong> is set to <strong>md5</strong>, enter the 32-bit lowercase MD5 string.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>186****1234</p>
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The parameter type:</p>
         * <ul>
         * <li><p><strong>normal</strong>: plaintext</p>
         * </li>
         * <li><p><strong>md5</strong>: MD5-encrypted</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder paramType(String paramType) {
            this.putBodyParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>The product to use. Set this parameter to the static value <strong>MOBILE_2META</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MOBILE_2META</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The name.</p>
         * <blockquote>
         * <ul>
         * <li>If <strong>paramType</strong> is set to <strong>normal</strong>, enter the plaintext value.</li>
         * <li>If <strong>paramType</strong> is set to <strong>md5</strong>, enter the 32-bit lowercase MD5 string.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang*</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Mobile2MetaVerifyIntlRequest build() {
            return new Mobile2MetaVerifyIntlRequest(this);
        } 

    } 

}
