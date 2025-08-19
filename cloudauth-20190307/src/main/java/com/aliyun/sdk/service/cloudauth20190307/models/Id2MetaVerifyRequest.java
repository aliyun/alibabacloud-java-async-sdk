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
         * <p>ID number:</p>
         * <p>Note
         * Only supports the ID numbers of second-generation resident IDs and Hong Kong, Macao, and Taiwan residence permits.</p>
         * <ul>
         * <li><p>When paramType is normal: enter the plaintext ID number.</p>
         * </li>
         * <li><p>When paramType is md5: first 6 digits of the ID number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID number (plaintext).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>明文：429001********8211</p>
         * <p>密文：</p>
         * <p>42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putBodyParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>Encryption method:</p>
         * <ul>
         * <li><p>normal: plaintext, no encryption</p>
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
         * <li><p>When paramType is md5: first character of the name in ciphertext + rest of the name in plaintext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>明文：张三</p>
         * <p>密文：</p>
         * <p>6499fc7409049355527ef6a2ba5706b8三​</p>
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
