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
 * {@link QueryRecognizeRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecognizeRuleDetailResponseBody</p>
 */
public class QueryRecognizeRuleDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryRecognizeRuleDetailResponseBody(Builder builder) {
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

    public static QueryRecognizeRuleDetailResponseBody create() {
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

        private Builder(QueryRecognizeRuleDetailResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the sensitive field in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nodeName&quot;:&quot;basic unit overview&quot;,&quot;gmtModified&quot;:1709017449000,&quot;hitThreshold&quot;:30,&quot;sensitiveName&quot;:&quot;mobile-yinni&quot;,&quot;templateId&quot;:&quot;8222abeb-9784-4417-b420-0322926d5cbf&quot;,&quot;recognizeRulesType&quot;:2,&quot;delete&quot;:false,&quot;bydAccuracy&quot;:1,&quot;colScan&quot;:&quot;,&quot; defineType &quot;:1,&quot;: ydAccuracy &quot;:{&quot; contentRule &quot;:)),&quot; operationType &quot;:0},&quot; nodeParent &quot;:&quot; unit/unit basic information/unit basic overview &quot;,&quot; level &quot;:6,&quot; keyRuleId &quot;:&quot; 228248921215042mobile-yinni &quot;,&quot; isDelete &quot;:false,&quot; levelName &quot;:&quot; 6level &quot;,&quot; sensitive &quot;:false,&quot; operationType &quot;:0,&quot; sourceName &quot;: dsg-test-zuoyue&quot;,&quot;nodeId&quot;:&quot;bea2fc81-90c9-45f3-b7a9-26d534208a0d&quot;,&quot;status&quot;:1}</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
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
         * 
         * <strong>example:</strong>
         * <p>Missing parameter</p>
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
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRecognizeRuleDetailResponseBody build() {
            return new QueryRecognizeRuleDetailResponseBody(this);
        } 

    } 

}
