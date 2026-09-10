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
 * {@link ExecuteResourceExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteResourceExportTaskResponseBody</p>
 */
public class ExecuteResourceExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ExecuteResourceExportTaskResponseBody(Builder builder) {
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteResourceExportTaskResponseBody create() {
        return builder().build();
    }

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String exportTaskId; 
        private String exportVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteResourceExportTaskResponseBody model) {
            this.exportTaskId = model.exportTaskId;
            this.exportVersion = model.exportVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The resource export ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-3b6cb9fa4751a6e645ad8365e6</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>The resource export version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder exportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B0A7C19-9077-5975-ACBD-DEE718787992</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteResourceExportTaskResponseBody build() {
            return new ExecuteResourceExportTaskResponseBody(this);
        } 

    } 

}
