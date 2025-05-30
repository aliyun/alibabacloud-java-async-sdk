// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link QueryPeriodBudgetBillRequest} extends {@link RequestModel}
 *
 * <p>QueryPeriodBudgetBillRequest</p>
 */
public class QueryPeriodBudgetBillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectIds")
    private String objectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("period")
    private String period;

    private QueryPeriodBudgetBillRequest(Builder builder) {
        super(builder);
        this.objectIds = builder.objectIds;
        this.objectType = builder.objectType;
        this.period = builder.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPeriodBudgetBillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectIds
     */
    public String getObjectIds() {
        return this.objectIds;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<QueryPeriodBudgetBillRequest, Builder> {
        private String objectIds; 
        private String objectType; 
        private String period; 

        private Builder() {
            super();
        } 

        private Builder(QueryPeriodBudgetBillRequest request) {
            super(request);
            this.objectIds = request.objectIds;
            this.objectType = request.objectType;
            this.period = request.period;
        } 

        /**
         * objectIds.
         */
        public Builder objectIds(String objectIds) {
            this.putQueryParameter("objectIds", objectIds);
            this.objectIds = objectIds;
            return this;
        }

        /**
         * objectType.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("objectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * period.
         */
        public Builder period(String period) {
            this.putQueryParameter("period", period);
            this.period = period;
            return this;
        }

        @Override
        public QueryPeriodBudgetBillRequest build() {
            return new QueryPeriodBudgetBillRequest(this);
        } 

    } 

}
