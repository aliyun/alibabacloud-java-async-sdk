// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppRequest</p>
 */
public class DescribeAppRequest extends Request {
    @Query
    @NameInMap("AppId")
    private Long appId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeAppRequest, Builder> {
        private Long appId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppRequest response) {
            super(response);
            this.appId = response.appId;
            this.securityToken = response.securityToken;
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
        public DescribeAppRequest build() {
            return new DescribeAppRequest(this);
        } 

    } 

}
