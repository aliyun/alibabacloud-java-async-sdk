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
 * {@link UpdateResourceExportTaskAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceExportTaskAttributeResponseBody</p>
 */
public class UpdateResourceExportTaskAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateResourceExportTaskAttributeResponseBody(Builder builder) {
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceExportTaskAttributeResponseBody create() {
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

        private Builder(UpdateResourceExportTaskAttributeResponseBody model) {
            this.exportTaskId = model.exportTaskId;
            this.exportVersion = model.exportVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the resource export task.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-kw161ol8te1n701e1igt8q8</p>
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
         * <p>B43F08A7-F2A3-54D3-BDA4-69C9F32A7B9F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateResourceExportTaskAttributeResponseBody build() {
            return new UpdateResourceExportTaskAttributeResponseBody(this);
        } 

    } 

}
