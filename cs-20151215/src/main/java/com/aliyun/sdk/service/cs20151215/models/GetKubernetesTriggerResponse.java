// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetKubernetesTriggerResponse} extends {@link TeaModel}
 *
 * <p>GetKubernetesTriggerResponse</p>
 */
public class GetKubernetesTriggerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<GetKubernetesTriggerResponseBody> body;

    private GetKubernetesTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetKubernetesTriggerResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<GetKubernetesTriggerResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetKubernetesTriggerResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<GetKubernetesTriggerResponseBody> body);

        @Override
        GetKubernetesTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetKubernetesTriggerResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<GetKubernetesTriggerResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetKubernetesTriggerResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<GetKubernetesTriggerResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetKubernetesTriggerResponse build() {
            return new GetKubernetesTriggerResponse(this);
        } 

    } 

    /**
     * 
     * {@link GetKubernetesTriggerResponse} extends {@link TeaModel}
     *
     * <p>GetKubernetesTriggerResponse</p>
     */
    public static class GetKubernetesTriggerResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private GetKubernetesTriggerResponseBody(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.clusterId = builder.clusterId;
            this.projectId = builder.projectId;
            this.type = builder.type;
            this.action = builder.action;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetKubernetesTriggerResponseBody create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String clusterId; 
            private String projectId; 
            private String type; 
            private String action; 
            private String token; 

            private Builder() {
            } 

            private Builder(GetKubernetesTriggerResponseBody model) {
                this.id = model.id;
                this.name = model.name;
                this.clusterId = model.clusterId;
                this.projectId = model.projectId;
                this.type = model.type;
                this.action = model.action;
                this.token = model.token;
            } 

            /**
             * <p>The ID of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the associated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c259f563386444ebb8d7**</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * <p>The name consists of the namespace where the application is deployed and the name of the application. The format is <code>${namespace}/${name}</code>. Example: default/test-app.</p>
             * 
             * <strong>example:</strong>
             * <p>default/test-app</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of trigger.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><code>deployment</code>: performs actions on Deployments.</li>
             * <li><code>application</code>: performs actions on applications that are deployed in Application Center.</li>
             * </ul>
             * <p>Default value: <code>deployment</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>deployment</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The action that the trigger performs. The value is set to redeploy.</p>
             * <p><code>redeploy</code>: redeploys the resource specified by project_id.</p>
             * 
             * <strong>example:</strong>
             * <p>redeploy</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>Token</p>
             * 
             * <strong>example:</strong>
             * <p>eyJhbGci***</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public GetKubernetesTriggerResponseBody build() {
                return new GetKubernetesTriggerResponseBody(this);
            } 

        } 

    }
}
