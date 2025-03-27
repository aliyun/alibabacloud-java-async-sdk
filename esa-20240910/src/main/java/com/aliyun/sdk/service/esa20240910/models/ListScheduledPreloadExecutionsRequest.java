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
 * {@link ListScheduledPreloadExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListScheduledPreloadExecutionsRequest</p>
 */
public class ListScheduledPreloadExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private ListScheduledPreloadExecutionsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledPreloadExecutionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListScheduledPreloadExecutionsRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduledPreloadExecutionsRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the scheduled prefetch task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ListScheduledPreloadExecutions</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public ListScheduledPreloadExecutionsRequest build() {
            return new ListScheduledPreloadExecutionsRequest(this);
        } 

    } 

}
