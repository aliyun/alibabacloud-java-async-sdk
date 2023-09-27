// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveIpControlApisRequest} extends {@link RequestModel}
 *
 * <p>RemoveIpControlApisRequest</p>
 */
public class RemoveIpControlApisRequest extends Request {
    @Query
    @NameInMap("ApiIds")
    private String apiIds;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IpControlId")
    @Validation(required = true)
    private String ipControlId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private RemoveIpControlApisRequest(Builder builder) {
        super(builder);
        this.apiIds = builder.apiIds;
        this.groupId = builder.groupId;
        this.ipControlId = builder.ipControlId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveIpControlApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
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

    public static final class Builder extends Request.Builder<RemoveIpControlApisRequest, Builder> {
        private String apiIds; 
        private String groupId; 
        private String ipControlId; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveIpControlApisRequest request) {
            super(request);
            this.apiIds = request.apiIds;
            this.groupId = request.groupId;
            this.ipControlId = request.ipControlId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * ApiIds.
         */
        public Builder apiIds(String apiIds) {
            this.putQueryParameter("ApiIds", apiIds);
            this.apiIds = apiIds;
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
         * IpControlId.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
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
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public RemoveIpControlApisRequest build() {
            return new RemoveIpControlApisRequest(this);
        } 

    } 

}
