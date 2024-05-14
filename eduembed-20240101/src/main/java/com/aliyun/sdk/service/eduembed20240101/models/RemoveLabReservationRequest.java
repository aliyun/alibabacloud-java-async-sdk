// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveLabReservationRequest} extends {@link RequestModel}
 *
 * <p>RemoveLabReservationRequest</p>
 */
public class RemoveLabReservationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabReservationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labReservationId;

    private RemoveLabReservationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.labReservationId = builder.labReservationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveLabReservationRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveLabReservationRequest, Builder> {
        private Long accountId; 
        private String labReservationId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveLabReservationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.labReservationId = request.labReservationId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * LabReservationId.
         */
        public Builder labReservationId(String labReservationId) {
            this.putBodyParameter("LabReservationId", labReservationId);
            this.labReservationId = labReservationId;
            return this;
        }

        @Override
        public RemoveLabReservationRequest build() {
            return new RemoveLabReservationRequest(this);
        } 

    } 

}
