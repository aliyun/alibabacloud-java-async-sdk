// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperationCancelIgnoreSuspEventRequest} extends {@link RequestModel}
 *
 * <p>OperationCancelIgnoreSuspEventRequest</p>
 */
public class OperationCancelIgnoreSuspEventRequest extends Request {
    @Query
    @NameInMap("SecurityEventIds")
    @Validation(required = true)
    private java.util.List < Long > securityEventIds;

    private OperationCancelIgnoreSuspEventRequest(Builder builder) {
        super(builder);
        this.securityEventIds = builder.securityEventIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationCancelIgnoreSuspEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityEventIds
     */
    public java.util.List < Long > getSecurityEventIds() {
        return this.securityEventIds;
    }

    public static final class Builder extends Request.Builder<OperationCancelIgnoreSuspEventRequest, Builder> {
        private java.util.List < Long > securityEventIds; 

        private Builder() {
            super();
        } 

        private Builder(OperationCancelIgnoreSuspEventRequest request) {
            super(request);
            this.securityEventIds = request.securityEventIds;
        } 

        /**
         * OperationCancelIgnoreSuspEvent
         */
        public Builder securityEventIds(java.util.List < Long > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        @Override
        public OperationCancelIgnoreSuspEventRequest build() {
            return new OperationCancelIgnoreSuspEventRequest(this);
        } 

    } 

}
