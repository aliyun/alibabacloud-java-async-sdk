// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListMarketsRequest} extends {@link RequestModel}
 *
 * <p>ListMarketsRequest</p>
 */
public class ListMarketsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    private ListMarketsRequest(Builder builder) {
        super(builder);
        this.companyId = builder.companyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMarketsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    public static final class Builder extends Request.Builder<ListMarketsRequest, Builder> {
        private Long companyId; 

        private Builder() {
            super();
        } 

        private Builder(ListMarketsRequest request) {
            super(request);
            this.companyId = request.companyId;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        @Override
        public ListMarketsRequest build() {
            return new ListMarketsRequest(this);
        } 

    } 

}
