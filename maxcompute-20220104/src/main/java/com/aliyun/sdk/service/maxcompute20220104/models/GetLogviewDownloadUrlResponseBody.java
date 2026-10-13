// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetLogviewDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogviewDownloadUrlResponseBody</p>
 */
public class GetLogviewDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetLogviewDownloadUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogviewDownloadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLogviewDownloadUrlResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The presigned OSS download URL for the offline Logview file. The URL is valid for 10 minutes from the time it is generated. The file name extension is .txt and the content is JSON data in UTF-8 encoding. The download URL is determined by useVpcEndpoint. If the link expires, invoke this operation again. The sample URL is desensitized and cannot be used for actual downloads.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/logview/offline/logview_detail_odps_project_20260409110419512gx6ofeaj8fb.txt?OSSAccessKeyId=LTAI5tExample****&Expires=1791777900&Signature=example">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/logview/offline/logview_detail_odps_project_20260409110419512gx6ofeaj8fb.txt?OSSAccessKeyId=LTAI5tExample****&amp;Expires=1791777900&amp;Signature=example</a>****</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. This field is not assigned a value when this operation is successfully processed. The sample value NO_PERMISSION is used to illustrate a common permission error and must not be combined with the success response example.</p>
         * 
         * <strong>example:</strong>
         * <p>NO_PERMISSION</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message. This field is not assigned a value when this operation is successfully processed. The sample value Forbidden is used to illustrate a common permission error and must not be combined with the success response example.</p>
         * 
         * <strong>example:</strong>
         * <p>Forbidden</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code field. This field is not assigned a value when this operation is successfully processed. Do not rely solely on whether this field equals 200 to determine success. Process the result based on the actual HTTP response status and returned content. The sample value 200 is used only to illustrate the field format.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID. This ID is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0aa16667684362147582e038f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLogviewDownloadUrlResponseBody build() {
            return new GetLogviewDownloadUrlResponseBody(this);
        } 

    } 

}
