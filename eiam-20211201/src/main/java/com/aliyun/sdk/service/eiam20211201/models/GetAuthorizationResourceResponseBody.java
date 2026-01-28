// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetAuthorizationResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationResourceResponseBody</p>
 */
public class GetAuthorizationResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationResource")
    private AuthorizationResource authorizationResource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuthorizationResourceResponseBody(Builder builder) {
        this.authorizationResource = builder.authorizationResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationResource
     */
    public AuthorizationResource getAuthorizationResource() {
        return this.authorizationResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuthorizationResource authorizationResource; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAuthorizationResourceResponseBody model) {
            this.authorizationResource = model.authorizationResource;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizationResource.
         */
        public Builder authorizationResource(AuthorizationResource authorizationResource) {
            this.authorizationResource = authorizationResource;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuthorizationResourceResponseBody build() {
            return new GetAuthorizationResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthorizationResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorizationResourceResponseBody</p>
     */
    public static class AuthorizationResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceEntityId")
        private String authorizationResourceEntityId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceEntityType")
        private String authorizationResourceEntityType;

        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceId")
        private String authorizationResourceId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private AuthorizationResource(Builder builder) {
            this.authorizationResourceEntityId = builder.authorizationResourceEntityId;
            this.authorizationResourceEntityType = builder.authorizationResourceEntityType;
            this.authorizationResourceId = builder.authorizationResourceId;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.cloudAccountId = builder.cloudAccountId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationResource create() {
            return builder().build();
        }

        /**
         * @return authorizationResourceEntityId
         */
        public String getAuthorizationResourceEntityId() {
            return this.authorizationResourceEntityId;
        }

        /**
         * @return authorizationResourceEntityType
         */
        public String getAuthorizationResourceEntityType() {
            return this.authorizationResourceEntityType;
        }

        /**
         * @return authorizationResourceId
         */
        public String getAuthorizationResourceId() {
            return this.authorizationResourceId;
        }

        /**
         * @return authorizationRuleId
         */
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String authorizationResourceEntityId; 
            private String authorizationResourceEntityType; 
            private String authorizationResourceId; 
            private String authorizationRuleId; 
            private String cloudAccountId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(AuthorizationResource model) {
                this.authorizationResourceEntityId = model.authorizationResourceEntityId;
                this.authorizationResourceEntityType = model.authorizationResourceEntityType;
                this.authorizationResourceId = model.authorizationResourceId;
                this.authorizationRuleId = model.authorizationRuleId;
                this.cloudAccountId = model.cloudAccountId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>资源实体标识</p>
             * 
             * <strong>example:</strong>
             * <p>carole_01kmek49aqxxxx</p>
             */
            public Builder authorizationResourceEntityId(String authorizationResourceEntityId) {
                this.authorizationResourceEntityId = authorizationResourceEntityId;
                return this;
            }

            /**
             * <p>资源实体类型，枚举类型：asset（资产）、credential（凭据）、cloud_identity_role（云账号角色）</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_account_role</p>
             */
            public Builder authorizationResourceEntityType(String authorizationResourceEntityType) {
                this.authorizationResourceEntityType = authorizationResourceEntityType;
                return this;
            }

            /**
             * <p>授权资源标识</p>
             * 
             * <strong>example:</strong>
             * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
             */
            public Builder authorizationResourceId(String authorizationResourceId) {
                this.authorizationResourceId = authorizationResourceId;
                return this;
            }

            /**
             * <p>授权规则标识</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>云账号ID。</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public AuthorizationResource build() {
                return new AuthorizationResource(this);
            } 

        } 

    }
}
