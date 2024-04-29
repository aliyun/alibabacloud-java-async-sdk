// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileUploadLimitRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileUploadLimitRequest</p>
 */
public class UpdateFileUploadLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

    private UpdateFileUploadLimitRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileUploadLimitRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateFileUploadLimitRequest, Builder> {
        private Long limit; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileUploadLimitRequest request) {
            super(request);
            this.limit = request.limit;
        } 

        /**
         * The QPS limit on the files uploaded from the client. Valid values: 100 to 10000.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        @Override
        public UpdateFileUploadLimitRequest build() {
            return new UpdateFileUploadLimitRequest(this);
        } 

    } 

}
