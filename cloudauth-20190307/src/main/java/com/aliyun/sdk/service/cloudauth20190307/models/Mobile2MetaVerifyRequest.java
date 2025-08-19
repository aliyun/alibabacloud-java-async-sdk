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
 * {@link Mobile2MetaVerifyRequest} extends {@link RequestModel}
 *
 * <p>Mobile2MetaVerifyRequest</p>
 */
public class Mobile2MetaVerifyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private Mobile2MetaVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Mobile2MetaVerifyRequest create() {
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<Mobile2MetaVerifyRequest, Builder> {
        private String regionId; 
        private String mobile; 
        private String paramType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(Mobile2MetaVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * <p>Phone number:</p>
         * <ul>
         * <li>When paramType is normal: input the plaintext phone number.</li>
         * <li>When paramType is md5: input the encrypted phone number.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>● 明文：186****2055
         * ● 密文：
         * 849169cd3b20621c1c78bd61a11a4fc2</p>
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Encryption method:</p>
         * <ul>
         * <li>normal: plaintext without encryption</li>
         * <li>md5: MD5 encryption</li>
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
         * <p>Name:</p>
         * <ul>
         * <li>When paramType is normal: input the plaintext name.</li>
         * <li>When paramType is md5: input the encrypted name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>● 明文：张三
         * ● 密文：
         * 32fa7bcd874161bea8ec8fd98f390ec9</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public Mobile2MetaVerifyRequest build() {
            return new Mobile2MetaVerifyRequest(this);
        } 

    } 

}
