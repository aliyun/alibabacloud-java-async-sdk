// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitMediaExportJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitMediaExportJobResponseBody</p>
 */
public class SubmitMediaExportJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private SubmitMediaExportJobResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaExportJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String fileURL; 
        private String jobId; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(SubmitMediaExportJobResponseBody model) {
            this.fileURL = model.fileURL;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * FileURL.
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SubmitMediaExportJobResponseBody build() {
            return new SubmitMediaExportJobResponseBody(this);
        } 

    } 

}
