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
 * {@link ExecuteRamPolicyExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteRamPolicyExportTaskResponseBody</p>
 */
public class ExecuteRamPolicyExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exportVersion")
    private String exportVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ExecuteRamPolicyExportTaskResponseBody(Builder builder) {
        this.exportVersion = builder.exportVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteRamPolicyExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String exportVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteRamPolicyExportTaskResponseBody model) {
            this.exportVersion = model.exportVersion;
            this.requestId = model.requestId;
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

        public ExecuteRamPolicyExportTaskResponseBody build() {
            return new ExecuteRamPolicyExportTaskResponseBody(this);
        } 

    } 

}
