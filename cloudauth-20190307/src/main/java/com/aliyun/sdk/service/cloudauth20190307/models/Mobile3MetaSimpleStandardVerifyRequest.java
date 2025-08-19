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
 * {@link Mobile3MetaSimpleStandardVerifyRequest} extends {@link RequestModel}
 *
 * <p>Mobile3MetaSimpleStandardVerifyRequest</p>
 */
public class Mobile3MetaSimpleStandardVerifyRequest extends Request {
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

    private Mobile3MetaSimpleStandardVerifyRequest(Builder builder) {
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

    public static Mobile3MetaSimpleStandardVerifyRequest create() {
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

    public static final class Builder extends Request.Builder<Mobile3MetaSimpleStandardVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String mobile; 
        private String paramType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Mobile3MetaSimpleStandardVerifyRequest request) {
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
         * <ul>
         * <li>When <code>paramType</code> is <code>normal</code>: Input the plain text of the ID number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>: Input the encrypted ID number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>429001********8211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putBodyParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>Phone number:</p>
         * <ul>
         * <li>When <code>paramType</code> is <code>normal</code>: Input the plain text of the phone number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>: Input the encrypted phone number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>130********</p>
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Parameter type:</p>
         * <ul>
         * <li>normal: Unencrypted.</li>
         * <li>md5: MD5 encrypted.</li>
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
         * <li>When <code>paramType</code> is <code>normal</code>: Input the plain text of the name.</li>
         * <li>When <code>paramType</code> is <code>md5</code>: Input the encrypted name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>张*</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Mobile3MetaSimpleStandardVerifyRequest build() {
            return new Mobile3MetaSimpleStandardVerifyRequest(this);
        } 

    } 

}
