// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppSecurityForInnerRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppSecurityForInnerRequest</p>
 */
public class DescribeAppSecurityForInnerRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeAppSecurityForInnerRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appId = builder.appId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppSecurityForInnerRequest create() {
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
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeAppSecurityForInnerRequest, Builder> {
        private Long aliUid; 
        private Long appId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppSecurityForInnerRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appId = request.appId;
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
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
        public DescribeAppSecurityForInnerRequest build() {
            return new DescribeAppSecurityForInnerRequest(this);
        } 

    } 

}
