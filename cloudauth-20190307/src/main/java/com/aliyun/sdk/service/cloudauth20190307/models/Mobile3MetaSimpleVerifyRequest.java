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
 * {@link Mobile3MetaSimpleVerifyRequest} extends {@link RequestModel}
 *
 * <p>Mobile3MetaSimpleVerifyRequest</p>
 */
public class Mobile3MetaSimpleVerifyRequest extends Request {
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

    private Mobile3MetaSimpleVerifyRequest(Builder builder) {
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

    public static Mobile3MetaSimpleVerifyRequest create() {
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

    public static final class Builder extends Request.Builder<Mobile3MetaSimpleVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String mobile; 
        private String paramType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Mobile3MetaSimpleVerifyRequest request) {
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
         * <p>ID number:</p>
         * <p>Note
         * Only supports the ID numbers of second-generation resident IDs and Hong Kong, Macao, and Taiwan residence permits.</p>
         * <ul>
         * <li><p>When paramType is normal: enter the plaintext ID number.</p>
         * </li>
         * <li><p>When paramType is md5: enter the encrypted ID number.</p>
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
         * <p>Mobile phone number:</p>
         * <ul>
         * <li><p>When paramType is normal: enter the plaintext mobile phone number.</p>
         * </li>
         * <li><p>When paramType is md5: enter the encrypted mobile phone number.</p>
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
         * <p>Encryption method:</p>
         * <ul>
         * <li><p>normal: plaintext, not encrypted</p>
         * </li>
         * <li><p>md5: MD5 encryption</p>
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
         * <p>Name:</p>
         * <ul>
         * <li><p>When paramType is normal: enter the plaintext name.</p>
         * </li>
         * <li><p>When paramType is md5: enter the encrypted name.</p>
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
        public Mobile3MetaSimpleVerifyRequest build() {
            return new Mobile3MetaSimpleVerifyRequest(this);
        } 

    } 

}
