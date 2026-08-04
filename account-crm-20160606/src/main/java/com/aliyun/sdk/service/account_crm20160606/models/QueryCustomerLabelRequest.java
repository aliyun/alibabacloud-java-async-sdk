// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryCustomerLabelRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomerLabelRequest</p>
 */
public class QueryCustomerLabelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelSeries")
    private String labelSeries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private QueryCustomerLabelRequest(Builder builder) {
        super(builder);
        this.labelSeries = builder.labelSeries;
        this.pk = builder.pk;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomerLabelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelSeries
     */
    public String getLabelSeries() {
        return this.labelSeries;
    }

    /**
     * @return pk
     */
    public Long getPk() {
        return this.pk;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<QueryCustomerLabelRequest, Builder> {
        private String labelSeries; 
        private Long pk; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomerLabelRequest request) {
            super(request);
            this.labelSeries = request.labelSeries;
            this.pk = request.pk;
            this.token = request.token;
        } 

        /**
         * LabelSeries.
         */
        public Builder labelSeries(String labelSeries) {
            this.putQueryParameter("LabelSeries", labelSeries);
            this.labelSeries = labelSeries;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(Long pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public QueryCustomerLabelRequest build() {
            return new QueryCustomerLabelRequest(this);
        } 

    } 

}
