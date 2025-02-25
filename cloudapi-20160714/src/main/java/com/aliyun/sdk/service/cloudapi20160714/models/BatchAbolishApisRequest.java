// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchAbolishApisRequest} extends {@link RequestModel}
 *
 * <p>BatchAbolishApisRequest</p>
 */
public class BatchAbolishApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Api")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Api> api;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
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
    public java.util.List<Api> getApi() {
        return this.api;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<BatchAbolishApisRequest, Builder> {
        private java.util.List<Api> api; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchAbolishApisRequest request) {
            super(request);
            this.api = request.api;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The APIs that you want to operate.</p>
         * <p>This parameter is required.</p>
         */
        public Builder api(java.util.List<Api> api) {
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

    /**
     * 
     * {@link BatchAbolishApisRequest} extends {@link TeaModel}
     *
     * <p>BatchAbolishApisRequest</p>
     */
    public static class Api extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiUid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiUid;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private Api(Builder builder) {
            this.apiUid = builder.apiUid;
            this.groupId = builder.groupId;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
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

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String apiUid; 
            private String groupId; 
            private String stageId; 
            private String stageName; 

            /**
             * <p>The ID of the API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>994f72dcdaf04af0b38022c65fdbd1ac</p>
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ced5ab777f7b440398ea70e4470124de</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>979fd16250644d5b82173534f465ac77</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The name of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
}
