// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupRequest</p>
 */
public class CreateMonitorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RawMonitorGroupId")
    private Long rawMonitorGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private CreateMonitorGroupRequest(Builder builder) {
        super(builder);
        this.auth = builder.auth;
        this.groupId = builder.groupId;
        this.rawMonitorGroupId = builder.rawMonitorGroupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auth
     */
    public String getAuth() {
        return this.auth;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return rawMonitorGroupId
     */
    public Long getRawMonitorGroupId() {
        return this.rawMonitorGroupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupRequest, Builder> {
        private String auth; 
        private String groupId; 
        private Long rawMonitorGroupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupRequest request) {
            super(request);
            this.auth = request.auth;
            this.groupId = request.groupId;
            this.rawMonitorGroupId = request.rawMonitorGroupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The caller authentication status of the API. Valid values: <strong>ok</strong>: The authentication is successful. <strong>mismatch</strong>: The request is redirected. <strong>servicenotfound</strong>: A request error occurred. <strong>Unknown</strong>: An unknown error occurred.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder auth(String auth) {
            this.putQueryParameter("Auth", auth);
            this.auth = auth;
            return this;
        }

        /**
         * <p>The ID of the API group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6735211ab9094c818f32f27bc545b6c8</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the monitoring group.</p>
         * 
         * <strong>example:</strong>
         * <p>166636221</p>
         */
        public Builder rawMonitorGroupId(Long rawMonitorGroupId) {
            this.putQueryParameter("RawMonitorGroupId", rawMonitorGroupId);
            this.rawMonitorGroupId = rawMonitorGroupId;
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
        public CreateMonitorGroupRequest build() {
            return new CreateMonitorGroupRequest(this);
        } 

    } 

}
