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
 * {@link CancelResourceExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CancelResourceExportTaskResponseBody</p>
 */
public class CancelResourceExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CancelResourceExportTaskResponseBody(Builder builder) {
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelResourceExportTaskResponseBody create() {
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

        private Builder(CancelResourceExportTaskResponseBody model) {
            this.exportTaskId = model.exportTaskId;
            this.exportVersion = model.exportVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the resource export task.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-3b6cb9fa4751a6e5cdc6460282</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>The version of the export task.</p>
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
         * <p>136B3926-DD90-5DB2-96EC-8BAD6407D1C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelResourceExportTaskResponseBody build() {
            return new CancelResourceExportTaskResponseBody(this);
        } 

    } 

}
