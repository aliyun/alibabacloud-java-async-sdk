// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link QueryAlertRulesInput} extends {@link TeaModel}
 *
 * <p>QueryAlertRulesInput</p>
 */
public class QueryAlertRulesInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filter")
    private QueryAlertRulesFilter filter;

    @com.aliyun.core.annotation.NameInMap("pagination")
    private Pagination pagination;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private QueryAlertRulesInput(Builder builder) {
        this.filter = builder.filter;
        this.pagination = builder.pagination;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAlertRulesInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public QueryAlertRulesFilter getFilter() {
        return this.filter;
    }

    /**
     * @return pagination
     */
    public Pagination getPagination() {
        return this.pagination;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private QueryAlertRulesFilter filter; 
        private Pagination pagination; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesInput model) {
            this.filter = model.filter;
            this.pagination = model.pagination;
            this.workspace = model.workspace;
        } 

        /**
         * <p>The comprehensive filter conditions for querying alert rules. Supports combined filtering by multiple dimensions such as name, status, severity level, tags, and notification channels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:{&quot;eq&quot;:&quot;Alarm&quot;},&quot;severityLevels&quot;:{&quot;contains&quot;:[&quot;CRITICAL&quot;,&quot;ERROR&quot;]}}</p>
         */
        public Builder filter(QueryAlertRulesFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>The pagination mode parameter. keyset indicates keyset-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:20}</p>
         */
        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * <p>The observable workspace name. If this parameter is not specified, all alert rules are returned based on the caller identity (callerUserId + callerRegionId). If this parameter is specified, only the rules under the specified workspace are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public QueryAlertRulesInput build() {
            return new QueryAlertRulesInput(this);
        } 

    } 

}
