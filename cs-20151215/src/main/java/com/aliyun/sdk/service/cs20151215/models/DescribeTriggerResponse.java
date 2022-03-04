// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTriggerResponse} extends {@link TeaModel}
 *
 * <p>DescribeTriggerResponse</p>
 */
public class DescribeTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeTriggerResponseBody> body;

    private DescribeTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTriggerResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public java.util.List < DescribeTriggerResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeTriggerResponseBody> body);

        @Override
        DescribeTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeTriggerResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTriggerResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < DescribeTriggerResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTriggerResponse build() {
            return new DescribeTriggerResponse(this);
        } 

    } 

    public static class DescribeTriggerResponseBody extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("project_id")
        private String projectId;

        @NameInMap("type")
        private String type;

        @NameInMap("action")
        private String action;

        @NameInMap("token")
        private String token;

        private DescribeTriggerResponseBody(Builder builder) {
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

        public static DescribeTriggerResponseBody create() {
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

            /**
             * 触发器ID。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 触发器名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 集群ID。
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 触发器项目名称。
             * <p>
             * 
             * 由应用所在命名空间及应用名称组成，格式为`${namespace}/${name}`，取值示例：default/test-app。
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * 触发器类型。
             * <p>
             * 
             * 取值：
             * 
             * - `deployment`：针对无状态应用的触发器。 
             * 
             * - `application`：针对应用中心应用的触发器。
             * 
             * 默认值：`deployment`。
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 触发器行为，取值：
             * <p>
             * 
             * `redeploy`: 重新部署project_id中定义的资源。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Token信息。
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public DescribeTriggerResponseBody build() {
                return new DescribeTriggerResponseBody(this);
            } 

        } 

    }
}
