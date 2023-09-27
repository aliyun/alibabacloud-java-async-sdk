// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApiMethodsRequest} extends {@link RequestModel}
 *
 * <p>GetApiMethodsRequest</p>
 */
public class GetApiMethodsRequest extends Request {
    @Query
    @NameInMap("ApiPath")
    @Validation(required = true)
    private String apiPath;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private GetApiMethodsRequest(Builder builder) {
        super(builder);
        this.apiPath = builder.apiPath;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiMethodsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
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

    public static final class Builder extends Request.Builder<GetApiMethodsRequest, Builder> {
        private String apiPath; 
        private String groupId; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(GetApiMethodsRequest request) {
            super(request);
            this.apiPath = request.apiPath;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * ApiPath.
         */
        public Builder apiPath(String apiPath) {
            this.putQueryParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
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
        public GetApiMethodsRequest build() {
            return new GetApiMethodsRequest(this);
        } 

    } 

}
