// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ValidateResourceRequest} extends {@link RequestModel}
 *
 * <p>ValidateResourceRequest</p>
 */
public class ValidateResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserAccessParam")
    private UserAccessParam userAccessParam;

    private ValidateResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.userAccessParam = builder.userAccessParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return userAccessParam
     */
    public UserAccessParam getUserAccessParam() {
        return this.userAccessParam;
    }

    public static final class Builder extends Request.Builder<ValidateResourceRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private UserAccessParam userAccessParam; 

        private Builder() {
            super();
        } 

        private Builder(ValidateResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.userAccessParam = request.userAccessParam;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-sh-ouypm5aucy</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>User Authorization Parameters</p>
         */
        public Builder userAccessParam(UserAccessParam userAccessParam) {
            String userAccessParamShrink = shrink(userAccessParam, "UserAccessParam", "json");
            this.putBodyParameter("UserAccessParam", userAccessParamShrink);
            this.userAccessParam = userAccessParam;
            return this;
        }

        @Override
        public ValidateResourceRequest build() {
            return new ValidateResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ValidateResourceRequest} extends {@link TeaModel}
     *
     * <p>ValidateResourceRequest</p>
     */
    public static class UserAccessParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private UserAccessParam(Builder builder) {
            this.accessId = builder.accessId;
            this.accessKey = builder.accessKey;
            this.endpoint = builder.endpoint;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAccessParam create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accessId; 
            private String accessKey; 
            private String endpoint; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(UserAccessParam model) {
                this.accessId = model.accessId;
                this.accessKey = model.accessKey;
                this.endpoint = model.endpoint;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>User Key</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>Endpoint</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>Workspace ID</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public UserAccessParam build() {
                return new UserAccessParam(this);
            } 

        } 

    }
}
