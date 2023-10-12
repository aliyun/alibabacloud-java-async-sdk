// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileUploadLimitRequest} extends {@link RequestModel}
 *
 * <p>CreateFileUploadLimitRequest</p>
 */
public class CreateFileUploadLimitRequest extends Request {
    @Query
    @NameInMap("Limit")
    @Validation(required = true)
    private Long limit;

    private CreateFileUploadLimitRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileUploadLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    public static final class Builder extends Request.Builder<CreateFileUploadLimitRequest, Builder> {
        private Long limit; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileUploadLimitRequest request) {
            super(request);
            this.limit = request.limit;
        } 

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        @Override
        public CreateFileUploadLimitRequest build() {
            return new CreateFileUploadLimitRequest(this);
        } 

    } 

}
