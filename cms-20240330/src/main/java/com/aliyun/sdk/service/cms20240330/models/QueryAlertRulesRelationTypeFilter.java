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
 * {@link QueryAlertRulesRelationTypeFilter} extends {@link TeaModel}
 *
 * <p>QueryAlertRulesRelationTypeFilter</p>
 */
public class QueryAlertRulesRelationTypeFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("in")
    private java.util.List<String> in;

    @com.aliyun.core.annotation.NameInMap("notIn")
    private java.util.List<String> notIn;

    private QueryAlertRulesRelationTypeFilter(Builder builder) {
        this.in = builder.in;
        this.notIn = builder.notIn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAlertRulesRelationTypeFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return in
     */
    public java.util.List<String> getIn() {
        return this.in;
    }

    /**
     * @return notIn
     */
    public java.util.List<String> getNotIn() {
        return this.notIn;
    }

    public static final class Builder {
        private java.util.List<String> in; 
        private java.util.List<String> notIn; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesRelationTypeFilter model) {
            this.in = model.in;
            this.notIn = model.notIn;
        } 

        /**
         * in.
         */
        public Builder in(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        /**
         * notIn.
         */
        public Builder notIn(java.util.List<String> notIn) {
            this.notIn = notIn;
            return this;
        }

        public QueryAlertRulesRelationTypeFilter build() {
            return new QueryAlertRulesRelationTypeFilter(this);
        } 

    } 

}
