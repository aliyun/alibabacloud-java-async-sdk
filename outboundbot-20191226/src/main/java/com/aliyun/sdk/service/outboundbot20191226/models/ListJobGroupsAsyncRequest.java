// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListJobGroupsAsyncRequest} extends {@link RequestModel}
 *
 * <p>ListJobGroupsAsyncRequest</p>
 */
public class ListJobGroupsAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String asyncTaskId;

    private ListJobGroupsAsyncRequest(Builder builder) {
        super(builder);
        this.asyncTaskId = builder.asyncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobGroupsAsyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public static final class Builder extends Request.Builder<ListJobGroupsAsyncRequest, Builder> {
        private String asyncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobGroupsAsyncRequest request) {
            super(request);
            this.asyncTaskId = request.asyncTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6243d904-939d-42ce-a8e4-886a139e77a3</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.putQueryParameter("AsyncTaskId", asyncTaskId);
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        @Override
        public ListJobGroupsAsyncRequest build() {
            return new ListJobGroupsAsyncRequest(this);
        } 

    } 

}
