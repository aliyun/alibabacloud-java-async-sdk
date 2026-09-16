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
 * {@link MobileRecycledMetaVerifyRequest} extends {@link RequestModel}
 *
 * <p>MobileRecycledMetaVerifyRequest</p>
 */
public class MobileRecycledMetaVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisterDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registerDate;

    private MobileRecycledMetaVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.registerDate = builder.registerDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobileRecycledMetaVerifyRequest create() {
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
     * @return registerDate
     */
    public String getRegisterDate() {
        return this.registerDate;
    }

    public static final class Builder extends Request.Builder<MobileRecycledMetaVerifyRequest, Builder> {
        private String regionId; 
        private String mobile; 
        private String paramType; 
        private String registerDate; 

        private Builder() {
            super();
        } 

        private Builder(MobileRecycledMetaVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
            this.registerDate = request.registerDate;
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
         * <p>The phone number. Valid values:</p>
         * <ul>
         * <li>If ParamType is set to normal, pass in the phone number in plaintext.</li>
         * <li>If ParamType is set to md5, pass in the MD5-encrypted phone number.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>明文：186****2055</p>
         * <p>密文：</p>
         * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li>normal: plaintext without encryption</li>
         * <li>md5: MD5 encryption.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The registration date in the format YYYYMMDD. For example, 19800101 indicates January 1, 1980.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20200505</p>
         */
        public Builder registerDate(String registerDate) {
            this.putQueryParameter("RegisterDate", registerDate);
            this.registerDate = registerDate;
            return this;
        }

        @Override
        public MobileRecycledMetaVerifyRequest build() {
            return new MobileRecycledMetaVerifyRequest(this);
        } 

    } 

}
