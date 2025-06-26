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
 * {@link GetWebSearchRequest} extends {@link RequestModel}
 *
 * <p>GetWebSearchRequest</p>
 */
public class GetWebSearchRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content_type")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("history")
    private java.util.List<History> history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query_rewrite")
    private Boolean queryRewrite;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("top_k")
    private Long topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("way")
    private String way;

    private GetWebSearchRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.contentType = builder.contentType;
        this.history = builder.history;
        this.query = builder.query;
        this.queryRewrite = builder.queryRewrite;
        this.topK = builder.topK;
        this.way = builder.way;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebSearchRequest create() {
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
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
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

    /**
     * @return queryRewrite
     */
    public Boolean getQueryRewrite() {
        return this.queryRewrite;
    }

    /**
     * @return topK
     */
    public Long getTopK() {
        return this.topK;
    }

    /**
     * @return way
     */
    public String getWay() {
        return this.way;
    }

    public static final class Builder extends Request.Builder<GetWebSearchRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private String contentType; 
        private java.util.List<History> history; 
        private String query; 
        private Boolean queryRewrite; 
        private Long topK; 
        private String way; 

        private Builder() {
            super();
        } 

        private Builder(GetWebSearchRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.contentType = request.contentType;
            this.history = request.history;
            this.query = request.query;
            this.queryRewrite = request.queryRewrite;
            this.topK = request.topK;
            this.way = request.way;
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
         * content_type.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("content_type", contentType);
            this.contentType = contentType;
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

        /**
         * query_rewrite.
         */
        public Builder queryRewrite(Boolean queryRewrite) {
            this.putBodyParameter("query_rewrite", queryRewrite);
            this.queryRewrite = queryRewrite;
            return this;
        }

        /**
         * top_k.
         */
        public Builder topK(Long topK) {
            this.putBodyParameter("top_k", topK);
            this.topK = topK;
            return this;
        }

        /**
         * way.
         */
        public Builder way(String way) {
            this.putBodyParameter("way", way);
            this.way = way;
            return this;
        }

        @Override
        public GetWebSearchRequest build() {
            return new GetWebSearchRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetWebSearchRequest} extends {@link TeaModel}
     *
     * <p>GetWebSearchRequest</p>
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
