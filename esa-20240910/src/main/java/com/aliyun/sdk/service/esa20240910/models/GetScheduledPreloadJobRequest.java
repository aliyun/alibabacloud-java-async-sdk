// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetScheduledPreloadJobRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledPreloadJobRequest</p>
 */
public class GetScheduledPreloadJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private GetScheduledPreloadJobRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledPreloadJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetScheduledPreloadJobRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledPreloadJobRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the scheduled prefetch task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GetScheduledPreloadJob</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetScheduledPreloadJobRequest build() {
            return new GetScheduledPreloadJobRequest(this);
        } 

    } 

}
