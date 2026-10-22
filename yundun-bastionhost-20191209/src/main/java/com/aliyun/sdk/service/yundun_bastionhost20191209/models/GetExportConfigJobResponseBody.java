// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetExportConfigJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetExportConfigJobResponseBody</p>
 */
public class GetExportConfigJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetExportConfigJobResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.expireTime = builder.expireTime;
        this.jobId = builder.jobId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExportConfigJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Long expireTime; 
        private String jobId; 
        private String message; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetExportConfigJobResponseBody model) {
            this.downloadUrl = model.downloadUrl;
            this.expireTime = model.expireTime;
            this.jobId = model.jobId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The download URL of the configuration backup file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bastionhost-cn-hangzhou-164***.oss-cn-hangzhou.aliyuncs.com/bastionhost-cn-2">https://bastionhost-cn-hangzhou-164***.oss-cn-hangzhou.aliyuncs.com/bastionhost-cn-2</a>******</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the configuration backup download URL. Unit: seconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1679393152</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The ID of the configuration backup export task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98DBE5C2-7D7A-5393-9E5A-71074336D33B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the configuration backup export task.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetExportConfigJobResponseBody build() {
            return new GetExportConfigJobResponseBody(this);
        } 

    } 

}
