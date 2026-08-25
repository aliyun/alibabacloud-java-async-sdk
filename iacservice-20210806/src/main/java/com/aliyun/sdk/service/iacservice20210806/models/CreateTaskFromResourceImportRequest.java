// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateTaskFromResourceImportRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskFromResourceImportRequest</p>
 */
public class CreateTaskFromResourceImportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exportVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateTaskFromResourceImportRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskFromResourceImportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return exportVersion
     */
    public String getExportVersion() {
        return this.exportVersion;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateTaskFromResourceImportRequest, Builder> {
        private String clientToken; 
        private String exportTaskId; 
        private String exportVersion; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskFromResourceImportRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.exportTaskId = request.exportTaskId;
            this.exportVersion = request.exportVersion;
            this.taskName = request.taskName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putBodyParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exportVersion(String exportVersion) {
            this.putBodyParameter("exportVersion", exportVersion);
            this.exportVersion = exportVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateTaskFromResourceImportRequest build() {
            return new CreateTaskFromResourceImportRequest(this);
        } 

    } 

}
