// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchApiRequest} extends {@link RequestModel}
 *
 * <p>SwitchApiRequest</p>
 */
public class SwitchApiRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("HistoryVersion")
    @Validation(required = true)
    private String historyVersion;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private SwitchApiRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.historyVersion = builder.historyVersion;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchApiRequest create() {
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
     * @return historyVersion
     */
    public String getHistoryVersion() {
        return this.historyVersion;
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

    public static final class Builder extends Request.Builder<SwitchApiRequest, Builder> {
        private String apiId; 
        private String description; 
        private String groupId; 
        private String historyVersion; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(SwitchApiRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.description = request.description;
            this.groupId = request.groupId;
            this.historyVersion = request.historyVersion;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * The description of the switch operation.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the runtime environment. Valid values:
         * <p>
         * 
         * *   **RELEASE**
         * *   **TEST**
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * *   This API is intended for API providers.
         * <p>
         * *   The historical version can be obtained through the DescribeHistoryApis API.****
         * *   Only APIs that have been published more than once have historical versions to switch to.
         * *   This operation can only be performed on running APIs. Use caution when performing this operation because the operation cannot be undone after it has been completed and takes effect within 5 seconds.
         * *   The switch operation is in essence a publish operation, and the reason for this operation must be provided.
         */
        public Builder historyVersion(String historyVersion) {
            this.putQueryParameter("HistoryVersion", historyVersion);
            this.historyVersion = historyVersion;
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
         * The historical version you want to switch to.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public SwitchApiRequest build() {
            return new SwitchApiRequest(this);
        } 

    } 

}
