// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link QueryDefaultTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDefaultTemplateResponseBody</p>
 */
public class QueryDefaultTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private Object data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private QueryDefaultTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDefaultTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Object data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDefaultTemplateResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data about the default data category and data sensitivity level template. The data is in the JSON array format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;gmtModified&quot;:1709022365000,&quot;fileName&quot;:&quot;default file&quot;,&quot;isDelete&quot;:false,&quot;isDefaultTemplate&quot;:true}]</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9990030003</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102400001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDefaultTemplateResponseBody build() {
            return new QueryDefaultTemplateResponseBody(this);
        } 

    } 

}
