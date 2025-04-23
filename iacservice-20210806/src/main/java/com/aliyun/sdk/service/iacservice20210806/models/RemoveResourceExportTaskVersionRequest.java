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
 * {@link RemoveResourceExportTaskVersionRequest} extends {@link RequestModel}
 *
 * <p>RemoveResourceExportTaskVersionRequest</p>
 */
public class RemoveResourceExportTaskVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    private RemoveResourceExportTaskVersionRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveResourceExportTaskVersionRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveResourceExportTaskVersionRequest, Builder> {
        private String exportTaskId; 
        private String exportVersion; 

        private Builder() {
            super();
        } 

        private Builder(RemoveResourceExportTaskVersionRequest request) {
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
            this.putPathParameter("exportVersion", exportVersion);
            this.exportVersion = exportVersion;
            return this;
        }

        @Override
        public RemoveResourceExportTaskVersionRequest build() {
            return new RemoveResourceExportTaskVersionRequest(this);
        } 

    } 

}
