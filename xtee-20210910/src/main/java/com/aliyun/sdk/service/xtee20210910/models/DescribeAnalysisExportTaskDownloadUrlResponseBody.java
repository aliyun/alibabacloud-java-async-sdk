// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAnalysisExportTaskDownloadUrlResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAnalysisExportTaskDownloadUrlResponseBody build() {
            return new DescribeAnalysisExportTaskDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAnalysisExportTaskDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnalysisExportTaskDownloadUrlResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.downloadFileUrl = model.downloadFileUrl;
                this.executeTime = model.executeTime;
                this.status = model.status;
            } 

            /**
             * <p>Download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
             */
            public Builder downloadFileUrl(String downloadFileUrl) {
                this.downloadFileUrl = downloadFileUrl;
                return this;
            }

            /**
             * <p>Download execution time</p>
             * 
             * <strong>example:</strong>
             * <p>1753891199000</p>
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>Task status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
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
