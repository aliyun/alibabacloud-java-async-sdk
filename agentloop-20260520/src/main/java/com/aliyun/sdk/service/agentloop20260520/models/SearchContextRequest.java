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
    @com.aliyun.core.annotation.NameInMap("threshold")
    private Double threshold;

    private SearchContextRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.filter = builder.filter;
        this.formatted = builder.formatted;
        this.limit = builder.limit;
        this.query = builder.query;
        this.retrievalOption = builder.retrievalOption;
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
        private Integer limit; 
        private String query; 
        private String retrievalOption; 
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
            this.limit = request.limit;
            this.query = request.query;
            this.retrievalOption = request.retrievalOption;
            this.threshold = request.threshold;
        } 

        /**
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
         * filter.
         */
        public Builder filter(java.util.Map<String, ?> filter) {
            this.putBodyParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * formatted.
         */
        public Builder formatted(Boolean formatted) {
            this.putBodyParameter("formatted", formatted);
            this.formatted = formatted;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
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
         * retrievalOption.
         */
        public Builder retrievalOption(String retrievalOption) {
            this.putBodyParameter("retrievalOption", retrievalOption);
            this.retrievalOption = retrievalOption;
            return this;
        }

        /**
         * threshold.
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

}
