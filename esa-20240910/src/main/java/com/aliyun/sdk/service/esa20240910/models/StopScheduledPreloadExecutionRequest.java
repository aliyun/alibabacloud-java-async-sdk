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
 * {@link StopScheduledPreloadExecutionRequest} extends {@link RequestModel}
 *
 * <p>StopScheduledPreloadExecutionRequest</p>
 */
public class StopScheduledPreloadExecutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private StopScheduledPreloadExecutionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopScheduledPreloadExecutionRequest create() {
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

    public static final class Builder extends Request.Builder<StopScheduledPreloadExecutionRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(StopScheduledPreloadExecutionRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the prefetch plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StopScheduledPreloadExecution</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public StopScheduledPreloadExecutionRequest build() {
            return new StopScheduledPreloadExecutionRequest(this);
        } 

    } 

}
