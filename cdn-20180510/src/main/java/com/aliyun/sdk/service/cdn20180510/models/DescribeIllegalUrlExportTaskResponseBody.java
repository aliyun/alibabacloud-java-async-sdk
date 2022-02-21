// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIllegalUrlExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIllegalUrlExportTaskResponseBody</p>
 */
public class DescribeIllegalUrlExportTaskResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeIllegalUrlExportTaskResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIllegalUrlExportTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String requestId; 
        private String status; 

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeIllegalUrlExportTaskResponseBody build() {
            return new DescribeIllegalUrlExportTaskResponseBody(this);
        } 

    } 

}
