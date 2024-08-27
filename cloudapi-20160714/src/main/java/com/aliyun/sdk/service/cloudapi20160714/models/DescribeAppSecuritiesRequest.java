// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppSecuritiesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppSecuritiesRequest</p>
 */
public class DescribeAppSecuritiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeAppSecuritiesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppSecuritiesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAppSecuritiesRequest, Builder> {
        private Long appId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppSecuritiesRequest request) {
            super(request);
            this.appId = request.appId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The application ID.
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
        public DescribeAppSecuritiesRequest build() {
            return new DescribeAppSecuritiesRequest(this);
        } 

    } 

}
