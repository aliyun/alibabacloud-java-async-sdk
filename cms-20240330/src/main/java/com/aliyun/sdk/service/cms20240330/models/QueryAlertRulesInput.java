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
         * <p>The filter criteria. Only alert rules that match these criteria are returned.</p>
         */
        public Builder filter(QueryAlertRulesFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>The pagination settings for the query. If omitted, the system returns the first page of results with the default page size.</p>
         */
        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * <p>The ID of the workspace that contains the alert rules.</p>
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
