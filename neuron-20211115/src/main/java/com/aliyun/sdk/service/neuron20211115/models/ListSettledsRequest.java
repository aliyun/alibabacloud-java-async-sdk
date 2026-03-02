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
 * {@link ListSettledsRequest} extends {@link RequestModel}
 *
 * <p>ListSettledsRequest</p>
 */
public class ListSettledsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseName")
    private String enterpriseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListSettledsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.applicant = builder.applicant;
        this.enterpriseName = builder.enterpriseName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSettledsRequest create() {
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
     * @return applicant
     */
    public String getApplicant() {
        return this.applicant;
    }

    /**
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListSettledsRequest, Builder> {
        private String accountId; 
        private String applicant; 
        private String enterpriseName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListSettledsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.applicant = request.applicant;
            this.enterpriseName = request.enterpriseName;
            this.status = request.status;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.putQueryParameter("applicant", applicant);
            this.applicant = applicant;
            return this;
        }

        /**
         * enterpriseName.
         */
        public Builder enterpriseName(String enterpriseName) {
            this.putQueryParameter("enterpriseName", enterpriseName);
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListSettledsRequest build() {
            return new ListSettledsRequest(this);
        } 

    } 

}
