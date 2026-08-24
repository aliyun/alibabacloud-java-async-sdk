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
 * {@link CancelVirusScanTasksRequest} extends {@link RequestModel}
 *
 * <p>CancelVirusScanTasksRequest</p>
 */
public class CancelVirusScanTasksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    private CancelVirusScanTasksRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelVirusScanTasksRequest create() {
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

    public static final class Builder extends Request.Builder<CancelVirusScanTasksRequest, Builder> {
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(CancelVirusScanTasksRequest request) {
            super(request);
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putBodyParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public CancelVirusScanTasksRequest build() {
            return new CancelVirusScanTasksRequest(this);
        } 

    } 

}
