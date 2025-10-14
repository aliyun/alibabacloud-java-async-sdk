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
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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
        this.instanceId = builder.instanceId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String instanceId; 
        private String phase; 
        private QueryArgs queryArgs; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListWafTemplateRulesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.phase = request.phase;
            this.queryArgs = request.queryArgs;
            this.siteId = request.siteId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>WAF operation phase, used to filter template rules for a specific phase.</p>
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
         * <p>Query parameters, used to filter template rules based on conditions such as rule type.</p>
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
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
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
        @com.aliyun.core.annotation.NameInMap("Kinds")
        private java.util.List<String> kinds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private QueryArgs(Builder builder) {
            this.kinds = builder.kinds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryArgs create() {
            return builder().build();
        }

        /**
         * @return kinds
         */
        public java.util.List<String> getKinds() {
            return this.kinds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> kinds; 
            private String type; 

            private Builder() {
            } 

            private Builder(QueryArgs model) {
                this.kinds = model.kinds;
                this.type = model.type;
            } 

            /**
             * Kinds.
             */
            public Builder kinds(java.util.List<String> kinds) {
                this.kinds = kinds;
                return this;
            }

            /**
             * <p>Rule type.</p>
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
