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
 * {@link CreateResourceExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceExportTaskResponseBody</p>
 */
public class CreateResourceExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateResourceExportTaskResponseBody(Builder builder) {
        this.exportTaskId = builder.exportTaskId;
        this.exportVersion = builder.exportVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceExportTaskResponseBody create() {
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

        private Builder(CreateResourceExportTaskResponseBody model) {
            this.exportTaskId = model.exportTaskId;
            this.exportVersion = model.exportVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The resource export task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-4a1ec8b7003d24528326821be</p>
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
         * <p>CFD8C2A8-5BE7-56D2-916D-64039B8E06E3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateResourceExportTaskResponseBody build() {
            return new CreateResourceExportTaskResponseBody(this);
        } 

    } 

}
