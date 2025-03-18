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
 * {@link BatchDeployApisRequest} extends {@link RequestModel}
 *
 * <p>BatchDeployApisRequest</p>
 */
public class BatchDeployApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Api")
    private java.util.List<Api> api;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Api> getApi() {
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
        private java.util.List<Api> api; 
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
         * <p>The APIs that you want to publish.</p>
         */
        public Builder api(java.util.List<Api> api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The name of the runtime environment. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong></li>
         * <li><strong>TEST</strong></li>
         * <li>PRE: the pre-release environment</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
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

    /**
     * 
     * {@link BatchDeployApisRequest} extends {@link TeaModel}
     *
     * <p>BatchDeployApisRequest</p>
     */
    public static class Api extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiUid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiUid;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Api model) {
                this.apiUid = model.apiUid;
                this.groupId = model.groupId;
            } 

            /**
             * <p>The API ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2b35dd68345b472f8051647306a16415</p>
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * <p>The API group ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>b4f5c342b8bc4ef88ccda0332402e0fa</p>
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
