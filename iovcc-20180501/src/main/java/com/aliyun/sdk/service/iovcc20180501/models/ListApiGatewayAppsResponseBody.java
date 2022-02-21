// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApiGatewayAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiGatewayAppsResponseBody</p>
 */
public class ListApiGatewayAppsResponseBody extends TeaModel {
    @NameInMap("ApiGatewayApps")
    private java.util.List < ApiGatewayApps> apiGatewayApps;

    @NameInMap("RequestId")
    private String requestId;

    private ListApiGatewayAppsResponseBody(Builder builder) {
        this.apiGatewayApps = builder.apiGatewayApps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiGatewayAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiGatewayApps
     */
    public java.util.List < ApiGatewayApps> getApiGatewayApps() {
        return this.apiGatewayApps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ApiGatewayApps> apiGatewayApps; 
        private String requestId; 

        /**
         * ApiGatewayApps.
         */
        public Builder apiGatewayApps(java.util.List < ApiGatewayApps> apiGatewayApps) {
            this.apiGatewayApps = apiGatewayApps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApiGatewayAppsResponseBody build() {
            return new ListApiGatewayAppsResponseBody(this);
        } 

    } 

    public static class ApiGatewayApps extends TeaModel {
        @NameInMap("GatewayAppId")
        private String gatewayAppId;

        @NameInMap("GatewayAppKey")
        private String gatewayAppKey;

        @NameInMap("GatewayAppSecret")
        private String gatewayAppSecret;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UserId")
        private String userId;

        private ApiGatewayApps(Builder builder) {
            this.gatewayAppId = builder.gatewayAppId;
            this.gatewayAppKey = builder.gatewayAppKey;
            this.gatewayAppSecret = builder.gatewayAppSecret;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiGatewayApps create() {
            return builder().build();
        }

        /**
         * @return gatewayAppId
         */
        public String getGatewayAppId() {
            return this.gatewayAppId;
        }

        /**
         * @return gatewayAppKey
         */
        public String getGatewayAppKey() {
            return this.gatewayAppKey;
        }

        /**
         * @return gatewayAppSecret
         */
        public String getGatewayAppSecret() {
            return this.gatewayAppSecret;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String gatewayAppId; 
            private String gatewayAppKey; 
            private String gatewayAppSecret; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String projectId; 
            private Integer status; 
            private String userId; 

            /**
             * GatewayAppId.
             */
            public Builder gatewayAppId(String gatewayAppId) {
                this.gatewayAppId = gatewayAppId;
                return this;
            }

            /**
             * GatewayAppKey.
             */
            public Builder gatewayAppKey(String gatewayAppKey) {
                this.gatewayAppKey = gatewayAppKey;
                return this;
            }

            /**
             * GatewayAppSecret.
             */
            public Builder gatewayAppSecret(String gatewayAppSecret) {
                this.gatewayAppSecret = gatewayAppSecret;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ApiGatewayApps build() {
                return new ApiGatewayApps(this);
            } 

        } 

    }
}
