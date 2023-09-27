// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetMockIntegrationRequest} extends {@link RequestModel}
 *
 * <p>SetMockIntegrationRequest</p>
 */
public class SetMockIntegrationRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Mock")
    @Validation(required = true)
    private String mock;

    @Query
    @NameInMap("MockResult")
    private String mockResult;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetMockIntegrationRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.groupId = builder.groupId;
        this.mock = builder.mock;
        this.mockResult = builder.mockResult;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMockIntegrationRequest create() {
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
     * @return mock
     */
    public String getMock() {
        return this.mock;
    }

    /**
     * @return mockResult
     */
    public String getMockResult() {
        return this.mockResult;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetMockIntegrationRequest, Builder> {
        private String apiId; 
        private String groupId; 
        private String mock; 
        private String mockResult; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetMockIntegrationRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.groupId = request.groupId;
            this.mock = request.mock;
            this.mockResult = request.mockResult;
            this.securityToken = request.securityToken;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Mock.
         */
        public Builder mock(String mock) {
            this.putQueryParameter("Mock", mock);
            this.mock = mock;
            return this;
        }

        /**
         * MockResult.
         */
        public Builder mockResult(String mockResult) {
            this.putQueryParameter("MockResult", mockResult);
            this.mockResult = mockResult;
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
        public SetMockIntegrationRequest build() {
            return new SetMockIntegrationRequest(this);
        } 

    } 

}
