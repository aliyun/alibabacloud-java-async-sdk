// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ExportStatisticalDataResponseBody} extends {@link TeaModel}
 *
 * <p>ExportStatisticalDataResponseBody</p>
 */
public class ExportStatisticalDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportTaskId")
    private String exportTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportStatisticalDataResponseBody(Builder builder) {
        this.exportTaskId = builder.exportTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportStatisticalDataResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String exportTaskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExportStatisticalDataResponseBody model) {
            this.exportTaskId = model.exportTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The asynchronous export task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6be5a9f1-406e-424e-a17b-b6fb86ee3cc9</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportStatisticalDataResponseBody build() {
            return new ExportStatisticalDataResponseBody(this);
        } 

    } 

}
