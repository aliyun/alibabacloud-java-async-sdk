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

        /**
         * ExportTaskId.
         */
        public Builder exportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * RequestId.
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
