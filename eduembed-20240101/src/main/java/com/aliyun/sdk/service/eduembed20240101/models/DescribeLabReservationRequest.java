// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link DescribeLabReservationRequest} extends {@link RequestModel}
 *
 * <p>DescribeLabReservationRequest</p>
 */
public class DescribeLabReservationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabReservationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labReservationId;

    private DescribeLabReservationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.labReservationId = builder.labReservationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLabReservationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return labReservationId
     */
    public String getLabReservationId() {
        return this.labReservationId;
    }

    public static final class Builder extends Request.Builder<DescribeLabReservationRequest, Builder> {
        private Long accountId; 
        private String labReservationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLabReservationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.labReservationId = request.labReservationId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder labReservationId(String labReservationId) {
            this.putQueryParameter("LabReservationId", labReservationId);
            this.labReservationId = labReservationId;
            return this;
        }

        @Override
        public DescribeLabReservationRequest build() {
            return new DescribeLabReservationRequest(this);
        } 

    } 

}
