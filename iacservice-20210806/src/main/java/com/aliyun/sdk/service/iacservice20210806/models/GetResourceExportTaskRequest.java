// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceExportTaskRequest} extends {@link RequestModel}
 *
 * <p>GetResourceExportTaskRequest</p>
 */
public class GetResourceExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    private GetResourceExportTaskRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceExportTaskRequest create() {
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
     * @return exportVersion
     */
    public String getExportVersion() {
        return this.exportVersion;
    }

    public static final class Builder extends Request.Builder<GetResourceExportTaskRequest, Builder> {
        private String exportTaskId; 
        private String exportVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceExportTaskRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.exportVersion = request.exportVersion;
        } 

        /**
         * exportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putPathParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * exportVersion.
         */
        public Builder exportVersion(String exportVersion) {
            this.putQueryParameter("exportVersion", exportVersion);
            this.exportVersion = exportVersion;
            return this;
        }

        @Override
        public GetResourceExportTaskRequest build() {
            return new GetResourceExportTaskRequest(this);
        } 

    } 

}
