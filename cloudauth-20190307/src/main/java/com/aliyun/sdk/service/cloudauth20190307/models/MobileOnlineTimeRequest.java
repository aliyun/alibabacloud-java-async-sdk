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
 * {@link MobileOnlineTimeRequest} extends {@link RequestModel}
 *
 * <p>MobileOnlineTimeRequest</p>
 */
public class MobileOnlineTimeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    private MobileOnlineTimeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobileOnlineTimeRequest create() {
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

    public static final class Builder extends Request.Builder<MobileOnlineTimeRequest, Builder> {
        private String regionId; 
        private String mobile; 
        private String paramType; 

        private Builder() {
            super();
        } 

        private Builder(MobileOnlineTimeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
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
         * <p>Mobile number:</p>
         * <ul>
         * <li>When <code>paramType</code> is <code>normal</code>: provide the plaintext mobile number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>: provide the encrypted mobile number.</li>
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

        @Override
        public MobileOnlineTimeRequest build() {
            return new MobileOnlineTimeRequest(this);
        } 

    } 

}
