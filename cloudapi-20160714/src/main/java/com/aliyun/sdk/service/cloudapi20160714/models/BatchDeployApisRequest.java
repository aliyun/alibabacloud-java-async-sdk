// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeployApisRequest} extends {@link RequestModel}
 *
 * <p>BatchDeployApisRequest</p>
 */
public class BatchDeployApisRequest extends Request {
    @Query
    @NameInMap("Api")
    private java.util.List < Api> api;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private BatchDeployApisRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeployApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public java.util.List < Api> getApi() {
        return this.api;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<BatchDeployApisRequest, Builder> {
        private java.util.List < Api> api; 
        private String description; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeployApisRequest request) {
            super(request);
            this.api = request.api;
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * b4f5c342b8bc4ef88ccda0332402e0fa
         */
        public Builder api(java.util.List < Api> api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * 2b35dd68345b472f8051647306a16415
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The description.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public BatchDeployApisRequest build() {
            return new BatchDeployApisRequest(this);
        } 

    } 

    public static class Api extends TeaModel {
        @NameInMap("ApiUid")
        @Validation(required = true)
        private String apiUid;

        @NameInMap("GroupId")
        @Validation(required = true)
        private String groupId;

        private Api(Builder builder) {
            this.apiUid = builder.apiUid;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Api create() {
            return builder().build();
        }

        /**
         * @return apiUid
         */
        public String getApiUid() {
            return this.apiUid;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private String apiUid; 
            private String groupId; 

            /**
             * Publishes multiple APIs at a time.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * The APIs that you want to operate.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
}
