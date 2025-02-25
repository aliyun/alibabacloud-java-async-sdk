// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuditRangeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuditRangeRequest</p>
 */
public class UpdateAuditRangeRequest extends Request {
    @Query
    @NameInMap("AuditRange")
    private String auditRange;

    private UpdateAuditRangeRequest(Builder builder) {
        super(builder);
        this.auditRange = builder.auditRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuditRangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditRange
     */
    public String getAuditRange() {
        return this.auditRange;
    }

    public static final class Builder extends Request.Builder<UpdateAuditRangeRequest, Builder> {
        private String auditRange; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuditRangeRequest request) {
            super(request);
            this.auditRange = request.auditRange;
        } 

        /**
         * AuditRange.
         */
        public Builder auditRange(String auditRange) {
            this.putQueryParameter("AuditRange", auditRange);
            this.auditRange = auditRange;
            return this;
        }

        @Override
        public UpdateAuditRangeRequest build() {
            return new UpdateAuditRangeRequest(this);
        } 

    } 

}
