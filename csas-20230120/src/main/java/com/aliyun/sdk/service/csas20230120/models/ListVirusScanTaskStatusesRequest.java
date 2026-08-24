// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusScanTaskStatusesRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanTaskStatusesRequest</p>
 */
public class ListVirusScanTaskStatusesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    private ListVirusScanTaskStatusesRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTaskStatusesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<ListVirusScanTaskStatusesRequest, Builder> {
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanTaskStatusesRequest request) {
            super(request);
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public ListVirusScanTaskStatusesRequest build() {
            return new ListVirusScanTaskStatusesRequest(this);
        } 

    } 

}
