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
 * {@link QueryAlertRulesProductCategoryFilter} extends {@link TeaModel}
 *
 * <p>QueryAlertRulesProductCategoryFilter</p>
 */
public class QueryAlertRulesProductCategoryFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eq")
    private String eq;

    private QueryAlertRulesProductCategoryFilter(Builder builder) {
        this.eq = builder.eq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAlertRulesProductCategoryFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eq
     */
    public String getEq() {
        return this.eq;
    }

    public static final class Builder {
        private String eq; 

        private Builder() {
        } 

        private Builder(QueryAlertRulesProductCategoryFilter model) {
            this.eq = model.eq;
        } 

        /**
         * eq.
         */
        public Builder eq(String eq) {
            this.eq = eq;
            return this;
        }

        public QueryAlertRulesProductCategoryFilter build() {
            return new QueryAlertRulesProductCategoryFilter(this);
        } 

    } 

}
