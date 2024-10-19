// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetAppsAuthoritiesRequest} extends {@link RequestModel}
 *
 * <p>SetAppsAuthoritiesRequest</p>
 */
public class SetAppsAuthoritiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthValidTime")
    private String authValidTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageName;

    private SetAppsAuthoritiesRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.appIds = builder.appIds;
        this.authValidTime = builder.authValidTime;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAppsAuthoritiesRequest create() {
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
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return authValidTime
     */
    public String getAuthValidTime() {
        return this.authValidTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<SetAppsAuthoritiesRequest, Builder> {
        private String apiId; 
        private String appIds; 
        private String authValidTime; 
        private String description; 
        private String groupId; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(SetAppsAuthoritiesRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.appIds = request.appIds;
            this.authValidTime = request.authValidTime;
            this.description = request.description;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * <p>The ID of the API. This ID is generated by the system and globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>baacc592e63a4cb6a41920d9d3f91f38</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The IDs of applications. Separate multiple application IDs with commas (,). A maximum of 100 applications IDs can be entered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2386789,3389798</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The time (UTC) when the authorization expires. If this parameter is empty, the authorization does not expire.</p>
         * 
         * <strong>example:</strong>
         * <p>Fri,05Oct201816:00:00GMT</p>
         */
        public Builder authValidTime(String authValidTime) {
            this.putQueryParameter("AuthValidTime", authValidTime);
            this.authValidTime = authValidTime;
            return this;
        }

        /**
         * <p>The description of the authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries weather based on the region name</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
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

        /**
         * <p>The name of the runtime environment. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong></li>
         * <li><strong>TEST</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public SetAppsAuthoritiesRequest build() {
            return new SetAppsAuthoritiesRequest(this);
        } 

    } 

}
