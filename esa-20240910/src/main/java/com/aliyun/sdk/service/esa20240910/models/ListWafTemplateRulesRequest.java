// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListWafTemplateRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWafTemplateRulesRequest</p>
 */
public class ListWafTemplateRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private QueryArgs queryArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListWafTemplateRulesRequest(Builder builder) {
        super(builder);
        this.phase = builder.phase;
        this.queryArgs = builder.queryArgs;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafTemplateRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return queryArgs
     */
    public QueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListWafTemplateRulesRequest, Builder> {
        private String phase; 
        private QueryArgs queryArgs; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListWafTemplateRulesRequest request) {
            super(request);
            this.phase = request.phase;
            this.queryArgs = request.queryArgs;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The WAF rule category, which is used to filter template rules of a specific category.</p>
         * 
         * <strong>example:</strong>
         * <p>http_anti_scan</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The query parameter, which is used to filter template rules based on criteria such as the rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>http_anti_scan</p>
         */
        public Builder queryArgs(QueryArgs queryArgs) {
            String queryArgsShrink = shrink(queryArgs, "QueryArgs", "json");
            this.putQueryParameter("QueryArgs", queryArgsShrink);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * <p>站点ID，可通过调用<a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a>接口获取。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListWafTemplateRulesRequest build() {
            return new ListWafTemplateRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListWafTemplateRulesRequest} extends {@link TeaModel}
     *
     * <p>ListWafTemplateRulesRequest</p>
     */
    public static class QueryArgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private QueryArgs(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
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

            /**
             * <p>The rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>http_directory_traversal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QueryArgs build() {
                return new QueryArgs(this);
            } 

        } 

    }
}
