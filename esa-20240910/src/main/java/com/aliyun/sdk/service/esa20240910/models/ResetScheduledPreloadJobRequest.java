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
 * {@link ResetScheduledPreloadJobRequest} extends {@link RequestModel}
 *
 * <p>ResetScheduledPreloadJobRequest</p>
 */
public class ResetScheduledPreloadJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private ResetScheduledPreloadJobRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetScheduledPreloadJobRequest create() {
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

    public static final class Builder extends Request.Builder<ResetScheduledPreloadJobRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(ResetScheduledPreloadJobRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the scheduled prefetch task.</p>
         * <blockquote>
         * <p>Notice: The ID of the scheduled prefetch task. This parameter is required. You can obtain the ID from the response of CreateScheduledPreloadJob after creating a task, or query the ID of an existing task by calling GetScheduledPreloadJob or ListScheduledPreloadJobs..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>665d3af3621bccf3fe29e1a4</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public ResetScheduledPreloadJobRequest build() {
            return new ResetScheduledPreloadJobRequest(this);
        } 

    } 

}
