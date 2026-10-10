// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link SearchContextRequest} extends {@link RequestModel}
 *
 * <p>SearchContextRequest</p>
 */
public class SearchContextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filter")
    private java.util.Map<String, ?> filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("formatted")
    private Boolean formatted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeInactive")
    private Boolean includeInactive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("retrievalOption")
    private String retrievalOption;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private Scope scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private SearchContextRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.filter = builder.filter;
        this.formatted = builder.formatted;
        this.includeInactive = builder.includeInactive;
        this.limit = builder.limit;
        this.query = builder.query;
        this.retrievalOption = builder.retrievalOption;
        this.scope = builder.scope;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchContextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return filter
     */
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    /**
     * @return formatted
     */
    public Boolean getFormatted() {
        return this.formatted;
    }

    /**
     * @return includeInactive
     */
    public Boolean getIncludeInactive() {
        return this.includeInactive;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return retrievalOption
     */
    public String getRetrievalOption() {
        return this.retrievalOption;
    }

    /**
     * @return scope
     */
    public Scope getScope() {
        return this.scope;
    }

    /**
     * @return threshold
     */
    public Double getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<SearchContextRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private java.util.Map<String, ?> filter; 
        private Boolean formatted; 
        private Boolean includeInactive; 
        private Integer limit; 
        private String query; 
        private String retrievalOption; 
        private Scope scope; 
        private Double threshold; 

        private Builder() {
            super();
        } 

        private Builder(SearchContextRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.filter = request.filter;
            this.formatted = request.formatted;
            this.includeInactive = request.includeInactive;
            this.limit = request.limit;
            this.query = request.query;
            this.retrievalOption = request.retrievalOption;
            this.scope = request.scope;
            this.threshold = request.threshold;
        } 

        /**
         * <p>The AgentSpace name. The name must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The context store name. The name must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The structured filter conditions. The key is the field name, and the value is the expected matching value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;alice&quot;}</p>
         */
        public Builder filter(java.util.Map<String, ?> filter) {
            this.putBodyParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>Specifies whether to apply structured formatting to the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder formatted(Boolean formatted) {
            this.putBodyParameter("formatted", formatted);
            this.formatted = formatted;
            return this;
        }

        /**
         * includeInactive.
         */
        public Builder includeInactive(Boolean includeInactive) {
            this.putBodyParameter("includeInactive", includeInactive);
            this.includeInactive = includeInactive;
            return this;
        }

        /**
         * <p>The maximum number of returned results (similarity Top-N).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The retrieval query text. Natural language is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>用户最近的偏好设置</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The retrieval options that control the retrieval strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic</p>
         */
        public Builder retrievalOption(String retrievalOption) {
            this.putBodyParameter("retrievalOption", retrievalOption);
            this.retrievalOption = retrievalOption;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(Scope scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The similarity threshold. Results with a similarity score lower than this value are filtered out. Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder threshold(Double threshold) {
            this.putBodyParameter("threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public SearchContextRequest build() {
            return new SearchContextRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchContextRequest} extends {@link TeaModel}
     *
     * <p>SearchContextRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Scope(Builder builder) {
            this.agentId = builder.agentId;
            this.appId = builder.appId;
            this.runId = builder.runId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String appId; 
            private String runId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Scope model) {
                this.agentId = model.agentId;
                this.appId = model.appId;
                this.runId = model.runId;
                this.userId = model.userId;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
}
