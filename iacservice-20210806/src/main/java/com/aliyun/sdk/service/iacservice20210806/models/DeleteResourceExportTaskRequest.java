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
 * {@link DeleteResourceExportTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceExportTaskRequest</p>
 */
public class DeleteResourceExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    private DeleteResourceExportTaskRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceExportTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteResourceExportTaskRequest, Builder> {
        private String exportTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceExportTaskRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
        } 

        /**
         * exportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putPathParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        @Override
        public DeleteResourceExportTaskRequest build() {
            return new DeleteResourceExportTaskRequest(this);
        } 

    } 

}
