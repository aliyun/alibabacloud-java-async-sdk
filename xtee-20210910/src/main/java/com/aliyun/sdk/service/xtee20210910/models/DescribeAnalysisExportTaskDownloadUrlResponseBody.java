// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnalysisExportTaskDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnalysisExportTaskDownloadUrlResponseBody</p>
 */
public class DescribeAnalysisExportTaskDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeAnalysisExportTaskDownloadUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnalysisExportTaskDownloadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAnalysisExportTaskDownloadUrlResponseBody build() {
            return new DescribeAnalysisExportTaskDownloadUrlResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downloadFileUrl")
        private String downloadFileUrl;

        @com.aliyun.core.annotation.NameInMap("executeTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private ResultObject(Builder builder) {
            this.downloadFileUrl = builder.downloadFileUrl;
            this.executeTime = builder.executeTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return downloadFileUrl
         */
        public String getDownloadFileUrl() {
            return this.downloadFileUrl;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String downloadFileUrl; 
            private Long executeTime; 
            private String status; 

            /**
             * downloadFileUrl.
             */
            public Builder downloadFileUrl(String downloadFileUrl) {
                this.downloadFileUrl = downloadFileUrl;
                return this;
            }

            /**
             * executeTime.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
