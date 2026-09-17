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
 * {@link QueryAlertRulesResourcesFilter} extends {@link TeaModel}
 *
 * <p>QueryAlertRulesResourcesFilter</p>
 */
public class QueryAlertRulesResourcesFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contains")
    private java.util.List<String> contains;

    @com.aliyun.core.annotation.NameInMap("notContains")
    private java.util.List<String> notContains;

    private QueryAlertRulesResourcesFilter(Builder builder) {
        this.contains = builder.contains;
        this.notContains = builder.notContains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAlertRulesResourcesFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contains
     */
    public java.util.List<String> getContains() {
        return this.contains;
    }

    /**
     * @return notContains
     */
    public java.util.List<String> getNotContains() {
        return this.notContains;
    }

    public static final class Builder {
        private java.util.List<String> contains; 
        private java.util.List<String> notContains; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesResourcesFilter model) {
            this.contains = model.contains;
            this.notContains = model.notContains;
        } 

        /**
         * <p>Matches any item in the list (OR semantics).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-bp1a2b3c4d5e6f7g8h9i&quot;,&quot;i-bp9h8g7f6e5d4c3b2a1&quot;]</p>
         */
        public Builder contains(java.util.List<String> contains) {
            this.contains = contains;
            return this;
        }

        /**
         * <p>Filters out alert rules by resource instance ID blacklist. Alert rules whose associated resources contains any instance ID in the array are excluded.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-bp0z9y8x7w6v5u4t3s2&quot;]</p>
         */
        public Builder notContains(java.util.List<String> notContains) {
            this.notContains = notContains;
            return this;
        }

        public QueryAlertRulesResourcesFilter build() {
            return new QueryAlertRulesResourcesFilter(this);
        } 

    } 

}
