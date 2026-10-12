// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetMigrationNamespacedServicesRequest} extends {@link RequestModel}
 *
 * <p>GetMigrationNamespacedServicesRequest</p>
 */
public class GetMigrationNamespacedServicesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetMigrationNamespacedServicesRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationNamespacedServicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMigrationNamespacedServicesRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrationNamespacedServicesRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The migration task ID. This parameter is a URL path parameter. Although the required field is set to false in the document metadata, you must provide a valid migration task ID when calling this operation. You can call ListMigrationTasks to obtain the migration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxxxxxx</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMigrationNamespacedServicesRequest build() {
            return new GetMigrationNamespacedServicesRequest(this);
        } 

    } 

}
