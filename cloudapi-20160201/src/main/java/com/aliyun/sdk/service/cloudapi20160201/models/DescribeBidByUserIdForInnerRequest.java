// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBidByUserIdForInnerRequest} extends {@link RequestModel}
 *
 * <p>DescribeBidByUserIdForInnerRequest</p>
 */
public class DescribeBidByUserIdForInnerRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeBidByUserIdForInnerRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBidByUserIdForInnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeBidByUserIdForInnerRequest, Builder> {
        private Long aliUid; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBidByUserIdForInnerRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.securityToken = request.securityToken;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeBidByUserIdForInnerRequest build() {
            return new DescribeBidByUserIdForInnerRequest(this);
        } 

    } 

}
