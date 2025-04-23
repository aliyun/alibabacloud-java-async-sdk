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
 * {@link ExecuteResourceExportTaskRequest} extends {@link RequestModel}
 *
 * <p>ExecuteResourceExportTaskRequest</p>
 */
public class ExecuteResourceExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRole")
    private String ramRole;

    private ExecuteResourceExportTaskRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.clientToken = builder.clientToken;
        this.ramRole = builder.ramRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteResourceExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    public static final class Builder extends Request.Builder<ExecuteResourceExportTaskRequest, Builder> {
        private String exportTaskId; 
        private String clientToken; 
        private String ramRole; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteResourceExportTaskRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.clientToken = request.clientToken;
            this.ramRole = request.ramRole;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-3b6cb9fa4751a6e645ad8365e6</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putPathParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ramRole.
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        @Override
        public ExecuteResourceExportTaskRequest build() {
            return new ExecuteResourceExportTaskRequest(this);
        } 

    } 

}
