// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeApiMarketAttributesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiMarketAttributesRequest</p>
 */
public class DescribeApiMarketAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeApiMarketAttributesRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiMarketAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeApiMarketAttributesRequest, Builder> {
        private String apiId; 
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiMarketAttributesRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1f9b5e9ba80943099cac52e040b7e160</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The ID of the API group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b693252f3f19445e9a01dac177c4454c</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public DescribeApiMarketAttributesRequest build() {
            return new DescribeApiMarketAttributesRequest(this);
        } 

    } 

}
