// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAbolishApisRequest} extends {@link RequestModel}
 *
 * <p>BatchAbolishApisRequest</p>
 */
public class BatchAbolishApisRequest extends Request {
    @Query
    @NameInMap("Api")
    @Validation(required = true)
    private java.util.List < Api> api;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private BatchAbolishApisRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAbolishApisRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<BatchAbolishApisRequest, Builder> {
        private java.util.List < Api> api; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchAbolishApisRequest response) {
            super(response);
            this.api = response.api;
            this.securityToken = response.securityToken;
        } 

        /**
         * Api.
         */
        public Builder api(java.util.List < Api> api) {
            this.putQueryParameter("Api", api);
            this.api = api;
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
        public BatchAbolishApisRequest build() {
            return new BatchAbolishApisRequest(this);
        } 

    } 

    public static class Api extends TeaModel {
        @NameInMap("ApiUid")
        @Validation(required = true)
        private String apiUid;

        @NameInMap("GroupId")
        @Validation(required = true)
        private String groupId;

        @NameInMap("StageId")
        @Validation(required = true)
        private String stageId;

        private Api(Builder builder) {
            this.apiUid = builder.apiUid;
            this.groupId = builder.groupId;
            this.stageId = builder.stageId;
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

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        public static final class Builder {
            private String apiUid; 
            private String groupId; 
            private String stageId; 

            /**
             * ApiUid.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
}
