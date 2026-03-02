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
 * {@link GetHistoryDeveloperRequest} extends {@link RequestModel}
 *
 * <p>GetHistoryDeveloperRequest</p>
 */
public class GetHistoryDeveloperRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    private GetHistoryDeveloperRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.enterpriseId = builder.enterpriseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoryDeveloperRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public static final class Builder extends Request.Builder<GetHistoryDeveloperRequest, Builder> {
        private String accountId; 
        private Long enterpriseId; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoryDeveloperRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.enterpriseId = request.enterpriseId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        @Override
        public GetHistoryDeveloperRequest build() {
            return new GetHistoryDeveloperRequest(this);
        } 

    } 

}
