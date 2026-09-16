// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link Mobile3MetaDetailVerifyRequest} extends {@link RequestModel}
 *
 * <p>Mobile3MetaDetailVerifyRequest</p>
 */
public class Mobile3MetaDetailVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private Mobile3MetaDetailVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identifyNum = builder.identifyNum;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Mobile3MetaDetailVerifyRequest create() {
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<Mobile3MetaDetailVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String mobile; 
        private String paramType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Mobile3MetaDetailVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identifyNum = request.identifyNum;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
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
         * <p>The ID card number.</p>
         * <blockquote>
         * <p>Note: Only second-generation resident ID card numbers and Hong Kong, Macao, or Taiwan residence permit numbers are supported.</p>
         * </blockquote>
         * <ul>
         * <li><p>If ParamType is set to normal, pass in the ID card number in plaintext.</p>
         * </li>
         * <li><p>If ParamType is set to md5, pass in the ID card number in ciphertext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>明文：429001********8211</p>
         * <p>密文：</p>
         * <p>32fa7bcd874161bea8ec8fd98f390ec9</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putBodyParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The phone number.</p>
         * <ul>
         * <li><p>If ParamType is set to normal, pass in the phone number in plaintext.</p>
         * </li>
         * <li><p>If ParamType is set to md5, pass in the phone number in ciphertext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>明文：186****2055</p>
         * <p>密文：</p>
         * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li><p>normal: plaintext without encryption</p>
         * </li>
         * <li><p>md5: MD5 encryption.</p>
         * </li>
         * </ul>
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
         * <p>The name.</p>
         * <ul>
         * <li><p>If ParamType is set to normal, pass in the name in plaintext.</p>
         * </li>
         * <li><p>If ParamType is set to md5, pass in the name in ciphertext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>明文：张三</p>
         * <p>密文：</p>
         * <p>32fa7bcd874161bea8ec8fd98f390ec9</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Mobile3MetaDetailVerifyRequest build() {
            return new Mobile3MetaDetailVerifyRequest(this);
        } 

    } 

}
