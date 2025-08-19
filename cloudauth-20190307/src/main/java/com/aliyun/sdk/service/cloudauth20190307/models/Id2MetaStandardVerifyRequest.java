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
 * {@link Id2MetaStandardVerifyRequest} extends {@link RequestModel}
 *
 * <p>Id2MetaStandardVerifyRequest</p>
 */
public class Id2MetaStandardVerifyRequest extends Request {
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

    private Id2MetaStandardVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identifyNum = builder.identifyNum;
        this.paramType = builder.paramType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Id2MetaStandardVerifyRequest create() {
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

    public static final class Builder extends Request.Builder<Id2MetaStandardVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String paramType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Id2MetaStandardVerifyRequest request) {
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
         * <ul>
         * <li>When <code>paramType</code> is normal: enter the plain text of the ID number.</li>
         * <li>When <code>paramType</code> is md5:
         * The first 6 digits (plain text) + date of birth (encrypted) + last 4 digits (plain text).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4****************1</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putBodyParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>Parameter type:</p>
         * <ul>
         * <li>normal: unencrypted.</li>
         * <li>md5: md5 encrypted.</li>
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
         * <li>When <code>paramType</code> is normal: enter the plain text of the name.</li>
         * <li>When <code>paramType</code> is md5: the first character of the name (encrypted) + the rest of the name (plain text).</li>
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
        public Id2MetaStandardVerifyRequest build() {
            return new Id2MetaStandardVerifyRequest(this);
        } 

    } 

}
