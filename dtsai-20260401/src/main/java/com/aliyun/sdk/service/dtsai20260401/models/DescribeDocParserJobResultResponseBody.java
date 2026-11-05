// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link DescribeDocParserJobResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocParserJobResultResponseBody</p>
 */
public class DescribeDocParserJobResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.NameInMap("ResultUrl")
    private String resultUrl;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDocParserJobResultResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultType = builder.resultType;
        this.resultUrl = builder.resultUrl;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocParserJobResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return resultUrl
     */
    public String getResultUrl() {
        return this.resultUrl;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private String result; 
        private String resultType; 
        private String resultUrl; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDocParserJobResultResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.result = model.result;
            this.resultType = model.resultType;
            this.resultUrl = model.resultUrl;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>JobNotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified job does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The document parsing result. The format is determined by the OutputFormat parameter specified in the CreateDocParserJob request.</p>
         * 
         * <strong>example:</strong>
         * <h1>Document Title</h1>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The result format.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * <p>oss url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://shuanglu-prod.oss-cn-shanghai-finance-1-pub.aliyuncs.com/idrs/24/local/remoteresult?Expires=1764472809&OSSAccessKeyId=****&Signature=">http://shuanglu-prod.oss-cn-shanghai-finance-1-pub.aliyuncs.com/idrs/24/local/remoteresult?Expires=1764472809&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        public Builder resultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDocParserJobResultResponseBody build() {
            return new DescribeDocParserJobResultResponseBody(this);
        } 

    } 

}
