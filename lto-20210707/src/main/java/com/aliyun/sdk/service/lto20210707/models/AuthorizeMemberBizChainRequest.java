// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link AuthorizeMemberBizChainRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeMemberBizChainRequest</p>
 */
public class AuthorizeMemberBizChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizChainInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AuthorizeMemberBizChainRequest(Builder builder) {
        super(builder);
        this.bizChainInfo = builder.bizChainInfo;
        this.memberId = builder.memberId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeMemberBizChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizChainInfo
     */
    public String getBizChainInfo() {
        return this.bizChainInfo;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AuthorizeMemberBizChainRequest, Builder> {
        private String bizChainInfo; 
        private String memberId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeMemberBizChainRequest request) {
            super(request);
            this.bizChainInfo = request.bizChainInfo;
            this.memberId = request.memberId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizChainInfo(String bizChainInfo) {
            this.putQueryParameter("BizChainInfo", bizChainInfo);
            this.bizChainInfo = bizChainInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AuthorizeMemberBizChainRequest build() {
            return new AuthorizeMemberBizChainRequest(this);
        } 

    } 

}
