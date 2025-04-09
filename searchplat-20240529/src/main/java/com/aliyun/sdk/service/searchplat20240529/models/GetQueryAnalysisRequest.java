// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetQueryAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetQueryAnalysisRequest</p>
 */
public class GetQueryAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("functions")
    private java.util.List<Functions> functions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("history")
    private java.util.List<History> history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private GetQueryAnalysisRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.functions = builder.functions;
        this.history = builder.history;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return functions
     */
    public java.util.List<Functions> getFunctions() {
        return this.functions;
    }

    /**
     * @return history
     */
    public java.util.List<History> getHistory() {
        return this.history;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<GetQueryAnalysisRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private java.util.List<Functions> functions; 
        private java.util.List<History> history; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryAnalysisRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.functions = request.functions;
            this.history = request.history;
            this.query = request.query;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * functions.
         */
        public Builder functions(java.util.List<Functions> functions) {
            this.putBodyParameter("functions", functions);
            this.functions = functions;
            return this;
        }

        /**
         * history.
         */
        public Builder history(java.util.List<History> history) {
            this.putBodyParameter("history", history);
            this.history = history;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public GetQueryAnalysisRequest build() {
            return new GetQueryAnalysisRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetQueryAnalysisRequest} extends {@link TeaModel}
     *
     * <p>GetQueryAnalysisRequest</p>
     */
    public static class Functions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        private Functions(Builder builder) {
            this.name = builder.name;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map<String, ?> parameters; 

            private Builder() {
            } 

            private Builder(Functions model) {
                this.name = model.name;
                this.parameters = model.parameters;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueryAnalysisRequest} extends {@link TeaModel}
     *
     * <p>GetQueryAnalysisRequest</p>
     */
    public static class History extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private History(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(History model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
}
