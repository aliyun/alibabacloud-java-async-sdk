// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefuseSupplementRequest} extends {@link RequestModel}
 *
 * <p>RefuseSupplementRequest</p>
 */
public class RefuseSupplementRequest extends Request {
    @Query
    @NameInMap("SupplementId")
    @Validation(required = true)
    private Long supplementId;

    private RefuseSupplementRequest(Builder builder) {
        super(builder);
        this.supplementId = builder.supplementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefuseSupplementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return supplementId
     */
    public Long getSupplementId() {
        return this.supplementId;
    }

    public static final class Builder extends Request.Builder<RefuseSupplementRequest, Builder> {
        private Long supplementId; 

        private Builder() {
            super();
        } 

        private Builder(RefuseSupplementRequest request) {
            super(request);
            this.supplementId = request.supplementId;
        } 

        /**
         * SupplementId.
         */
        public Builder supplementId(Long supplementId) {
            this.putQueryParameter("SupplementId", supplementId);
            this.supplementId = supplementId;
            return this;
        }

        @Override
        public RefuseSupplementRequest build() {
            return new RefuseSupplementRequest(this);
        } 

    } 

}
