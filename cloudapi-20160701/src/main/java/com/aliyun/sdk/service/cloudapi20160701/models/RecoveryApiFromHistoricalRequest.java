// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoveryApiFromHistoricalRequest} extends {@link RequestModel}
 *
 * <p>RecoveryApiFromHistoricalRequest</p>
 */
public class RecoveryApiFromHistoricalRequest extends Request {
    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private String apiId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
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

    private RecoveryApiFromHistoricalRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.groupId = builder.groupId;
        this.historyVersion = builder.historyVersion;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoveryApiFromHistoricalRequest create() {
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

    public static final class Builder extends Request.Builder<RecoveryApiFromHistoricalRequest, Builder> {
        private String apiId; 
        private String groupId; 
        private String historyVersion; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(RecoveryApiFromHistoricalRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.groupId = request.groupId;
            this.historyVersion = request.historyVersion;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
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
         * HistoryVersion.
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
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public RecoveryApiFromHistoricalRequest build() {
            return new RecoveryApiFromHistoricalRequest(this);
        } 

    } 

}
