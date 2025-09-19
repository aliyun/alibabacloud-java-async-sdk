// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateFileUploadLimitRequest} extends {@link RequestModel}
 *
 * <p>CreateFileUploadLimitRequest</p>
 */
public class CreateFileUploadLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The QPS limit on the files uploaded from the client. Valid values: 100 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
