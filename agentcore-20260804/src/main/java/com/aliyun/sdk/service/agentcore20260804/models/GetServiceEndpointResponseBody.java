// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceEndpointResponseBody</p>
 */
public class GetServiceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetServiceEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetServiceEndpointResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The service endpoint details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. An error description is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceEndpointResponseBody build() {
            return new GetServiceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
     */
    public static class AccessUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private AccessUrls(Builder builder) {
            this.accessType = builder.accessType;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessUrls create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String accessType; 
            private String status; 
            private String statusReason; 
            private String url; 

            private Builder() {
            } 

            private Builder(AccessUrls model) {
                this.accessType = model.accessType;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.url = model.url;
            } 

            /**
             * <p>The access URL type. Valid values: INTERNET, VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The access URL status. Valid values: CREATING, READY, DEGRADED.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the access URL status. A specific reason is returned when the status is degraded.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://endpoint.example.com">https://endpoint.example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AccessUrls build() {
                return new AccessUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
     */
    public static class Authentication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Authentication(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authentication create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(Authentication model) {
                this.type = model.type;
            } 

            /**
             * <p>The authentication method. Valid values:</p>
             * <ul>
             * <li>NONE: no authentication required.</li>
             * <li>API_KEY: authentication by passing an API key through the x-api-key request header.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>API_KEY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Authentication build() {
                return new Authentication(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("collaborationComponent")
        private String collaborationComponent;

        @com.aliyun.core.annotation.NameInMap("resourceBindingId")
        private String resourceBindingId;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        private Target(Builder builder) {
            this.agentId = builder.agentId;
            this.agentVersion = builder.agentVersion;
            this.collaborationComponent = builder.collaborationComponent;
            this.resourceBindingId = builder.resourceBindingId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return collaborationComponent
         */
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        /**
         * @return resourceBindingId
         */
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String agentId; 
            private String agentVersion; 
            private String collaborationComponent; 
            private String resourceBindingId; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.agentId = model.agentId;
                this.agentVersion = model.agentVersion;
                this.collaborationComponent = model.collaborationComponent;
                this.resourceBindingId = model.resourceBindingId;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The target agent ID. This parameter is returned when the target type is AGENT_VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-123456</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The target agent version number. This parameter is returned when the target type is AGENT_VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The collaboration component type. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
             * 
             * <strong>example:</strong>
             * <p>ELEMENT_WEB</p>
             */
            public Builder collaborationComponent(String collaborationComponent) {
                this.collaborationComponent = collaborationComponent;
                return this;
            }

            /**
             * <p>The workspace resource binding ID associated with the target collaboration component. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
             * 
             * <strong>example:</strong>
             * <p>wrb-123456</p>
             */
            public Builder resourceBindingId(String resourceBindingId) {
                this.resourceBindingId = resourceBindingId;
                return this;
            }

            /**
             * <p>The target type. Valid values: AGENT_VERSION, TEAM_COLLABORATION.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT_VERSION</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessUrls")
        private java.util.List<AccessUrls> accessUrls;

        @com.aliyun.core.annotation.NameInMap("authentication")
        private Authentication authentication;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("endpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
        private String serviceEndpointId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.accessUrls = builder.accessUrls;
            this.authentication = builder.authentication;
            this.createdAt = builder.createdAt;
            this.endpointType = builder.endpointType;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.serviceEndpointId = builder.serviceEndpointId;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.target = builder.target;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessUrls
         */
        public java.util.List<AccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        /**
         * @return authentication
         */
        public Authentication getAuthentication() {
            return this.authentication;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceEndpointId
         */
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List<AccessUrls> accessUrls; 
            private Authentication authentication; 
            private String createdAt; 
            private String endpointType; 
            private String name; 
            private String regionId; 
            private String serviceEndpointId; 
            private String status; 
            private String statusReason; 
            private Target target; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessUrls = model.accessUrls;
                this.authentication = model.authentication;
                this.createdAt = model.createdAt;
                this.endpointType = model.endpointType;
                this.name = model.name;
                this.regionId = model.regionId;
                this.serviceEndpointId = model.serviceEndpointId;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.target = model.target;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The access URL list of the service endpoint.</p>
             */
            public Builder accessUrls(java.util.List<AccessUrls> accessUrls) {
                this.accessUrls = accessUrls;
                return this;
            }

            /**
             * <p>The authentication configuration of the service endpoint.</p>
             */
            public Builder authentication(Authentication authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * <p>The creation time in UTC, formatted in RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The service endpoint type. Valid values:</p>
             * <ul>
             * <li>DEFAULT: a default endpoint created and maintained by the platform.</li>
             * <li>NAMED: a named endpoint explicitly created by the user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NAMED</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The service endpoint name. The name is unique within the workspace and is 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-endpoint</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID where the service endpoint resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The service endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>se-123456</p>
             */
            public Builder serviceEndpointId(String serviceEndpointId) {
                this.serviceEndpointId = serviceEndpointId;
                return this;
            }

            /**
             * <p>The service endpoint status. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, DELETING.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the service endpoint status. A specific reason is returned when the status is abnormal.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The target routing configuration of the service endpoint.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The last modification time in UTC, formatted in RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-123456</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
