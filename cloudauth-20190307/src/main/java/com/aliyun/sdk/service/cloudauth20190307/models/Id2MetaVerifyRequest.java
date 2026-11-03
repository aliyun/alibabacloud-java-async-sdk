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
 * {@link Id2MetaVerifyRequest} extends {@link RequestModel}
 *
 * <p>Id2MetaVerifyRequest</p>
 */
public class Id2MetaVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private Id2MetaVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identifyNum = builder.identifyNum;
        this.paramType = builder.paramType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Id2MetaVerifyRequest create() {
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

    public static final class Builder extends Request.Builder<Id2MetaVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String paramType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Id2MetaVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identifyNum = request.identifyNum;
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
         * <p>Note: Only the numbers of second-generation resident identity cards and residence permits for Hong Kong, Macao, and Taiwan residents are supported.</p>
         * <ul>
         * <li><p>If you set paramType to normal, enter the ID card number in plaintext.</p>
         * </li>
         * <li><p>If you set paramType to md5, enter the first 6 digits of the ID card number in plaintext, the date of birth in ciphertext, and the last 4 digits of the ID card number in plaintext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Plaintext: 429001********8211</p>
         * <p>Ciphertext:</p>
         * <p>42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putBodyParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li><p>normal: plaintext without encryption</p>
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
         * <p>The name.</p>
         * <ul>
         * <li><p>If you set paramType to normal, enter the name in plaintext.</p>
         * </li>
         * <li><p>If you set paramType to md5, enter the first character of the name in ciphertext and the rest of the name in plaintext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Plaintext: Zhang San</p>
         * <p>Ciphertext:</p>
         * <p>6499fc7409049355527ef6a2ba5706b8San</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Id2MetaVerifyRequest build() {
            return new Id2MetaVerifyRequest(this);
        } 

    } 

}
