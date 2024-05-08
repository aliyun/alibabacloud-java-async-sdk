// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachPluginRequest} extends {@link RequestModel}
 *
 * <p>AttachPluginRequest</p>
 */
public class AttachPluginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiIds")
    private String apiIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageName;

    private AttachPluginRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.apiIds = builder.apiIds;
        this.groupId = builder.groupId;
        this.pluginId = builder.pluginId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachPluginRequest create() {
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
     * @return apiIds
     */
    public String getApiIds() {
        return this.apiIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
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

    public static final class Builder extends Request.Builder<AttachPluginRequest, Builder> {
        private String apiId; 
        private String apiIds; 
        private String groupId; 
        private String pluginId; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(AttachPluginRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.apiIds = request.apiIds;
            this.groupId = request.groupId;
            this.pluginId = request.pluginId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * The number of the API to be bound.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The number of the API to be operated. Separate multiple numbers with commas (,). A maximum of 100 numbers can be entered.
         */
        public Builder apiIds(String apiIds) {
            this.putQueryParameter("ApiIds", apiIds);
            this.apiIds = apiIds;
            return this;
        }

        /**
         * The ID of the API group that contains the API to which the plug-in is to be bound.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the plug-in to be bound.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
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
         * The name of the runtime environment. Valid values:
         * <p>
         * 
         * *   **RELEASE**
         * *   **PRE: the pre-release environment**
         * *   **TEST**
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public AttachPluginRequest build() {
            return new AttachPluginRequest(this);
        } 

    } 

}
