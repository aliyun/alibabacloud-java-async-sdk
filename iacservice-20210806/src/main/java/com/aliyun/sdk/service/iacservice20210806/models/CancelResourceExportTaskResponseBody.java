// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * exportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * exportVersion.
         */
        public Builder exportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }

        /**
         * requestId.
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
